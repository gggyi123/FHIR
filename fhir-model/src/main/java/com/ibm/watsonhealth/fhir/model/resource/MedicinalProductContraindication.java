/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.type.BackboneElement;
import com.ibm.watsonhealth.fhir.model.type.Code;
import com.ibm.watsonhealth.fhir.model.type.CodeableConcept;
import com.ibm.watsonhealth.fhir.model.type.Element;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Population;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory 
 * purposes.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class MedicinalProductContraindication extends DomainResource {
    private final List<Reference> subject;
    private final CodeableConcept disease;
    private final CodeableConcept diseaseStatus;
    private final List<CodeableConcept> comorbidity;
    private final List<Reference> therapeuticIndication;
    private final List<OtherTherapy> otherTherapy;
    private final List<Population> population;

    private MedicinalProductContraindication(Builder builder) {
        super(builder);
        this.subject = builder.subject;
        this.disease = builder.disease;
        this.diseaseStatus = builder.diseaseStatus;
        this.comorbidity = builder.comorbidity;
        this.therapeuticIndication = builder.therapeuticIndication;
        this.otherTherapy = builder.otherTherapy;
        this.population = builder.population;
    }

    /**
     * <p>
     * The medication for which this is an indication.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getSubject() {
        return subject;
    }

    /**
     * <p>
     * The disease, symptom or procedure for the contraindication.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getDisease() {
        return disease;
    }

    /**
     * <p>
     * The status of the disease or symptom for the contraindication.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getDiseaseStatus() {
        return diseaseStatus;
    }

    /**
     * <p>
     * A comorbidity (concurrent condition) or coinfection.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getComorbidity() {
        return comorbidity;
    }

    /**
     * <p>
     * Information about the use of the medicinal product in relation to other therapies as part of the indication.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getTherapeuticIndication() {
        return therapeuticIndication;
    }

    /**
     * <p>
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link OtherTherapy}.
     */
    public List<OtherTherapy> getOtherTherapy() {
        return otherTherapy;
    }

    /**
     * <p>
     * The population group to which this applies.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Population}.
     */
    public List<Population> getPopulation() {
        return population;
    }

    @Override
    public void accept(java.lang.String elementName, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, this);
            if (visitor.visit(elementName, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(meta, "meta", visitor);
                accept(implicitRules, "implicitRules", visitor);
                accept(language, "language", visitor);
                accept(text, "text", visitor);
                accept(contained, "contained", visitor, Resource.class);
                accept(extension, "extension", visitor, Extension.class);
                accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                accept(subject, "subject", visitor, Reference.class);
                accept(disease, "disease", visitor);
                accept(diseaseStatus, "diseaseStatus", visitor);
                accept(comorbidity, "comorbidity", visitor, CodeableConcept.class);
                accept(therapeuticIndication, "therapeuticIndication", visitor, Reference.class);
                accept(otherTherapy, "otherTherapy", visitor, OtherTherapy.class);
                accept(population, "population", visitor, Population.class);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.meta = meta;
        builder.implicitRules = implicitRules;
        builder.language = language;
        builder.text = text;
        builder.contained.addAll(contained);
        builder.extension.addAll(extension);
        builder.modifierExtension.addAll(modifierExtension);
        builder.subject.addAll(subject);
        builder.disease = disease;
        builder.diseaseStatus = diseaseStatus;
        builder.comorbidity.addAll(comorbidity);
        builder.therapeuticIndication.addAll(therapeuticIndication);
        builder.otherTherapy.addAll(otherTherapy);
        builder.population.addAll(population);
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends DomainResource.Builder {
        // optional
        private List<Reference> subject = new ArrayList<>();
        private CodeableConcept disease;
        private CodeableConcept diseaseStatus;
        private List<CodeableConcept> comorbidity = new ArrayList<>();
        private List<Reference> therapeuticIndication = new ArrayList<>();
        private List<OtherTherapy> otherTherapy = new ArrayList<>();
        private List<Population> population = new ArrayList<>();

        private Builder() {
            super();
        }

        /**
         * <p>
         * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
         * </p>
         * 
         * @param id
         *     Logical id of this artifact
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder id(Id id) {
            return (Builder) super.id(id);
        }

        /**
         * <p>
         * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content 
         * might not always be associated with version changes to the resource.
         * </p>
         * 
         * @param meta
         *     Metadata about the resource
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder meta(Meta meta) {
            return (Builder) super.meta(meta);
        }

        /**
         * <p>
         * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when 
         * processing the content. Often, this is a reference to an implementation guide that defines the special rules along 
         * with other profiles etc.
         * </p>
         * 
         * @param implicitRules
         *     A set of rules under which this content was created
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder implicitRules(Uri implicitRules) {
            return (Builder) super.implicitRules(implicitRules);
        }

        /**
         * <p>
         * The base language in which the resource is written.
         * </p>
         * 
         * @param language
         *     Language of the resource content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder language(Code language) {
            return (Builder) super.language(language);
        }

        /**
         * <p>
         * A human-readable narrative that contains a summary of the resource and can be used to represent the content of the 
         * resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient 
         * detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what 
         * content should be represented in the narrative to ensure clinical safety.
         * </p>
         * 
         * @param text
         *     Text summary of the resource, for human interpretation
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder text(Narrative text) {
            return (Builder) super.text(text);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Resource... contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Collection<Resource> contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Extension... modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Collection<Extension> modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * The medication for which this is an indication.
         * </p>
         * 
         * @param subject
         *     The medication for which this is an indication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder subject(Reference... subject) {
            for (Reference value : subject) {
                this.subject.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The medication for which this is an indication.
         * </p>
         * 
         * @param subject
         *     The medication for which this is an indication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder subject(Collection<Reference> subject) {
            this.subject.addAll(subject);
            return this;
        }

        /**
         * <p>
         * The disease, symptom or procedure for the contraindication.
         * </p>
         * 
         * @param disease
         *     The disease, symptom or procedure for the contraindication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder disease(CodeableConcept disease) {
            this.disease = disease;
            return this;
        }

        /**
         * <p>
         * The status of the disease or symptom for the contraindication.
         * </p>
         * 
         * @param diseaseStatus
         *     The status of the disease or symptom for the contraindication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder diseaseStatus(CodeableConcept diseaseStatus) {
            this.diseaseStatus = diseaseStatus;
            return this;
        }

        /**
         * <p>
         * A comorbidity (concurrent condition) or coinfection.
         * </p>
         * 
         * @param comorbidity
         *     A comorbidity (concurrent condition) or coinfection
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder comorbidity(CodeableConcept... comorbidity) {
            for (CodeableConcept value : comorbidity) {
                this.comorbidity.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A comorbidity (concurrent condition) or coinfection.
         * </p>
         * 
         * @param comorbidity
         *     A comorbidity (concurrent condition) or coinfection
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder comorbidity(Collection<CodeableConcept> comorbidity) {
            this.comorbidity.addAll(comorbidity);
            return this;
        }

        /**
         * <p>
         * Information about the use of the medicinal product in relation to other therapies as part of the indication.
         * </p>
         * 
         * @param therapeuticIndication
         *     Information about the use of the medicinal product in relation to other therapies as part of the indication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder therapeuticIndication(Reference... therapeuticIndication) {
            for (Reference value : therapeuticIndication) {
                this.therapeuticIndication.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Information about the use of the medicinal product in relation to other therapies as part of the indication.
         * </p>
         * 
         * @param therapeuticIndication
         *     Information about the use of the medicinal product in relation to other therapies as part of the indication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder therapeuticIndication(Collection<Reference> therapeuticIndication) {
            this.therapeuticIndication.addAll(therapeuticIndication);
            return this;
        }

        /**
         * <p>
         * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
         * </p>
         * 
         * @param otherTherapy
         *     Information about the use of the medicinal product in relation to other therapies described as part of the indication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder otherTherapy(OtherTherapy... otherTherapy) {
            for (OtherTherapy value : otherTherapy) {
                this.otherTherapy.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
         * </p>
         * 
         * @param otherTherapy
         *     Information about the use of the medicinal product in relation to other therapies described as part of the indication
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder otherTherapy(Collection<OtherTherapy> otherTherapy) {
            this.otherTherapy.addAll(otherTherapy);
            return this;
        }

        /**
         * <p>
         * The population group to which this applies.
         * </p>
         * 
         * @param population
         *     The population group to which this applies
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder population(Population... population) {
            for (Population value : population) {
                this.population.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The population group to which this applies.
         * </p>
         * 
         * @param population
         *     The population group to which this applies
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder population(Collection<Population> population) {
            this.population.addAll(population);
            return this;
        }

        @Override
        public MedicinalProductContraindication build() {
            return new MedicinalProductContraindication(this);
        }
    }

    /**
     * <p>
     * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
     * </p>
     */
    public static class OtherTherapy extends BackboneElement {
        private final CodeableConcept therapyRelationshipType;
        private final Element medication;

        private OtherTherapy(Builder builder) {
            super(builder);
            this.therapyRelationshipType = ValidationSupport.requireNonNull(builder.therapyRelationshipType, "therapyRelationshipType");
            this.medication = ValidationSupport.requireChoiceElement(builder.medication, "medication", CodeableConcept.class, Reference.class);
        }

        /**
         * <p>
         * The type of relationship between the medicinal product indication or contraindication and another therapy.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getTherapyRelationshipType() {
            return therapyRelationshipType;
        }

        /**
         * <p>
         * Reference to a specific medication (active substance, medicinal product or class of products) as part of an indication 
         * or contraindication.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getMedication() {
            return medication;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(therapyRelationshipType, "therapyRelationshipType", visitor);
                    accept(medication, "medication", visitor, true);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(CodeableConcept therapyRelationshipType, Element medication) {
            return new Builder(therapyRelationshipType, medication);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final CodeableConcept therapyRelationshipType;
            private final Element medication;

            private Builder(CodeableConcept therapyRelationshipType, Element medication) {
                super();
                this.therapyRelationshipType = therapyRelationshipType;
                this.medication = medication;
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            @Override
            public OtherTherapy build() {
                return new OtherTherapy(this);
            }

            private static Builder from(OtherTherapy otherTherapy) {
                Builder builder = new Builder(otherTherapy.therapyRelationshipType, otherTherapy.medication);
                builder.id = otherTherapy.id;
                builder.extension.addAll(otherTherapy.extension);
                builder.modifierExtension.addAll(otherTherapy.modifierExtension);
                return builder;
            }
        }
    }
}
