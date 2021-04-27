/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class StructureMapGroupTest {

    @Test
    public void testConstructor() {
        assertNotNull(new StructureMap.StructureMapGroup(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(StructureMap.StructureMapGroup.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", StructureMap.StructureMapGroup.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapGroup.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapGroup.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", StructureMap.StructureMapGroup.create().name("x").build().name());
    }

    @Test
    public void testExtendsValue() {
        assertEquals("x", StructureMap.StructureMapGroup.create().extendsValue("x").build().extendsValue());
    }

    @Test
    public void testTypeMode() {
        assertEquals("x", StructureMap.StructureMapGroup.create().typeMode("x").build().typeMode());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", StructureMap.StructureMapGroup.create().documentation("x").build().documentation());
    }

    @Test
    public void testInput() {
        final java.util.List<StructureMap.StructureMapInput> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapGroup.create().input(value).build().input());
    }

    @Test
    public void testRule() {
        final java.util.List<StructureMap.StructureMapRule> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapGroup.create().rule(value).build().rule());
    }
}
