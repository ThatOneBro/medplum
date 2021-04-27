/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class GraphDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new GraphDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(GraphDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", GraphDefinition.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", GraphDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, GraphDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", GraphDefinition.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", GraphDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, GraphDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, GraphDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, GraphDefinition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, GraphDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        assertEquals("x", GraphDefinition.create().url("x").build().url());
    }

    @Test
    public void testVersion() {
        assertEquals("x", GraphDefinition.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", GraphDefinition.create().name("x").build().name());
    }

    @Test
    public void testStatus() {
        assertEquals("x", GraphDefinition.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, GraphDefinition.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, GraphDefinition.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", GraphDefinition.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, GraphDefinition.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", GraphDefinition.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, GraphDefinition.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, GraphDefinition.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", GraphDefinition.create().purpose("x").build().purpose());
    }

    @Test
    public void testStart() {
        assertEquals("x", GraphDefinition.create().start("x").build().start());
    }

    @Test
    public void testProfile() {
        assertEquals("x", GraphDefinition.create().profile("x").build().profile());
    }

    @Test
    public void testLink() {
        final java.util.List<GraphDefinition.GraphDefinitionLink> value = java.util.Collections.emptyList();
        assertEquals(value, GraphDefinition.create().link(value).build().link());
    }
}
