/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExampleScenarioVersionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExampleScenario.ExampleScenarioVersion(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExampleScenario.ExampleScenarioVersion.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ExampleScenario.ExampleScenarioVersion.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioVersion.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioVersion.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testVersionId() {
        assertEquals("x", ExampleScenario.ExampleScenarioVersion.create().versionId("x").build().versionId());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ExampleScenario.ExampleScenarioVersion.create().description("x").build().description());
    }
}
