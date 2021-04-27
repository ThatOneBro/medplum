/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class DeviceMetric extends FhirResource {
    public static final String RESOURCE_TYPE = "DeviceMetric";
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
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_UNIT = "unit";
    public static final String PROPERTY_SOURCE = "source";
    public static final String PROPERTY_PARENT = "parent";
    public static final String PROPERTY_OPERATIONAL_STATUS = "operationalStatus";
    public static final String PROPERTY_COLOR = "color";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_MEASUREMENT_PERIOD = "measurementPeriod";
    public static final String PROPERTY_CALIBRATION = "calibration";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public DeviceMetric(final JsonObject data) {
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
     * Unique instance identifiers assigned to a device by the device or
     * gateway software, manufacturers, other organizations or owners. For
     * example: handle ID.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Describes the type of the metric. For example: Heart Rate, PEEP
     * Setting, etc.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * Describes the unit that an observed value determined for this metric
     * will have. For example: Percent, Seconds, etc.
     */
    public CodeableConcept unit() {
        return getObject(CodeableConcept.class, PROPERTY_UNIT);
    }

    /**
     * Describes the link to the  Device that this DeviceMetric belongs to
     * and that contains administrative device information such as
     * manufacturer, serial number, etc.
     */
    public Reference source() {
        return getObject(Reference.class, PROPERTY_SOURCE);
    }

    /**
     * Describes the link to the  Device that this DeviceMetric belongs to
     * and that provide information about the location of this DeviceMetric
     * in the containment structure of the parent Device. An example would be
     * a Device that represents a Channel. This reference can be used by a
     * client application to distinguish DeviceMetrics that have the same
     * type, but should be interpreted based on their containment location.
     */
    public Reference parent() {
        return getObject(Reference.class, PROPERTY_PARENT);
    }

    /**
     * Indicates current operational state of the device. For example: On,
     * Off, Standby, etc.
     */
    public String operationalStatus() {
        return getString(PROPERTY_OPERATIONAL_STATUS);
    }

    /**
     * Describes the color representation for the metric. This is often used
     * to aid clinicians to track and identify parameter types by color. In
     * practice, consider a Patient Monitor that has ECG/HR and Pleth for
     * example; the parameters are displayed in different characteristic
     * colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     */
    public String color() {
        return getString(PROPERTY_COLOR);
    }

    /**
     * Indicates the category of the observation generation process. A
     * DeviceMetric can be for example a setting, measurement, or
     * calculation.
     */
    public String category() {
        return getString(PROPERTY_CATEGORY);
    }

    /**
     * Describes the measurement repetition time. This is not necessarily the
     * same as the update period. The measurement repetition time can range
     * from milliseconds up to hours. An example for a measurement repetition
     * time in the range of milliseconds is the sampling rate of an ECG. An
     * example for a measurement repetition time in the range of hours is a
     * NIBP that is triggered automatically every hour. The update period may
     * be different than the measurement repetition time, if the device does
     * not update the published observed value with the same frequency as it
     * was measured.
     */
    public Timing measurementPeriod() {
        return getObject(Timing.class, PROPERTY_MEASUREMENT_PERIOD);
    }

    /**
     * Describes the calibrations that have been performed or that are
     * required to be performed.
     */
    public java.util.List<DeviceMetricCalibration> calibration() {
        return getList(DeviceMetricCalibration.class, PROPERTY_CALIBRATION);
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

        public Builder type(final CodeableConcept type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder unit(final CodeableConcept unit) {
            b.add(PROPERTY_UNIT, unit);
            return this;
        }

        public Builder source(final Reference source) {
            b.add(PROPERTY_SOURCE, source);
            return this;
        }

        public Builder parent(final Reference parent) {
            b.add(PROPERTY_PARENT, parent);
            return this;
        }

        public Builder operationalStatus(final String operationalStatus) {
            b.add(PROPERTY_OPERATIONAL_STATUS, operationalStatus);
            return this;
        }

        public Builder color(final String color) {
            b.add(PROPERTY_COLOR, color);
            return this;
        }

        public Builder category(final String category) {
            b.add(PROPERTY_CATEGORY, category);
            return this;
        }

        public Builder measurementPeriod(final Timing measurementPeriod) {
            b.add(PROPERTY_MEASUREMENT_PERIOD, measurementPeriod);
            return this;
        }

        public Builder calibration(final java.util.List<DeviceMetricCalibration> calibration) {
            b.add(PROPERTY_CALIBRATION, FhirObject.toArray(calibration));
            return this;
        }

        public DeviceMetric build() {
            return new DeviceMetric(b.build());
        }
    }

    public static class DeviceMetricCalibration extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceMetricCalibration";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_STATE = "state";
        public static final String PROPERTY_TIME = "time";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceMetricCalibration(final JsonObject data) {
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
         * Describes the type of the calibration method.
         */
        public String type() {
            return getString(PROPERTY_TYPE);
        }

        /**
         * Describes the state of the calibration.
         */
        public String state() {
            return getString(PROPERTY_STATE);
        }

        /**
         * Describes the time last calibration has been performed.
         */
        public java.time.Instant time() {
            return java.time.Instant.parse(data.getString(PROPERTY_TIME));
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

            public Builder type(final String type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder state(final String state) {
                b.add(PROPERTY_STATE, state);
                return this;
            }

            public Builder time(final java.time.Instant time) {
                b.add(PROPERTY_TIME, time.toString());
                return this;
            }

            public DeviceMetricCalibration build() {
                return new DeviceMetricCalibration(b.build());
            }
        }
    }
}
