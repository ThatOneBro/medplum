/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MolecularSequenceRocTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MolecularSequence.MolecularSequenceRoc(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MolecularSequence.MolecularSequenceRoc.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MolecularSequence.MolecularSequenceRoc.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testScore() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().score(value).build().score());
    }

    @Test
    public void testNumTP() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().numTP(value).build().numTP());
    }

    @Test
    public void testNumFP() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().numFP(value).build().numFP());
    }

    @Test
    public void testNumFN() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().numFN(value).build().numFN());
    }

    @Test
    public void testPrecision() {
        final java.util.List<Double> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().precision(value).build().precision());
    }

    @Test
    public void testSensitivity() {
        final java.util.List<Double> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().sensitivity(value).build().sensitivity());
    }

    @Test
    public void testFMeasure() {
        final java.util.List<Double> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceRoc.create().fMeasure(value).build().fMeasure());
    }
}
