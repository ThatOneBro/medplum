/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class RiskAssessmentPredictionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new RiskAssessment.RiskAssessmentPrediction(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(RiskAssessment.RiskAssessmentPrediction.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", RiskAssessment.RiskAssessmentPrediction.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.RiskAssessmentPrediction.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.RiskAssessmentPrediction.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOutcome() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, RiskAssessment.RiskAssessmentPrediction.create().outcome(value).build().outcome());
    }

    @Test
    public void testProbabilityDecimal() {
        assertEquals(1, RiskAssessment.RiskAssessmentPrediction.create().probabilityDecimal(1).build().probabilityDecimal());
    }

    @Test
    public void testProbabilityRange() {
        final Range value = Range.create().build();
        assertEquals(value, RiskAssessment.RiskAssessmentPrediction.create().probabilityRange(value).build().probabilityRange());
    }

    @Test
    public void testQualitativeRisk() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, RiskAssessment.RiskAssessmentPrediction.create().qualitativeRisk(value).build().qualitativeRisk());
    }

    @Test
    public void testRelativeRisk() {
        assertEquals(1.0, RiskAssessment.RiskAssessmentPrediction.create().relativeRisk(1.0).build().relativeRisk());
    }

    @Test
    public void testWhenPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, RiskAssessment.RiskAssessmentPrediction.create().whenPeriod(value).build().whenPeriod());
    }

    @Test
    public void testWhenRange() {
        final Range value = Range.create().build();
        assertEquals(value, RiskAssessment.RiskAssessmentPrediction.create().whenRange(value).build().whenRange());
    }

    @Test
    public void testRationale() {
        assertEquals("x", RiskAssessment.RiskAssessmentPrediction.create().rationale("x").build().rationale());
    }
}
