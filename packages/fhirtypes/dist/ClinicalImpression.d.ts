/*
 * This is a generated file
 * Do not edit manually.
 */

import { AllergyIntolerance } from './AllergyIntolerance';
import { Annotation } from './Annotation';
import { CodeableConcept } from './CodeableConcept';
import { Condition } from './Condition';
import { DiagnosticReport } from './DiagnosticReport';
import { Encounter } from './Encounter';
import { Extension } from './Extension';
import { FamilyMemberHistory } from './FamilyMemberHistory';
import { Group } from './Group';
import { Identifier } from './Identifier';
import { ImagingStudy } from './ImagingStudy';
import { Media } from './Media';
import { Meta } from './Meta';
import { Narrative } from './Narrative';
import { Observation } from './Observation';
import { Patient } from './Patient';
import { Period } from './Period';
import { Practitioner } from './Practitioner';
import { PractitionerRole } from './PractitionerRole';
import { QuestionnaireResponse } from './QuestionnaireResponse';
import { Reference } from './Reference';
import { Resource } from './Resource';
import { RiskAssessment } from './RiskAssessment';

/**
 * A record of a clinical assessment performed to determine what
 * problem(s) may affect the patient and before planning the treatments
 * or management strategies that are best to manage a patient's
 * condition. Assessments are often 1:1 with a clinical consultation /
 * encounter,  but this varies greatly depending on the clinical
 * workflow. This resource is called &quot;ClinicalImpression&quot; rather than
 * &quot;ClinicalAssessment&quot; to avoid confusion with the recording of
 * assessment tools such as Apgar score.
 */
export interface ClinicalImpression {

  /**
   * This is a ClinicalImpression resource
   */
  readonly resourceType: 'ClinicalImpression';

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
   * Business identifiers assigned to this clinical impression by the
   * performer or other systems which remain constant as the resource is
   * updated and propagates from server to server.
   */
  identifier?: Identifier[];

  /**
   * Identifies the workflow status of the assessment.
   */
  status: 'in-progress' | 'completed' | 'entered-in-error';

  /**
   * Captures the reason for the current state of the ClinicalImpression.
   */
  statusReason?: CodeableConcept;

  /**
   * Categorizes the type of clinical assessment performed.
   */
  code?: CodeableConcept;

  /**
   * A summary of the context and/or cause of the assessment - why / where
   * it was performed, and what patient events/status prompted it.
   */
  description?: string;

  /**
   * The patient or group of individuals assessed as part of this record.
   */
  subject: Reference<Patient | Group>;

  /**
   * The Encounter during which this ClinicalImpression was created or to
   * which the creation of this record is tightly associated.
   */
  encounter?: Reference<Encounter>;

  /**
   * The point in time or period over which the subject was assessed.
   */
  effectiveDateTime?: string;

  /**
   * The point in time or period over which the subject was assessed.
   */
  effectivePeriod?: Period;

  /**
   * Indicates when the documentation of the assessment was complete.
   */
  date?: string;

  /**
   * The clinician performing the assessment.
   */
  assessor?: Reference<Practitioner | PractitionerRole>;

  /**
   * A reference to the last assessment that was conducted on this patient.
   * Assessments are often/usually ongoing in nature; a care provider
   * (practitioner or team) will make new assessments on an ongoing basis
   * as new data arises or the patient's conditions changes.
   */
  previous?: Reference<ClinicalImpression>;

  /**
   * A list of the relevant problems/conditions for a patient.
   */
  problem?: Reference<Condition | AllergyIntolerance>[];

  /**
   * One or more sets of investigations (signs, symptoms, etc.). The actual
   * grouping of investigations varies greatly depending on the type and
   * context of the assessment. These investigations may include data
   * generated during the assessment process, or data previously generated
   * and recorded that is pertinent to the outcomes.
   */
  investigation?: ClinicalImpressionInvestigation[];

  /**
   * Reference to a specific published clinical protocol that was followed
   * during this assessment, and/or that provides evidence in support of
   * the diagnosis.
   */
  protocol?: string[];

  /**
   * A text summary of the investigations and the diagnosis.
   */
  summary?: string;

  /**
   * Specific findings or diagnoses that were considered likely or relevant
   * to ongoing treatment.
   */
  finding?: ClinicalImpressionFinding[];

  /**
   * Estimate of likely outcome.
   */
  prognosisCodeableConcept?: CodeableConcept[];

  /**
   * RiskAssessment expressing likely outcome.
   */
  prognosisReference?: Reference<RiskAssessment>[];

  /**
   * Information supporting the clinical impression.
   */
  supportingInfo?: Reference<Resource>[];

  /**
   * Commentary about the impression, typically recorded after the
   * impression itself was made, though supplemental notes by the original
   * author could also appear.
   */
  note?: Annotation[];
}

/**
 * The point in time or period over which the subject was assessed.
 */
export type ClinicalImpressionEffective = Period | string;

/**
 * Specific findings or diagnoses that were considered likely or relevant
 * to ongoing treatment.
 */
export interface ClinicalImpressionFinding {

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
   * Specific text or code for finding or diagnosis, which may include
   * ruled-out or resolved conditions.
   */
  itemCodeableConcept?: CodeableConcept;

  /**
   * Specific reference for finding or diagnosis, which may include
   * ruled-out or resolved conditions.
   */
  itemReference?: Reference<Condition | Observation | Media>;

  /**
   * Which investigations support finding or diagnosis.
   */
  basis?: string;
}

/**
 * One or more sets of investigations (signs, symptoms, etc.). The actual
 * grouping of investigations varies greatly depending on the type and
 * context of the assessment. These investigations may include data
 * generated during the assessment process, or data previously generated
 * and recorded that is pertinent to the outcomes.
 */
export interface ClinicalImpressionInvestigation {

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
   * A name/code for the group (&quot;set&quot;) of investigations. Typically, this
   * will be something like &quot;signs&quot;, &quot;symptoms&quot;, &quot;clinical&quot;, &quot;diagnostic&quot;,
   * but the list is not constrained, and others such groups such as
   * (exposure|family|travel|nutritional) history may be used.
   */
  code: CodeableConcept;

  /**
   * A record of a specific investigation that was undertaken.
   */
  item?: Reference<Observation | QuestionnaireResponse | FamilyMemberHistory | DiagnosticReport | RiskAssessment | ImagingStudy | Media>[];
}
