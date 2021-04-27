/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class VerificationResultPrimarySourceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new VerificationResult.VerificationResultPrimarySource(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(VerificationResult.VerificationResultPrimarySource.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", VerificationResult.VerificationResultPrimarySource.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testWho() {
        final Reference value = Reference.create().build();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().who(value).build().who());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().type(value).build().type());
    }

    @Test
    public void testCommunicationMethod() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().communicationMethod(value).build().communicationMethod());
    }

    @Test
    public void testValidationStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().validationStatus(value).build().validationStatus());
    }

    @Test
    public void testValidationDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().validationDate(value).build().validationDate());
    }

    @Test
    public void testCanPushUpdates() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().canPushUpdates(value).build().canPushUpdates());
    }

    @Test
    public void testPushTypeAvailable() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, VerificationResult.VerificationResultPrimarySource.create().pushTypeAvailable(value).build().pushTypeAvailable());
    }
}
