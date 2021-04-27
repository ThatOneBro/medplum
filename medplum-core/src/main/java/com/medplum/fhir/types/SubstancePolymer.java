/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class SubstancePolymer extends FhirResource {
    public static final String RESOURCE_TYPE = "SubstancePolymer";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_CLASS = "class";
    public static final String PROPERTY_GEOMETRY = "geometry";
    public static final String PROPERTY_COPOLYMER_CONNECTIVITY = "copolymerConnectivity";
    public static final String PROPERTY_MODIFICATION = "modification";
    public static final String PROPERTY_MONOMER_SET = "monomerSet";
    public static final String PROPERTY_REPEAT = "repeat";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SubstancePolymer(final JsonObject data) {
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
     * Todo.
     */
    public CodeableConcept classValue() {
        return getObject(CodeableConcept.class, PROPERTY_CLASS);
    }

    /**
     * Todo.
     */
    public CodeableConcept geometry() {
        return getObject(CodeableConcept.class, PROPERTY_GEOMETRY);
    }

    /**
     * Todo.
     */
    public java.util.List<CodeableConcept> copolymerConnectivity() {
        return getList(CodeableConcept.class, PROPERTY_COPOLYMER_CONNECTIVITY);
    }

    /**
     * Todo.
     */
    public java.util.List<String> modification() {
        return getList(String.class, PROPERTY_MODIFICATION);
    }

    /**
     * Todo.
     */
    public java.util.List<SubstancePolymerMonomerSet> monomerSet() {
        return getList(SubstancePolymerMonomerSet.class, PROPERTY_MONOMER_SET);
    }

    /**
     * Todo.
     */
    public java.util.List<SubstancePolymerRepeat> repeat() {
        return getList(SubstancePolymerRepeat.class, PROPERTY_REPEAT);
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

        public Builder classValue(final CodeableConcept classValue) {
            b.add(PROPERTY_CLASS, classValue);
            return this;
        }

        public Builder geometry(final CodeableConcept geometry) {
            b.add(PROPERTY_GEOMETRY, geometry);
            return this;
        }

        public Builder copolymerConnectivity(final java.util.List<CodeableConcept> copolymerConnectivity) {
            b.add(PROPERTY_COPOLYMER_CONNECTIVITY, FhirObject.toArray(copolymerConnectivity));
            return this;
        }

        public Builder modification(final java.util.List<String> modification) {
            b.add(PROPERTY_MODIFICATION, FhirObject.toStringArray(modification));
            return this;
        }

        public Builder monomerSet(final java.util.List<SubstancePolymerMonomerSet> monomerSet) {
            b.add(PROPERTY_MONOMER_SET, FhirObject.toArray(monomerSet));
            return this;
        }

        public Builder repeat(final java.util.List<SubstancePolymerRepeat> repeat) {
            b.add(PROPERTY_REPEAT, FhirObject.toArray(repeat));
            return this;
        }

        public SubstancePolymer build() {
            return new SubstancePolymer(b.build());
        }
    }

    public static class SubstancePolymerDegreeOfPolymerisation extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstancePolymerDegreeOfPolymerisation";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_DEGREE = "degree";
        public static final String PROPERTY_AMOUNT = "amount";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstancePolymerDegreeOfPolymerisation(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept degree() {
            return getObject(CodeableConcept.class, PROPERTY_DEGREE);
        }

        /**
         * Todo.
         */
        public SubstanceAmount amount() {
            return getObject(SubstanceAmount.class, PROPERTY_AMOUNT);
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

            public Builder degree(final CodeableConcept degree) {
                b.add(PROPERTY_DEGREE, degree);
                return this;
            }

            public Builder amount(final SubstanceAmount amount) {
                b.add(PROPERTY_AMOUNT, amount);
                return this;
            }

            public SubstancePolymerDegreeOfPolymerisation build() {
                return new SubstancePolymerDegreeOfPolymerisation(b.build());
            }
        }
    }

    public static class SubstancePolymerMonomerSet extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstancePolymerMonomerSet";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_RATIO_TYPE = "ratioType";
        public static final String PROPERTY_STARTING_MATERIAL = "startingMaterial";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstancePolymerMonomerSet(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept ratioType() {
            return getObject(CodeableConcept.class, PROPERTY_RATIO_TYPE);
        }

        /**
         * Todo.
         */
        public java.util.List<SubstancePolymerStartingMaterial> startingMaterial() {
            return getList(SubstancePolymerStartingMaterial.class, PROPERTY_STARTING_MATERIAL);
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

            public Builder ratioType(final CodeableConcept ratioType) {
                b.add(PROPERTY_RATIO_TYPE, ratioType);
                return this;
            }

            public Builder startingMaterial(final java.util.List<SubstancePolymerStartingMaterial> startingMaterial) {
                b.add(PROPERTY_STARTING_MATERIAL, FhirObject.toArray(startingMaterial));
                return this;
            }

            public SubstancePolymerMonomerSet build() {
                return new SubstancePolymerMonomerSet(b.build());
            }
        }
    }

    public static class SubstancePolymerRepeat extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstancePolymerRepeat";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_NUMBER_OF_UNITS = "numberOfUnits";
        public static final String PROPERTY_AVERAGE_MOLECULAR_FORMULA = "averageMolecularFormula";
        public static final String PROPERTY_REPEAT_UNIT_AMOUNT_TYPE = "repeatUnitAmountType";
        public static final String PROPERTY_REPEAT_UNIT = "repeatUnit";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstancePolymerRepeat(final JsonObject data) {
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
         * Todo.
         */
        public Integer numberOfUnits() {
            return data.getInt(PROPERTY_NUMBER_OF_UNITS);
        }

        /**
         * Todo.
         */
        public String averageMolecularFormula() {
            return getString(PROPERTY_AVERAGE_MOLECULAR_FORMULA);
        }

        /**
         * Todo.
         */
        public CodeableConcept repeatUnitAmountType() {
            return getObject(CodeableConcept.class, PROPERTY_REPEAT_UNIT_AMOUNT_TYPE);
        }

        /**
         * Todo.
         */
        public java.util.List<SubstancePolymerRepeatUnit> repeatUnit() {
            return getList(SubstancePolymerRepeatUnit.class, PROPERTY_REPEAT_UNIT);
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

            public Builder numberOfUnits(final Integer numberOfUnits) {
                b.add(PROPERTY_NUMBER_OF_UNITS, numberOfUnits);
                return this;
            }

            public Builder averageMolecularFormula(final String averageMolecularFormula) {
                b.add(PROPERTY_AVERAGE_MOLECULAR_FORMULA, averageMolecularFormula);
                return this;
            }

            public Builder repeatUnitAmountType(final CodeableConcept repeatUnitAmountType) {
                b.add(PROPERTY_REPEAT_UNIT_AMOUNT_TYPE, repeatUnitAmountType);
                return this;
            }

            public Builder repeatUnit(final java.util.List<SubstancePolymerRepeatUnit> repeatUnit) {
                b.add(PROPERTY_REPEAT_UNIT, FhirObject.toArray(repeatUnit));
                return this;
            }

            public SubstancePolymerRepeat build() {
                return new SubstancePolymerRepeat(b.build());
            }
        }
    }

    public static class SubstancePolymerRepeatUnit extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstancePolymerRepeatUnit";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_ORIENTATION_OF_POLYMERISATION = "orientationOfPolymerisation";
        public static final String PROPERTY_REPEAT_UNIT = "repeatUnit";
        public static final String PROPERTY_AMOUNT = "amount";
        public static final String PROPERTY_DEGREE_OF_POLYMERISATION = "degreeOfPolymerisation";
        public static final String PROPERTY_STRUCTURAL_REPRESENTATION = "structuralRepresentation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstancePolymerRepeatUnit(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept orientationOfPolymerisation() {
            return getObject(CodeableConcept.class, PROPERTY_ORIENTATION_OF_POLYMERISATION);
        }

        /**
         * Todo.
         */
        public String repeatUnit() {
            return getString(PROPERTY_REPEAT_UNIT);
        }

        /**
         * Todo.
         */
        public SubstanceAmount amount() {
            return getObject(SubstanceAmount.class, PROPERTY_AMOUNT);
        }

        /**
         * Todo.
         */
        public java.util.List<SubstancePolymerDegreeOfPolymerisation> degreeOfPolymerisation() {
            return getList(SubstancePolymerDegreeOfPolymerisation.class, PROPERTY_DEGREE_OF_POLYMERISATION);
        }

        /**
         * Todo.
         */
        public java.util.List<SubstancePolymerStructuralRepresentation> structuralRepresentation() {
            return getList(SubstancePolymerStructuralRepresentation.class, PROPERTY_STRUCTURAL_REPRESENTATION);
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

            public Builder orientationOfPolymerisation(final CodeableConcept orientationOfPolymerisation) {
                b.add(PROPERTY_ORIENTATION_OF_POLYMERISATION, orientationOfPolymerisation);
                return this;
            }

            public Builder repeatUnit(final String repeatUnit) {
                b.add(PROPERTY_REPEAT_UNIT, repeatUnit);
                return this;
            }

            public Builder amount(final SubstanceAmount amount) {
                b.add(PROPERTY_AMOUNT, amount);
                return this;
            }

            public Builder degreeOfPolymerisation(final java.util.List<SubstancePolymerDegreeOfPolymerisation> degreeOfPolymerisation) {
                b.add(PROPERTY_DEGREE_OF_POLYMERISATION, FhirObject.toArray(degreeOfPolymerisation));
                return this;
            }

            public Builder structuralRepresentation(final java.util.List<SubstancePolymerStructuralRepresentation> structuralRepresentation) {
                b.add(PROPERTY_STRUCTURAL_REPRESENTATION, FhirObject.toArray(structuralRepresentation));
                return this;
            }

            public SubstancePolymerRepeatUnit build() {
                return new SubstancePolymerRepeatUnit(b.build());
            }
        }
    }

    public static class SubstancePolymerStartingMaterial extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstancePolymerStartingMaterial";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_MATERIAL = "material";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_IS_DEFINING = "isDefining";
        public static final String PROPERTY_AMOUNT = "amount";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstancePolymerStartingMaterial(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept material() {
            return getObject(CodeableConcept.class, PROPERTY_MATERIAL);
        }

        /**
         * Todo.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * Todo.
         */
        public Boolean isDefining() {
            return data.getBoolean(PROPERTY_IS_DEFINING);
        }

        /**
         * Todo.
         */
        public SubstanceAmount amount() {
            return getObject(SubstanceAmount.class, PROPERTY_AMOUNT);
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

            public Builder material(final CodeableConcept material) {
                b.add(PROPERTY_MATERIAL, material);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder isDefining(final Boolean isDefining) {
                b.add(PROPERTY_IS_DEFINING, isDefining);
                return this;
            }

            public Builder amount(final SubstanceAmount amount) {
                b.add(PROPERTY_AMOUNT, amount);
                return this;
            }

            public SubstancePolymerStartingMaterial build() {
                return new SubstancePolymerStartingMaterial(b.build());
            }
        }
    }

    public static class SubstancePolymerStructuralRepresentation extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstancePolymerStructuralRepresentation";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_REPRESENTATION = "representation";
        public static final String PROPERTY_ATTACHMENT = "attachment";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstancePolymerStructuralRepresentation(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * Todo.
         */
        public String representation() {
            return getString(PROPERTY_REPRESENTATION);
        }

        /**
         * Todo.
         */
        public Attachment attachment() {
            return getObject(Attachment.class, PROPERTY_ATTACHMENT);
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

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder representation(final String representation) {
                b.add(PROPERTY_REPRESENTATION, representation);
                return this;
            }

            public Builder attachment(final Attachment attachment) {
                b.add(PROPERTY_ATTACHMENT, attachment);
                return this;
            }

            public SubstancePolymerStructuralRepresentation build() {
                return new SubstancePolymerStructuralRepresentation(b.build());
            }
        }
    }
}
