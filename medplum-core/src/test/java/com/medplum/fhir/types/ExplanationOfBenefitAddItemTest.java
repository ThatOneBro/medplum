/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitAddItemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitAddItem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitAddItem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testItemSequence() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().itemSequence(value).build().itemSequence());
    }

    @Test
    public void testDetailSequence() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().detailSequence(value).build().detailSequence());
    }

    @Test
    public void testSubDetailSequence() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().subDetailSequence(value).build().subDetailSequence());
    }

    @Test
    public void testProvider() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().provider(value).build().provider());
    }

    @Test
    public void testProductOrService() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().productOrService(value).build().productOrService());
    }

    @Test
    public void testModifier() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().modifier(value).build().modifier());
    }

    @Test
    public void testProgramCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().programCode(value).build().programCode());
    }

    @Test
    public void testServicedDate() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().servicedDate("x").build().servicedDate());
    }

    @Test
    public void testServicedPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().servicedPeriod(value).build().servicedPeriod());
    }

    @Test
    public void testLocationCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().locationCodeableConcept(value).build().locationCodeableConcept());
    }

    @Test
    public void testLocationAddress() {
        final Address value = Address.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().locationAddress(value).build().locationAddress());
    }

    @Test
    public void testLocationReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().locationReference(value).build().locationReference());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().quantity(value).build().quantity());
    }

    @Test
    public void testUnitPrice() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().unitPrice(value).build().unitPrice());
    }

    @Test
    public void testFactor() {
        assertEquals(1.0, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().factor(1.0).build().factor());
    }

    @Test
    public void testNet() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().net(value).build().net());
    }

    @Test
    public void testBodySite() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().bodySite(value).build().bodySite());
    }

    @Test
    public void testSubSite() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().subSite(value).build().subSite());
    }

    @Test
    public void testNoteNumber() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().noteNumber(value).build().noteNumber());
    }

    @Test
    public void testAdjudication() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitAdjudication> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().adjudication(value).build().adjudication());
    }

    @Test
    public void testDetail() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitDetail1> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitAddItem.create().detail(value).build().detail());
    }
}
