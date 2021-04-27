/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TaskTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Task(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Task.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", Task.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Task.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Task.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Task.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Task.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Task.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().identifier(value).build().identifier());
    }

    @Test
    public void testInstantiatesCanonical() {
        assertEquals("x", Task.create().instantiatesCanonical("x").build().instantiatesCanonical());
    }

    @Test
    public void testInstantiatesUri() {
        assertEquals("x", Task.create().instantiatesUri("x").build().instantiatesUri());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testGroupIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Task.create().groupIdentifier(value).build().groupIdentifier());
    }

    @Test
    public void testPartOf() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().partOf(value).build().partOf());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Task.create().status("x").build().status());
    }

    @Test
    public void testStatusReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Task.create().statusReason(value).build().statusReason());
    }

    @Test
    public void testBusinessStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Task.create().businessStatus(value).build().businessStatus());
    }

    @Test
    public void testIntent() {
        assertEquals("x", Task.create().intent("x").build().intent());
    }

    @Test
    public void testPriority() {
        assertEquals("x", Task.create().priority("x").build().priority());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Task.create().code(value).build().code());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Task.create().description("x").build().description());
    }

    @Test
    public void testFocus() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.create().focus(value).build().focus());
    }

    @Test
    public void testForValue() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.create().forValue(value).build().forValue());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.create().encounter(value).build().encounter());
    }

    @Test
    public void testExecutionPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Task.create().executionPeriod(value).build().executionPeriod());
    }

    @Test
    public void testAuthoredOn() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Task.create().authoredOn(value).build().authoredOn());
    }

    @Test
    public void testLastModified() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Task.create().lastModified(value).build().lastModified());
    }

    @Test
    public void testRequester() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.create().requester(value).build().requester());
    }

    @Test
    public void testPerformerType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().performerType(value).build().performerType());
    }

    @Test
    public void testOwner() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.create().owner(value).build().owner());
    }

    @Test
    public void testLocation() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.create().location(value).build().location());
    }

    @Test
    public void testReasonCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Task.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testInsurance() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().insurance(value).build().insurance());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().note(value).build().note());
    }

    @Test
    public void testRelevantHistory() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().relevantHistory(value).build().relevantHistory());
    }

    @Test
    public void testRestriction() {
        final Task.TaskRestriction value = Task.TaskRestriction.create().build();
        assertEquals(value, Task.create().restriction(value).build().restriction());
    }

    @Test
    public void testInput() {
        final java.util.List<Task.TaskInput> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().input(value).build().input());
    }

    @Test
    public void testOutput() {
        final java.util.List<Task.TaskOutput> value = java.util.Collections.emptyList();
        assertEquals(value, Task.create().output(value).build().output());
    }
}
