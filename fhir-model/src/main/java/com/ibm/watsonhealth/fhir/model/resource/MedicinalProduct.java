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
import com.ibm.watsonhealth.fhir.model.type.Coding;
import com.ibm.watsonhealth.fhir.model.type.DateTime;
import com.ibm.watsonhealth.fhir.model.type.Element;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.MarketingStatus;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class MedicinalProduct extends DomainResource {
    private final List<Identifier> identifier;
    private final CodeableConcept type;
    private final Coding domain;
    private final CodeableConcept combinedPharmaceuticalDoseForm;
    private final CodeableConcept legalStatusOfSupply;
    private final CodeableConcept additionalMonitoringIndicator;
    private final List<String> specialMeasures;
    private final CodeableConcept paediatricUseIndicator;
    private final List<CodeableConcept> productClassification;
    private final List<MarketingStatus> marketingStatus;
    private final List<Reference> pharmaceuticalProduct;
    private final List<Reference> packagedMedicinalProduct;
    private final List<Reference> attachedDocument;
    private final List<Reference> masterFile;
    private final List<Reference> contact;
    private final List<Reference> clinicalTrial;
    private final List<Name> name;
    private final List<Identifier> crossReference;
    private final List<ManufacturingBusinessOperation> manufacturingBusinessOperation;
    private final List<SpecialDesignation> specialDesignation;

    private MedicinalProduct(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
        this.type = builder.type;
        this.domain = builder.domain;
        this.combinedPharmaceuticalDoseForm = builder.combinedPharmaceuticalDoseForm;
        this.legalStatusOfSupply = builder.legalStatusOfSupply;
        this.additionalMonitoringIndicator = builder.additionalMonitoringIndicator;
        this.specialMeasures = builder.specialMeasures;
        this.paediatricUseIndicator = builder.paediatricUseIndicator;
        this.productClassification = builder.productClassification;
        this.marketingStatus = builder.marketingStatus;
        this.pharmaceuticalProduct = builder.pharmaceuticalProduct;
        this.packagedMedicinalProduct = builder.packagedMedicinalProduct;
        this.attachedDocument = builder.attachedDocument;
        this.masterFile = builder.masterFile;
        this.contact = builder.contact;
        this.clinicalTrial = builder.clinicalTrial;
        this.name = ValidationSupport.requireNonEmpty(builder.name, "name");
        this.crossReference = builder.crossReference;
        this.manufacturingBusinessOperation = builder.manufacturingBusinessOperation;
        this.specialDesignation = builder.specialDesignation;
    }

    /**
     * <p>
     * Business identifier for this product. Could be an MPID.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Identifier}.
     */
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * Regulatory type, e.g. Investigational or Authorized.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * <p>
     * If this medicine applies to human or veterinary uses.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Coding}.
     */
    public Coding getDomain() {
        return domain;
    }

    /**
     * <p>
     * The dose form for a single part product, or combined form of a multiple part product.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getCombinedPharmaceuticalDoseForm() {
        return combinedPharmaceuticalDoseForm;
    }

    /**
     * <p>
     * The legal status of supply of the medicinal product as classified by the regulator.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getLegalStatusOfSupply() {
        return legalStatusOfSupply;
    }

    /**
     * <p>
     * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getAdditionalMonitoringIndicator() {
        return additionalMonitoringIndicator;
    }

    /**
     * <p>
     * Whether the Medicinal Product is subject to special measures for regulatory reasons.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link String}.
     */
    public List<String> getSpecialMeasures() {
        return specialMeasures;
    }

    /**
     * <p>
     * If authorised for use in children.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getPaediatricUseIndicator() {
        return paediatricUseIndicator;
    }

    /**
     * <p>
     * Allows the product to be classified by various systems.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getProductClassification() {
        return productClassification;
    }

    /**
     * <p>
     * Marketing status of the medicinal product, in contrast to marketing authorizaton.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link MarketingStatus}.
     */
    public List<MarketingStatus> getMarketingStatus() {
        return marketingStatus;
    }

    /**
     * <p>
     * Pharmaceutical aspects of product.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getPharmaceuticalProduct() {
        return pharmaceuticalProduct;
    }

    /**
     * <p>
     * Package representation for the product.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getPackagedMedicinalProduct() {
        return packagedMedicinalProduct;
    }

    /**
     * <p>
     * Supporting documentation, typically for regulatory submission.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getAttachedDocument() {
        return attachedDocument;
    }

    /**
     * <p>
     * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getMasterFile() {
        return masterFile;
    }

    /**
     * <p>
     * A product specific contact, person (in a role), or an organization.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getContact() {
        return contact;
    }

    /**
     * <p>
     * Clinical trials or studies that this product is involved in.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getClinicalTrial() {
        return clinicalTrial;
    }

    /**
     * <p>
     * The product's name, including full name and possibly coded parts.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Name}.
     */
    public List<Name> getName() {
        return name;
    }

    /**
     * <p>
     * Reference to another product, e.g. for linking authorised to investigational product.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Identifier}.
     */
    public List<Identifier> getCrossReference() {
        return crossReference;
    }

    /**
     * <p>
     * An operation applied to the product, for manufacturing or adminsitrative purpose.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link ManufacturingBusinessOperation}.
     */
    public List<ManufacturingBusinessOperation> getManufacturingBusinessOperation() {
        return manufacturingBusinessOperation;
    }

    /**
     * <p>
     * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link SpecialDesignation}.
     */
    public List<SpecialDesignation> getSpecialDesignation() {
        return specialDesignation;
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
                accept(identifier, "identifier", visitor, Identifier.class);
                accept(type, "type", visitor);
                accept(domain, "domain", visitor);
                accept(combinedPharmaceuticalDoseForm, "combinedPharmaceuticalDoseForm", visitor);
                accept(legalStatusOfSupply, "legalStatusOfSupply", visitor);
                accept(additionalMonitoringIndicator, "additionalMonitoringIndicator", visitor);
                accept(specialMeasures, "specialMeasures", visitor, String.class);
                accept(paediatricUseIndicator, "paediatricUseIndicator", visitor);
                accept(productClassification, "productClassification", visitor, CodeableConcept.class);
                accept(marketingStatus, "marketingStatus", visitor, MarketingStatus.class);
                accept(pharmaceuticalProduct, "pharmaceuticalProduct", visitor, Reference.class);
                accept(packagedMedicinalProduct, "packagedMedicinalProduct", visitor, Reference.class);
                accept(attachedDocument, "attachedDocument", visitor, Reference.class);
                accept(masterFile, "masterFile", visitor, Reference.class);
                accept(contact, "contact", visitor, Reference.class);
                accept(clinicalTrial, "clinicalTrial", visitor, Reference.class);
                accept(name, "name", visitor, Name.class);
                accept(crossReference, "crossReference", visitor, Identifier.class);
                accept(manufacturingBusinessOperation, "manufacturingBusinessOperation", visitor, ManufacturingBusinessOperation.class);
                accept(specialDesignation, "specialDesignation", visitor, SpecialDesignation.class);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder(name);
        builder.id = id;
        builder.meta = meta;
        builder.implicitRules = implicitRules;
        builder.language = language;
        builder.text = text;
        builder.contained.addAll(contained);
        builder.extension.addAll(extension);
        builder.modifierExtension.addAll(modifierExtension);
        builder.identifier.addAll(identifier);
        builder.type = type;
        builder.domain = domain;
        builder.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
        builder.legalStatusOfSupply = legalStatusOfSupply;
        builder.additionalMonitoringIndicator = additionalMonitoringIndicator;
        builder.specialMeasures.addAll(specialMeasures);
        builder.paediatricUseIndicator = paediatricUseIndicator;
        builder.productClassification.addAll(productClassification);
        builder.marketingStatus.addAll(marketingStatus);
        builder.pharmaceuticalProduct.addAll(pharmaceuticalProduct);
        builder.packagedMedicinalProduct.addAll(packagedMedicinalProduct);
        builder.attachedDocument.addAll(attachedDocument);
        builder.masterFile.addAll(masterFile);
        builder.contact.addAll(contact);
        builder.clinicalTrial.addAll(clinicalTrial);
        builder.crossReference.addAll(crossReference);
        builder.manufacturingBusinessOperation.addAll(manufacturingBusinessOperation);
        builder.specialDesignation.addAll(specialDesignation);
        return builder;
    }

    public static Builder builder(List<Name> name) {
        return new Builder(name);
    }

    public static class Builder extends DomainResource.Builder {
        // required
        private final List<Name> name;

        // optional
        private List<Identifier> identifier = new ArrayList<>();
        private CodeableConcept type;
        private Coding domain;
        private CodeableConcept combinedPharmaceuticalDoseForm;
        private CodeableConcept legalStatusOfSupply;
        private CodeableConcept additionalMonitoringIndicator;
        private List<String> specialMeasures = new ArrayList<>();
        private CodeableConcept paediatricUseIndicator;
        private List<CodeableConcept> productClassification = new ArrayList<>();
        private List<MarketingStatus> marketingStatus = new ArrayList<>();
        private List<Reference> pharmaceuticalProduct = new ArrayList<>();
        private List<Reference> packagedMedicinalProduct = new ArrayList<>();
        private List<Reference> attachedDocument = new ArrayList<>();
        private List<Reference> masterFile = new ArrayList<>();
        private List<Reference> contact = new ArrayList<>();
        private List<Reference> clinicalTrial = new ArrayList<>();
        private List<Identifier> crossReference = new ArrayList<>();
        private List<ManufacturingBusinessOperation> manufacturingBusinessOperation = new ArrayList<>();
        private List<SpecialDesignation> specialDesignation = new ArrayList<>();

        private Builder(List<Name> name) {
            super();
            this.name = name;
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
         * Business identifier for this product. Could be an MPID.
         * </p>
         * 
         * @param identifier
         *     Business identifier for this product. Could be an MPID
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Identifier... identifier) {
            for (Identifier value : identifier) {
                this.identifier.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Business identifier for this product. Could be an MPID.
         * </p>
         * 
         * @param identifier
         *     Business identifier for this product. Could be an MPID
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Collection<Identifier> identifier) {
            this.identifier.addAll(identifier);
            return this;
        }

        /**
         * <p>
         * Regulatory type, e.g. Investigational or Authorized.
         * </p>
         * 
         * @param type
         *     Regulatory type, e.g. Investigational or Authorized
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder type(CodeableConcept type) {
            this.type = type;
            return this;
        }

        /**
         * <p>
         * If this medicine applies to human or veterinary uses.
         * </p>
         * 
         * @param domain
         *     If this medicine applies to human or veterinary uses
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder domain(Coding domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>
         * The dose form for a single part product, or combined form of a multiple part product.
         * </p>
         * 
         * @param combinedPharmaceuticalDoseForm
         *     The dose form for a single part product, or combined form of a multiple part product
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder combinedPharmaceuticalDoseForm(CodeableConcept combinedPharmaceuticalDoseForm) {
            this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
            return this;
        }

        /**
         * <p>
         * The legal status of supply of the medicinal product as classified by the regulator.
         * </p>
         * 
         * @param legalStatusOfSupply
         *     The legal status of supply of the medicinal product as classified by the regulator
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder legalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
            this.legalStatusOfSupply = legalStatusOfSupply;
            return this;
        }

        /**
         * <p>
         * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.
         * </p>
         * 
         * @param additionalMonitoringIndicator
         *     Whether the Medicinal Product is subject to additional monitoring for regulatory reasons
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder additionalMonitoringIndicator(CodeableConcept additionalMonitoringIndicator) {
            this.additionalMonitoringIndicator = additionalMonitoringIndicator;
            return this;
        }

        /**
         * <p>
         * Whether the Medicinal Product is subject to special measures for regulatory reasons.
         * </p>
         * 
         * @param specialMeasures
         *     Whether the Medicinal Product is subject to special measures for regulatory reasons
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder specialMeasures(String... specialMeasures) {
            for (String value : specialMeasures) {
                this.specialMeasures.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Whether the Medicinal Product is subject to special measures for regulatory reasons.
         * </p>
         * 
         * @param specialMeasures
         *     Whether the Medicinal Product is subject to special measures for regulatory reasons
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder specialMeasures(Collection<String> specialMeasures) {
            this.specialMeasures.addAll(specialMeasures);
            return this;
        }

        /**
         * <p>
         * If authorised for use in children.
         * </p>
         * 
         * @param paediatricUseIndicator
         *     If authorised for use in children
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder paediatricUseIndicator(CodeableConcept paediatricUseIndicator) {
            this.paediatricUseIndicator = paediatricUseIndicator;
            return this;
        }

        /**
         * <p>
         * Allows the product to be classified by various systems.
         * </p>
         * 
         * @param productClassification
         *     Allows the product to be classified by various systems
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder productClassification(CodeableConcept... productClassification) {
            for (CodeableConcept value : productClassification) {
                this.productClassification.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Allows the product to be classified by various systems.
         * </p>
         * 
         * @param productClassification
         *     Allows the product to be classified by various systems
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder productClassification(Collection<CodeableConcept> productClassification) {
            this.productClassification.addAll(productClassification);
            return this;
        }

        /**
         * <p>
         * Marketing status of the medicinal product, in contrast to marketing authorizaton.
         * </p>
         * 
         * @param marketingStatus
         *     Marketing status of the medicinal product, in contrast to marketing authorizaton
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder marketingStatus(MarketingStatus... marketingStatus) {
            for (MarketingStatus value : marketingStatus) {
                this.marketingStatus.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Marketing status of the medicinal product, in contrast to marketing authorizaton.
         * </p>
         * 
         * @param marketingStatus
         *     Marketing status of the medicinal product, in contrast to marketing authorizaton
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder marketingStatus(Collection<MarketingStatus> marketingStatus) {
            this.marketingStatus.addAll(marketingStatus);
            return this;
        }

        /**
         * <p>
         * Pharmaceutical aspects of product.
         * </p>
         * 
         * @param pharmaceuticalProduct
         *     Pharmaceutical aspects of product
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder pharmaceuticalProduct(Reference... pharmaceuticalProduct) {
            for (Reference value : pharmaceuticalProduct) {
                this.pharmaceuticalProduct.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Pharmaceutical aspects of product.
         * </p>
         * 
         * @param pharmaceuticalProduct
         *     Pharmaceutical aspects of product
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder pharmaceuticalProduct(Collection<Reference> pharmaceuticalProduct) {
            this.pharmaceuticalProduct.addAll(pharmaceuticalProduct);
            return this;
        }

        /**
         * <p>
         * Package representation for the product.
         * </p>
         * 
         * @param packagedMedicinalProduct
         *     Package representation for the product
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder packagedMedicinalProduct(Reference... packagedMedicinalProduct) {
            for (Reference value : packagedMedicinalProduct) {
                this.packagedMedicinalProduct.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Package representation for the product.
         * </p>
         * 
         * @param packagedMedicinalProduct
         *     Package representation for the product
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder packagedMedicinalProduct(Collection<Reference> packagedMedicinalProduct) {
            this.packagedMedicinalProduct.addAll(packagedMedicinalProduct);
            return this;
        }

        /**
         * <p>
         * Supporting documentation, typically for regulatory submission.
         * </p>
         * 
         * @param attachedDocument
         *     Supporting documentation, typically for regulatory submission
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder attachedDocument(Reference... attachedDocument) {
            for (Reference value : attachedDocument) {
                this.attachedDocument.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Supporting documentation, typically for regulatory submission.
         * </p>
         * 
         * @param attachedDocument
         *     Supporting documentation, typically for regulatory submission
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder attachedDocument(Collection<Reference> attachedDocument) {
            this.attachedDocument.addAll(attachedDocument);
            return this;
        }

        /**
         * <p>
         * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
         * </p>
         * 
         * @param masterFile
         *     A master file for to the medicinal product (e.g. Pharmacovigilance System Master File)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder masterFile(Reference... masterFile) {
            for (Reference value : masterFile) {
                this.masterFile.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
         * </p>
         * 
         * @param masterFile
         *     A master file for to the medicinal product (e.g. Pharmacovigilance System Master File)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder masterFile(Collection<Reference> masterFile) {
            this.masterFile.addAll(masterFile);
            return this;
        }

        /**
         * <p>
         * A product specific contact, person (in a role), or an organization.
         * </p>
         * 
         * @param contact
         *     A product specific contact, person (in a role), or an organization
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder contact(Reference... contact) {
            for (Reference value : contact) {
                this.contact.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A product specific contact, person (in a role), or an organization.
         * </p>
         * 
         * @param contact
         *     A product specific contact, person (in a role), or an organization
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder contact(Collection<Reference> contact) {
            this.contact.addAll(contact);
            return this;
        }

        /**
         * <p>
         * Clinical trials or studies that this product is involved in.
         * </p>
         * 
         * @param clinicalTrial
         *     Clinical trials or studies that this product is involved in
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder clinicalTrial(Reference... clinicalTrial) {
            for (Reference value : clinicalTrial) {
                this.clinicalTrial.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Clinical trials or studies that this product is involved in.
         * </p>
         * 
         * @param clinicalTrial
         *     Clinical trials or studies that this product is involved in
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder clinicalTrial(Collection<Reference> clinicalTrial) {
            this.clinicalTrial.addAll(clinicalTrial);
            return this;
        }

        /**
         * <p>
         * Reference to another product, e.g. for linking authorised to investigational product.
         * </p>
         * 
         * @param crossReference
         *     Reference to another product, e.g. for linking authorised to investigational product
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder crossReference(Identifier... crossReference) {
            for (Identifier value : crossReference) {
                this.crossReference.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Reference to another product, e.g. for linking authorised to investigational product.
         * </p>
         * 
         * @param crossReference
         *     Reference to another product, e.g. for linking authorised to investigational product
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder crossReference(Collection<Identifier> crossReference) {
            this.crossReference.addAll(crossReference);
            return this;
        }

        /**
         * <p>
         * An operation applied to the product, for manufacturing or adminsitrative purpose.
         * </p>
         * 
         * @param manufacturingBusinessOperation
         *     An operation applied to the product, for manufacturing or adminsitrative purpose
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder manufacturingBusinessOperation(ManufacturingBusinessOperation... manufacturingBusinessOperation) {
            for (ManufacturingBusinessOperation value : manufacturingBusinessOperation) {
                this.manufacturingBusinessOperation.add(value);
            }
            return this;
        }

        /**
         * <p>
         * An operation applied to the product, for manufacturing or adminsitrative purpose.
         * </p>
         * 
         * @param manufacturingBusinessOperation
         *     An operation applied to the product, for manufacturing or adminsitrative purpose
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder manufacturingBusinessOperation(Collection<ManufacturingBusinessOperation> manufacturingBusinessOperation) {
            this.manufacturingBusinessOperation.addAll(manufacturingBusinessOperation);
            return this;
        }

        /**
         * <p>
         * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
         * </p>
         * 
         * @param specialDesignation
         *     Indicates if the medicinal product has an orphan designation for the treatment of a rare disease
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder specialDesignation(SpecialDesignation... specialDesignation) {
            for (SpecialDesignation value : specialDesignation) {
                this.specialDesignation.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
         * </p>
         * 
         * @param specialDesignation
         *     Indicates if the medicinal product has an orphan designation for the treatment of a rare disease
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder specialDesignation(Collection<SpecialDesignation> specialDesignation) {
            this.specialDesignation.addAll(specialDesignation);
            return this;
        }

        @Override
        public MedicinalProduct build() {
            return new MedicinalProduct(this);
        }
    }

    /**
     * <p>
     * The product's name, including full name and possibly coded parts.
     * </p>
     */
    public static class Name extends BackboneElement {
        private final String productName;
        private final List<NamePart> namePart;
        private final List<CountryLanguage> countryLanguage;

        private Name(Builder builder) {
            super(builder);
            this.productName = ValidationSupport.requireNonNull(builder.productName, "productName");
            this.namePart = builder.namePart;
            this.countryLanguage = builder.countryLanguage;
        }

        /**
         * <p>
         * The full product name.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getProductName() {
            return productName;
        }

        /**
         * <p>
         * Coding words or phrases of the name.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link NamePart}.
         */
        public List<NamePart> getNamePart() {
            return namePart;
        }

        /**
         * <p>
         * Country where the name applies.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CountryLanguage}.
         */
        public List<CountryLanguage> getCountryLanguage() {
            return countryLanguage;
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
                    accept(productName, "productName", visitor);
                    accept(namePart, "namePart", visitor, NamePart.class);
                    accept(countryLanguage, "countryLanguage", visitor, CountryLanguage.class);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(String productName) {
            return new Builder(productName);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final String productName;

            // optional
            private List<NamePart> namePart = new ArrayList<>();
            private List<CountryLanguage> countryLanguage = new ArrayList<>();

            private Builder(String productName) {
                super();
                this.productName = productName;
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

            /**
             * <p>
             * Coding words or phrases of the name.
             * </p>
             * 
             * @param namePart
             *     Coding words or phrases of the name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder namePart(NamePart... namePart) {
                for (NamePart value : namePart) {
                    this.namePart.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Coding words or phrases of the name.
             * </p>
             * 
             * @param namePart
             *     Coding words or phrases of the name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder namePart(Collection<NamePart> namePart) {
                this.namePart.addAll(namePart);
                return this;
            }

            /**
             * <p>
             * Country where the name applies.
             * </p>
             * 
             * @param countryLanguage
             *     Country where the name applies
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder countryLanguage(CountryLanguage... countryLanguage) {
                for (CountryLanguage value : countryLanguage) {
                    this.countryLanguage.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Country where the name applies.
             * </p>
             * 
             * @param countryLanguage
             *     Country where the name applies
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder countryLanguage(Collection<CountryLanguage> countryLanguage) {
                this.countryLanguage.addAll(countryLanguage);
                return this;
            }

            @Override
            public Name build() {
                return new Name(this);
            }

            private static Builder from(Name name) {
                Builder builder = new Builder(name.productName);
                builder.id = name.id;
                builder.extension.addAll(name.extension);
                builder.modifierExtension.addAll(name.modifierExtension);
                builder.namePart.addAll(name.namePart);
                builder.countryLanguage.addAll(name.countryLanguage);
                return builder;
            }
        }

        /**
         * <p>
         * Coding words or phrases of the name.
         * </p>
         */
        public static class NamePart extends BackboneElement {
            private final String part;
            private final Coding type;

            private NamePart(Builder builder) {
                super(builder);
                this.part = ValidationSupport.requireNonNull(builder.part, "part");
                this.type = ValidationSupport.requireNonNull(builder.type, "type");
            }

            /**
             * <p>
             * A fragment of a product name.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link String}.
             */
            public String getPart() {
                return part;
            }

            /**
             * <p>
             * Idenifying type for this part of the name (e.g. strength part).
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Coding}.
             */
            public Coding getType() {
                return type;
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
                        accept(part, "part", visitor);
                        accept(type, "type", visitor);
                    }
                    visitor.visitEnd(elementName, this);
                    visitor.postVisit(this);
                }
            }

            @Override
            public Builder toBuilder() {
                return Builder.from(this);
            }

            public static Builder builder(String part, Coding type) {
                return new Builder(part, type);
            }

            public static class Builder extends BackboneElement.Builder {
                // required
                private final String part;
                private final Coding type;

                private Builder(String part, Coding type) {
                    super();
                    this.part = part;
                    this.type = type;
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
                public NamePart build() {
                    return new NamePart(this);
                }

                private static Builder from(NamePart namePart) {
                    Builder builder = new Builder(namePart.part, namePart.type);
                    builder.id = namePart.id;
                    builder.extension.addAll(namePart.extension);
                    builder.modifierExtension.addAll(namePart.modifierExtension);
                    return builder;
                }
            }
        }

        /**
         * <p>
         * Country where the name applies.
         * </p>
         */
        public static class CountryLanguage extends BackboneElement {
            private final CodeableConcept country;
            private final CodeableConcept jurisdiction;
            private final CodeableConcept language;

            private CountryLanguage(Builder builder) {
                super(builder);
                this.country = ValidationSupport.requireNonNull(builder.country, "country");
                this.jurisdiction = builder.jurisdiction;
                this.language = ValidationSupport.requireNonNull(builder.language, "language");
            }

            /**
             * <p>
             * Country code for where this name applies.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getCountry() {
                return country;
            }

            /**
             * <p>
             * Jurisdiction code for where this name applies.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getJurisdiction() {
                return jurisdiction;
            }

            /**
             * <p>
             * Language code for this name.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getLanguage() {
                return language;
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
                        accept(country, "country", visitor);
                        accept(jurisdiction, "jurisdiction", visitor);
                        accept(language, "language", visitor);
                    }
                    visitor.visitEnd(elementName, this);
                    visitor.postVisit(this);
                }
            }

            @Override
            public Builder toBuilder() {
                return Builder.from(this);
            }

            public static Builder builder(CodeableConcept country, CodeableConcept language) {
                return new Builder(country, language);
            }

            public static class Builder extends BackboneElement.Builder {
                // required
                private final CodeableConcept country;
                private final CodeableConcept language;

                // optional
                private CodeableConcept jurisdiction;

                private Builder(CodeableConcept country, CodeableConcept language) {
                    super();
                    this.country = country;
                    this.language = language;
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

                /**
                 * <p>
                 * Jurisdiction code for where this name applies.
                 * </p>
                 * 
                 * @param jurisdiction
                 *     Jurisdiction code for where this name applies
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder jurisdiction(CodeableConcept jurisdiction) {
                    this.jurisdiction = jurisdiction;
                    return this;
                }

                @Override
                public CountryLanguage build() {
                    return new CountryLanguage(this);
                }

                private static Builder from(CountryLanguage countryLanguage) {
                    Builder builder = new Builder(countryLanguage.country, countryLanguage.language);
                    builder.id = countryLanguage.id;
                    builder.extension.addAll(countryLanguage.extension);
                    builder.modifierExtension.addAll(countryLanguage.modifierExtension);
                    builder.jurisdiction = countryLanguage.jurisdiction;
                    return builder;
                }
            }
        }
    }

    /**
     * <p>
     * An operation applied to the product, for manufacturing or adminsitrative purpose.
     * </p>
     */
    public static class ManufacturingBusinessOperation extends BackboneElement {
        private final CodeableConcept operationType;
        private final Identifier authorisationReferenceNumber;
        private final DateTime effectiveDate;
        private final CodeableConcept confidentialityIndicator;
        private final List<Reference> manufacturer;
        private final Reference regulator;

        private ManufacturingBusinessOperation(Builder builder) {
            super(builder);
            this.operationType = builder.operationType;
            this.authorisationReferenceNumber = builder.authorisationReferenceNumber;
            this.effectiveDate = builder.effectiveDate;
            this.confidentialityIndicator = builder.confidentialityIndicator;
            this.manufacturer = builder.manufacturer;
            this.regulator = builder.regulator;
        }

        /**
         * <p>
         * The type of manufacturing operation.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getOperationType() {
            return operationType;
        }

        /**
         * <p>
         * Regulatory authorization reference number.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Identifier}.
         */
        public Identifier getAuthorisationReferenceNumber() {
            return authorisationReferenceNumber;
        }

        /**
         * <p>
         * Regulatory authorization date.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link DateTime}.
         */
        public DateTime getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * <p>
         * To indicate if this proces is commercially confidential.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getConfidentialityIndicator() {
            return confidentialityIndicator;
        }

        /**
         * <p>
         * The manufacturer or establishment associated with the process.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getManufacturer() {
            return manufacturer;
        }

        /**
         * <p>
         * A regulator which oversees the operation.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Reference}.
         */
        public Reference getRegulator() {
            return regulator;
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
                    accept(operationType, "operationType", visitor);
                    accept(authorisationReferenceNumber, "authorisationReferenceNumber", visitor);
                    accept(effectiveDate, "effectiveDate", visitor);
                    accept(confidentialityIndicator, "confidentialityIndicator", visitor);
                    accept(manufacturer, "manufacturer", visitor, Reference.class);
                    accept(regulator, "regulator", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder extends BackboneElement.Builder {
            // optional
            private CodeableConcept operationType;
            private Identifier authorisationReferenceNumber;
            private DateTime effectiveDate;
            private CodeableConcept confidentialityIndicator;
            private List<Reference> manufacturer = new ArrayList<>();
            private Reference regulator;

            private Builder() {
                super();
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

            /**
             * <p>
             * The type of manufacturing operation.
             * </p>
             * 
             * @param operationType
             *     The type of manufacturing operation
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder operationType(CodeableConcept operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>
             * Regulatory authorization reference number.
             * </p>
             * 
             * @param authorisationReferenceNumber
             *     Regulatory authorization reference number
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder authorisationReferenceNumber(Identifier authorisationReferenceNumber) {
                this.authorisationReferenceNumber = authorisationReferenceNumber;
                return this;
            }

            /**
             * <p>
             * Regulatory authorization date.
             * </p>
             * 
             * @param effectiveDate
             *     Regulatory authorization date
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder effectiveDate(DateTime effectiveDate) {
                this.effectiveDate = effectiveDate;
                return this;
            }

            /**
             * <p>
             * To indicate if this proces is commercially confidential.
             * </p>
             * 
             * @param confidentialityIndicator
             *     To indicate if this proces is commercially confidential
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder confidentialityIndicator(CodeableConcept confidentialityIndicator) {
                this.confidentialityIndicator = confidentialityIndicator;
                return this;
            }

            /**
             * <p>
             * The manufacturer or establishment associated with the process.
             * </p>
             * 
             * @param manufacturer
             *     The manufacturer or establishment associated with the process
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder manufacturer(Reference... manufacturer) {
                for (Reference value : manufacturer) {
                    this.manufacturer.add(value);
                }
                return this;
            }

            /**
             * <p>
             * The manufacturer or establishment associated with the process.
             * </p>
             * 
             * @param manufacturer
             *     The manufacturer or establishment associated with the process
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder manufacturer(Collection<Reference> manufacturer) {
                this.manufacturer.addAll(manufacturer);
                return this;
            }

            /**
             * <p>
             * A regulator which oversees the operation.
             * </p>
             * 
             * @param regulator
             *     A regulator which oversees the operation
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder regulator(Reference regulator) {
                this.regulator = regulator;
                return this;
            }

            @Override
            public ManufacturingBusinessOperation build() {
                return new ManufacturingBusinessOperation(this);
            }

            private static Builder from(ManufacturingBusinessOperation manufacturingBusinessOperation) {
                Builder builder = new Builder();
                builder.id = manufacturingBusinessOperation.id;
                builder.extension.addAll(manufacturingBusinessOperation.extension);
                builder.modifierExtension.addAll(manufacturingBusinessOperation.modifierExtension);
                builder.operationType = manufacturingBusinessOperation.operationType;
                builder.authorisationReferenceNumber = manufacturingBusinessOperation.authorisationReferenceNumber;
                builder.effectiveDate = manufacturingBusinessOperation.effectiveDate;
                builder.confidentialityIndicator = manufacturingBusinessOperation.confidentialityIndicator;
                builder.manufacturer.addAll(manufacturingBusinessOperation.manufacturer);
                builder.regulator = manufacturingBusinessOperation.regulator;
                return builder;
            }
        }
    }

    /**
     * <p>
     * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
     * </p>
     */
    public static class SpecialDesignation extends BackboneElement {
        private final List<Identifier> identifier;
        private final CodeableConcept type;
        private final CodeableConcept intendedUse;
        private final Element indication;
        private final CodeableConcept status;
        private final DateTime date;
        private final CodeableConcept species;

        private SpecialDesignation(Builder builder) {
            super(builder);
            this.identifier = builder.identifier;
            this.type = builder.type;
            this.intendedUse = builder.intendedUse;
            this.indication = ValidationSupport.choiceElement(builder.indication, "indication", CodeableConcept.class, Reference.class);
            this.status = builder.status;
            this.date = builder.date;
            this.species = builder.species;
        }

        /**
         * <p>
         * Identifier for the designation, or procedure number.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Identifier}.
         */
        public List<Identifier> getIdentifier() {
            return identifier;
        }

        /**
         * <p>
         * The type of special designation, e.g. orphan drug, minor use.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getType() {
            return type;
        }

        /**
         * <p>
         * The intended use of the product, e.g. prevention, treatment.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getIntendedUse() {
            return intendedUse;
        }

        /**
         * <p>
         * Condition for which the medicinal use applies.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getIndication() {
            return indication;
        }

        /**
         * <p>
         * For example granted, pending, expired or withdrawn.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getStatus() {
            return status;
        }

        /**
         * <p>
         * Date when the designation was granted.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link DateTime}.
         */
        public DateTime getDate() {
            return date;
        }

        /**
         * <p>
         * Animal species for which this applies.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getSpecies() {
            return species;
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
                    accept(identifier, "identifier", visitor, Identifier.class);
                    accept(type, "type", visitor);
                    accept(intendedUse, "intendedUse", visitor);
                    accept(indication, "indication", visitor, true);
                    accept(status, "status", visitor);
                    accept(date, "date", visitor);
                    accept(species, "species", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder extends BackboneElement.Builder {
            // optional
            private List<Identifier> identifier = new ArrayList<>();
            private CodeableConcept type;
            private CodeableConcept intendedUse;
            private Element indication;
            private CodeableConcept status;
            private DateTime date;
            private CodeableConcept species;

            private Builder() {
                super();
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

            /**
             * <p>
             * Identifier for the designation, or procedure number.
             * </p>
             * 
             * @param identifier
             *     Identifier for the designation, or procedure number
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder identifier(Identifier... identifier) {
                for (Identifier value : identifier) {
                    this.identifier.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Identifier for the designation, or procedure number.
             * </p>
             * 
             * @param identifier
             *     Identifier for the designation, or procedure number
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder identifier(Collection<Identifier> identifier) {
                this.identifier.addAll(identifier);
                return this;
            }

            /**
             * <p>
             * The type of special designation, e.g. orphan drug, minor use.
             * </p>
             * 
             * @param type
             *     The type of special designation, e.g. orphan drug, minor use
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder type(CodeableConcept type) {
                this.type = type;
                return this;
            }

            /**
             * <p>
             * The intended use of the product, e.g. prevention, treatment.
             * </p>
             * 
             * @param intendedUse
             *     The intended use of the product, e.g. prevention, treatment
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder intendedUse(CodeableConcept intendedUse) {
                this.intendedUse = intendedUse;
                return this;
            }

            /**
             * <p>
             * Condition for which the medicinal use applies.
             * </p>
             * 
             * @param indication
             *     Condition for which the medicinal use applies
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder indication(Element indication) {
                this.indication = indication;
                return this;
            }

            /**
             * <p>
             * For example granted, pending, expired or withdrawn.
             * </p>
             * 
             * @param status
             *     For example granted, pending, expired or withdrawn
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder status(CodeableConcept status) {
                this.status = status;
                return this;
            }

            /**
             * <p>
             * Date when the designation was granted.
             * </p>
             * 
             * @param date
             *     Date when the designation was granted
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder date(DateTime date) {
                this.date = date;
                return this;
            }

            /**
             * <p>
             * Animal species for which this applies.
             * </p>
             * 
             * @param species
             *     Animal species for which this applies
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder species(CodeableConcept species) {
                this.species = species;
                return this;
            }

            @Override
            public SpecialDesignation build() {
                return new SpecialDesignation(this);
            }

            private static Builder from(SpecialDesignation specialDesignation) {
                Builder builder = new Builder();
                builder.id = specialDesignation.id;
                builder.extension.addAll(specialDesignation.extension);
                builder.modifierExtension.addAll(specialDesignation.modifierExtension);
                builder.identifier.addAll(specialDesignation.identifier);
                builder.type = specialDesignation.type;
                builder.intendedUse = specialDesignation.intendedUse;
                builder.indication = specialDesignation.indication;
                builder.status = specialDesignation.status;
                builder.date = specialDesignation.date;
                builder.species = specialDesignation.species;
                return builder;
            }
        }
    }
}
