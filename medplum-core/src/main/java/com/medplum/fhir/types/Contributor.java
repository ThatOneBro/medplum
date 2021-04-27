/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Contributor extends FhirResource {
    public static final String RESOURCE_TYPE = "Contributor";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_CONTACT = "contact";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Contributor(final JsonObject data) {
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
     * The type of contributor.
     */
    public String type() {
        return getString(PROPERTY_TYPE);
    }

    /**
     * The name of the individual or organization responsible for the
     * contribution.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * contributor.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, PROPERTY_CONTACT);
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

        public Builder type(final String type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Contributor build() {
            return new Contributor(b.build());
        }
    }
}
