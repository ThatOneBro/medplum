/*
 * This is a generated file
 * Do not edit manually.
 */

import { Age } from './Age';
import { Annotation } from './Annotation';
import { CodeableConcept } from './CodeableConcept';
import { Encounter } from './Encounter';
import { Extension } from './Extension';
import { Identifier } from './Identifier';
import { Meta } from './Meta';
import { Narrative } from './Narrative';
import { Patient } from './Patient';
import { Period } from './Period';
import { Practitioner } from './Practitioner';
import { PractitionerRole } from './PractitionerRole';
import { Range } from './Range';
import { Reference } from './Reference';
import { RelatedPerson } from './RelatedPerson';
import { Resource } from './Resource';

/**
 * Risk of harmful or undesirable, physiological response which is unique
 * to an individual and associated with exposure to a substance.
 */
export interface AllergyIntolerance {

  /**
   * This is a AllergyIntolerance resource
   */
  readonly resourceType: 'AllergyIntolerance';

  /**
   * The logical id of the resource, as used in the URL for the resource.
   * Once assigned, this value never changes.
   */
  id?: string;

  /**
   * The metadata about the resource. This is content that is maintained by
   * the infrastructure. Changes to the content might not always be
   * associated with version changes to the resource.
   */
  meta?: Meta;

  /**
   * A reference to a set of rules that were followed when the resource was
   * constructed, and which must be understood when processing the content.
   * Often, this is a reference to an implementation guide that defines the
   * special rules along with other profiles etc.
   */
  implicitRules?: string;

  /**
   * The base language in which the resource is written.
   */
  language?: string;

  /**
   * A human-readable narrative that contains a summary of the resource and
   * can be used to represent the content of the resource to a human. The
   * narrative need not encode all the structured data, but is required to
   * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
   * just read the narrative. Resource definitions may define what content
   * should be represented in the narrative to ensure clinical safety.
   */
  text?: Narrative;

  /**
   * These resources do not have an independent existence apart from the
   * resource that contains them - they cannot be identified independently,
   * and nor can they have their own independent transaction scope.
   */
  contained?: Resource[];

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the resource. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  extension?: Extension[];

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the resource and that modifies the
   * understanding of the element that contains it and/or the understanding
   * of the containing element's descendants. Usually modifier elements
   * provide negation or qualification. To make the use of extensions safe
   * and manageable, there is a strict set of governance applied to the
   * definition and use of extensions. Though any implementer is allowed to
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension. Applications processing a
   * resource are required to check for modifier extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on
   * Resource or DomainResource (including cannot change the meaning of
   * modifierExtension itself).
   */
  modifierExtension?: Extension[];

  /**
   * Business identifiers assigned to this AllergyIntolerance by the
   * performer or other systems which remain constant as the resource is
   * updated and propagates from server to server.
   */
  identifier?: Identifier[];

  /**
   * The clinical status of the allergy or intolerance.
   */
  clinicalStatus?: CodeableConcept;

  /**
   * Assertion about certainty associated with the propensity, or potential
   * risk, of a reaction to the identified substance (including
   * pharmaceutical product).
   */
  verificationStatus?: CodeableConcept;

  /**
   * Identification of the underlying physiological mechanism for the
   * reaction risk.
   */
  type?: 'allergy' | 'intolerance';

  /**
   * Category of the identified substance.
   */
  category?: ('food' | 'medication' | 'environment' | 'biologic')[];

  /**
   * Estimate of the potential clinical harm, or seriousness, of the
   * reaction to the identified substance.
   */
  criticality?: 'low' | 'high' | 'unable-to-assess';

  /**
   * Code for an allergy or intolerance statement (either a positive or a
   * negated/excluded statement).  This may be a code for a substance or
   * pharmaceutical product that is considered to be responsible for the
   * adverse reaction risk (e.g., &quot;Latex&quot;), an allergy or intolerance
   * condition (e.g., &quot;Latex allergy&quot;), or a negated/excluded code for a
   * specific substance or class (e.g., &quot;No latex allergy&quot;) or a general or
   * categorical negated statement (e.g.,  &quot;No known allergy&quot;, &quot;No known
   * drug allergies&quot;).  Note: the substance for a specific reaction may be
   * different from the substance identified as the cause of the risk, but
   * it must be consistent with it. For instance, it may be a more specific
   * substance (e.g. a brand medication) or a composite product that
   * includes the identified substance. It must be clinically safe to only
   * process the 'code' and ignore the 'reaction.substance'.  If a
   * receiving system is unable to confirm that
   * AllergyIntolerance.reaction.substance falls within the semantic scope
   * of AllergyIntolerance.code, then the receiving system should ignore
   * AllergyIntolerance.reaction.substance.
   */
  code?: CodeableConcept;

  /**
   * The patient who has the allergy or intolerance.
   */
  patient: Reference<Patient>;

  /**
   * The encounter when the allergy or intolerance was asserted.
   */
  encounter?: Reference<Encounter>;

  /**
   * Estimated or actual date,  date-time, or age when allergy or
   * intolerance was identified.
   */
  onsetDateTime?: string;

  /**
   * Estimated or actual date,  date-time, or age when allergy or
   * intolerance was identified.
   */
  onsetAge?: Age;

  /**
   * Estimated or actual date,  date-time, or age when allergy or
   * intolerance was identified.
   */
  onsetPeriod?: Period;

  /**
   * Estimated or actual date,  date-time, or age when allergy or
   * intolerance was identified.
   */
  onsetRange?: Range;

  /**
   * Estimated or actual date,  date-time, or age when allergy or
   * intolerance was identified.
   */
  onsetString?: string;

  /**
   * The recordedDate represents when this particular AllergyIntolerance
   * record was created in the system, which is often a system-generated
   * date.
   */
  recordedDate?: string;

  /**
   * Individual who recorded the record and takes responsibility for its
   * content.
   */
  recorder?: Reference<Practitioner | PractitionerRole | Patient | RelatedPerson>;

  /**
   * The source of the information about the allergy that is recorded.
   */
  asserter?: Reference<Patient | RelatedPerson | Practitioner | PractitionerRole>;

  /**
   * Represents the date and/or time of the last known occurrence of a
   * reaction event.
   */
  lastOccurrence?: string;

  /**
   * Additional narrative about the propensity for the Adverse Reaction,
   * not captured in other fields.
   */
  note?: Annotation[];

  /**
   * Details about each adverse reaction event linked to exposure to the
   * identified substance.
   */
  reaction?: AllergyIntoleranceReaction[];
}

/**
 * Estimated or actual date,  date-time, or age when allergy or
 * intolerance was identified.
 */
export type AllergyIntoleranceOnset = Age | Period | Range | string;

/**
 * Details about each adverse reaction event linked to exposure to the
 * identified substance.
 */
export interface AllergyIntoleranceReaction {

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  id?: string;

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  extension?: Extension[];

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element and that modifies the
   * understanding of the element in which it is contained and/or the
   * understanding of the containing element's descendants. Usually
   * modifier elements provide negation or qualification. To make the use
   * of extensions safe and manageable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any
   * implementer can define an extension, there is a set of requirements
   * that SHALL be met as part of the definition of the extension.
   * Applications processing a resource are required to check for modifier
   * extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on
   * Resource or DomainResource (including cannot change the meaning of
   * modifierExtension itself).
   */
  modifierExtension?: Extension[];

  /**
   * Identification of the specific substance (or pharmaceutical product)
   * considered to be responsible for the Adverse Reaction event. Note: the
   * substance for a specific reaction may be different from the substance
   * identified as the cause of the risk, but it must be consistent with
   * it. For instance, it may be a more specific substance (e.g. a brand
   * medication) or a composite product that includes the identified
   * substance. It must be clinically safe to only process the 'code' and
   * ignore the 'reaction.substance'.  If a receiving system is unable to
   * confirm that AllergyIntolerance.reaction.substance falls within the
   * semantic scope of AllergyIntolerance.code, then the receiving system
   * should ignore AllergyIntolerance.reaction.substance.
   */
  substance?: CodeableConcept;

  /**
   * Clinical symptoms and/or signs that are observed or associated with
   * the adverse reaction event.
   */
  manifestation: CodeableConcept[];

  /**
   * Text description about the reaction as a whole, including details of
   * the manifestation if required.
   */
  description?: string;

  /**
   * Record of the date and/or time of the onset of the Reaction.
   */
  onset?: string;

  /**
   * Clinical assessment of the severity of the reaction event as a whole,
   * potentially considering multiple different manifestations.
   */
  severity?: 'mild' | 'moderate' | 'severe';

  /**
   * Identification of the route by which the subject was exposed to the
   * substance.
   */
  exposureRoute?: CodeableConcept;

  /**
   * Additional text about the adverse reaction event not captured in other
   * fields.
   */
  note?: Annotation[];
}
