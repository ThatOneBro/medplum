/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MeasurePopulationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Measure.MeasurePopulation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Measure.MeasurePopulation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Measure.MeasurePopulation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.MeasurePopulation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.MeasurePopulation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Measure.MeasurePopulation.create().code(value).build().code());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Measure.MeasurePopulation.create().description("x").build().description());
    }

    @Test
    public void testCriteria() {
        final Expression value = Expression.create().build();
        assertEquals(value, Measure.MeasurePopulation.create().criteria(value).build().criteria());
    }
}
