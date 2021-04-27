/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DeviceVersionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Device.DeviceVersion(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Device.DeviceVersion.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Device.DeviceVersion.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceVersion.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceVersion.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Device.DeviceVersion.create().type(value).build().type());
    }

    @Test
    public void testComponent() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Device.DeviceVersion.create().component(value).build().component());
    }

    @Test
    public void testValue() {
        assertEquals("x", Device.DeviceVersion.create().value("x").build().value());
    }
}
