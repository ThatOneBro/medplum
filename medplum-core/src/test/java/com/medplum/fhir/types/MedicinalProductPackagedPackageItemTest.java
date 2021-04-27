/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductPackagedPackageItemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductPackaged.MedicinalProductPackagedPackageItem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().identifier(value).build().identifier());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().type(value).build().type());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().quantity(value).build().quantity());
    }

    @Test
    public void testMaterial() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().material(value).build().material());
    }

    @Test
    public void testAlternateMaterial() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().alternateMaterial(value).build().alternateMaterial());
    }

    @Test
    public void testDevice() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().device(value).build().device());
    }

    @Test
    public void testManufacturedItem() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().manufacturedItem(value).build().manufacturedItem());
    }

    @Test
    public void testPackageItem() {
        final java.util.List<MedicinalProductPackaged.MedicinalProductPackagedPackageItem> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().packageItem(value).build().packageItem());
    }

    @Test
    public void testPhysicalCharacteristics() {
        final ProdCharacteristic value = ProdCharacteristic.create().build();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().physicalCharacteristics(value).build().physicalCharacteristics());
    }

    @Test
    public void testOtherCharacteristics() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().otherCharacteristics(value).build().otherCharacteristics());
    }

    @Test
    public void testShelfLifeStorage() {
        final java.util.List<ProductShelfLife> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().shelfLifeStorage(value).build().shelfLifeStorage());
    }

    @Test
    public void testManufacturer() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.MedicinalProductPackagedPackageItem.create().manufacturer(value).build().manufacturer());
    }
}
