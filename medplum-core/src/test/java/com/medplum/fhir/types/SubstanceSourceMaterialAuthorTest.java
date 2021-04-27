/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceSourceMaterialAuthorTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceSourceMaterial.SubstanceSourceMaterialAuthor(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceSourceMaterial.SubstanceSourceMaterialAuthor.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceSourceMaterial.SubstanceSourceMaterialAuthor.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialAuthor.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialAuthor.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAuthorType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialAuthor.create().authorType(value).build().authorType());
    }

    @Test
    public void testAuthorDescription() {
        assertEquals("x", SubstanceSourceMaterial.SubstanceSourceMaterialAuthor.create().authorDescription("x").build().authorDescription());
    }
}
