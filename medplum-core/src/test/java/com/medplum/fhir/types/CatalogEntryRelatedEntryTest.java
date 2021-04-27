/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CatalogEntryRelatedEntryTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CatalogEntry.CatalogEntryRelatedEntry(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CatalogEntry.CatalogEntryRelatedEntry.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CatalogEntry.CatalogEntryRelatedEntry.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.CatalogEntryRelatedEntry.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.CatalogEntryRelatedEntry.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testRelationtype() {
        assertEquals("x", CatalogEntry.CatalogEntryRelatedEntry.create().relationtype("x").build().relationtype());
    }

    @Test
    public void testItem() {
        final Reference value = Reference.create().build();
        assertEquals(value, CatalogEntry.CatalogEntryRelatedEntry.create().item(value).build().item());
    }
}
