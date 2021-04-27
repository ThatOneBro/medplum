/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class RiskEvidenceSynthesisRiskEstimateTest {

    @Test
    public void testConstructor() {
        assertNotNull(new RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().description("x").build().description());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().type(value).build().type());
    }

    @Test
    public void testValue() {
        assertEquals(1.0, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().value(1.0).build().value());
    }

    @Test
    public void testUnitOfMeasure() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().unitOfMeasure(value).build().unitOfMeasure());
    }

    @Test
    public void testDenominatorCount() {
        assertEquals(1, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().denominatorCount(1).build().denominatorCount());
    }

    @Test
    public void testNumeratorCount() {
        assertEquals(1, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().numeratorCount(1).build().numeratorCount());
    }

    @Test
    public void testPrecisionEstimate() {
        final java.util.List<RiskEvidenceSynthesis.RiskEvidenceSynthesisPrecisionEstimate> value = java.util.Collections.emptyList();
        assertEquals(value, RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimate.create().precisionEstimate(value).build().precisionEstimate());
    }
}
