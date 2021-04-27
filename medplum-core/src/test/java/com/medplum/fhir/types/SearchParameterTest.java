/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SearchParameterTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SearchParameter(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SearchParameter.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", SearchParameter.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", SearchParameter.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, SearchParameter.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", SearchParameter.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", SearchParameter.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, SearchParameter.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        assertEquals("x", SearchParameter.create().url("x").build().url());
    }

    @Test
    public void testVersion() {
        assertEquals("x", SearchParameter.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", SearchParameter.create().name("x").build().name());
    }

    @Test
    public void testDerivedFrom() {
        assertEquals("x", SearchParameter.create().derivedFrom("x").build().derivedFrom());
    }

    @Test
    public void testStatus() {
        assertEquals("x", SearchParameter.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, SearchParameter.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, SearchParameter.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", SearchParameter.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", SearchParameter.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", SearchParameter.create().purpose("x").build().purpose());
    }

    @Test
    public void testCode() {
        assertEquals("x", SearchParameter.create().code("x").build().code());
    }

    @Test
    public void testBase() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().base(value).build().base());
    }

    @Test
    public void testType() {
        assertEquals("x", SearchParameter.create().type("x").build().type());
    }

    @Test
    public void testExpression() {
        assertEquals("x", SearchParameter.create().expression("x").build().expression());
    }

    @Test
    public void testXpath() {
        assertEquals("x", SearchParameter.create().xpath("x").build().xpath());
    }

    @Test
    public void testXpathUsage() {
        assertEquals("x", SearchParameter.create().xpathUsage("x").build().xpathUsage());
    }

    @Test
    public void testTarget() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().target(value).build().target());
    }

    @Test
    public void testMultipleOr() {
        assertEquals(true, SearchParameter.create().multipleOr(true).build().multipleOr());
    }

    @Test
    public void testMultipleAnd() {
        assertEquals(true, SearchParameter.create().multipleAnd(true).build().multipleAnd());
    }

    @Test
    public void testComparator() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().comparator(value).build().comparator());
    }

    @Test
    public void testModifier() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().modifier(value).build().modifier());
    }

    @Test
    public void testChain() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().chain(value).build().chain());
    }

    @Test
    public void testComponent() {
        final java.util.List<SearchParameter.SearchParameterComponent> value = java.util.Collections.emptyList();
        assertEquals(value, SearchParameter.create().component(value).build().component());
    }
}
