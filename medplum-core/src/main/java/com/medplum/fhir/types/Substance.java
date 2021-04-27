/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Substance extends FhirResource {
    public static final String RESOURCE_TYPE = "Substance";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_INSTANCE = "instance";
    public static final String PROPERTY_INGREDIENT = "ingredient";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Substance(final JsonObject data) {
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
     * Unique identifier for the substance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * A code to indicate if the substance is actively used.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * A code that classifies the general type of substance.  This is used 
     * for searching, sorting and display purposes.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * A code (or set of codes) that identify this substance.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * A description of the substance - its appearance, handling
     * requirements, and other usage notes.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * Substance may be used to describe a kind of substance, or a specific
     * package/container of the substance: an instance.
     */
    public java.util.List<SubstanceInstance> instance() {
        return getList(SubstanceInstance.class, PROPERTY_INSTANCE);
    }

    /**
     * A substance can be composed of other substances.
     */
    public java.util.List<SubstanceIngredient> ingredient() {
        return getList(SubstanceIngredient.class, PROPERTY_INGREDIENT);
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

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder instance(final java.util.List<SubstanceInstance> instance) {
            b.add(PROPERTY_INSTANCE, FhirObject.toArray(instance));
            return this;
        }

        public Builder ingredient(final java.util.List<SubstanceIngredient> ingredient) {
            b.add(PROPERTY_INGREDIENT, FhirObject.toArray(ingredient));
            return this;
        }

        public Substance build() {
            return new Substance(b.build());
        }
    }

    public static class SubstanceIngredient extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceIngredient";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_QUANTITY = "quantity";
        public static final String PROPERTY_SUBSTANCE_CODEABLE_CONCEPT = "substanceCodeableConcept";
        public static final String PROPERTY_SUBSTANCE_REFERENCE = "substanceReference";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceIngredient(final JsonObject data) {
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
         * The amount of the ingredient in the substance - a concentration ratio.
         */
        public Ratio quantity() {
            return getObject(Ratio.class, PROPERTY_QUANTITY);
        }

        /**
         * Another substance that is a component of this substance.
         */
        public CodeableConcept substanceCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_SUBSTANCE_CODEABLE_CONCEPT);
        }

        /**
         * Another substance that is a component of this substance.
         */
        public Reference substanceReference() {
            return getObject(Reference.class, PROPERTY_SUBSTANCE_REFERENCE);
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

            public Builder quantity(final Ratio quantity) {
                b.add(PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder substanceCodeableConcept(final CodeableConcept substanceCodeableConcept) {
                b.add(PROPERTY_SUBSTANCE_CODEABLE_CONCEPT, substanceCodeableConcept);
                return this;
            }

            public Builder substanceReference(final Reference substanceReference) {
                b.add(PROPERTY_SUBSTANCE_REFERENCE, substanceReference);
                return this;
            }

            public SubstanceIngredient build() {
                return new SubstanceIngredient(b.build());
            }
        }
    }

    public static class SubstanceInstance extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceInstance";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_IDENTIFIER = "identifier";
        public static final String PROPERTY_EXPIRY = "expiry";
        public static final String PROPERTY_QUANTITY = "quantity";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceInstance(final JsonObject data) {
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
         * Identifier associated with the package/container (usually a label
         * affixed directly).
         */
        public Identifier identifier() {
            return getObject(Identifier.class, PROPERTY_IDENTIFIER);
        }

        /**
         * When the substance is no longer valid to use. For some substances, a
         * single arbitrary date is used for expiry.
         */
        public java.time.Instant expiry() {
            return java.time.Instant.parse(data.getString(PROPERTY_EXPIRY));
        }

        /**
         * The amount of the substance.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, PROPERTY_QUANTITY);
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

            public Builder identifier(final Identifier identifier) {
                b.add(PROPERTY_IDENTIFIER, identifier);
                return this;
            }

            public Builder expiry(final java.time.Instant expiry) {
                b.add(PROPERTY_EXPIRY, expiry.toString());
                return this;
            }

            public Builder quantity(final Quantity quantity) {
                b.add(PROPERTY_QUANTITY, quantity);
                return this;
            }

            public SubstanceInstance build() {
                return new SubstanceInstance(b.build());
            }
        }
    }
}
