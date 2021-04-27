/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExampleScenarioContainedInstanceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExampleScenario.ExampleScenarioContainedInstance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExampleScenario.ExampleScenarioContainedInstance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ExampleScenario.ExampleScenarioContainedInstance.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioContainedInstance.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioContainedInstance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testResourceId() {
        assertEquals("x", ExampleScenario.ExampleScenarioContainedInstance.create().resourceId("x").build().resourceId());
    }

    @Test
    public void testVersionId() {
        assertEquals("x", ExampleScenario.ExampleScenarioContainedInstance.create().versionId("x").build().versionId());
    }
}
