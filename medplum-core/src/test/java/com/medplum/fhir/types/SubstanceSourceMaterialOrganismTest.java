/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceSourceMaterialOrganismTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceSourceMaterial.SubstanceSourceMaterialOrganism(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testFamily() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().family(value).build().family());
    }

    @Test
    public void testGenus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().genus(value).build().genus());
    }

    @Test
    public void testSpecies() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().species(value).build().species());
    }

    @Test
    public void testIntraspecificType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().intraspecificType(value).build().intraspecificType());
    }

    @Test
    public void testIntraspecificDescription() {
        assertEquals("x", SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().intraspecificDescription("x").build().intraspecificDescription());
    }

    @Test
    public void testAuthor() {
        final java.util.List<SubstanceSourceMaterial.SubstanceSourceMaterialAuthor> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().author(value).build().author());
    }

    @Test
    public void testHybrid() {
        final SubstanceSourceMaterial.SubstanceSourceMaterialHybrid value = SubstanceSourceMaterial.SubstanceSourceMaterialHybrid.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().hybrid(value).build().hybrid());
    }

    @Test
    public void testOrganismGeneral() {
        final SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral value = SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().organismGeneral(value).build().organismGeneral());
    }
}
