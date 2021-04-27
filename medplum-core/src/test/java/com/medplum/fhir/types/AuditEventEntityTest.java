/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AuditEventEntityTest {

    @Test
    public void testConstructor() {
        assertNotNull(new AuditEvent.AuditEventEntity(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(AuditEvent.AuditEventEntity.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", AuditEvent.AuditEventEntity.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventEntity.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventEntity.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testWhat() {
        final Reference value = Reference.create().build();
        assertEquals(value, AuditEvent.AuditEventEntity.create().what(value).build().what());
    }

    @Test
    public void testType() {
        final Coding value = Coding.create().build();
        assertEquals(value, AuditEvent.AuditEventEntity.create().type(value).build().type());
    }

    @Test
    public void testRole() {
        final Coding value = Coding.create().build();
        assertEquals(value, AuditEvent.AuditEventEntity.create().role(value).build().role());
    }

    @Test
    public void testLifecycle() {
        final Coding value = Coding.create().build();
        assertEquals(value, AuditEvent.AuditEventEntity.create().lifecycle(value).build().lifecycle());
    }

    @Test
    public void testSecurityLabel() {
        final java.util.List<Coding> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventEntity.create().securityLabel(value).build().securityLabel());
    }

    @Test
    public void testName() {
        assertEquals("x", AuditEvent.AuditEventEntity.create().name("x").build().name());
    }

    @Test
    public void testDescription() {
        assertEquals("x", AuditEvent.AuditEventEntity.create().description("x").build().description());
    }

    @Test
    public void testQuery() {
        assertEquals("x", AuditEvent.AuditEventEntity.create().query("x").build().query());
    }

    @Test
    public void testDetail() {
        final java.util.List<AuditEvent.AuditEventDetail> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventEntity.create().detail(value).build().detail());
    }
}
