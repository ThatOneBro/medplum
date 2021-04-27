/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class QuestionnaireItemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Questionnaire.QuestionnaireItem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Questionnaire.QuestionnaireItem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.QuestionnaireItem.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.QuestionnaireItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLinkId() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().linkId("x").build().linkId());
    }

    @Test
    public void testDefinition() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().definition("x").build().definition());
    }

    @Test
    public void testCode() {
        final java.util.List<Coding> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.QuestionnaireItem.create().code(value).build().code());
    }

    @Test
    public void testPrefix() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().prefix("x").build().prefix());
    }

    @Test
    public void testText() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().text("x").build().text());
    }

    @Test
    public void testType() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().type("x").build().type());
    }

    @Test
    public void testEnableWhen() {
        final java.util.List<Questionnaire.QuestionnaireEnableWhen> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.QuestionnaireItem.create().enableWhen(value).build().enableWhen());
    }

    @Test
    public void testEnableBehavior() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().enableBehavior("x").build().enableBehavior());
    }

    @Test
    public void testRequired() {
        assertEquals(true, Questionnaire.QuestionnaireItem.create().required(true).build().required());
    }

    @Test
    public void testRepeats() {
        assertEquals(true, Questionnaire.QuestionnaireItem.create().repeats(true).build().repeats());
    }

    @Test
    public void testReadOnly() {
        assertEquals(true, Questionnaire.QuestionnaireItem.create().readOnly(true).build().readOnly());
    }

    @Test
    public void testMaxLength() {
        assertEquals(1, Questionnaire.QuestionnaireItem.create().maxLength(1).build().maxLength());
    }

    @Test
    public void testAnswerValueSet() {
        assertEquals("x", Questionnaire.QuestionnaireItem.create().answerValueSet("x").build().answerValueSet());
    }

    @Test
    public void testAnswerOption() {
        final java.util.List<Questionnaire.QuestionnaireAnswerOption> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.QuestionnaireItem.create().answerOption(value).build().answerOption());
    }

    @Test
    public void testInitial() {
        final java.util.List<Questionnaire.QuestionnaireInitial> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.QuestionnaireItem.create().initial(value).build().initial());
    }

    @Test
    public void testItem() {
        final java.util.List<Questionnaire.QuestionnaireItem> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.QuestionnaireItem.create().item(value).build().item());
    }
}
