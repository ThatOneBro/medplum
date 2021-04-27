/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ValueSetParameterTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ValueSet.ValueSetParameter(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ValueSet.ValueSetParameter.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ValueSet.ValueSetParameter.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetParameter.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetParameter.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", ValueSet.ValueSetParameter.create().name("x").build().name());
    }

    @Test
    public void testValueString() {
        assertEquals("x", ValueSet.ValueSetParameter.create().valueString("x").build().valueString());
    }

    @Test
    public void testValueBoolean() {
        assertEquals(true, ValueSet.ValueSetParameter.create().valueBoolean(true).build().valueBoolean());
    }

    @Test
    public void testValueInteger() {
        assertEquals(1, ValueSet.ValueSetParameter.create().valueInteger(1).build().valueInteger());
    }

    @Test
    public void testValueDecimal() {
        assertEquals(1, ValueSet.ValueSetParameter.create().valueDecimal(1).build().valueDecimal());
    }

    @Test
    public void testValueUri() {
        assertEquals("x", ValueSet.ValueSetParameter.create().valueUri("x").build().valueUri());
    }

    @Test
    public void testValueCode() {
        assertEquals("x", ValueSet.ValueSetParameter.create().valueCode("x").build().valueCode());
    }

    @Test
    public void testValueDateTime() {
        assertEquals("x", ValueSet.ValueSetParameter.create().valueDateTime("x").build().valueDateTime());
    }
}
