/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ChargeItemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ChargeItem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ChargeItem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", ChargeItem.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", ChargeItem.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ChargeItem.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", ChargeItem.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ChargeItem.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ChargeItem.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().identifier(value).build().identifier());
    }

    @Test
    public void testDefinitionUri() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().definitionUri(value).build().definitionUri());
    }

    @Test
    public void testDefinitionCanonical() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().definitionCanonical(value).build().definitionCanonical());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ChargeItem.create().status("x").build().status());
    }

    @Test
    public void testPartOf() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().partOf(value).build().partOf());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ChargeItem.create().code(value).build().code());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, ChargeItem.create().subject(value).build().subject());
    }

    @Test
    public void testContext() {
        final Reference value = Reference.create().build();
        assertEquals(value, ChargeItem.create().context(value).build().context());
    }

    @Test
    public void testOccurrenceDateTime() {
        assertEquals("x", ChargeItem.create().occurrenceDateTime("x").build().occurrenceDateTime());
    }

    @Test
    public void testOccurrencePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ChargeItem.create().occurrencePeriod(value).build().occurrencePeriod());
    }

    @Test
    public void testOccurrenceTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, ChargeItem.create().occurrenceTiming(value).build().occurrenceTiming());
    }

    @Test
    public void testPerformer() {
        final java.util.List<ChargeItem.ChargeItemPerformer> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().performer(value).build().performer());
    }

    @Test
    public void testPerformingOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, ChargeItem.create().performingOrganization(value).build().performingOrganization());
    }

    @Test
    public void testRequestingOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, ChargeItem.create().requestingOrganization(value).build().requestingOrganization());
    }

    @Test
    public void testCostCenter() {
        final Reference value = Reference.create().build();
        assertEquals(value, ChargeItem.create().costCenter(value).build().costCenter());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ChargeItem.create().quantity(value).build().quantity());
    }

    @Test
    public void testBodysite() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().bodysite(value).build().bodysite());
    }

    @Test
    public void testFactorOverride() {
        assertEquals(1.0, ChargeItem.create().factorOverride(1.0).build().factorOverride());
    }

    @Test
    public void testPriceOverride() {
        final Money value = Money.create().build();
        assertEquals(value, ChargeItem.create().priceOverride(value).build().priceOverride());
    }

    @Test
    public void testOverrideReason() {
        assertEquals("x", ChargeItem.create().overrideReason("x").build().overrideReason());
    }

    @Test
    public void testEnterer() {
        final Reference value = Reference.create().build();
        assertEquals(value, ChargeItem.create().enterer(value).build().enterer());
    }

    @Test
    public void testEnteredDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ChargeItem.create().enteredDate(value).build().enteredDate());
    }

    @Test
    public void testReason() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().reason(value).build().reason());
    }

    @Test
    public void testService() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().service(value).build().service());
    }

    @Test
    public void testProductReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ChargeItem.create().productReference(value).build().productReference());
    }

    @Test
    public void testProductCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ChargeItem.create().productCodeableConcept(value).build().productCodeableConcept());
    }

    @Test
    public void testAccount() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().account(value).build().account());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().note(value).build().note());
    }

    @Test
    public void testSupportingInformation() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItem.create().supportingInformation(value).build().supportingInformation());
    }
}
