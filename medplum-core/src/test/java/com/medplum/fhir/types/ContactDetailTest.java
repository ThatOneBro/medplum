/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ContactDetailTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ContactDetail(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ContactDetail.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ContactDetail.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ContactDetail.create().extension(value).build().extension());
    }

    @Test
    public void testName() {
        assertEquals("x", ContactDetail.create().name("x").build().name());
    }

    @Test
    public void testTelecom() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, ContactDetail.create().telecom(value).build().telecom());
    }
}
