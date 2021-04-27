/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SpecimenProcessingTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Specimen.SpecimenProcessing(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Specimen.SpecimenProcessing.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Specimen.SpecimenProcessing.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Specimen.SpecimenProcessing.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Specimen.SpecimenProcessing.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Specimen.SpecimenProcessing.create().description("x").build().description());
    }

    @Test
    public void testProcedure() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Specimen.SpecimenProcessing.create().procedure(value).build().procedure());
    }

    @Test
    public void testAdditive() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Specimen.SpecimenProcessing.create().additive(value).build().additive());
    }

    @Test
    public void testTimeDateTime() {
        assertEquals("x", Specimen.SpecimenProcessing.create().timeDateTime("x").build().timeDateTime());
    }

    @Test
    public void testTimePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Specimen.SpecimenProcessing.create().timePeriod(value).build().timePeriod());
    }
}
