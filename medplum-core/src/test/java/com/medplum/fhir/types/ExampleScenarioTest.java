/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExampleScenarioTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExampleScenario(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExampleScenario.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", ExampleScenario.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", ExampleScenario.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ExampleScenario.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", ExampleScenario.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ExampleScenario.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ExampleScenario.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        assertEquals("x", ExampleScenario.create().url("x").build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", ExampleScenario.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", ExampleScenario.create().name("x").build().name());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ExampleScenario.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, ExampleScenario.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ExampleScenario.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", ExampleScenario.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().contact(value).build().contact());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", ExampleScenario.create().copyright("x").build().copyright());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", ExampleScenario.create().purpose("x").build().purpose());
    }

    @Test
    public void testActor() {
        final java.util.List<ExampleScenario.ExampleScenarioActor> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().actor(value).build().actor());
    }

    @Test
    public void testInstance() {
        final java.util.List<ExampleScenario.ExampleScenarioInstance> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().instance(value).build().instance());
    }

    @Test
    public void testProcess() {
        final java.util.List<ExampleScenario.ExampleScenarioProcess> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().process(value).build().process());
    }

    @Test
    public void testWorkflow() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.create().workflow(value).build().workflow());
    }
}
