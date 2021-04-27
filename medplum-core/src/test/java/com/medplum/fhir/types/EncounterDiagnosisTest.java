/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EncounterDiagnosisTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Encounter.EncounterDiagnosis(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Encounter.EncounterDiagnosis.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Encounter.EncounterDiagnosis.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Encounter.EncounterDiagnosis.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Encounter.EncounterDiagnosis.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCondition() {
        final Reference value = Reference.create().build();
        assertEquals(value, Encounter.EncounterDiagnosis.create().condition(value).build().condition());
    }

    @Test
    public void testUse() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Encounter.EncounterDiagnosis.create().use(value).build().use());
    }

    @Test
    public void testRank() {
        assertEquals(1, Encounter.EncounterDiagnosis.create().rank(1).build().rank());
    }
}
