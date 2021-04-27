/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExampleScenarioActorTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExampleScenario.ExampleScenarioActor(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExampleScenario.ExampleScenarioActor.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ExampleScenario.ExampleScenarioActor.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioActor.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioActor.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testActorId() {
        assertEquals("x", ExampleScenario.ExampleScenarioActor.create().actorId("x").build().actorId());
    }

    @Test
    public void testType() {
        assertEquals("x", ExampleScenario.ExampleScenarioActor.create().type("x").build().type());
    }

    @Test
    public void testName() {
        assertEquals("x", ExampleScenario.ExampleScenarioActor.create().name("x").build().name());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ExampleScenario.ExampleScenarioActor.create().description("x").build().description());
    }
}
