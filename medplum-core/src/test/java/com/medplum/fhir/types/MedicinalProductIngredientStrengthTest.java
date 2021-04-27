/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductIngredientStrengthTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductIngredient.MedicinalProductIngredientStrength(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductIngredient.MedicinalProductIngredientStrength.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductIngredient.MedicinalProductIngredientStrength.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testPresentation() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().presentation(value).build().presentation());
    }

    @Test
    public void testPresentationLowLimit() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().presentationLowLimit(value).build().presentationLowLimit());
    }

    @Test
    public void testConcentration() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().concentration(value).build().concentration());
    }

    @Test
    public void testConcentrationLowLimit() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().concentrationLowLimit(value).build().concentrationLowLimit());
    }

    @Test
    public void testMeasurementPoint() {
        assertEquals("x", MedicinalProductIngredient.MedicinalProductIngredientStrength.create().measurementPoint("x").build().measurementPoint());
    }

    @Test
    public void testCountry() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().country(value).build().country());
    }

    @Test
    public void testReferenceStrength() {
        final java.util.List<MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientStrength.create().referenceStrength(value).build().referenceStrength());
    }
}
