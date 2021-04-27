/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TaskInputTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Task.TaskInput(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Task.TaskInput.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Task.TaskInput.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Task.TaskInput.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Task.TaskInput.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Task.TaskInput.create().type(value).build().type());
    }

    @Test
    public void testValueBase64Binary() {
        assertEquals("x", Task.TaskInput.create().valueBase64Binary("x").build().valueBase64Binary());
    }

    @Test
    public void testValueBoolean() {
        assertEquals(true, Task.TaskInput.create().valueBoolean(true).build().valueBoolean());
    }

    @Test
    public void testValueCanonical() {
        assertEquals("x", Task.TaskInput.create().valueCanonical("x").build().valueCanonical());
    }

    @Test
    public void testValueCode() {
        assertEquals("x", Task.TaskInput.create().valueCode("x").build().valueCode());
    }

    @Test
    public void testValueDate() {
        assertEquals("x", Task.TaskInput.create().valueDate("x").build().valueDate());
    }

    @Test
    public void testValueDateTime() {
        assertEquals("x", Task.TaskInput.create().valueDateTime("x").build().valueDateTime());
    }

    @Test
    public void testValueDecimal() {
        assertEquals(1, Task.TaskInput.create().valueDecimal(1).build().valueDecimal());
    }

    @Test
    public void testValueId() {
        assertEquals("x", Task.TaskInput.create().valueId("x").build().valueId());
    }

    @Test
    public void testValueInstant() {
        assertEquals("x", Task.TaskInput.create().valueInstant("x").build().valueInstant());
    }

    @Test
    public void testValueInteger() {
        assertEquals(1, Task.TaskInput.create().valueInteger(1).build().valueInteger());
    }

    @Test
    public void testValueMarkdown() {
        assertEquals("x", Task.TaskInput.create().valueMarkdown("x").build().valueMarkdown());
    }

    @Test
    public void testValueOid() {
        assertEquals("x", Task.TaskInput.create().valueOid("x").build().valueOid());
    }

    @Test
    public void testValuePositiveInt() {
        assertEquals(1, Task.TaskInput.create().valuePositiveInt(1).build().valuePositiveInt());
    }

    @Test
    public void testValueString() {
        assertEquals("x", Task.TaskInput.create().valueString("x").build().valueString());
    }

    @Test
    public void testValueTime() {
        assertEquals("x", Task.TaskInput.create().valueTime("x").build().valueTime());
    }

    @Test
    public void testValueUnsignedInt() {
        assertEquals(1, Task.TaskInput.create().valueUnsignedInt(1).build().valueUnsignedInt());
    }

    @Test
    public void testValueUri() {
        assertEquals("x", Task.TaskInput.create().valueUri("x").build().valueUri());
    }

    @Test
    public void testValueUrl() {
        assertEquals("x", Task.TaskInput.create().valueUrl("x").build().valueUrl());
    }

    @Test
    public void testValueUuid() {
        assertEquals("x", Task.TaskInput.create().valueUuid("x").build().valueUuid());
    }

    @Test
    public void testValueAddress() {
        final Address value = Address.create().build();
        assertEquals(value, Task.TaskInput.create().valueAddress(value).build().valueAddress());
    }

    @Test
    public void testValueAge() {
        final Age value = Age.create().build();
        assertEquals(value, Task.TaskInput.create().valueAge(value).build().valueAge());
    }

    @Test
    public void testValueAnnotation() {
        final Annotation value = Annotation.create().build();
        assertEquals(value, Task.TaskInput.create().valueAnnotation(value).build().valueAnnotation());
    }

    @Test
    public void testValueAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, Task.TaskInput.create().valueAttachment(value).build().valueAttachment());
    }

    @Test
    public void testValueCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Task.TaskInput.create().valueCodeableConcept(value).build().valueCodeableConcept());
    }

    @Test
    public void testValueCoding() {
        final Coding value = Coding.create().build();
        assertEquals(value, Task.TaskInput.create().valueCoding(value).build().valueCoding());
    }

    @Test
    public void testValueContactPoint() {
        final ContactPoint value = ContactPoint.create().build();
        assertEquals(value, Task.TaskInput.create().valueContactPoint(value).build().valueContactPoint());
    }

    @Test
    public void testValueCount() {
        final Count value = Count.create().build();
        assertEquals(value, Task.TaskInput.create().valueCount(value).build().valueCount());
    }

    @Test
    public void testValueDistance() {
        final Distance value = Distance.create().build();
        assertEquals(value, Task.TaskInput.create().valueDistance(value).build().valueDistance());
    }

    @Test
    public void testValueDuration() {
        final Duration value = Duration.create().build();
        assertEquals(value, Task.TaskInput.create().valueDuration(value).build().valueDuration());
    }

    @Test
    public void testValueHumanName() {
        final HumanName value = HumanName.create().build();
        assertEquals(value, Task.TaskInput.create().valueHumanName(value).build().valueHumanName());
    }

    @Test
    public void testValueIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Task.TaskInput.create().valueIdentifier(value).build().valueIdentifier());
    }

    @Test
    public void testValueMoney() {
        final Money value = Money.create().build();
        assertEquals(value, Task.TaskInput.create().valueMoney(value).build().valueMoney());
    }

    @Test
    public void testValuePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Task.TaskInput.create().valuePeriod(value).build().valuePeriod());
    }

    @Test
    public void testValueQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, Task.TaskInput.create().valueQuantity(value).build().valueQuantity());
    }

    @Test
    public void testValueRange() {
        final Range value = Range.create().build();
        assertEquals(value, Task.TaskInput.create().valueRange(value).build().valueRange());
    }

    @Test
    public void testValueRatio() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, Task.TaskInput.create().valueRatio(value).build().valueRatio());
    }

    @Test
    public void testValueReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Task.TaskInput.create().valueReference(value).build().valueReference());
    }

    @Test
    public void testValueSampledData() {
        final SampledData value = SampledData.create().build();
        assertEquals(value, Task.TaskInput.create().valueSampledData(value).build().valueSampledData());
    }

    @Test
    public void testValueSignature() {
        final Signature value = Signature.create().build();
        assertEquals(value, Task.TaskInput.create().valueSignature(value).build().valueSignature());
    }

    @Test
    public void testValueTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, Task.TaskInput.create().valueTiming(value).build().valueTiming());
    }

    @Test
    public void testValueContactDetail() {
        final ContactDetail value = ContactDetail.create().build();
        assertEquals(value, Task.TaskInput.create().valueContactDetail(value).build().valueContactDetail());
    }

    @Test
    public void testValueContributor() {
        final Contributor value = Contributor.create().build();
        assertEquals(value, Task.TaskInput.create().valueContributor(value).build().valueContributor());
    }

    @Test
    public void testValueDataRequirement() {
        final DataRequirement value = DataRequirement.create().build();
        assertEquals(value, Task.TaskInput.create().valueDataRequirement(value).build().valueDataRequirement());
    }

    @Test
    public void testValueExpression() {
        final Expression value = Expression.create().build();
        assertEquals(value, Task.TaskInput.create().valueExpression(value).build().valueExpression());
    }

    @Test
    public void testValueParameterDefinition() {
        final ParameterDefinition value = ParameterDefinition.create().build();
        assertEquals(value, Task.TaskInput.create().valueParameterDefinition(value).build().valueParameterDefinition());
    }

    @Test
    public void testValueRelatedArtifact() {
        final RelatedArtifact value = RelatedArtifact.create().build();
        assertEquals(value, Task.TaskInput.create().valueRelatedArtifact(value).build().valueRelatedArtifact());
    }

    @Test
    public void testValueTriggerDefinition() {
        final TriggerDefinition value = TriggerDefinition.create().build();
        assertEquals(value, Task.TaskInput.create().valueTriggerDefinition(value).build().valueTriggerDefinition());
    }

    @Test
    public void testValueUsageContext() {
        final UsageContext value = UsageContext.create().build();
        assertEquals(value, Task.TaskInput.create().valueUsageContext(value).build().valueUsageContext());
    }

    @Test
    public void testValueDosage() {
        final Dosage value = Dosage.create().build();
        assertEquals(value, Task.TaskInput.create().valueDosage(value).build().valueDosage());
    }

    @Test
    public void testValueMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Task.TaskInput.create().valueMeta(value).build().valueMeta());
    }
}
