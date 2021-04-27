/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DevicePropertyTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Device.DeviceProperty(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Device.DeviceProperty.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Device.DeviceProperty.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceProperty.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceProperty.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Device.DeviceProperty.create().type(value).build().type());
    }

    @Test
    public void testValueQuantity() {
        final java.util.List<Quantity> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceProperty.create().valueQuantity(value).build().valueQuantity());
    }

    @Test
    public void testValueCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceProperty.create().valueCode(value).build().valueCode());
    }
}
