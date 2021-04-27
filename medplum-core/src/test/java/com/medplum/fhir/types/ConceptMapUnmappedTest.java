/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ConceptMapUnmappedTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ConceptMap.ConceptMapUnmapped(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ConceptMap.ConceptMapUnmapped.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ConceptMap.ConceptMapUnmapped.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapUnmapped.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapUnmapped.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMode() {
        assertEquals("x", ConceptMap.ConceptMapUnmapped.create().mode("x").build().mode());
    }

    @Test
    public void testCode() {
        assertEquals("x", ConceptMap.ConceptMapUnmapped.create().code("x").build().code());
    }

    @Test
    public void testDisplay() {
        assertEquals("x", ConceptMap.ConceptMapUnmapped.create().display("x").build().display());
    }

    @Test
    public void testUrl() {
        assertEquals("x", ConceptMap.ConceptMapUnmapped.create().url("x").build().url());
    }
}
