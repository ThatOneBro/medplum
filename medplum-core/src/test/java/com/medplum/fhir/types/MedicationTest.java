/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Medication(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Medication.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", Medication.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Medication.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Medication.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Medication.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Medication.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Medication.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.create().identifier(value).build().identifier());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Medication.create().code(value).build().code());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Medication.create().status("x").build().status());
    }

    @Test
    public void testManufacturer() {
        final Reference value = Reference.create().build();
        assertEquals(value, Medication.create().manufacturer(value).build().manufacturer());
    }

    @Test
    public void testForm() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Medication.create().form(value).build().form());
    }

    @Test
    public void testAmount() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, Medication.create().amount(value).build().amount());
    }

    @Test
    public void testIngredient() {
        final java.util.List<Medication.MedicationIngredient> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.create().ingredient(value).build().ingredient());
    }

    @Test
    public void testBatch() {
        final Medication.MedicationBatch value = Medication.MedicationBatch.create().build();
        assertEquals(value, Medication.create().batch(value).build().batch());
    }
}
