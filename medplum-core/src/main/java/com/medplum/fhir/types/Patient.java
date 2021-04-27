/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Patient extends FhirResource {
    public static final String RESOURCE_TYPE = "Patient";
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
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_TELECOM = "telecom";
    public static final String PROPERTY_GENDER = "gender";
    public static final String PROPERTY_BIRTH_DATE = "birthDate";
    public static final String PROPERTY_DECEASED_BOOLEAN = "deceasedBoolean";
    public static final String PROPERTY_DECEASED_DATE_TIME = "deceasedDateTime";
    public static final String PROPERTY_ADDRESS = "address";
    public static final String PROPERTY_MARITAL_STATUS = "maritalStatus";
    public static final String PROPERTY_MULTIPLE_BIRTH_BOOLEAN = "multipleBirthBoolean";
    public static final String PROPERTY_MULTIPLE_BIRTH_INTEGER = "multipleBirthInteger";
    public static final String PROPERTY_PHOTO = "photo";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_COMMUNICATION = "communication";
    public static final String PROPERTY_GENERAL_PRACTITIONER = "generalPractitioner";
    public static final String PROPERTY_MANAGING_ORGANIZATION = "managingOrganization";
    public static final String PROPERTY_LINK = "link";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Patient(final JsonObject data) {
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
     * An identifier for this patient.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Whether this patient record is in active use. 
     * Many systems use this property to mark as non-current patients, such
     * as those that have not been seen for a period of time based on an
     * organization's business rules.
     *
     * It is often used to filter patient lists to exclude inactive patients
     *
     * Deceased patients may also be marked as inactive for the same reasons,
     * but may be active for some time after death.
     */
    public Boolean active() {
        return data.getBoolean(PROPERTY_ACTIVE);
    }

    /**
     * A name associated with the individual.
     */
    public java.util.List<HumanName> name() {
        return getList(HumanName.class, PROPERTY_NAME);
    }

    /**
     * A contact detail (e.g. a telephone number or an email address) by
     * which the individual may be contacted.
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, PROPERTY_TELECOM);
    }

    /**
     * Administrative Gender - the gender that the patient is considered to
     * have for administration and record keeping purposes.
     */
    public String gender() {
        return getString(PROPERTY_GENDER);
    }

    /**
     * The date of birth for the individual.
     */
    public java.time.LocalDate birthDate() {
        return java.time.LocalDate.parse(data.getString(PROPERTY_BIRTH_DATE));
    }

    /**
     * Indicates if the individual is deceased or not.
     */
    public Boolean deceasedBoolean() {
        return data.getBoolean(PROPERTY_DECEASED_BOOLEAN);
    }

    /**
     * Indicates if the individual is deceased or not.
     */
    public String deceasedDateTime() {
        return getString(PROPERTY_DECEASED_DATE_TIME);
    }

    /**
     * An address for the individual.
     */
    public java.util.List<Address> address() {
        return getList(Address.class, PROPERTY_ADDRESS);
    }

    /**
     * This field contains a patient's most recent marital (civil) status.
     */
    public CodeableConcept maritalStatus() {
        return getObject(CodeableConcept.class, PROPERTY_MARITAL_STATUS);
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or
     * indicates the actual birth order (integer).
     */
    public Boolean multipleBirthBoolean() {
        return data.getBoolean(PROPERTY_MULTIPLE_BIRTH_BOOLEAN);
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or
     * indicates the actual birth order (integer).
     */
    public Integer multipleBirthInteger() {
        return data.getInt(PROPERTY_MULTIPLE_BIRTH_INTEGER);
    }

    /**
     * Image of the patient.
     */
    public java.util.List<Attachment> photo() {
        return getList(Attachment.class, PROPERTY_PHOTO);
    }

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     */
    public java.util.List<PatientContact> contact() {
        return getList(PatientContact.class, PROPERTY_CONTACT);
    }

    /**
     * A language which may be used to communicate with the patient about his
     * or her health.
     */
    public java.util.List<PatientCommunication> communication() {
        return getList(PatientCommunication.class, PROPERTY_COMMUNICATION);
    }

    /**
     * Patient's nominated care provider.
     */
    public java.util.List<Reference> generalPractitioner() {
        return getList(Reference.class, PROPERTY_GENERAL_PRACTITIONER);
    }

    /**
     * Organization that is the custodian of the patient record.
     */
    public Reference managingOrganization() {
        return getObject(Reference.class, PROPERTY_MANAGING_ORGANIZATION);
    }

    /**
     * Link to another patient resource that concerns the same actual
     * patient.
     */
    public java.util.List<PatientLink> link() {
        return getList(PatientLink.class, PROPERTY_LINK);
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

        public Builder active(final Boolean active) {
            b.add(PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder name(final java.util.List<HumanName> name) {
            b.add(PROPERTY_NAME, FhirObject.toArray(name));
            return this;
        }

        public Builder telecom(final java.util.List<ContactPoint> telecom) {
            b.add(PROPERTY_TELECOM, FhirObject.toArray(telecom));
            return this;
        }

        public Builder gender(final String gender) {
            b.add(PROPERTY_GENDER, gender);
            return this;
        }

        public Builder birthDate(final java.time.LocalDate birthDate) {
            b.add(PROPERTY_BIRTH_DATE, birthDate.toString());
            return this;
        }

        public Builder deceasedBoolean(final Boolean deceasedBoolean) {
            b.add(PROPERTY_DECEASED_BOOLEAN, deceasedBoolean);
            return this;
        }

        public Builder deceasedDateTime(final String deceasedDateTime) {
            b.add(PROPERTY_DECEASED_DATE_TIME, deceasedDateTime);
            return this;
        }

        public Builder address(final java.util.List<Address> address) {
            b.add(PROPERTY_ADDRESS, FhirObject.toArray(address));
            return this;
        }

        public Builder maritalStatus(final CodeableConcept maritalStatus) {
            b.add(PROPERTY_MARITAL_STATUS, maritalStatus);
            return this;
        }

        public Builder multipleBirthBoolean(final Boolean multipleBirthBoolean) {
            b.add(PROPERTY_MULTIPLE_BIRTH_BOOLEAN, multipleBirthBoolean);
            return this;
        }

        public Builder multipleBirthInteger(final Integer multipleBirthInteger) {
            b.add(PROPERTY_MULTIPLE_BIRTH_INTEGER, multipleBirthInteger);
            return this;
        }

        public Builder photo(final java.util.List<Attachment> photo) {
            b.add(PROPERTY_PHOTO, FhirObject.toArray(photo));
            return this;
        }

        public Builder contact(final java.util.List<PatientContact> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder communication(final java.util.List<PatientCommunication> communication) {
            b.add(PROPERTY_COMMUNICATION, FhirObject.toArray(communication));
            return this;
        }

        public Builder generalPractitioner(final java.util.List<Reference> generalPractitioner) {
            b.add(PROPERTY_GENERAL_PRACTITIONER, FhirObject.toArray(generalPractitioner));
            return this;
        }

        public Builder managingOrganization(final Reference managingOrganization) {
            b.add(PROPERTY_MANAGING_ORGANIZATION, managingOrganization);
            return this;
        }

        public Builder link(final java.util.List<PatientLink> link) {
            b.add(PROPERTY_LINK, FhirObject.toArray(link));
            return this;
        }

        public Patient build() {
            return new Patient(b.build());
        }
    }

    public static class PatientCommunication extends FhirObject {
        public static final String RESOURCE_TYPE = "PatientCommunication";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_LANGUAGE = "language";
        public static final String PROPERTY_PREFERRED = "preferred";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PatientCommunication(final JsonObject data) {
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
         * The ISO-639-1 alpha 2 code in lower case for the language, optionally
         * followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in
         * upper case; e.g. &quot;en&quot; for English, or &quot;en-US&quot; for American English
         * versus &quot;en-EN&quot; for England English.
         */
        public CodeableConcept language() {
            return getObject(CodeableConcept.class, PROPERTY_LANGUAGE);
        }

        /**
         * Indicates whether or not the patient prefers this language (over other
         * languages he masters up a certain level).
         */
        public Boolean preferred() {
            return data.getBoolean(PROPERTY_PREFERRED);
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

            public Builder language(final CodeableConcept language) {
                b.add(PROPERTY_LANGUAGE, language);
                return this;
            }

            public Builder preferred(final Boolean preferred) {
                b.add(PROPERTY_PREFERRED, preferred);
                return this;
            }

            public PatientCommunication build() {
                return new PatientCommunication(b.build());
            }
        }
    }

    public static class PatientContact extends FhirObject {
        public static final String RESOURCE_TYPE = "PatientContact";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_RELATIONSHIP = "relationship";
        public static final String PROPERTY_NAME = "name";
        public static final String PROPERTY_TELECOM = "telecom";
        public static final String PROPERTY_ADDRESS = "address";
        public static final String PROPERTY_GENDER = "gender";
        public static final String PROPERTY_ORGANIZATION = "organization";
        public static final String PROPERTY_PERIOD = "period";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PatientContact(final JsonObject data) {
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
         * The nature of the relationship between the patient and the contact
         * person.
         */
        public java.util.List<CodeableConcept> relationship() {
            return getList(CodeableConcept.class, PROPERTY_RELATIONSHIP);
        }

        /**
         * A name associated with the contact person.
         */
        public HumanName name() {
            return getObject(HumanName.class, PROPERTY_NAME);
        }

        /**
         * A contact detail for the person, e.g. a telephone number or an email
         * address.
         */
        public java.util.List<ContactPoint> telecom() {
            return getList(ContactPoint.class, PROPERTY_TELECOM);
        }

        /**
         * Address for the contact person.
         */
        public Address address() {
            return getObject(Address.class, PROPERTY_ADDRESS);
        }

        /**
         * Administrative Gender - the gender that the contact person is
         * considered to have for administration and record keeping purposes.
         */
        public String gender() {
            return getString(PROPERTY_GENDER);
        }

        /**
         * Organization on behalf of which the contact is acting or for which the
         * contact is working.
         */
        public Reference organization() {
            return getObject(Reference.class, PROPERTY_ORGANIZATION);
        }

        /**
         * The period during which this contact person or organization is valid
         * to be contacted relating to this patient.
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

            public Builder relationship(final java.util.List<CodeableConcept> relationship) {
                b.add(PROPERTY_RELATIONSHIP, FhirObject.toArray(relationship));
                return this;
            }

            public Builder name(final HumanName name) {
                b.add(PROPERTY_NAME, name);
                return this;
            }

            public Builder telecom(final java.util.List<ContactPoint> telecom) {
                b.add(PROPERTY_TELECOM, FhirObject.toArray(telecom));
                return this;
            }

            public Builder address(final Address address) {
                b.add(PROPERTY_ADDRESS, address);
                return this;
            }

            public Builder gender(final String gender) {
                b.add(PROPERTY_GENDER, gender);
                return this;
            }

            public Builder organization(final Reference organization) {
                b.add(PROPERTY_ORGANIZATION, organization);
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public PatientContact build() {
                return new PatientContact(b.build());
            }
        }
    }

    public static class PatientLink extends FhirObject {
        public static final String RESOURCE_TYPE = "PatientLink";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_OTHER = "other";
        public static final String PROPERTY_TYPE = "type";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PatientLink(final JsonObject data) {
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
         * The other patient resource that the link refers to.
         */
        public Reference other() {
            return getObject(Reference.class, PROPERTY_OTHER);
        }

        /**
         * The type of link between this patient resource and another patient
         * resource.
         */
        public String type() {
            return getString(PROPERTY_TYPE);
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

            public Builder other(final Reference other) {
                b.add(PROPERTY_OTHER, other);
                return this;
            }

            public Builder type(final String type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public PatientLink build() {
                return new PatientLink(b.build());
            }
        }
    }
}
