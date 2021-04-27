/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImplementationGuidePage1Test {

    @Test
    public void testConstructor() {
        assertNotNull(new ImplementationGuide.ImplementationGuidePage1(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImplementationGuide.ImplementationGuidePage1.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ImplementationGuide.ImplementationGuidePage1.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuidePage1.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuidePage1.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", ImplementationGuide.ImplementationGuidePage1.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", ImplementationGuide.ImplementationGuidePage1.create().title("x").build().title());
    }

    @Test
    public void testAnchor() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuidePage1.create().anchor(value).build().anchor());
    }
}
