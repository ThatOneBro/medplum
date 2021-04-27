/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ConditionEvidenceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Condition.ConditionEvidence(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Condition.ConditionEvidence.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Condition.ConditionEvidence.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.ConditionEvidence.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.ConditionEvidence.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.ConditionEvidence.create().code(value).build().code());
    }

    @Test
    public void testDetail() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.ConditionEvidence.create().detail(value).build().detail());
    }
}
