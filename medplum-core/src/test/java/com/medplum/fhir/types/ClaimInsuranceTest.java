/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimInsuranceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Claim.ClaimInsurance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Claim.ClaimInsurance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Claim.ClaimInsurance.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimInsurance.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimInsurance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, Claim.ClaimInsurance.create().sequence(1).build().sequence());
    }

    @Test
    public void testFocal() {
        assertEquals(true, Claim.ClaimInsurance.create().focal(true).build().focal());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Claim.ClaimInsurance.create().identifier(value).build().identifier());
    }

    @Test
    public void testCoverage() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.ClaimInsurance.create().coverage(value).build().coverage());
    }

    @Test
    public void testBusinessArrangement() {
        assertEquals("x", Claim.ClaimInsurance.create().businessArrangement("x").build().businessArrangement());
    }

    @Test
    public void testPreAuthRef() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimInsurance.create().preAuthRef(value).build().preAuthRef());
    }

    @Test
    public void testClaimResponse() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.ClaimInsurance.create().claimResponse(value).build().claimResponse());
    }
}
