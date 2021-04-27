/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class NutritionOrderNutrientTest {

    @Test
    public void testConstructor() {
        assertNotNull(new NutritionOrder.NutritionOrderNutrient(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(NutritionOrder.NutritionOrderNutrient.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", NutritionOrder.NutritionOrderNutrient.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, NutritionOrder.NutritionOrderNutrient.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, NutritionOrder.NutritionOrderNutrient.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testModifier() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, NutritionOrder.NutritionOrderNutrient.create().modifier(value).build().modifier());
    }

    @Test
    public void testAmount() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, NutritionOrder.NutritionOrderNutrient.create().amount(value).build().amount());
    }
}
