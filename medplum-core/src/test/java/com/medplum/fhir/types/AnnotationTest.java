/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AnnotationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Annotation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Annotation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Annotation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Annotation.create().extension(value).build().extension());
    }

    @Test
    public void testAuthorReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Annotation.create().authorReference(value).build().authorReference());
    }

    @Test
    public void testAuthorString() {
        assertEquals("x", Annotation.create().authorString("x").build().authorString());
    }

    @Test
    public void testTime() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Annotation.create().time(value).build().time());
    }

    @Test
    public void testText() {
        assertEquals("x", Annotation.create().text("x").build().text());
    }
}
