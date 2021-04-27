/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TerminologyCapabilitiesExpansionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TerminologyCapabilities.TerminologyCapabilitiesExpansion(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TerminologyCapabilities.TerminologyCapabilitiesExpansion.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testHierarchical() {
        assertEquals(true, TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().hierarchical(true).build().hierarchical());
    }

    @Test
    public void testPaging() {
        assertEquals(true, TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().paging(true).build().paging());
    }

    @Test
    public void testIncomplete() {
        assertEquals(true, TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().incomplete(true).build().incomplete());
    }

    @Test
    public void testParameter() {
        final java.util.List<TerminologyCapabilities.TerminologyCapabilitiesParameter> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().parameter(value).build().parameter());
    }

    @Test
    public void testTextFilter() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesExpansion.create().textFilter("x").build().textFilter());
    }
}
