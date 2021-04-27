/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestReportAction1Test {

    @Test
    public void testConstructor() {
        assertNotNull(new TestReport.TestReportAction1(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestReport.TestReportAction1.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TestReport.TestReportAction1.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportAction1.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportAction1.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOperation() {
        final TestReport.TestReportOperation value = TestReport.TestReportOperation.create().build();
        assertEquals(value, TestReport.TestReportAction1.create().operation(value).build().operation());
    }

    @Test
    public void testAssertValue() {
        final TestReport.TestReportAssert value = TestReport.TestReportAssert.create().build();
        assertEquals(value, TestReport.TestReportAction1.create().assertValue(value).build().assertValue());
    }
}
