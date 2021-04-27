/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CapabilityStatementResourceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CapabilityStatement.CapabilityStatementResource(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CapabilityStatement.CapabilityStatementResource.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementResource.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", CapabilityStatement.CapabilityStatementResource.create().type("x").build().type());
    }

    @Test
    public void testProfile() {
        assertEquals("x", CapabilityStatement.CapabilityStatementResource.create().profile("x").build().profile());
    }

    @Test
    public void testSupportedProfile() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().supportedProfile(value).build().supportedProfile());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", CapabilityStatement.CapabilityStatementResource.create().documentation("x").build().documentation());
    }

    @Test
    public void testInteraction() {
        final java.util.List<CapabilityStatement.CapabilityStatementInteraction> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().interaction(value).build().interaction());
    }

    @Test
    public void testVersioning() {
        assertEquals("x", CapabilityStatement.CapabilityStatementResource.create().versioning("x").build().versioning());
    }

    @Test
    public void testReadHistory() {
        assertEquals(true, CapabilityStatement.CapabilityStatementResource.create().readHistory(true).build().readHistory());
    }

    @Test
    public void testUpdateCreate() {
        assertEquals(true, CapabilityStatement.CapabilityStatementResource.create().updateCreate(true).build().updateCreate());
    }

    @Test
    public void testConditionalCreate() {
        assertEquals(true, CapabilityStatement.CapabilityStatementResource.create().conditionalCreate(true).build().conditionalCreate());
    }

    @Test
    public void testConditionalRead() {
        assertEquals("x", CapabilityStatement.CapabilityStatementResource.create().conditionalRead("x").build().conditionalRead());
    }

    @Test
    public void testConditionalUpdate() {
        assertEquals(true, CapabilityStatement.CapabilityStatementResource.create().conditionalUpdate(true).build().conditionalUpdate());
    }

    @Test
    public void testConditionalDelete() {
        assertEquals("x", CapabilityStatement.CapabilityStatementResource.create().conditionalDelete("x").build().conditionalDelete());
    }

    @Test
    public void testReferencePolicy() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().referencePolicy(value).build().referencePolicy());
    }

    @Test
    public void testSearchInclude() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().searchInclude(value).build().searchInclude());
    }

    @Test
    public void testSearchRevInclude() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().searchRevInclude(value).build().searchRevInclude());
    }

    @Test
    public void testSearchParam() {
        final java.util.List<CapabilityStatement.CapabilityStatementSearchParam> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().searchParam(value).build().searchParam());
    }

    @Test
    public void testOperation() {
        final java.util.List<CapabilityStatement.CapabilityStatementOperation> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementResource.create().operation(value).build().operation());
    }
}
