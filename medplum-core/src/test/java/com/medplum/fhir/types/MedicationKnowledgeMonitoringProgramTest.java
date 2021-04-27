/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationKnowledgeMonitoringProgramTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationKnowledge.MedicationKnowledgeMonitoringProgram(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationKnowledge.MedicationKnowledgeMonitoringProgram.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeMonitoringProgram.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonitoringProgram.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonitoringProgram.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonitoringProgram.create().type(value).build().type());
    }

    @Test
    public void testName() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeMonitoringProgram.create().name("x").build().name());
    }
}
