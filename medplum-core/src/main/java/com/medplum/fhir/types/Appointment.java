/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Appointment extends FhirResource {
    public static final String RESOURCE_TYPE = "Appointment";
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
    public static final String PROPERTY_CANCELATION_REASON = "cancelationReason";
    public static final String PROPERTY_SERVICE_CATEGORY = "serviceCategory";
    public static final String PROPERTY_SERVICE_TYPE = "serviceType";
    public static final String PROPERTY_SPECIALTY = "specialty";
    public static final String PROPERTY_APPOINTMENT_TYPE = "appointmentType";
    public static final String PROPERTY_REASON_CODE = "reasonCode";
    public static final String PROPERTY_REASON_REFERENCE = "reasonReference";
    public static final String PROPERTY_PRIORITY = "priority";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_SUPPORTING_INFORMATION = "supportingInformation";
    public static final String PROPERTY_START = "start";
    public static final String PROPERTY_END = "end";
    public static final String PROPERTY_MINUTES_DURATION = "minutesDuration";
    public static final String PROPERTY_SLOT = "slot";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_COMMENT = "comment";
    public static final String PROPERTY_PATIENT_INSTRUCTION = "patientInstruction";
    public static final String PROPERTY_BASED_ON = "basedOn";
    public static final String PROPERTY_PARTICIPANT = "participant";
    public static final String PROPERTY_REQUESTED_PERIOD = "requestedPeriod";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Appointment(final JsonObject data) {
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
     * This records identifiers associated with this appointment concern that
     * are defined by business processes and/or used to refer to it when a
     * direct URL reference to the resource itself is not appropriate (e.g.
     * in CDA documents, or in written / printed documentation).
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The overall status of the Appointment. Each of the participants has
     * their own participation status which indicates their involvement in
     * the process, however this status indicates the shared status.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * The coded reason for the appointment being cancelled. This is often
     * used in reporting/billing/futher processing to determine if further
     * actions are required, or specific fees apply.
     */
    public CodeableConcept cancelationReason() {
        return getObject(CodeableConcept.class, PROPERTY_CANCELATION_REASON);
    }

    /**
     * A broad categorization of the service that is to be performed during
     * this appointment.
     */
    public java.util.List<CodeableConcept> serviceCategory() {
        return getList(CodeableConcept.class, PROPERTY_SERVICE_CATEGORY);
    }

    /**
     * The specific service that is to be performed during this appointment.
     */
    public java.util.List<CodeableConcept> serviceType() {
        return getList(CodeableConcept.class, PROPERTY_SERVICE_TYPE);
    }

    /**
     * The specialty of a practitioner that would be required to perform the
     * service requested in this appointment.
     */
    public java.util.List<CodeableConcept> specialty() {
        return getList(CodeableConcept.class, PROPERTY_SPECIALTY);
    }

    /**
     * The style of appointment or patient that has been booked in the slot
     * (not service type).
     */
    public CodeableConcept appointmentType() {
        return getObject(CodeableConcept.class, PROPERTY_APPOINTMENT_TYPE);
    }

    /**
     * The coded reason that this appointment is being scheduled. This is
     * more clinical than administrative.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASON_CODE);
    }

    /**
     * Reason the appointment has been scheduled to take place, as specified
     * using information from another resource. When the patient arrives and
     * the encounter begins it may be used as the admission diagnosis. The
     * indication will typically be a Condition (with other resources
     * referenced in the evidence.detail), or a Procedure.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASON_REFERENCE);
    }

    /**
     * The priority of the appointment. Can be used to make informed
     * decisions if needing to re-prioritize appointments. (The iCal Standard
     * specifies 0 as undefined, 1 as highest, 9 as lowest priority).
     */
    public Integer priority() {
        return data.getInt(PROPERTY_PRIORITY);
    }

    /**
     * The brief description of the appointment as would be shown on a
     * subject line in a meeting request, or appointment list. Detailed or
     * expanded information should be put in the comment field.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * Additional information to support the appointment provided when making
     * the appointment.
     */
    public java.util.List<Reference> supportingInformation() {
        return getList(Reference.class, PROPERTY_SUPPORTING_INFORMATION);
    }

    /**
     * Date/Time that the appointment is to take place.
     */
    public java.time.Instant start() {
        return java.time.Instant.parse(data.getString(PROPERTY_START));
    }

    /**
     * Date/Time that the appointment is to conclude.
     */
    public java.time.Instant end() {
        return java.time.Instant.parse(data.getString(PROPERTY_END));
    }

    /**
     * Number of minutes that the appointment is to take. This can be less
     * than the duration between the start and end times.  For example, where
     * the actual time of appointment is only an estimate or if a 30 minute
     * appointment is being requested, but any time would work.  Also, if
     * there is, for example, a planned 15 minute break in the middle of a
     * long appointment, the duration may be 15 minutes less than the
     * difference between the start and end.
     */
    public Integer minutesDuration() {
        return data.getInt(PROPERTY_MINUTES_DURATION);
    }

    /**
     * The slots from the participants' schedules that will be filled by the
     * appointment.
     */
    public java.util.List<Reference> slot() {
        return getList(Reference.class, PROPERTY_SLOT);
    }

    /**
     * The date that this appointment was initially created. This could be
     * different to the meta.lastModified value on the initial entry, as this
     * could have been before the resource was created on the FHIR server,
     * and should remain unchanged over the lifespan of the appointment.
     */
    public java.time.Instant created() {
        return java.time.Instant.parse(data.getString(PROPERTY_CREATED));
    }

    /**
     * Additional comments about the appointment.
     */
    public String comment() {
        return getString(PROPERTY_COMMENT);
    }

    /**
     * While Appointment.comment contains information for internal use,
     * Appointment.patientInstructions is used to capture patient facing
     * information about the Appointment (e.g. please bring your referral or
     * fast from 8pm night before).
     */
    public String patientInstruction() {
        return getString(PROPERTY_PATIENT_INSTRUCTION);
    }

    /**
     * The service request this appointment is allocated to assess (e.g.
     * incoming referral or procedure request).
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, PROPERTY_BASED_ON);
    }

    /**
     * List of participants involved in the appointment.
     */
    public java.util.List<AppointmentParticipant> participant() {
        return getList(AppointmentParticipant.class, PROPERTY_PARTICIPANT);
    }

    /**
     * A set of date ranges (potentially including times) that the
     * appointment is preferred to be scheduled within.
     *
     * The duration (usually in minutes) could also be provided to indicate
     * the length of the appointment to fill and populate the start/end times
     * for the actual allocated time. However, in other situations the
     * duration may be calculated by the scheduling system.
     */
    public java.util.List<Period> requestedPeriod() {
        return getList(Period.class, PROPERTY_REQUESTED_PERIOD);
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

        public Builder cancelationReason(final CodeableConcept cancelationReason) {
            b.add(PROPERTY_CANCELATION_REASON, cancelationReason);
            return this;
        }

        public Builder serviceCategory(final java.util.List<CodeableConcept> serviceCategory) {
            b.add(PROPERTY_SERVICE_CATEGORY, FhirObject.toArray(serviceCategory));
            return this;
        }

        public Builder serviceType(final java.util.List<CodeableConcept> serviceType) {
            b.add(PROPERTY_SERVICE_TYPE, FhirObject.toArray(serviceType));
            return this;
        }

        public Builder specialty(final java.util.List<CodeableConcept> specialty) {
            b.add(PROPERTY_SPECIALTY, FhirObject.toArray(specialty));
            return this;
        }

        public Builder appointmentType(final CodeableConcept appointmentType) {
            b.add(PROPERTY_APPOINTMENT_TYPE, appointmentType);
            return this;
        }

        public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
            b.add(PROPERTY_REASON_CODE, FhirObject.toArray(reasonCode));
            return this;
        }

        public Builder reasonReference(final java.util.List<Reference> reasonReference) {
            b.add(PROPERTY_REASON_REFERENCE, FhirObject.toArray(reasonReference));
            return this;
        }

        public Builder priority(final Integer priority) {
            b.add(PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder supportingInformation(final java.util.List<Reference> supportingInformation) {
            b.add(PROPERTY_SUPPORTING_INFORMATION, FhirObject.toArray(supportingInformation));
            return this;
        }

        public Builder start(final java.time.Instant start) {
            b.add(PROPERTY_START, start.toString());
            return this;
        }

        public Builder end(final java.time.Instant end) {
            b.add(PROPERTY_END, end.toString());
            return this;
        }

        public Builder minutesDuration(final Integer minutesDuration) {
            b.add(PROPERTY_MINUTES_DURATION, minutesDuration);
            return this;
        }

        public Builder slot(final java.util.List<Reference> slot) {
            b.add(PROPERTY_SLOT, FhirObject.toArray(slot));
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder comment(final String comment) {
            b.add(PROPERTY_COMMENT, comment);
            return this;
        }

        public Builder patientInstruction(final String patientInstruction) {
            b.add(PROPERTY_PATIENT_INSTRUCTION, patientInstruction);
            return this;
        }

        public Builder basedOn(final java.util.List<Reference> basedOn) {
            b.add(PROPERTY_BASED_ON, FhirObject.toArray(basedOn));
            return this;
        }

        public Builder participant(final java.util.List<AppointmentParticipant> participant) {
            b.add(PROPERTY_PARTICIPANT, FhirObject.toArray(participant));
            return this;
        }

        public Builder requestedPeriod(final java.util.List<Period> requestedPeriod) {
            b.add(PROPERTY_REQUESTED_PERIOD, FhirObject.toArray(requestedPeriod));
            return this;
        }

        public Appointment build() {
            return new Appointment(b.build());
        }
    }

    public static class AppointmentParticipant extends FhirObject {
        public static final String RESOURCE_TYPE = "AppointmentParticipant";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_ACTOR = "actor";
        public static final String PROPERTY_REQUIRED = "required";
        public static final String PROPERTY_STATUS = "status";
        public static final String PROPERTY_PERIOD = "period";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AppointmentParticipant(final JsonObject data) {
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
         * Role of participant in the appointment.
         */
        public java.util.List<CodeableConcept> type() {
            return getList(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * A Person, Location/HealthcareService or Device that is participating
         * in the appointment.
         */
        public Reference actor() {
            return getObject(Reference.class, PROPERTY_ACTOR);
        }

        /**
         * Whether this participant is required to be present at the meeting.
         * This covers a use-case where two doctors need to meet to discuss the
         * results for a specific patient, and the patient is not required to be
         * present.
         */
        public String required() {
            return getString(PROPERTY_REQUIRED);
        }

        /**
         * Participation status of the actor.
         */
        public String status() {
            return getString(PROPERTY_STATUS);
        }

        /**
         * Participation period of the actor.
         */
        public Period period() {
            return getObject(Period.class, PROPERTY_PERIOD);
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

            public Builder type(final java.util.List<CodeableConcept> type) {
                b.add(PROPERTY_TYPE, FhirObject.toArray(type));
                return this;
            }

            public Builder actor(final Reference actor) {
                b.add(PROPERTY_ACTOR, actor);
                return this;
            }

            public Builder required(final String required) {
                b.add(PROPERTY_REQUIRED, required);
                return this;
            }

            public Builder status(final String status) {
                b.add(PROPERTY_STATUS, status);
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public AppointmentParticipant build() {
                return new AppointmentParticipant(b.build());
            }
        }
    }
}
