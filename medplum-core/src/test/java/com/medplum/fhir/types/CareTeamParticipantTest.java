/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CareTeamParticipantTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CareTeam.CareTeamParticipant(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CareTeam.CareTeamParticipant.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CareTeam.CareTeamParticipant.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CareTeam.CareTeamParticipant.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CareTeam.CareTeamParticipant.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testRole() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CareTeam.CareTeamParticipant.create().role(value).build().role());
    }

    @Test
    public void testMember() {
        final Reference value = Reference.create().build();
        assertEquals(value, CareTeam.CareTeamParticipant.create().member(value).build().member());
    }

    @Test
    public void testOnBehalfOf() {
        final Reference value = Reference.create().build();
        assertEquals(value, CareTeam.CareTeamParticipant.create().onBehalfOf(value).build().onBehalfOf());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, CareTeam.CareTeamParticipant.create().period(value).build().period());
    }
}
