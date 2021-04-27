/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class LinkageItemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Linkage.LinkageItem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Linkage.LinkageItem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Linkage.LinkageItem.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.LinkageItem.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.LinkageItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", Linkage.LinkageItem.create().type("x").build().type());
    }

    @Test
    public void testResource() {
        final Reference value = Reference.create().build();
        assertEquals(value, Linkage.LinkageItem.create().resource(value).build().resource());
    }
}
