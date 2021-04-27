/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class BodyStructureTest {

    @Test
    public void testConstructor() {
        assertNotNull(new BodyStructure(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(BodyStructure.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", BodyStructure.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", BodyStructure.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, BodyStructure.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", BodyStructure.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", BodyStructure.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, BodyStructure.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, BodyStructure.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, BodyStructure.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, BodyStructure.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, BodyStructure.create().identifier(value).build().identifier());
    }

    @Test
    public void testActive() {
        assertEquals(true, BodyStructure.create().active(true).build().active());
    }

    @Test
    public void testMorphology() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, BodyStructure.create().morphology(value).build().morphology());
    }

    @Test
    public void testLocation() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, BodyStructure.create().location(value).build().location());
    }

    @Test
    public void testLocationQualifier() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, BodyStructure.create().locationQualifier(value).build().locationQualifier());
    }

    @Test
    public void testDescription() {
        assertEquals("x", BodyStructure.create().description("x").build().description());
    }

    @Test
    public void testImage() {
        final java.util.List<Attachment> value = java.util.Collections.emptyList();
        assertEquals(value, BodyStructure.create().image(value).build().image());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, BodyStructure.create().patient(value).build().patient());
    }
}
