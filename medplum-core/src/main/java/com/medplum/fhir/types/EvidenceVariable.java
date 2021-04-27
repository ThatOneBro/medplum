/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class EvidenceVariable extends FhirResource {
    public static final String RESOURCE_TYPE = "EvidenceVariable";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_SHORT_TITLE = "shortTitle";
    public static final String PROPERTY_SUBTITLE = "subtitle";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_PUBLISHER = "publisher";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_USE_CONTEXT = "useContext";
    public static final String PROPERTY_JURISDICTION = "jurisdiction";
    public static final String PROPERTY_COPYRIGHT = "copyright";
    public static final String PROPERTY_APPROVAL_DATE = "approvalDate";
    public static final String PROPERTY_LAST_REVIEW_DATE = "lastReviewDate";
    public static final String PROPERTY_EFFECTIVE_PERIOD = "effectivePeriod";
    public static final String PROPERTY_TOPIC = "topic";
    public static final String PROPERTY_AUTHOR = "author";
    public static final String PROPERTY_EDITOR = "editor";
    public static final String PROPERTY_REVIEWER = "reviewer";
    public static final String PROPERTY_ENDORSER = "endorser";
    public static final String PROPERTY_RELATED_ARTIFACT = "relatedArtifact";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_CHARACTERISTIC = "characteristic";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public EvidenceVariable(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public String implicitRules() {
        return getString(PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

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
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * An absolute URI that is used to identify this evidence variable when
     * it is referenced in a specification, model, design or an instance;
     * also called its canonical identifier. This SHOULD be globally unique
     * and SHOULD be a literal address at which at which an authoritative
     * instance of this evidence variable is (or will be) published. This URL
     * can be the target of a canonical reference. It SHALL remain the same
     * when the evidence variable is stored on different servers.
     */
    public String url() {
        return getString(PROPERTY_URL);
    }

    /**
     * A formal identifier that is used to identify this evidence variable
     * when it is represented in other formats, or referenced in a
     * specification, model, design or an instance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The identifier that is used to identify this version of the evidence
     * variable when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the evidence variable
     * author and is not expected to be globally unique. For example, it
     * might be a timestamp (e.g. yyyymmdd) if a managed version is not
     * available. There is also no expectation that versions can be placed in
     * a lexicographical sequence. To provide a version consistent with the
     * Decision Support Service specification, use the format
     * Major.Minor.Revision (e.g. 1.0.0). For more information on versioning
     * knowledge assets, refer to the Decision Support Service specification.
     * Note that a version is required for non-experimental active artifacts.
     */
    public String version() {
        return getString(PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the evidence variable. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * A short, descriptive, user-friendly title for the evidence variable.
     */
    public String title() {
        return getString(PROPERTY_TITLE);
    }

    /**
     * The short title provides an alternate title for use in informal
     * descriptive contexts where the full, formal title is not necessary.
     */
    public String shortTitle() {
        return getString(PROPERTY_SHORT_TITLE);
    }

    /**
     * An explanatory or alternate title for the EvidenceVariable giving
     * additional information about its content.
     */
    public String subtitle() {
        return getString(PROPERTY_SUBTITLE);
    }

    /**
     * The status of this evidence variable. Enables tracking the life-cycle
     * of the content.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * The date  (and optionally time) when the evidence variable was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the evidence variable changes.
     */
    public java.time.Instant date() {
        return java.time.Instant.parse(data.getString(PROPERTY_DATE));
    }

    /**
     * The name of the organization or individual that published the evidence
     * variable.
     */
    public String publisher() {
        return getString(PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, PROPERTY_CONTACT);
    }

    /**
     * A free text natural language description of the evidence variable from
     * a consumer's perspective.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * A human-readable string to clarify or explain concepts about the
     * resource.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate evidence variable instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the evidence variable is
     * intended to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, PROPERTY_JURISDICTION);
    }

    /**
     * A copyright statement relating to the evidence variable and/or its
     * contents. Copyright statements are generally legal restrictions on the
     * use and publishing of the evidence variable.
     */
    public String copyright() {
        return getString(PROPERTY_COPYRIGHT);
    }

    /**
     * The date on which the resource content was approved by the publisher.
     * Approval happens once when the content is officially approved for
     * usage.
     */
    public java.time.LocalDate approvalDate() {
        return java.time.LocalDate.parse(data.getString(PROPERTY_APPROVAL_DATE));
    }

    /**
     * The date on which the resource content was last reviewed. Review
     * happens periodically after approval but does not change the original
     * approval date.
     */
    public java.time.LocalDate lastReviewDate() {
        return java.time.LocalDate.parse(data.getString(PROPERTY_LAST_REVIEW_DATE));
    }

    /**
     * The period during which the evidence variable content was or is
     * planned to be in active use.
     */
    public Period effectivePeriod() {
        return getObject(Period.class, PROPERTY_EFFECTIVE_PERIOD);
    }

    /**
     * Descriptive topics related to the content of the EvidenceVariable.
     * Topics provide a high-level categorization grouping types of
     * EvidenceVariables that can be useful for filtering and searching.
     */
    public java.util.List<CodeableConcept> topic() {
        return getList(CodeableConcept.class, PROPERTY_TOPIC);
    }

    /**
     * An individiual or organization primarily involved in the creation and
     * maintenance of the content.
     */
    public java.util.List<ContactDetail> author() {
        return getList(ContactDetail.class, PROPERTY_AUTHOR);
    }

    /**
     * An individual or organization primarily responsible for internal
     * coherence of the content.
     */
    public java.util.List<ContactDetail> editor() {
        return getList(ContactDetail.class, PROPERTY_EDITOR);
    }

    /**
     * An individual or organization primarily responsible for review of some
     * aspect of the content.
     */
    public java.util.List<ContactDetail> reviewer() {
        return getList(ContactDetail.class, PROPERTY_REVIEWER);
    }

    /**
     * An individual or organization responsible for officially endorsing the
     * content for use in some setting.
     */
    public java.util.List<ContactDetail> endorser() {
        return getList(ContactDetail.class, PROPERTY_ENDORSER);
    }

    /**
     * Related artifacts such as additional documentation, justification, or
     * bibliographic references.
     */
    public java.util.List<RelatedArtifact> relatedArtifact() {
        return getList(RelatedArtifact.class, PROPERTY_RELATED_ARTIFACT);
    }

    /**
     * The type of evidence element, a population, an exposure, or an
     * outcome.
     */
    public String type() {
        return getString(PROPERTY_TYPE);
    }

    /**
     * A characteristic that defines the members of the evidence element.
     * Multiple characteristics are applied with &quot;and&quot; semantics.
     */
    public java.util.List<EvidenceVariableCharacteristic> characteristic() {
        return getList(EvidenceVariableCharacteristic.class, PROPERTY_CHARACTERISTIC);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCE_TYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final String implicitRules) {
            b.add(PROPERTY_IMPLICIT_RULES, implicitRules);
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder url(final String url) {
            b.add(PROPERTY_URL, url);
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder version(final String version) {
            b.add(PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder title(final String title) {
            b.add(PROPERTY_TITLE, title);
            return this;
        }

        public Builder shortTitle(final String shortTitle) {
            b.add(PROPERTY_SHORT_TITLE, shortTitle);
            return this;
        }

        public Builder subtitle(final String subtitle) {
            b.add(PROPERTY_SUBTITLE, subtitle);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(PROPERTY_USE_CONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder jurisdiction(final java.util.List<CodeableConcept> jurisdiction) {
            b.add(PROPERTY_JURISDICTION, FhirObject.toArray(jurisdiction));
            return this;
        }

        public Builder copyright(final String copyright) {
            b.add(PROPERTY_COPYRIGHT, copyright);
            return this;
        }

        public Builder approvalDate(final java.time.LocalDate approvalDate) {
            b.add(PROPERTY_APPROVAL_DATE, approvalDate.toString());
            return this;
        }

        public Builder lastReviewDate(final java.time.LocalDate lastReviewDate) {
            b.add(PROPERTY_LAST_REVIEW_DATE, lastReviewDate.toString());
            return this;
        }

        public Builder effectivePeriod(final Period effectivePeriod) {
            b.add(PROPERTY_EFFECTIVE_PERIOD, effectivePeriod);
            return this;
        }

        public Builder topic(final java.util.List<CodeableConcept> topic) {
            b.add(PROPERTY_TOPIC, FhirObject.toArray(topic));
            return this;
        }

        public Builder author(final java.util.List<ContactDetail> author) {
            b.add(PROPERTY_AUTHOR, FhirObject.toArray(author));
            return this;
        }

        public Builder editor(final java.util.List<ContactDetail> editor) {
            b.add(PROPERTY_EDITOR, FhirObject.toArray(editor));
            return this;
        }

        public Builder reviewer(final java.util.List<ContactDetail> reviewer) {
            b.add(PROPERTY_REVIEWER, FhirObject.toArray(reviewer));
            return this;
        }

        public Builder endorser(final java.util.List<ContactDetail> endorser) {
            b.add(PROPERTY_ENDORSER, FhirObject.toArray(endorser));
            return this;
        }

        public Builder relatedArtifact(final java.util.List<RelatedArtifact> relatedArtifact) {
            b.add(PROPERTY_RELATED_ARTIFACT, FhirObject.toArray(relatedArtifact));
            return this;
        }

        public Builder type(final String type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder characteristic(final java.util.List<EvidenceVariableCharacteristic> characteristic) {
            b.add(PROPERTY_CHARACTERISTIC, FhirObject.toArray(characteristic));
            return this;
        }

        public EvidenceVariable build() {
            return new EvidenceVariable(b.build());
        }
    }

    public static class EvidenceVariableCharacteristic extends FhirObject {
        public static final String RESOURCE_TYPE = "EvidenceVariableCharacteristic";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_DESCRIPTION = "description";
        public static final String PROPERTY_DEFINITION_REFERENCE = "definitionReference";
        public static final String PROPERTY_DEFINITION_CANONICAL = "definitionCanonical";
        public static final String PROPERTY_DEFINITION_CODEABLE_CONCEPT = "definitionCodeableConcept";
        public static final String PROPERTY_DEFINITION_EXPRESSION = "definitionExpression";
        public static final String PROPERTY_DEFINITION_DATA_REQUIREMENT = "definitionDataRequirement";
        public static final String PROPERTY_DEFINITION_TRIGGER_DEFINITION = "definitionTriggerDefinition";
        public static final String PROPERTY_USAGE_CONTEXT = "usageContext";
        public static final String PROPERTY_EXCLUDE = "exclude";
        public static final String PROPERTY_PARTICIPANT_EFFECTIVE_DATE_TIME = "participantEffectiveDateTime";
        public static final String PROPERTY_PARTICIPANT_EFFECTIVE_PERIOD = "participantEffectivePeriod";
        public static final String PROPERTY_PARTICIPANT_EFFECTIVE_DURATION = "participantEffectiveDuration";
        public static final String PROPERTY_PARTICIPANT_EFFECTIVE_TIMING = "participantEffectiveTiming";
        public static final String PROPERTY_TIME_FROM_START = "timeFromStart";
        public static final String PROPERTY_GROUP_MEASURE = "groupMeasure";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public EvidenceVariableCharacteristic(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references).
         * This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of
         * the basic definition of the element. To make the use of extensions
         * safe and manageable, there is a strict set of governance  applied to
         * the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met
         * as part of the definition of the extension.
         */
        public java.util.List<Extension> extension() {
            return getList(Extension.class, PROPERTY_EXTENSION);
        }

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
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * A short, natural language description of the characteristic that could
         * be used to communicate the criteria to an end-user.
         */
        public String description() {
            return getString(PROPERTY_DESCRIPTION);
        }

        /**
         * Define members of the evidence element using Codes (such as condition,
         * medication, or observation), Expressions ( using an expression
         * language such as FHIRPath or CQL) or DataRequirements (such as
         * Diabetes diagnosis onset in the last year).
         */
        public Reference definitionReference() {
            return getObject(Reference.class, PROPERTY_DEFINITION_REFERENCE);
        }

        /**
         * Define members of the evidence element using Codes (such as condition,
         * medication, or observation), Expressions ( using an expression
         * language such as FHIRPath or CQL) or DataRequirements (such as
         * Diabetes diagnosis onset in the last year).
         */
        public String definitionCanonical() {
            return getString(PROPERTY_DEFINITION_CANONICAL);
        }

        /**
         * Define members of the evidence element using Codes (such as condition,
         * medication, or observation), Expressions ( using an expression
         * language such as FHIRPath or CQL) or DataRequirements (such as
         * Diabetes diagnosis onset in the last year).
         */
        public CodeableConcept definitionCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_DEFINITION_CODEABLE_CONCEPT);
        }

        /**
         * Define members of the evidence element using Codes (such as condition,
         * medication, or observation), Expressions ( using an expression
         * language such as FHIRPath or CQL) or DataRequirements (such as
         * Diabetes diagnosis onset in the last year).
         */
        public Expression definitionExpression() {
            return getObject(Expression.class, PROPERTY_DEFINITION_EXPRESSION);
        }

        /**
         * Define members of the evidence element using Codes (such as condition,
         * medication, or observation), Expressions ( using an expression
         * language such as FHIRPath or CQL) or DataRequirements (such as
         * Diabetes diagnosis onset in the last year).
         */
        public DataRequirement definitionDataRequirement() {
            return getObject(DataRequirement.class, PROPERTY_DEFINITION_DATA_REQUIREMENT);
        }

        /**
         * Define members of the evidence element using Codes (such as condition,
         * medication, or observation), Expressions ( using an expression
         * language such as FHIRPath or CQL) or DataRequirements (such as
         * Diabetes diagnosis onset in the last year).
         */
        public TriggerDefinition definitionTriggerDefinition() {
            return getObject(TriggerDefinition.class, PROPERTY_DEFINITION_TRIGGER_DEFINITION);
        }

        /**
         * Use UsageContext to define the members of the population, such as Age
         * Ranges, Genders, Settings.
         */
        public java.util.List<UsageContext> usageContext() {
            return getList(UsageContext.class, PROPERTY_USAGE_CONTEXT);
        }

        /**
         * When true, members with this characteristic are excluded from the
         * element.
         */
        public Boolean exclude() {
            return data.getBoolean(PROPERTY_EXCLUDE);
        }

        /**
         * Indicates what effective period the study covers.
         */
        public String participantEffectiveDateTime() {
            return getString(PROPERTY_PARTICIPANT_EFFECTIVE_DATE_TIME);
        }

        /**
         * Indicates what effective period the study covers.
         */
        public Period participantEffectivePeriod() {
            return getObject(Period.class, PROPERTY_PARTICIPANT_EFFECTIVE_PERIOD);
        }

        /**
         * Indicates what effective period the study covers.
         */
        public Duration participantEffectiveDuration() {
            return getObject(Duration.class, PROPERTY_PARTICIPANT_EFFECTIVE_DURATION);
        }

        /**
         * Indicates what effective period the study covers.
         */
        public Timing participantEffectiveTiming() {
            return getObject(Timing.class, PROPERTY_PARTICIPANT_EFFECTIVE_TIMING);
        }

        /**
         * Indicates duration from the participant's study entry.
         */
        public Duration timeFromStart() {
            return getObject(Duration.class, PROPERTY_TIME_FROM_START);
        }

        /**
         * Indicates how elements are aggregated within the study effective
         * period.
         */
        public String groupMeasure() {
            return getString(PROPERTY_GROUP_MEASURE);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder extension(final java.util.List<Extension> extension) {
                b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder description(final String description) {
                b.add(PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder definitionReference(final Reference definitionReference) {
                b.add(PROPERTY_DEFINITION_REFERENCE, definitionReference);
                return this;
            }

            public Builder definitionCanonical(final String definitionCanonical) {
                b.add(PROPERTY_DEFINITION_CANONICAL, definitionCanonical);
                return this;
            }

            public Builder definitionCodeableConcept(final CodeableConcept definitionCodeableConcept) {
                b.add(PROPERTY_DEFINITION_CODEABLE_CONCEPT, definitionCodeableConcept);
                return this;
            }

            public Builder definitionExpression(final Expression definitionExpression) {
                b.add(PROPERTY_DEFINITION_EXPRESSION, definitionExpression);
                return this;
            }

            public Builder definitionDataRequirement(final DataRequirement definitionDataRequirement) {
                b.add(PROPERTY_DEFINITION_DATA_REQUIREMENT, definitionDataRequirement);
                return this;
            }

            public Builder definitionTriggerDefinition(final TriggerDefinition definitionTriggerDefinition) {
                b.add(PROPERTY_DEFINITION_TRIGGER_DEFINITION, definitionTriggerDefinition);
                return this;
            }

            public Builder usageContext(final java.util.List<UsageContext> usageContext) {
                b.add(PROPERTY_USAGE_CONTEXT, FhirObject.toArray(usageContext));
                return this;
            }

            public Builder exclude(final Boolean exclude) {
                b.add(PROPERTY_EXCLUDE, exclude);
                return this;
            }

            public Builder participantEffectiveDateTime(final String participantEffectiveDateTime) {
                b.add(PROPERTY_PARTICIPANT_EFFECTIVE_DATE_TIME, participantEffectiveDateTime);
                return this;
            }

            public Builder participantEffectivePeriod(final Period participantEffectivePeriod) {
                b.add(PROPERTY_PARTICIPANT_EFFECTIVE_PERIOD, participantEffectivePeriod);
                return this;
            }

            public Builder participantEffectiveDuration(final Duration participantEffectiveDuration) {
                b.add(PROPERTY_PARTICIPANT_EFFECTIVE_DURATION, participantEffectiveDuration);
                return this;
            }

            public Builder participantEffectiveTiming(final Timing participantEffectiveTiming) {
                b.add(PROPERTY_PARTICIPANT_EFFECTIVE_TIMING, participantEffectiveTiming);
                return this;
            }

            public Builder timeFromStart(final Duration timeFromStart) {
                b.add(PROPERTY_TIME_FROM_START, timeFromStart);
                return this;
            }

            public Builder groupMeasure(final String groupMeasure) {
                b.add(PROPERTY_GROUP_MEASURE, groupMeasure);
                return this;
            }

            public EvidenceVariableCharacteristic build() {
                return new EvidenceVariableCharacteristic(b.build());
            }
        }
    }
}
