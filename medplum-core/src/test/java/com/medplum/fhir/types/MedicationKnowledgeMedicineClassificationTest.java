/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationKnowledgeMedicineClassificationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationKnowledge.MedicationKnowledgeMedicineClassification(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationKnowledge.MedicationKnowledgeMedicineClassification.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeMedicineClassification.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMedicineClassification.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMedicineClassification.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMedicineClassification.create().type(value).build().type());
    }

    @Test
    public void testClassification() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMedicineClassification.create().classification(value).build().classification());
    }
}
