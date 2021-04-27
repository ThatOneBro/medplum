/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimResponseErrorTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ClaimResponse.ClaimResponseError(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClaimResponse.ClaimResponseError.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ClaimResponse.ClaimResponseError.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseError.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseError.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testItemSequence() {
        assertEquals(1, ClaimResponse.ClaimResponseError.create().itemSequence(1).build().itemSequence());
    }

    @Test
    public void testDetailSequence() {
        assertEquals(1, ClaimResponse.ClaimResponseError.create().detailSequence(1).build().detailSequence());
    }

    @Test
    public void testSubDetailSequence() {
        assertEquals(1, ClaimResponse.ClaimResponseError.create().subDetailSequence(1).build().subDetailSequence());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseError.create().code(value).build().code());
    }
}
