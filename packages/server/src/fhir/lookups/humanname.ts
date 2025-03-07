import { formatFamilyName, formatGivenName, formatHumanName } from '@medplum/core';
import { HumanName, Resource, ResourceType, SearchParameter } from '@medplum/fhirtypes';
import { Pool, PoolClient } from 'pg';
import { LookupTable } from './lookuptable';
import { DeleteQuery, Column } from '../sql';

/**
 * The HumanNameTable class is used to index and search "name" properties on "Person" resources.
 * Each name is represented as a separate row in the "HumanName" table.
 */
export class HumanNameTable extends LookupTable {
  private static readonly knownParams: Set<string> = new Set<string>([
    'individual-given',
    'individual-family',
    'Patient-name',
    'Person-name',
    'Practitioner-name',
    'RelatedPerson-name',
  ]);

  private static readonly resourceTypes = ['Patient', 'Person', 'Practitioner', 'RelatedPerson'] as const;

  private static readonly resourceTypeSet = new Set(this.resourceTypes);

  private static hasHumanName(
    resourceType: ResourceType
  ): resourceType is (typeof HumanNameTable.resourceTypes)[number] {
    return HumanNameTable.resourceTypeSet.has(resourceType as any);
  }

  /**
   * Returns the table name.
   * @returns The table name.
   */
  getTableName(): string {
    return 'HumanName';
  }

  /**
   * Returns the column name for the given search parameter.
   * @param code - The search parameter code.
   * @returns The column name.
   */
  getColumnName(code: string): string {
    return code;
  }

  /**
   * Returns true if the search parameter is an HumanName parameter.
   * @param searchParam - The search parameter.
   * @returns True if the search parameter is an HumanName parameter.
   */
  isIndexed(searchParam: SearchParameter): boolean {
    return HumanNameTable.knownParams.has(searchParam.id as string);
  }

  /**
   * Indexes a resource HumanName values.
   * Attempts to reuse existing identifiers if they are correct.
   * @param client - The database client.
   * @param resource - The resource to index.
   * @param create - True if the resource should be created (vs updated).
   * @returns Promise on completion.
   */
  async indexResource(client: PoolClient, resource: Resource, create: boolean): Promise<void> {
    if (
      resource.resourceType !== 'Patient' &&
      resource.resourceType !== 'Person' &&
      resource.resourceType !== 'Practitioner' &&
      resource.resourceType !== 'RelatedPerson'
    ) {
      return;
    }

    if (!create) {
      await this.deleteValuesForResource(client, resource);
    }

    const names: HumanName[] | undefined = resource.name;
    if (!names || !Array.isArray(names)) {
      return;
    }

    const resourceType = resource.resourceType;
    const resourceId = resource.id;
    const values = names.map((name) => ({
      resourceId,
      name: getNameString(name),
      given: formatGivenName(name),
      family: formatFamilyName(name),
    }));

    await this.insertValuesForResource(client, resourceType, values);
  }

  /**
   * Deletes the resource from the lookup table.
   * @param client - The database client.
   * @param resource - The resource to delete.
   */
  async deleteValuesForResource(client: Pool | PoolClient, resource: Resource): Promise<void> {
    if (!HumanNameTable.hasHumanName(resource.resourceType)) {
      return;
    }

    const tableName = this.getTableName();
    const resourceId = resource.id;
    await new DeleteQuery(tableName).where('resourceId', '=', resourceId).execute(client);
  }

  /**
   * Purges resources of the specified type that were last updated before the specified date.
   * This is only available to the system and super admin accounts.
   * @param client - The database client.
   * @param resourceType - The FHIR resource type.
   * @param before - The date before which resources should be purged.
   */
  async purgeValuesBefore(client: Pool | PoolClient, resourceType: ResourceType, before: string): Promise<void> {
    if (!HumanNameTable.hasHumanName(resourceType)) {
      return;
    }

    const lookupTableName = this.getTableName();
    await new DeleteQuery(lookupTableName)
      .using(resourceType)
      .where(new Column(lookupTableName, 'resourceId'), '=', new Column(resourceType, 'id'))
      .where(new Column(resourceType, 'lastUpdated'), '<', before)
      .execute(client);
  }
}

/**
 * Returns a string representation of the human name for indexing.
 *
 * In previous versions, we simply used `formatHumanName(name)`.
 *
 * However, the FHIR spec indicates that the `text` field should be used for indexing.
 *
 * Quote:
 *
 *   "The given name parts may contain whitespace, though generally they don't.
 *    Initials may be used in place of the full name if that is all that is recorded.
 *    Systems that operate across cultures should generally rely on the text form for
 *    presentation and use the parts for index/search functionality. For this reason,
 *    applications SHOULD populate the text element for future robustness."
 *
 * @param name - The input human name.
 * @returns A string representation of the human name.
 */
export function getNameString(name: HumanName): string {
  let result = formatHumanName(name);

  if (name.text) {
    // Add unique tokens from the text field
    const resultTokens = getTokens(result);
    const textTokens = getTokens(name.text);
    for (const token of textTokens) {
      if (!resultTokens.has(token)) {
        result += ' ' + token;
        resultTokens.add(token);
      }
    }
  }

  return result;
}

function getTokens(input: string): Set<string> {
  if (!input || typeof input !== 'string') {
    return new Set();
  }

  // Convert to lowercase
  // Split on whitespace
  // Remove empty strings
  return new Set<string>(input.toLowerCase().split(/\s+/).filter(Boolean));
}
