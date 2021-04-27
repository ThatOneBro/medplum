/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CompositionSectionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Composition.CompositionSection(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Composition.CompositionSection.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Composition.CompositionSection.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionSection.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionSection.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testTitle() {
        assertEquals("x", Composition.CompositionSection.create().title("x").build().title());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Composition.CompositionSection.create().code(value).build().code());
    }

    @Test
    public void testAuthor() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionSection.create().author(value).build().author());
    }

    @Test
    public void testFocus() {
        final Reference value = Reference.create().build();
        assertEquals(value, Composition.CompositionSection.create().focus(value).build().focus());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Composition.CompositionSection.create().text(value).build().text());
    }

    @Test
    public void testMode() {
        assertEquals("x", Composition.CompositionSection.create().mode("x").build().mode());
    }

    @Test
    public void testOrderedBy() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Composition.CompositionSection.create().orderedBy(value).build().orderedBy());
    }

    @Test
    public void testEntry() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionSection.create().entry(value).build().entry());
    }

    @Test
    public void testEmptyReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Composition.CompositionSection.create().emptyReason(value).build().emptyReason());
    }

    @Test
    public void testSection() {
        final java.util.List<Composition.CompositionSection> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionSection.create().section(value).build().section());
    }
}
