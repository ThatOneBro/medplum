/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class MedicinalProductContraindication extends FhirResource {
    public static final String RESOURCE_TYPE = "MedicinalProductContraindication";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_DISEASE = "disease";
    public static final String PROPERTY_DISEASE_STATUS = "diseaseStatus";
    public static final String PROPERTY_COMORBIDITY = "comorbidity";
    public static final String PROPERTY_THERAPEUTIC_INDICATION = "therapeuticIndication";
    public static final String PROPERTY_OTHER_THERAPY = "otherTherapy";
    public static final String PROPERTY_POPULATION = "population";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductContraindication(final JsonObject data) {
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
     * The medication for which this is an indication.
     */
    public java.util.List<Reference> subject() {
        return getList(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The disease, symptom or procedure for the contraindication.
     */
    public CodeableConcept disease() {
        return getObject(CodeableConcept.class, PROPERTY_DISEASE);
    }

    /**
     * The status of the disease or symptom for the contraindication.
     */
    public CodeableConcept diseaseStatus() {
        return getObject(CodeableConcept.class, PROPERTY_DISEASE_STATUS);
    }

    /**
     * A comorbidity (concurrent condition) or coinfection.
     */
    public java.util.List<CodeableConcept> comorbidity() {
        return getList(CodeableConcept.class, PROPERTY_COMORBIDITY);
    }

    /**
     * Information about the use of the medicinal product in relation to
     * other therapies as part of the indication.
     */
    public java.util.List<Reference> therapeuticIndication() {
        return getList(Reference.class, PROPERTY_THERAPEUTIC_INDICATION);
    }

    /**
     * Information about the use of the medicinal product in relation to
     * other therapies described as part of the indication.
     */
    public java.util.List<MedicinalProductContraindicationOtherTherapy> otherTherapy() {
        return getList(MedicinalProductContraindicationOtherTherapy.class, PROPERTY_OTHER_THERAPY);
    }

    /**
     * The population group to which this applies.
     */
    public java.util.List<Population> population() {
        return getList(Population.class, PROPERTY_POPULATION);
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

        public Builder subject(final java.util.List<Reference> subject) {
            b.add(PROPERTY_SUBJECT, FhirObject.toArray(subject));
            return this;
        }

        public Builder disease(final CodeableConcept disease) {
            b.add(PROPERTY_DISEASE, disease);
            return this;
        }

        public Builder diseaseStatus(final CodeableConcept diseaseStatus) {
            b.add(PROPERTY_DISEASE_STATUS, diseaseStatus);
            return this;
        }

        public Builder comorbidity(final java.util.List<CodeableConcept> comorbidity) {
            b.add(PROPERTY_COMORBIDITY, FhirObject.toArray(comorbidity));
            return this;
        }

        public Builder therapeuticIndication(final java.util.List<Reference> therapeuticIndication) {
            b.add(PROPERTY_THERAPEUTIC_INDICATION, FhirObject.toArray(therapeuticIndication));
            return this;
        }

        public Builder otherTherapy(final java.util.List<MedicinalProductContraindicationOtherTherapy> otherTherapy) {
            b.add(PROPERTY_OTHER_THERAPY, FhirObject.toArray(otherTherapy));
            return this;
        }

        public Builder population(final java.util.List<Population> population) {
            b.add(PROPERTY_POPULATION, FhirObject.toArray(population));
            return this;
        }

        public MedicinalProductContraindication build() {
            return new MedicinalProductContraindication(b.build());
        }
    }

    public static class MedicinalProductContraindicationOtherTherapy extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductContraindicationOtherTherapy";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_THERAPY_RELATIONSHIP_TYPE = "therapyRelationshipType";
        public static final String PROPERTY_MEDICATION_CODEABLE_CONCEPT = "medicationCodeableConcept";
        public static final String PROPERTY_MEDICATION_REFERENCE = "medicationReference";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductContraindicationOtherTherapy(final JsonObject data) {
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
         * The type of relationship between the medicinal product indication or
         * contraindication and another therapy.
         */
        public CodeableConcept therapyRelationshipType() {
            return getObject(CodeableConcept.class, PROPERTY_THERAPY_RELATIONSHIP_TYPE);
        }

        /**
         * Reference to a specific medication (active substance, medicinal
         * product or class of products) as part of an indication or
         * contraindication.
         */
        public CodeableConcept medicationCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_MEDICATION_CODEABLE_CONCEPT);
        }

        /**
         * Reference to a specific medication (active substance, medicinal
         * product or class of products) as part of an indication or
         * contraindication.
         */
        public Reference medicationReference() {
            return getObject(Reference.class, PROPERTY_MEDICATION_REFERENCE);
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

            public Builder therapyRelationshipType(final CodeableConcept therapyRelationshipType) {
                b.add(PROPERTY_THERAPY_RELATIONSHIP_TYPE, therapyRelationshipType);
                return this;
            }

            public Builder medicationCodeableConcept(final CodeableConcept medicationCodeableConcept) {
                b.add(PROPERTY_MEDICATION_CODEABLE_CONCEPT, medicationCodeableConcept);
                return this;
            }

            public Builder medicationReference(final Reference medicationReference) {
                b.add(PROPERTY_MEDICATION_REFERENCE, medicationReference);
                return this;
            }

            public MedicinalProductContraindicationOtherTherapy build() {
                return new MedicinalProductContraindicationOtherTherapy(b.build());
            }
        }
    }
}
