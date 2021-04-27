/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ContributorTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Contributor(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Contributor.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Contributor.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contributor.create().extension(value).build().extension());
    }

    @Test
    public void testType() {
        assertEquals("x", Contributor.create().type("x").build().type());
    }

    @Test
    public void testName() {
        assertEquals("x", Contributor.create().name("x").build().name());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Contributor.create().contact(value).build().contact());
    }
}
