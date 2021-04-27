/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ResearchStudyObjectiveTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ResearchStudy.ResearchStudyObjective(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ResearchStudy.ResearchStudyObjective.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ResearchStudy.ResearchStudyObjective.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.ResearchStudyObjective.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.ResearchStudyObjective.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", ResearchStudy.ResearchStudyObjective.create().name("x").build().name());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ResearchStudy.ResearchStudyObjective.create().type(value).build().type());
    }
}
