/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PractitionerRoleAvailableTimeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new PractitionerRole.PractitionerRoleAvailableTime(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(PractitionerRole.PractitionerRoleAvailableTime.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", PractitionerRole.PractitionerRoleAvailableTime.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PractitionerRole.PractitionerRoleAvailableTime.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PractitionerRole.PractitionerRoleAvailableTime.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDaysOfWeek() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, PractitionerRole.PractitionerRoleAvailableTime.create().daysOfWeek(value).build().daysOfWeek());
    }

    @Test
    public void testAllDay() {
        assertEquals(true, PractitionerRole.PractitionerRoleAvailableTime.create().allDay(true).build().allDay());
    }

    @Test
    public void testAvailableStartTime() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, PractitionerRole.PractitionerRoleAvailableTime.create().availableStartTime(value).build().availableStartTime());
    }

    @Test
    public void testAvailableEndTime() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, PractitionerRole.PractitionerRoleAvailableTime.create().availableEndTime(value).build().availableEndTime());
    }
}
