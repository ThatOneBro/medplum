/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class DocumentManifest extends FhirResource {
    public static final String RESOURCE_TYPE = "DocumentManifest";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_MASTER_IDENTIFIER = "masterIdentifier";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_AUTHOR = "author";
    public static final String PROPERTY_RECIPIENT = "recipient";
    public static final String PROPERTY_SOURCE = "source";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_CONTENT = "content";
    public static final String PROPERTY_RELATED = "related";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public DocumentManifest(final JsonObject data) {
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
     * A single identifier that uniquely identifies this manifest.
     * Principally used to refer to the manifest in non-FHIR contexts.
     */
    public Identifier masterIdentifier() {
        return getObject(Identifier.class, PROPERTY_MASTER_IDENTIFIER);
    }

    /**
     * Other identifiers associated with the document manifest, including
     * version independent  identifiers.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The status of this document manifest.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * The code specifying the type of clinical activity that resulted in
     * placing the associated content into the DocumentManifest.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * Who or what the set of documents is about. The documents can be about
     * a person, (patient or healthcare practitioner), a device (i.e.
     * machine) or even a group of subjects (such as a document about a herd
     * of farm animals, or a set of patients that share a common exposure).
     * If the documents cross more than one subject, then more than one
     * subject is allowed here (unusual use case).
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * When the document manifest was created for submission to the server
     * (not necessarily the same thing as the actual resource last modified
     * time, since it may be modified, replicated, etc.).
     */
    public java.time.Instant created() {
        return java.time.Instant.parse(data.getString(PROPERTY_CREATED));
    }

    /**
     * Identifies who is the author of the manifest. Manifest author is not
     * necessarly the author of the references included.
     */
    public java.util.List<Reference> author() {
        return getList(Reference.class, PROPERTY_AUTHOR);
    }

    /**
     * A patient, practitioner, or organization for which this set of
     * documents is intended.
     */
    public java.util.List<Reference> recipient() {
        return getList(Reference.class, PROPERTY_RECIPIENT);
    }

    /**
     * Identifies the source system, application, or software that produced
     * the document manifest.
     */
    public String source() {
        return getString(PROPERTY_SOURCE);
    }

    /**
     * Human-readable description of the source document. This is sometimes
     * known as the &quot;title&quot;.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * The list of Resources that consist of the parts of this manifest.
     */
    public java.util.List<Reference> content() {
        return getList(Reference.class, PROPERTY_CONTENT);
    }

    /**
     * Related identifiers or resources associated with the DocumentManifest.
     */
    public java.util.List<DocumentManifestRelated> related() {
        return getList(DocumentManifestRelated.class, PROPERTY_RELATED);
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

        public Builder masterIdentifier(final Identifier masterIdentifier) {
            b.add(PROPERTY_MASTER_IDENTIFIER, masterIdentifier);
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

        public Builder type(final CodeableConcept type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder author(final java.util.List<Reference> author) {
            b.add(PROPERTY_AUTHOR, FhirObject.toArray(author));
            return this;
        }

        public Builder recipient(final java.util.List<Reference> recipient) {
            b.add(PROPERTY_RECIPIENT, FhirObject.toArray(recipient));
            return this;
        }

        public Builder source(final String source) {
            b.add(PROPERTY_SOURCE, source);
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder content(final java.util.List<Reference> content) {
            b.add(PROPERTY_CONTENT, FhirObject.toArray(content));
            return this;
        }

        public Builder related(final java.util.List<DocumentManifestRelated> related) {
            b.add(PROPERTY_RELATED, FhirObject.toArray(related));
            return this;
        }

        public DocumentManifest build() {
            return new DocumentManifest(b.build());
        }
    }

    public static class DocumentManifestRelated extends FhirObject {
        public static final String RESOURCE_TYPE = "DocumentManifestRelated";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_IDENTIFIER = "identifier";
        public static final String PROPERTY_REF = "ref";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DocumentManifestRelated(final JsonObject data) {
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
         * Related identifier to this DocumentManifest.  For example, Order
         * numbers, accession numbers, XDW workflow numbers.
         */
        public Identifier identifier() {
            return getObject(Identifier.class, PROPERTY_IDENTIFIER);
        }

        /**
         * Related Resource to this DocumentManifest. For example, Order,
         * ServiceRequest,  Procedure, EligibilityRequest, etc.
         */
        public Reference ref() {
            return getObject(Reference.class, PROPERTY_REF);
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

            public Builder ref(final Reference ref) {
                b.add(PROPERTY_REF, ref);
                return this;
            }

            public DocumentManifestRelated build() {
                return new DocumentManifestRelated(b.build());
            }
        }
    }
}
