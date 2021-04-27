/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductPackagedBatchIdentifierTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOuterPackaging() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier.create().outerPackaging(value).build().outerPackaging());
    }

    @Test
    public void testImmediatePackaging() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier.create().immediatePackaging(value).build().immediatePackaging());
    }
}
