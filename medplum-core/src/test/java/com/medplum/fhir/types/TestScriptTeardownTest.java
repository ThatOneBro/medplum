/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestScriptTeardownTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestScript.TestScriptTeardown(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestScript.TestScriptTeardown.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TestScript.TestScriptTeardown.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptTeardown.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptTeardown.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAction() {
        final java.util.List<TestScript.TestScriptAction2> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptTeardown.create().action(value).build().action());
    }
}
