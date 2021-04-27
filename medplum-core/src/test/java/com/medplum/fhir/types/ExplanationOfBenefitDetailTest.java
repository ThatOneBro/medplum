/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitDetailTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitDetail(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitDetail.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitDetail.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().sequence(1).build().sequence());
    }

    @Test
    public void testRevenue() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().revenue(value).build().revenue());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().category(value).build().category());
    }

    @Test
    public void testProductOrService() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().productOrService(value).build().productOrService());
    }

    @Test
    public void testModifier() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().modifier(value).build().modifier());
    }

    @Test
    public void testProgramCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().programCode(value).build().programCode());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().quantity(value).build().quantity());
    }

    @Test
    public void testUnitPrice() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().unitPrice(value).build().unitPrice());
    }

    @Test
    public void testFactor() {
        assertEquals(1.0, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().factor(1.0).build().factor());
    }

    @Test
    public void testNet() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().net(value).build().net());
    }

    @Test
    public void testUdi() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().udi(value).build().udi());
    }

    @Test
    public void testNoteNumber() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().noteNumber(value).build().noteNumber());
    }

    @Test
    public void testAdjudication() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitAdjudication> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().adjudication(value).build().adjudication());
    }

    @Test
    public void testSubDetail() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitSubDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail.create().subDetail(value).build().subDetail());
    }
}
