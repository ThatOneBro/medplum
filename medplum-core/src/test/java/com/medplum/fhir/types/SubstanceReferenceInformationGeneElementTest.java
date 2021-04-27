/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceReferenceInformationGeneElementTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement.create().type(value).build().type());
    }

    @Test
    public void testElement() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement.create().element(value).build().element());
    }

    @Test
    public void testSource() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement.create().source(value).build().source());
    }
}
