/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DocumentManifestTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DocumentManifest(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DocumentManifest.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", DocumentManifest.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", DocumentManifest.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, DocumentManifest.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", DocumentManifest.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", DocumentManifest.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, DocumentManifest.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMasterIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, DocumentManifest.create().masterIdentifier(value).build().masterIdentifier());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", DocumentManifest.create().status("x").build().status());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DocumentManifest.create().type(value).build().type());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, DocumentManifest.create().subject(value).build().subject());
    }

    @Test
    public void testCreated() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, DocumentManifest.create().created(value).build().created());
    }

    @Test
    public void testAuthor() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().author(value).build().author());
    }

    @Test
    public void testRecipient() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().recipient(value).build().recipient());
    }

    @Test
    public void testSource() {
        assertEquals("x", DocumentManifest.create().source("x").build().source());
    }

    @Test
    public void testDescription() {
        assertEquals("x", DocumentManifest.create().description("x").build().description());
    }

    @Test
    public void testContent() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().content(value).build().content());
    }

    @Test
    public void testRelated() {
        final java.util.List<DocumentManifest.DocumentManifestRelated> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.create().related(value).build().related());
    }
}
