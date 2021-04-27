/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImplementationGuideTemplateTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ImplementationGuide.ImplementationGuideTemplate(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImplementationGuide.ImplementationGuideTemplate.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ImplementationGuide.ImplementationGuideTemplate.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuideTemplate.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuideTemplate.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        assertEquals("x", ImplementationGuide.ImplementationGuideTemplate.create().code("x").build().code());
    }

    @Test
    public void testSource() {
        assertEquals("x", ImplementationGuide.ImplementationGuideTemplate.create().source("x").build().source());
    }

    @Test
    public void testScope() {
        assertEquals("x", ImplementationGuide.ImplementationGuideTemplate.create().scope("x").build().scope());
    }
}
