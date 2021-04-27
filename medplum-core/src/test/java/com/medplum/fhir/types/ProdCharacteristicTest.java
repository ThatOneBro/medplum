/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ProdCharacteristicTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ProdCharacteristic(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ProdCharacteristic.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ProdCharacteristic.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ProdCharacteristic.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ProdCharacteristic.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testHeight() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ProdCharacteristic.create().height(value).build().height());
    }

    @Test
    public void testWidth() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ProdCharacteristic.create().width(value).build().width());
    }

    @Test
    public void testDepth() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ProdCharacteristic.create().depth(value).build().depth());
    }

    @Test
    public void testWeight() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ProdCharacteristic.create().weight(value).build().weight());
    }

    @Test
    public void testNominalVolume() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ProdCharacteristic.create().nominalVolume(value).build().nominalVolume());
    }

    @Test
    public void testExternalDiameter() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ProdCharacteristic.create().externalDiameter(value).build().externalDiameter());
    }

    @Test
    public void testShape() {
        assertEquals("x", ProdCharacteristic.create().shape("x").build().shape());
    }

    @Test
    public void testColor() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ProdCharacteristic.create().color(value).build().color());
    }

    @Test
    public void testImprint() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ProdCharacteristic.create().imprint(value).build().imprint());
    }

    @Test
    public void testImage() {
        final java.util.List<Attachment> value = java.util.Collections.emptyList();
        assertEquals(value, ProdCharacteristic.create().image(value).build().image());
    }

    @Test
    public void testScoring() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ProdCharacteristic.create().scoring(value).build().scoring());
    }
}
