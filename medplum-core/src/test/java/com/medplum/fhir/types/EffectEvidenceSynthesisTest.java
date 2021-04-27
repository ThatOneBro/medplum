/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EffectEvidenceSynthesisTest {

    @Test
    public void testConstructor() {
        assertNotNull(new EffectEvidenceSynthesis(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(EffectEvidenceSynthesis.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", EffectEvidenceSynthesis.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", EffectEvidenceSynthesis.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", EffectEvidenceSynthesis.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", EffectEvidenceSynthesis.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        assertEquals("x", EffectEvidenceSynthesis.create().url("x").build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", EffectEvidenceSynthesis.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", EffectEvidenceSynthesis.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", EffectEvidenceSynthesis.create().title("x").build().title());
    }

    @Test
    public void testStatus() {
        assertEquals("x", EffectEvidenceSynthesis.create().status("x").build().status());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, EffectEvidenceSynthesis.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", EffectEvidenceSynthesis.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", EffectEvidenceSynthesis.create().description("x").build().description());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().note(value).build().note());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", EffectEvidenceSynthesis.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, EffectEvidenceSynthesis.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, EffectEvidenceSynthesis.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testTopic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().topic(value).build().topic());
    }

    @Test
    public void testAuthor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().author(value).build().author());
    }

    @Test
    public void testEditor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().editor(value).build().editor());
    }

    @Test
    public void testReviewer() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().reviewer(value).build().reviewer());
    }

    @Test
    public void testEndorser() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().endorser(value).build().endorser());
    }

    @Test
    public void testRelatedArtifact() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().relatedArtifact(value).build().relatedArtifact());
    }

    @Test
    public void testSynthesisType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().synthesisType(value).build().synthesisType());
    }

    @Test
    public void testStudyType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().studyType(value).build().studyType());
    }

    @Test
    public void testPopulation() {
        final Reference value = Reference.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().population(value).build().population());
    }

    @Test
    public void testExposure() {
        final Reference value = Reference.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().exposure(value).build().exposure());
    }

    @Test
    public void testExposureAlternative() {
        final Reference value = Reference.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().exposureAlternative(value).build().exposureAlternative());
    }

    @Test
    public void testOutcome() {
        final Reference value = Reference.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().outcome(value).build().outcome());
    }

    @Test
    public void testSampleSize() {
        final EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize value = EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create().build();
        assertEquals(value, EffectEvidenceSynthesis.create().sampleSize(value).build().sampleSize());
    }

    @Test
    public void testResultsByExposure() {
        final java.util.List<EffectEvidenceSynthesis.EffectEvidenceSynthesisResultsByExposure> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().resultsByExposure(value).build().resultsByExposure());
    }

    @Test
    public void testEffectEstimate() {
        final java.util.List<EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().effectEstimate(value).build().effectEstimate());
    }

    @Test
    public void testCertainty() {
        final java.util.List<EffectEvidenceSynthesis.EffectEvidenceSynthesisCertainty> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.create().certainty(value).build().certainty());
    }
}
