/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestScriptVariableTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestScript.TestScriptVariable(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestScript.TestScriptVariable.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TestScript.TestScriptVariable.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptVariable.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptVariable.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", TestScript.TestScriptVariable.create().name("x").build().name());
    }

    @Test
    public void testDefaultValue() {
        assertEquals("x", TestScript.TestScriptVariable.create().defaultValue("x").build().defaultValue());
    }

    @Test
    public void testDescription() {
        assertEquals("x", TestScript.TestScriptVariable.create().description("x").build().description());
    }

    @Test
    public void testExpression() {
        assertEquals("x", TestScript.TestScriptVariable.create().expression("x").build().expression());
    }

    @Test
    public void testHeaderField() {
        assertEquals("x", TestScript.TestScriptVariable.create().headerField("x").build().headerField());
    }

    @Test
    public void testHint() {
        assertEquals("x", TestScript.TestScriptVariable.create().hint("x").build().hint());
    }

    @Test
    public void testPath() {
        assertEquals("x", TestScript.TestScriptVariable.create().path("x").build().path());
    }

    @Test
    public void testSourceId() {
        assertEquals("x", TestScript.TestScriptVariable.create().sourceId("x").build().sourceId());
    }
}
