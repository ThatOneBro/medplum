/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class InsurancePlanBenefitTest {

    @Test
    public void testConstructor() {
        assertNotNull(new InsurancePlan.InsurancePlanBenefit(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(InsurancePlan.InsurancePlanBenefit.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", InsurancePlan.InsurancePlanBenefit.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit.create().type(value).build().type());
    }

    @Test
    public void testRequirement() {
        assertEquals("x", InsurancePlan.InsurancePlanBenefit.create().requirement("x").build().requirement());
    }

    @Test
    public void testLimit() {
        final java.util.List<InsurancePlan.InsurancePlanLimit> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit.create().limit(value).build().limit());
    }
}
