/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Organization extends FhirResource {
    public static final String RESOURCE_TYPE = "Organization";
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
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_ALIAS = "alias";
    public static final String PROPERTY_TELECOM = "telecom";
    public static final String PROPERTY_ADDRESS = "address";
    public static final String PROPERTY_PART_OF = "partOf";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_ENDPOINT = "endpoint";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Organization(final JsonObject data) {
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
     * Identifier for the organization that is used to identify the
     * organization across multiple disparate systems.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Whether the organization's record is still in active use.
     */
    public Boolean active() {
        return data.getBoolean(PROPERTY_ACTIVE);
    }

    /**
     * The kind(s) of organization that this is.
     */
    public java.util.List<CodeableConcept> type() {
        return getList(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * A name associated with the organization.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * A list of alternate names that the organization is known as, or was
     * known as in the past.
     */
    public java.util.List<String> alias() {
        return getList(String.class, PROPERTY_ALIAS);
    }

    /**
     * A contact detail for the organization.
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, PROPERTY_TELECOM);
    }

    /**
     * An address for the organization.
     */
    public java.util.List<Address> address() {
        return getList(Address.class, PROPERTY_ADDRESS);
    }

    /**
     * The organization of which this organization forms a part.
     */
    public Reference partOf() {
        return getObject(Reference.class, PROPERTY_PART_OF);
    }

    /**
     * Contact for the organization for a certain purpose.
     */
    public java.util.List<OrganizationContact> contact() {
        return getList(OrganizationContact.class, PROPERTY_CONTACT);
    }

    /**
     * Technical endpoints providing access to services operated for the
     * organization.
     */
    public java.util.List<Reference> endpoint() {
        return getList(Reference.class, PROPERTY_ENDPOINT);
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

        public Builder type(final java.util.List<CodeableConcept> type) {
            b.add(PROPERTY_TYPE, FhirObject.toArray(type));
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder alias(final java.util.List<String> alias) {
            b.add(PROPERTY_ALIAS, FhirObject.toStringArray(alias));
            return this;
        }

        public Builder telecom(final java.util.List<ContactPoint> telecom) {
            b.add(PROPERTY_TELECOM, FhirObject.toArray(telecom));
            return this;
        }

        public Builder address(final java.util.List<Address> address) {
            b.add(PROPERTY_ADDRESS, FhirObject.toArray(address));
            return this;
        }

        public Builder partOf(final Reference partOf) {
            b.add(PROPERTY_PART_OF, partOf);
            return this;
        }

        public Builder contact(final java.util.List<OrganizationContact> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder endpoint(final java.util.List<Reference> endpoint) {
            b.add(PROPERTY_ENDPOINT, FhirObject.toArray(endpoint));
            return this;
        }

        public Organization build() {
            return new Organization(b.build());
        }
    }

    public static class OrganizationContact extends FhirObject {
        public static final String RESOURCE_TYPE = "OrganizationContact";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_PURPOSE = "purpose";
        public static final String PROPERTY_NAME = "name";
        public static final String PROPERTY_TELECOM = "telecom";
        public static final String PROPERTY_ADDRESS = "address";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public OrganizationContact(final JsonObject data) {
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
         * Indicates a purpose for which the contact can be reached.
         */
        public CodeableConcept purpose() {
            return getObject(CodeableConcept.class, PROPERTY_PURPOSE);
        }

        /**
         * A name associated with the contact.
         */
        public HumanName name() {
            return getObject(HumanName.class, PROPERTY_NAME);
        }

        /**
         * A contact detail (e.g. a telephone number or an email address) by
         * which the party may be contacted.
         */
        public java.util.List<ContactPoint> telecom() {
            return getList(ContactPoint.class, PROPERTY_TELECOM);
        }

        /**
         * Visiting or postal addresses for the contact.
         */
        public Address address() {
            return getObject(Address.class, PROPERTY_ADDRESS);
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

            public Builder purpose(final CodeableConcept purpose) {
                b.add(PROPERTY_PURPOSE, purpose);
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

            public OrganizationContact build() {
                return new OrganizationContact(b.build());
            }
        }
    }
}
