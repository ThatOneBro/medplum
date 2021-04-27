/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ValueSetDesignationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ValueSet.ValueSetDesignation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ValueSet.ValueSetDesignation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ValueSet.ValueSetDesignation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetDesignation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetDesignation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ValueSet.ValueSetDesignation.create().language("x").build().language());
    }

    @Test
    public void testUse() {
        final Coding value = Coding.create().build();
        assertEquals(value, ValueSet.ValueSetDesignation.create().use(value).build().use());
    }

    @Test
    public void testValue() {
        assertEquals("x", ValueSet.ValueSetDesignation.create().value("x").build().value());
    }
}
