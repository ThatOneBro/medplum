/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ContractSecurityLabelTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Contract.ContractSecurityLabel(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Contract.ContractSecurityLabel.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Contract.ContractSecurityLabel.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractSecurityLabel.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractSecurityLabel.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testNumber() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractSecurityLabel.create().number(value).build().number());
    }

    @Test
    public void testClassification() {
        final Coding value = Coding.create().build();
        assertEquals(value, Contract.ContractSecurityLabel.create().classification(value).build().classification());
    }

    @Test
    public void testCategory() {
        final java.util.List<Coding> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractSecurityLabel.create().category(value).build().category());
    }

    @Test
    public void testControl() {
        final java.util.List<Coding> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractSecurityLabel.create().control(value).build().control());
    }
}
