/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationKnowledgeDrugCharacteristicTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationKnowledge.MedicationKnowledgeDrugCharacteristic(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().type(value).build().type());
    }

    @Test
    public void testValueCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().valueCodeableConcept(value).build().valueCodeableConcept());
    }

    @Test
    public void testValueString() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().valueString("x").build().valueString());
    }

    @Test
    public void testValueQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().valueQuantity(value).build().valueQuantity());
    }

    @Test
    public void testValueBase64Binary() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeDrugCharacteristic.create().valueBase64Binary("x").build().valueBase64Binary());
    }
}
