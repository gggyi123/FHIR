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

import com.ibm.watsonhealth.fhir.model.type.Attachment;
import com.ibm.watsonhealth.fhir.model.type.BackboneElement;
import com.ibm.watsonhealth.fhir.model.type.Boolean;
import com.ibm.watsonhealth.fhir.model.type.CodeableConcept;
import com.ibm.watsonhealth.fhir.model.type.DateTime;
import com.ibm.watsonhealth.fhir.model.type.Element;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Quantity;
import com.ibm.watsonhealth.fhir.model.type.Range;
import com.ibm.watsonhealth.fhir.model.type.Ratio;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class SubstanceSpecification extends DomainResource {
    private final Identifier identifier;
    private final CodeableConcept type;
    private final CodeableConcept status;
    private final CodeableConcept domain;
    private final String description;
    private final List<Reference> source;
    private final String comment;
    private final List<Moiety> moiety;
    private final List<Property> property;
    private final Reference referenceInformation;
    private final Structure structure;
    private final List<Code> code;
    private final List<Name> name;
    private final List<SubstanceSpecification.Structure.Isotope.MolecularWeight> molecularWeight;
    private final List<Relationship> relationship;
    private final Reference nucleicAcid;
    private final Reference polymer;
    private final Reference protein;
    private final Reference sourceMaterial;

    private SubstanceSpecification(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
        this.type = builder.type;
        this.status = builder.status;
        this.domain = builder.domain;
        this.description = builder.description;
        this.source = builder.source;
        this.comment = builder.comment;
        this.moiety = builder.moiety;
        this.property = builder.property;
        this.referenceInformation = builder.referenceInformation;
        this.structure = builder.structure;
        this.code = builder.code;
        this.name = builder.name;
        this.molecularWeight = builder.molecularWeight;
        this.relationship = builder.relationship;
        this.nucleicAcid = builder.nucleicAcid;
        this.polymer = builder.polymer;
        this.protein = builder.protein;
        this.sourceMaterial = builder.sourceMaterial;
    }

    /**
     * <p>
     * Identifier by which this substance is known.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Identifier}.
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * High level categorization, e.g. polymer or nucleic acid.
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
     * Status of substance within the catalogue e.g. approved.
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
     * If the substance applies to only human or veterinary use.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getDomain() {
        return domain;
    }

    /**
     * <p>
     * Textual description of the substance.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Supporting literature.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getSource() {
        return source;
    }

    /**
     * <p>
     * Textual comment about this record of a substance.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * Moiety, for structural modifications.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Moiety}.
     */
    public List<Moiety> getMoiety() {
        return moiety;
    }

    /**
     * <p>
     * General specifications for this substance, including how it is related to other substances.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Property}.
     */
    public List<Property> getProperty() {
        return property;
    }

    /**
     * <p>
     * General information detailing this substance.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getReferenceInformation() {
        return referenceInformation;
    }

    /**
     * <p>
     * Structural information.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Structure}.
     */
    public Structure getStructure() {
        return structure;
    }

    /**
     * <p>
     * Codes associated with the substance.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Code}.
     */
    public List<Code> getCode() {
        return code;
    }

    /**
     * <p>
     * Names applicable to this substance.
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
     * The molecular weight or weight range (for proteins, polymers or nucleic acids).
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link MolecularWeight}.
     */
    public List<SubstanceSpecification.Structure.Isotope.MolecularWeight> getMolecularWeight() {
        return molecularWeight;
    }

    /**
     * <p>
     * A link between this substance and another, with details of the relationship.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Relationship}.
     */
    public List<Relationship> getRelationship() {
        return relationship;
    }

    /**
     * <p>
     * Data items specific to nucleic acids.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getNucleicAcid() {
        return nucleicAcid;
    }

    /**
     * <p>
     * Data items specific to polymers.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getPolymer() {
        return polymer;
    }

    /**
     * <p>
     * Data items specific to proteins.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getProtein() {
        return protein;
    }

    /**
     * <p>
     * Material or taxonomic/anatomical source for the substance.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getSourceMaterial() {
        return sourceMaterial;
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
                accept(identifier, "identifier", visitor);
                accept(type, "type", visitor);
                accept(status, "status", visitor);
                accept(domain, "domain", visitor);
                accept(description, "description", visitor);
                accept(source, "source", visitor, Reference.class);
                accept(comment, "comment", visitor);
                accept(moiety, "moiety", visitor, Moiety.class);
                accept(property, "property", visitor, Property.class);
                accept(referenceInformation, "referenceInformation", visitor);
                accept(structure, "structure", visitor);
                accept(code, "code", visitor, Code.class);
                accept(name, "name", visitor, Name.class);
                accept(molecularWeight, "molecularWeight", visitor, SubstanceSpecification.Structure.Isotope.MolecularWeight.class);
                accept(relationship, "relationship", visitor, Relationship.class);
                accept(nucleicAcid, "nucleicAcid", visitor);
                accept(polymer, "polymer", visitor);
                accept(protein, "protein", visitor);
                accept(sourceMaterial, "sourceMaterial", visitor);
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
        builder.identifier = identifier;
        builder.type = type;
        builder.status = status;
        builder.domain = domain;
        builder.description = description;
        builder.source.addAll(source);
        builder.comment = comment;
        builder.moiety.addAll(moiety);
        builder.property.addAll(property);
        builder.referenceInformation = referenceInformation;
        builder.structure = structure;
        builder.code.addAll(code);
        builder.name.addAll(name);
        builder.molecularWeight.addAll(molecularWeight);
        builder.relationship.addAll(relationship);
        builder.nucleicAcid = nucleicAcid;
        builder.polymer = polymer;
        builder.protein = protein;
        builder.sourceMaterial = sourceMaterial;
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends DomainResource.Builder {
        // optional
        private Identifier identifier;
        private CodeableConcept type;
        private CodeableConcept status;
        private CodeableConcept domain;
        private String description;
        private List<Reference> source = new ArrayList<>();
        private String comment;
        private List<Moiety> moiety = new ArrayList<>();
        private List<Property> property = new ArrayList<>();
        private Reference referenceInformation;
        private Structure structure;
        private List<Code> code = new ArrayList<>();
        private List<Name> name = new ArrayList<>();
        private List<SubstanceSpecification.Structure.Isotope.MolecularWeight> molecularWeight = new ArrayList<>();
        private List<Relationship> relationship = new ArrayList<>();
        private Reference nucleicAcid;
        private Reference polymer;
        private Reference protein;
        private Reference sourceMaterial;

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
        public Builder language(com.ibm.watsonhealth.fhir.model.type.Code language) {
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
         * Identifier by which this substance is known.
         * </p>
         * 
         * @param identifier
         *     Identifier by which this substance is known
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Identifier identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>
         * High level categorization, e.g. polymer or nucleic acid.
         * </p>
         * 
         * @param type
         *     High level categorization, e.g. polymer or nucleic acid
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
         * Status of substance within the catalogue e.g. approved.
         * </p>
         * 
         * @param status
         *     Status of substance within the catalogue e.g. approved
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
         * If the substance applies to only human or veterinary use.
         * </p>
         * 
         * @param domain
         *     If the substance applies to only human or veterinary use
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder domain(CodeableConcept domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>
         * Textual description of the substance.
         * </p>
         * 
         * @param description
         *     Textual description of the substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>
         * Supporting literature.
         * </p>
         * 
         * @param source
         *     Supporting literature
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder source(Reference... source) {
            for (Reference value : source) {
                this.source.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Supporting literature.
         * </p>
         * 
         * @param source
         *     Supporting literature
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder source(Collection<Reference> source) {
            this.source.addAll(source);
            return this;
        }

        /**
         * <p>
         * Textual comment about this record of a substance.
         * </p>
         * 
         * @param comment
         *     Textual comment about this record of a substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>
         * Moiety, for structural modifications.
         * </p>
         * 
         * @param moiety
         *     Moiety, for structural modifications
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder moiety(Moiety... moiety) {
            for (Moiety value : moiety) {
                this.moiety.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Moiety, for structural modifications.
         * </p>
         * 
         * @param moiety
         *     Moiety, for structural modifications
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder moiety(Collection<Moiety> moiety) {
            this.moiety.addAll(moiety);
            return this;
        }

        /**
         * <p>
         * General specifications for this substance, including how it is related to other substances.
         * </p>
         * 
         * @param property
         *     General specifications for this substance, including how it is related to other substances
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder property(Property... property) {
            for (Property value : property) {
                this.property.add(value);
            }
            return this;
        }

        /**
         * <p>
         * General specifications for this substance, including how it is related to other substances.
         * </p>
         * 
         * @param property
         *     General specifications for this substance, including how it is related to other substances
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder property(Collection<Property> property) {
            this.property.addAll(property);
            return this;
        }

        /**
         * <p>
         * General information detailing this substance.
         * </p>
         * 
         * @param referenceInformation
         *     General information detailing this substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder referenceInformation(Reference referenceInformation) {
            this.referenceInformation = referenceInformation;
            return this;
        }

        /**
         * <p>
         * Structural information.
         * </p>
         * 
         * @param structure
         *     Structural information
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder structure(Structure structure) {
            this.structure = structure;
            return this;
        }

        /**
         * <p>
         * Codes associated with the substance.
         * </p>
         * 
         * @param code
         *     Codes associated with the substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder code(Code... code) {
            for (Code value : code) {
                this.code.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Codes associated with the substance.
         * </p>
         * 
         * @param code
         *     Codes associated with the substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder code(Collection<Code> code) {
            this.code.addAll(code);
            return this;
        }

        /**
         * <p>
         * Names applicable to this substance.
         * </p>
         * 
         * @param name
         *     Names applicable to this substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder name(Name... name) {
            for (Name value : name) {
                this.name.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Names applicable to this substance.
         * </p>
         * 
         * @param name
         *     Names applicable to this substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder name(Collection<Name> name) {
            this.name.addAll(name);
            return this;
        }

        /**
         * <p>
         * The molecular weight or weight range (for proteins, polymers or nucleic acids).
         * </p>
         * 
         * @param molecularWeight
         *     The molecular weight or weight range (for proteins, polymers or nucleic acids)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder molecularWeight(SubstanceSpecification.Structure.Isotope.MolecularWeight... molecularWeight) {
            for (SubstanceSpecification.Structure.Isotope.MolecularWeight value : molecularWeight) {
                this.molecularWeight.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The molecular weight or weight range (for proteins, polymers or nucleic acids).
         * </p>
         * 
         * @param molecularWeight
         *     The molecular weight or weight range (for proteins, polymers or nucleic acids)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder molecularWeight(Collection<SubstanceSpecification.Structure.Isotope.MolecularWeight> molecularWeight) {
            this.molecularWeight.addAll(molecularWeight);
            return this;
        }

        /**
         * <p>
         * A link between this substance and another, with details of the relationship.
         * </p>
         * 
         * @param relationship
         *     A link between this substance and another, with details of the relationship
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder relationship(Relationship... relationship) {
            for (Relationship value : relationship) {
                this.relationship.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A link between this substance and another, with details of the relationship.
         * </p>
         * 
         * @param relationship
         *     A link between this substance and another, with details of the relationship
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder relationship(Collection<Relationship> relationship) {
            this.relationship.addAll(relationship);
            return this;
        }

        /**
         * <p>
         * Data items specific to nucleic acids.
         * </p>
         * 
         * @param nucleicAcid
         *     Data items specific to nucleic acids
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder nucleicAcid(Reference nucleicAcid) {
            this.nucleicAcid = nucleicAcid;
            return this;
        }

        /**
         * <p>
         * Data items specific to polymers.
         * </p>
         * 
         * @param polymer
         *     Data items specific to polymers
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder polymer(Reference polymer) {
            this.polymer = polymer;
            return this;
        }

        /**
         * <p>
         * Data items specific to proteins.
         * </p>
         * 
         * @param protein
         *     Data items specific to proteins
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder protein(Reference protein) {
            this.protein = protein;
            return this;
        }

        /**
         * <p>
         * Material or taxonomic/anatomical source for the substance.
         * </p>
         * 
         * @param sourceMaterial
         *     Material or taxonomic/anatomical source for the substance
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder sourceMaterial(Reference sourceMaterial) {
            this.sourceMaterial = sourceMaterial;
            return this;
        }

        @Override
        public SubstanceSpecification build() {
            return new SubstanceSpecification(this);
        }
    }

    /**
     * <p>
     * Moiety, for structural modifications.
     * </p>
     */
    public static class Moiety extends BackboneElement {
        private final CodeableConcept role;
        private final Identifier identifier;
        private final String name;
        private final CodeableConcept stereochemistry;
        private final CodeableConcept opticalActivity;
        private final String molecularFormula;
        private final Element amount;

        private Moiety(Builder builder) {
            super(builder);
            this.role = builder.role;
            this.identifier = builder.identifier;
            this.name = builder.name;
            this.stereochemistry = builder.stereochemistry;
            this.opticalActivity = builder.opticalActivity;
            this.molecularFormula = builder.molecularFormula;
            this.amount = ValidationSupport.choiceElement(builder.amount, "amount", Quantity.class, String.class);
        }

        /**
         * <p>
         * Role that the moiety is playing.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getRole() {
            return role;
        }

        /**
         * <p>
         * Identifier by which this moiety substance is known.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Identifier}.
         */
        public Identifier getIdentifier() {
            return identifier;
        }

        /**
         * <p>
         * Textual name for this moiety substance.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getName() {
            return name;
        }

        /**
         * <p>
         * Stereochemistry type.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getStereochemistry() {
            return stereochemistry;
        }

        /**
         * <p>
         * Optical activity type.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getOpticalActivity() {
            return opticalActivity;
        }

        /**
         * <p>
         * Molecular formula.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getMolecularFormula() {
            return molecularFormula;
        }

        /**
         * <p>
         * Quantitative value for this moiety.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getAmount() {
            return amount;
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
                    accept(role, "role", visitor);
                    accept(identifier, "identifier", visitor);
                    accept(name, "name", visitor);
                    accept(stereochemistry, "stereochemistry", visitor);
                    accept(opticalActivity, "opticalActivity", visitor);
                    accept(molecularFormula, "molecularFormula", visitor);
                    accept(amount, "amount", visitor, true);
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
            private CodeableConcept role;
            private Identifier identifier;
            private String name;
            private CodeableConcept stereochemistry;
            private CodeableConcept opticalActivity;
            private String molecularFormula;
            private Element amount;

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
             * Role that the moiety is playing.
             * </p>
             * 
             * @param role
             *     Role that the moiety is playing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder role(CodeableConcept role) {
                this.role = role;
                return this;
            }

            /**
             * <p>
             * Identifier by which this moiety substance is known.
             * </p>
             * 
             * @param identifier
             *     Identifier by which this moiety substance is known
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder identifier(Identifier identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>
             * Textual name for this moiety substance.
             * </p>
             * 
             * @param name
             *     Textual name for this moiety substance
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>
             * Stereochemistry type.
             * </p>
             * 
             * @param stereochemistry
             *     Stereochemistry type
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder stereochemistry(CodeableConcept stereochemistry) {
                this.stereochemistry = stereochemistry;
                return this;
            }

            /**
             * <p>
             * Optical activity type.
             * </p>
             * 
             * @param opticalActivity
             *     Optical activity type
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder opticalActivity(CodeableConcept opticalActivity) {
                this.opticalActivity = opticalActivity;
                return this;
            }

            /**
             * <p>
             * Molecular formula.
             * </p>
             * 
             * @param molecularFormula
             *     Molecular formula
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder molecularFormula(String molecularFormula) {
                this.molecularFormula = molecularFormula;
                return this;
            }

            /**
             * <p>
             * Quantitative value for this moiety.
             * </p>
             * 
             * @param amount
             *     Quantitative value for this moiety
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder amount(Element amount) {
                this.amount = amount;
                return this;
            }

            @Override
            public Moiety build() {
                return new Moiety(this);
            }

            private static Builder from(Moiety moiety) {
                Builder builder = new Builder();
                builder.id = moiety.id;
                builder.extension.addAll(moiety.extension);
                builder.modifierExtension.addAll(moiety.modifierExtension);
                builder.role = moiety.role;
                builder.identifier = moiety.identifier;
                builder.name = moiety.name;
                builder.stereochemistry = moiety.stereochemistry;
                builder.opticalActivity = moiety.opticalActivity;
                builder.molecularFormula = moiety.molecularFormula;
                builder.amount = moiety.amount;
                return builder;
            }
        }
    }

    /**
     * <p>
     * General specifications for this substance, including how it is related to other substances.
     * </p>
     */
    public static class Property extends BackboneElement {
        private final CodeableConcept category;
        private final CodeableConcept code;
        private final String parameters;
        private final Element definingSubstance;
        private final Element amount;

        private Property(Builder builder) {
            super(builder);
            this.category = builder.category;
            this.code = builder.code;
            this.parameters = builder.parameters;
            this.definingSubstance = ValidationSupport.choiceElement(builder.definingSubstance, "definingSubstance", Reference.class, CodeableConcept.class);
            this.amount = ValidationSupport.choiceElement(builder.amount, "amount", Quantity.class, String.class);
        }

        /**
         * <p>
         * A category for this property, e.g. Physical, Chemical, Enzymatic.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getCategory() {
            return category;
        }

        /**
         * <p>
         * Property type e.g. viscosity, pH, isoelectric point.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getCode() {
            return code;
        }

        /**
         * <p>
         * Parameters that were used in the measurement of a property (e.g. for viscosity: measured at 20C with a pH of 7.1).
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getParameters() {
            return parameters;
        }

        /**
         * <p>
         * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol).
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getDefiningSubstance() {
            return definingSubstance;
        }

        /**
         * <p>
         * Quantitative value for this property.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getAmount() {
            return amount;
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
                    accept(category, "category", visitor);
                    accept(code, "code", visitor);
                    accept(parameters, "parameters", visitor);
                    accept(definingSubstance, "definingSubstance", visitor, true);
                    accept(amount, "amount", visitor, true);
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
            private CodeableConcept category;
            private CodeableConcept code;
            private String parameters;
            private Element definingSubstance;
            private Element amount;

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
             * A category for this property, e.g. Physical, Chemical, Enzymatic.
             * </p>
             * 
             * @param category
             *     A category for this property, e.g. Physical, Chemical, Enzymatic
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder category(CodeableConcept category) {
                this.category = category;
                return this;
            }

            /**
             * <p>
             * Property type e.g. viscosity, pH, isoelectric point.
             * </p>
             * 
             * @param code
             *     Property type e.g. viscosity, pH, isoelectric point
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder code(CodeableConcept code) {
                this.code = code;
                return this;
            }

            /**
             * <p>
             * Parameters that were used in the measurement of a property (e.g. for viscosity: measured at 20C with a pH of 7.1).
             * </p>
             * 
             * @param parameters
             *     Parameters that were used in the measurement of a property (e.g. for viscosity: measured at 20C with a pH of 7.1)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>
             * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol).
             * </p>
             * 
             * @param definingSubstance
             *     A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder definingSubstance(Element definingSubstance) {
                this.definingSubstance = definingSubstance;
                return this;
            }

            /**
             * <p>
             * Quantitative value for this property.
             * </p>
             * 
             * @param amount
             *     Quantitative value for this property
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder amount(Element amount) {
                this.amount = amount;
                return this;
            }

            @Override
            public Property build() {
                return new Property(this);
            }

            private static Builder from(Property property) {
                Builder builder = new Builder();
                builder.id = property.id;
                builder.extension.addAll(property.extension);
                builder.modifierExtension.addAll(property.modifierExtension);
                builder.category = property.category;
                builder.code = property.code;
                builder.parameters = property.parameters;
                builder.definingSubstance = property.definingSubstance;
                builder.amount = property.amount;
                return builder;
            }
        }
    }

    /**
     * <p>
     * Structural information.
     * </p>
     */
    public static class Structure extends BackboneElement {
        private final CodeableConcept stereochemistry;
        private final CodeableConcept opticalActivity;
        private final String molecularFormula;
        private final String molecularFormulaByMoiety;
        private final List<Isotope> isotope;
        private final SubstanceSpecification.Structure.Isotope.MolecularWeight molecularWeight;
        private final List<Reference> source;
        private final List<Representation> representation;

        private Structure(Builder builder) {
            super(builder);
            this.stereochemistry = builder.stereochemistry;
            this.opticalActivity = builder.opticalActivity;
            this.molecularFormula = builder.molecularFormula;
            this.molecularFormulaByMoiety = builder.molecularFormulaByMoiety;
            this.isotope = builder.isotope;
            this.molecularWeight = builder.molecularWeight;
            this.source = builder.source;
            this.representation = builder.representation;
        }

        /**
         * <p>
         * Stereochemistry type.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getStereochemistry() {
            return stereochemistry;
        }

        /**
         * <p>
         * Optical activity type.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getOpticalActivity() {
            return opticalActivity;
        }

        /**
         * <p>
         * Molecular formula.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getMolecularFormula() {
            return molecularFormula;
        }

        /**
         * <p>
         * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical, each moiety separated by a 
         * dot.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getMolecularFormulaByMoiety() {
            return molecularFormulaByMoiety;
        }

        /**
         * <p>
         * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Isotope}.
         */
        public List<Isotope> getIsotope() {
            return isotope;
        }

        /**
         * <p>
         * The molecular weight or weight range (for proteins, polymers or nucleic acids).
         * </p>
         * 
         * @return
         *     An immutable object of type {@link MolecularWeight}.
         */
        public SubstanceSpecification.Structure.Isotope.MolecularWeight getMolecularWeight() {
            return molecularWeight;
        }

        /**
         * <p>
         * Supporting literature.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getSource() {
            return source;
        }

        /**
         * <p>
         * Molecular structural representation.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Representation}.
         */
        public List<Representation> getRepresentation() {
            return representation;
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
                    accept(stereochemistry, "stereochemistry", visitor);
                    accept(opticalActivity, "opticalActivity", visitor);
                    accept(molecularFormula, "molecularFormula", visitor);
                    accept(molecularFormulaByMoiety, "molecularFormulaByMoiety", visitor);
                    accept(isotope, "isotope", visitor, Isotope.class);
                    accept(molecularWeight, "molecularWeight", visitor);
                    accept(source, "source", visitor, Reference.class);
                    accept(representation, "representation", visitor, Representation.class);
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
            private CodeableConcept stereochemistry;
            private CodeableConcept opticalActivity;
            private String molecularFormula;
            private String molecularFormulaByMoiety;
            private List<Isotope> isotope = new ArrayList<>();
            private SubstanceSpecification.Structure.Isotope.MolecularWeight molecularWeight;
            private List<Reference> source = new ArrayList<>();
            private List<Representation> representation = new ArrayList<>();

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
             * Stereochemistry type.
             * </p>
             * 
             * @param stereochemistry
             *     Stereochemistry type
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder stereochemistry(CodeableConcept stereochemistry) {
                this.stereochemistry = stereochemistry;
                return this;
            }

            /**
             * <p>
             * Optical activity type.
             * </p>
             * 
             * @param opticalActivity
             *     Optical activity type
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder opticalActivity(CodeableConcept opticalActivity) {
                this.opticalActivity = opticalActivity;
                return this;
            }

            /**
             * <p>
             * Molecular formula.
             * </p>
             * 
             * @param molecularFormula
             *     Molecular formula
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder molecularFormula(String molecularFormula) {
                this.molecularFormula = molecularFormula;
                return this;
            }

            /**
             * <p>
             * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical, each moiety separated by a 
             * dot.
             * </p>
             * 
             * @param molecularFormulaByMoiety
             *     Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical, each moiety separated by a 
             *     dot
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder molecularFormulaByMoiety(String molecularFormulaByMoiety) {
                this.molecularFormulaByMoiety = molecularFormulaByMoiety;
                return this;
            }

            /**
             * <p>
             * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
             * </p>
             * 
             * @param isotope
             *     Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder isotope(Isotope... isotope) {
                for (Isotope value : isotope) {
                    this.isotope.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
             * </p>
             * 
             * @param isotope
             *     Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder isotope(Collection<Isotope> isotope) {
                this.isotope.addAll(isotope);
                return this;
            }

            /**
             * <p>
             * The molecular weight or weight range (for proteins, polymers or nucleic acids).
             * </p>
             * 
             * @param molecularWeight
             *     The molecular weight or weight range (for proteins, polymers or nucleic acids)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder molecularWeight(SubstanceSpecification.Structure.Isotope.MolecularWeight molecularWeight) {
                this.molecularWeight = molecularWeight;
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Reference... source) {
                for (Reference value : source) {
                    this.source.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Collection<Reference> source) {
                this.source.addAll(source);
                return this;
            }

            /**
             * <p>
             * Molecular structural representation.
             * </p>
             * 
             * @param representation
             *     Molecular structural representation
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder representation(Representation... representation) {
                for (Representation value : representation) {
                    this.representation.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Molecular structural representation.
             * </p>
             * 
             * @param representation
             *     Molecular structural representation
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder representation(Collection<Representation> representation) {
                this.representation.addAll(representation);
                return this;
            }

            @Override
            public Structure build() {
                return new Structure(this);
            }

            private static Builder from(Structure structure) {
                Builder builder = new Builder();
                builder.id = structure.id;
                builder.extension.addAll(structure.extension);
                builder.modifierExtension.addAll(structure.modifierExtension);
                builder.stereochemistry = structure.stereochemistry;
                builder.opticalActivity = structure.opticalActivity;
                builder.molecularFormula = structure.molecularFormula;
                builder.molecularFormulaByMoiety = structure.molecularFormulaByMoiety;
                builder.isotope.addAll(structure.isotope);
                builder.molecularWeight = structure.molecularWeight;
                builder.source.addAll(structure.source);
                builder.representation.addAll(structure.representation);
                return builder;
            }
        }

        /**
         * <p>
         * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
         * </p>
         */
        public static class Isotope extends BackboneElement {
            private final Identifier identifier;
            private final CodeableConcept name;
            private final CodeableConcept substitution;
            private final Quantity halfLife;
            private final MolecularWeight molecularWeight;

            private Isotope(Builder builder) {
                super(builder);
                this.identifier = builder.identifier;
                this.name = builder.name;
                this.substitution = builder.substitution;
                this.halfLife = builder.halfLife;
                this.molecularWeight = builder.molecularWeight;
            }

            /**
             * <p>
             * Substance identifier for each non-natural or radioisotope.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Identifier}.
             */
            public Identifier getIdentifier() {
                return identifier;
            }

            /**
             * <p>
             * Substance name for each non-natural or radioisotope.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getName() {
                return name;
            }

            /**
             * <p>
             * The type of isotopic substitution present in a single substance.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getSubstitution() {
                return substitution;
            }

            /**
             * <p>
             * Half life - for a non-natural nuclide.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Quantity}.
             */
            public Quantity getHalfLife() {
                return halfLife;
            }

            /**
             * <p>
             * The molecular weight or weight range (for proteins, polymers or nucleic acids).
             * </p>
             * 
             * @return
             *     An immutable object of type {@link MolecularWeight}.
             */
            public MolecularWeight getMolecularWeight() {
                return molecularWeight;
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
                        accept(identifier, "identifier", visitor);
                        accept(name, "name", visitor);
                        accept(substitution, "substitution", visitor);
                        accept(halfLife, "halfLife", visitor);
                        accept(molecularWeight, "molecularWeight", visitor);
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
                private Identifier identifier;
                private CodeableConcept name;
                private CodeableConcept substitution;
                private Quantity halfLife;
                private MolecularWeight molecularWeight;

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
                 * Substance identifier for each non-natural or radioisotope.
                 * </p>
                 * 
                 * @param identifier
                 *     Substance identifier for each non-natural or radioisotope
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder identifier(Identifier identifier) {
                    this.identifier = identifier;
                    return this;
                }

                /**
                 * <p>
                 * Substance name for each non-natural or radioisotope.
                 * </p>
                 * 
                 * @param name
                 *     Substance name for each non-natural or radioisotope
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder name(CodeableConcept name) {
                    this.name = name;
                    return this;
                }

                /**
                 * <p>
                 * The type of isotopic substitution present in a single substance.
                 * </p>
                 * 
                 * @param substitution
                 *     The type of isotopic substitution present in a single substance
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder substitution(CodeableConcept substitution) {
                    this.substitution = substitution;
                    return this;
                }

                /**
                 * <p>
                 * Half life - for a non-natural nuclide.
                 * </p>
                 * 
                 * @param halfLife
                 *     Half life - for a non-natural nuclide
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder halfLife(Quantity halfLife) {
                    this.halfLife = halfLife;
                    return this;
                }

                /**
                 * <p>
                 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
                 * </p>
                 * 
                 * @param molecularWeight
                 *     The molecular weight or weight range (for proteins, polymers or nucleic acids)
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder molecularWeight(MolecularWeight molecularWeight) {
                    this.molecularWeight = molecularWeight;
                    return this;
                }

                @Override
                public Isotope build() {
                    return new Isotope(this);
                }

                private static Builder from(Isotope isotope) {
                    Builder builder = new Builder();
                    builder.id = isotope.id;
                    builder.extension.addAll(isotope.extension);
                    builder.modifierExtension.addAll(isotope.modifierExtension);
                    builder.identifier = isotope.identifier;
                    builder.name = isotope.name;
                    builder.substitution = isotope.substitution;
                    builder.halfLife = isotope.halfLife;
                    builder.molecularWeight = isotope.molecularWeight;
                    return builder;
                }
            }

            /**
             * <p>
             * The molecular weight or weight range (for proteins, polymers or nucleic acids).
             * </p>
             */
            public static class MolecularWeight extends BackboneElement {
                private final CodeableConcept method;
                private final CodeableConcept type;
                private final Quantity amount;

                private MolecularWeight(Builder builder) {
                    super(builder);
                    this.method = builder.method;
                    this.type = builder.type;
                    this.amount = builder.amount;
                }

                /**
                 * <p>
                 * The method by which the molecular weight was determined.
                 * </p>
                 * 
                 * @return
                 *     An immutable object of type {@link CodeableConcept}.
                 */
                public CodeableConcept getMethod() {
                    return method;
                }

                /**
                 * <p>
                 * Type of molecular weight such as exact, average (also known as. number average), weight average.
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
                 * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be 
                 * the average. If only a single definite value for a given element is given, it would be captured in this field.
                 * </p>
                 * 
                 * @return
                 *     An immutable object of type {@link Quantity}.
                 */
                public Quantity getAmount() {
                    return amount;
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
                            accept(method, "method", visitor);
                            accept(type, "type", visitor);
                            accept(amount, "amount", visitor);
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
                    private CodeableConcept method;
                    private CodeableConcept type;
                    private Quantity amount;

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
                     * The method by which the molecular weight was determined.
                     * </p>
                     * 
                     * @param method
                     *     The method by which the molecular weight was determined
                     * 
                     * @return
                     *     A reference to this Builder instance.
                     */
                    public Builder method(CodeableConcept method) {
                        this.method = method;
                        return this;
                    }

                    /**
                     * <p>
                     * Type of molecular weight such as exact, average (also known as. number average), weight average.
                     * </p>
                     * 
                     * @param type
                     *     Type of molecular weight such as exact, average (also known as. number average), weight average
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
                     * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be 
                     * the average. If only a single definite value for a given element is given, it would be captured in this field.
                     * </p>
                     * 
                     * @param amount
                     *     Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be 
                     *     the average. If only a single definite value for a given element is given, it would be captured in this field
                     * 
                     * @return
                     *     A reference to this Builder instance.
                     */
                    public Builder amount(Quantity amount) {
                        this.amount = amount;
                        return this;
                    }

                    @Override
                    public MolecularWeight build() {
                        return new MolecularWeight(this);
                    }

                    private static Builder from(MolecularWeight molecularWeight) {
                        Builder builder = new Builder();
                        builder.id = molecularWeight.id;
                        builder.extension.addAll(molecularWeight.extension);
                        builder.modifierExtension.addAll(molecularWeight.modifierExtension);
                        builder.method = molecularWeight.method;
                        builder.type = molecularWeight.type;
                        builder.amount = molecularWeight.amount;
                        return builder;
                    }
                }
            }
        }

        /**
         * <p>
         * Molecular structural representation.
         * </p>
         */
        public static class Representation extends BackboneElement {
            private final CodeableConcept type;
            private final String representation;
            private final Attachment attachment;

            private Representation(Builder builder) {
                super(builder);
                this.type = builder.type;
                this.representation = builder.representation;
                this.attachment = builder.attachment;
            }

            /**
             * <p>
             * The type of structure (e.g. Full, Partial, Representative).
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
             * The structural representation as text string in a format e.g. InChI, SMILES, MOLFILE, CDX.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link String}.
             */
            public String getRepresentation() {
                return representation;
            }

            /**
             * <p>
             * An attached file with the structural representation.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Attachment}.
             */
            public Attachment getAttachment() {
                return attachment;
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
                        accept(type, "type", visitor);
                        accept(representation, "representation", visitor);
                        accept(attachment, "attachment", visitor);
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
                private CodeableConcept type;
                private String representation;
                private Attachment attachment;

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
                 * The type of structure (e.g. Full, Partial, Representative).
                 * </p>
                 * 
                 * @param type
                 *     The type of structure (e.g. Full, Partial, Representative)
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
                 * The structural representation as text string in a format e.g. InChI, SMILES, MOLFILE, CDX.
                 * </p>
                 * 
                 * @param representation
                 *     The structural representation as text string in a format e.g. InChI, SMILES, MOLFILE, CDX
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder representation(String representation) {
                    this.representation = representation;
                    return this;
                }

                /**
                 * <p>
                 * An attached file with the structural representation.
                 * </p>
                 * 
                 * @param attachment
                 *     An attached file with the structural representation
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder attachment(Attachment attachment) {
                    this.attachment = attachment;
                    return this;
                }

                @Override
                public Representation build() {
                    return new Representation(this);
                }

                private static Builder from(Representation representation) {
                    Builder builder = new Builder();
                    builder.id = representation.id;
                    builder.extension.addAll(representation.extension);
                    builder.modifierExtension.addAll(representation.modifierExtension);
                    builder.type = representation.type;
                    builder.representation = representation.representation;
                    builder.attachment = representation.attachment;
                    return builder;
                }
            }
        }
    }

    /**
     * <p>
     * Codes associated with the substance.
     * </p>
     */
    public static class Code extends BackboneElement {
        private final CodeableConcept code;
        private final CodeableConcept status;
        private final DateTime statusDate;
        private final String comment;
        private final List<Reference> source;

        private Code(Builder builder) {
            super(builder);
            this.code = builder.code;
            this.status = builder.status;
            this.statusDate = builder.statusDate;
            this.comment = builder.comment;
            this.source = builder.source;
        }

        /**
         * <p>
         * The specific code.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getCode() {
            return code;
        }

        /**
         * <p>
         * Status of the code assignment.
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
         * The date at which the code status is changed as part of the terminology maintenance.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link DateTime}.
         */
        public DateTime getStatusDate() {
            return statusDate;
        }

        /**
         * <p>
         * Any comment can be provided in this field, if necessary.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getComment() {
            return comment;
        }

        /**
         * <p>
         * Supporting literature.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getSource() {
            return source;
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
                    accept(code, "code", visitor);
                    accept(status, "status", visitor);
                    accept(statusDate, "statusDate", visitor);
                    accept(comment, "comment", visitor);
                    accept(source, "source", visitor, Reference.class);
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
            private CodeableConcept code;
            private CodeableConcept status;
            private DateTime statusDate;
            private String comment;
            private List<Reference> source = new ArrayList<>();

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
             * The specific code.
             * </p>
             * 
             * @param code
             *     The specific code
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder code(CodeableConcept code) {
                this.code = code;
                return this;
            }

            /**
             * <p>
             * Status of the code assignment.
             * </p>
             * 
             * @param status
             *     Status of the code assignment
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
             * The date at which the code status is changed as part of the terminology maintenance.
             * </p>
             * 
             * @param statusDate
             *     The date at which the code status is changed as part of the terminology maintenance
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder statusDate(DateTime statusDate) {
                this.statusDate = statusDate;
                return this;
            }

            /**
             * <p>
             * Any comment can be provided in this field, if necessary.
             * </p>
             * 
             * @param comment
             *     Any comment can be provided in this field, if necessary
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Reference... source) {
                for (Reference value : source) {
                    this.source.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Collection<Reference> source) {
                this.source.addAll(source);
                return this;
            }

            @Override
            public Code build() {
                return new Code(this);
            }

            private static Builder from(Code code) {
                Builder builder = new Builder();
                builder.id = code.id;
                builder.extension.addAll(code.extension);
                builder.modifierExtension.addAll(code.modifierExtension);
                builder.code = code.code;
                builder.status = code.status;
                builder.statusDate = code.statusDate;
                builder.comment = code.comment;
                builder.source.addAll(code.source);
                return builder;
            }
        }
    }

    /**
     * <p>
     * Names applicable to this substance.
     * </p>
     */
    public static class Name extends BackboneElement {
        private final String name;
        private final CodeableConcept type;
        private final CodeableConcept status;
        private final Boolean preferred;
        private final List<CodeableConcept> language;
        private final List<CodeableConcept> domain;
        private final List<CodeableConcept> jurisdiction;
        private final List<SubstanceSpecification.Name> synonym;
        private final List<SubstanceSpecification.Name> translation;
        private final List<Official> official;
        private final List<Reference> source;

        private Name(Builder builder) {
            super(builder);
            this.name = ValidationSupport.requireNonNull(builder.name, "name");
            this.type = builder.type;
            this.status = builder.status;
            this.preferred = builder.preferred;
            this.language = builder.language;
            this.domain = builder.domain;
            this.jurisdiction = builder.jurisdiction;
            this.synonym = builder.synonym;
            this.translation = builder.translation;
            this.official = builder.official;
            this.source = builder.source;
        }

        /**
         * <p>
         * The actual name.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getName() {
            return name;
        }

        /**
         * <p>
         * Name type.
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
         * The status of the name.
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
         * If this is the preferred name for this substance.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Boolean}.
         */
        public Boolean getPreferred() {
            return preferred;
        }

        /**
         * <p>
         * Language of the name.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getLanguage() {
            return language;
        }

        /**
         * <p>
         * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food 
         * colour additive.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getDomain() {
            return domain;
        }

        /**
         * <p>
         * The jurisdiction where this name applies.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getJurisdiction() {
            return jurisdiction;
        }

        /**
         * <p>
         * A synonym of this name.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Name}.
         */
        public List<SubstanceSpecification.Name> getSynonym() {
            return synonym;
        }

        /**
         * <p>
         * A translation for this name.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Name}.
         */
        public List<SubstanceSpecification.Name> getTranslation() {
            return translation;
        }

        /**
         * <p>
         * Details of the official nature of this name.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Official}.
         */
        public List<Official> getOfficial() {
            return official;
        }

        /**
         * <p>
         * Supporting literature.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getSource() {
            return source;
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
                    accept(name, "name", visitor);
                    accept(type, "type", visitor);
                    accept(status, "status", visitor);
                    accept(preferred, "preferred", visitor);
                    accept(language, "language", visitor, CodeableConcept.class);
                    accept(domain, "domain", visitor, CodeableConcept.class);
                    accept(jurisdiction, "jurisdiction", visitor, CodeableConcept.class);
                    accept(synonym, "synonym", visitor, SubstanceSpecification.Name.class);
                    accept(translation, "translation", visitor, SubstanceSpecification.Name.class);
                    accept(official, "official", visitor, Official.class);
                    accept(source, "source", visitor, Reference.class);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(String name) {
            return new Builder(name);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final String name;

            // optional
            private CodeableConcept type;
            private CodeableConcept status;
            private Boolean preferred;
            private List<CodeableConcept> language = new ArrayList<>();
            private List<CodeableConcept> domain = new ArrayList<>();
            private List<CodeableConcept> jurisdiction = new ArrayList<>();
            private List<SubstanceSpecification.Name> synonym = new ArrayList<>();
            private List<SubstanceSpecification.Name> translation = new ArrayList<>();
            private List<Official> official = new ArrayList<>();
            private List<Reference> source = new ArrayList<>();

            private Builder(String name) {
                super();
                this.name = name;
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
             * Name type.
             * </p>
             * 
             * @param type
             *     Name type
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
             * The status of the name.
             * </p>
             * 
             * @param status
             *     The status of the name
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
             * If this is the preferred name for this substance.
             * </p>
             * 
             * @param preferred
             *     If this is the preferred name for this substance
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder preferred(Boolean preferred) {
                this.preferred = preferred;
                return this;
            }

            /**
             * <p>
             * Language of the name.
             * </p>
             * 
             * @param language
             *     Language of the name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder language(CodeableConcept... language) {
                for (CodeableConcept value : language) {
                    this.language.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Language of the name.
             * </p>
             * 
             * @param language
             *     Language of the name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder language(Collection<CodeableConcept> language) {
                this.language.addAll(language);
                return this;
            }

            /**
             * <p>
             * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food 
             * colour additive.
             * </p>
             * 
             * @param domain
             *     The use context of this name for example if there is a different name a drug active ingredient as opposed to a food 
             *     colour additive
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder domain(CodeableConcept... domain) {
                for (CodeableConcept value : domain) {
                    this.domain.add(value);
                }
                return this;
            }

            /**
             * <p>
             * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food 
             * colour additive.
             * </p>
             * 
             * @param domain
             *     The use context of this name for example if there is a different name a drug active ingredient as opposed to a food 
             *     colour additive
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder domain(Collection<CodeableConcept> domain) {
                this.domain.addAll(domain);
                return this;
            }

            /**
             * <p>
             * The jurisdiction where this name applies.
             * </p>
             * 
             * @param jurisdiction
             *     The jurisdiction where this name applies
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder jurisdiction(CodeableConcept... jurisdiction) {
                for (CodeableConcept value : jurisdiction) {
                    this.jurisdiction.add(value);
                }
                return this;
            }

            /**
             * <p>
             * The jurisdiction where this name applies.
             * </p>
             * 
             * @param jurisdiction
             *     The jurisdiction where this name applies
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder jurisdiction(Collection<CodeableConcept> jurisdiction) {
                this.jurisdiction.addAll(jurisdiction);
                return this;
            }

            /**
             * <p>
             * A synonym of this name.
             * </p>
             * 
             * @param synonym
             *     A synonym of this name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder synonym(SubstanceSpecification.Name... synonym) {
                for (SubstanceSpecification.Name value : synonym) {
                    this.synonym.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A synonym of this name.
             * </p>
             * 
             * @param synonym
             *     A synonym of this name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder synonym(Collection<SubstanceSpecification.Name> synonym) {
                this.synonym.addAll(synonym);
                return this;
            }

            /**
             * <p>
             * A translation for this name.
             * </p>
             * 
             * @param translation
             *     A translation for this name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder translation(SubstanceSpecification.Name... translation) {
                for (SubstanceSpecification.Name value : translation) {
                    this.translation.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A translation for this name.
             * </p>
             * 
             * @param translation
             *     A translation for this name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder translation(Collection<SubstanceSpecification.Name> translation) {
                this.translation.addAll(translation);
                return this;
            }

            /**
             * <p>
             * Details of the official nature of this name.
             * </p>
             * 
             * @param official
             *     Details of the official nature of this name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder official(Official... official) {
                for (Official value : official) {
                    this.official.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Details of the official nature of this name.
             * </p>
             * 
             * @param official
             *     Details of the official nature of this name
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder official(Collection<Official> official) {
                this.official.addAll(official);
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Reference... source) {
                for (Reference value : source) {
                    this.source.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Collection<Reference> source) {
                this.source.addAll(source);
                return this;
            }

            @Override
            public Name build() {
                return new Name(this);
            }

            private static Builder from(Name name) {
                Builder builder = new Builder(name.name);
                builder.id = name.id;
                builder.extension.addAll(name.extension);
                builder.modifierExtension.addAll(name.modifierExtension);
                builder.type = name.type;
                builder.status = name.status;
                builder.preferred = name.preferred;
                builder.language.addAll(name.language);
                builder.domain.addAll(name.domain);
                builder.jurisdiction.addAll(name.jurisdiction);
                builder.synonym.addAll(name.synonym);
                builder.translation.addAll(name.translation);
                builder.official.addAll(name.official);
                builder.source.addAll(name.source);
                return builder;
            }
        }

        /**
         * <p>
         * Details of the official nature of this name.
         * </p>
         */
        public static class Official extends BackboneElement {
            private final CodeableConcept authority;
            private final CodeableConcept status;
            private final DateTime date;

            private Official(Builder builder) {
                super(builder);
                this.authority = builder.authority;
                this.status = builder.status;
                this.date = builder.date;
            }

            /**
             * <p>
             * Which authority uses this official name.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getAuthority() {
                return authority;
            }

            /**
             * <p>
             * The status of the official name.
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
             * Date of official name change.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link DateTime}.
             */
            public DateTime getDate() {
                return date;
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
                        accept(authority, "authority", visitor);
                        accept(status, "status", visitor);
                        accept(date, "date", visitor);
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
                private CodeableConcept authority;
                private CodeableConcept status;
                private DateTime date;

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
                 * Which authority uses this official name.
                 * </p>
                 * 
                 * @param authority
                 *     Which authority uses this official name
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder authority(CodeableConcept authority) {
                    this.authority = authority;
                    return this;
                }

                /**
                 * <p>
                 * The status of the official name.
                 * </p>
                 * 
                 * @param status
                 *     The status of the official name
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
                 * Date of official name change.
                 * </p>
                 * 
                 * @param date
                 *     Date of official name change
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder date(DateTime date) {
                    this.date = date;
                    return this;
                }

                @Override
                public Official build() {
                    return new Official(this);
                }

                private static Builder from(Official official) {
                    Builder builder = new Builder();
                    builder.id = official.id;
                    builder.extension.addAll(official.extension);
                    builder.modifierExtension.addAll(official.modifierExtension);
                    builder.authority = official.authority;
                    builder.status = official.status;
                    builder.date = official.date;
                    return builder;
                }
            }
        }
    }

    /**
     * <p>
     * A link between this substance and another, with details of the relationship.
     * </p>
     */
    public static class Relationship extends BackboneElement {
        private final Element substance;
        private final CodeableConcept relationship;
        private final Boolean isDefining;
        private final Element amount;
        private final Ratio amountRatioLowLimit;
        private final CodeableConcept amountType;
        private final List<Reference> source;

        private Relationship(Builder builder) {
            super(builder);
            this.substance = ValidationSupport.choiceElement(builder.substance, "substance", Reference.class, CodeableConcept.class);
            this.relationship = builder.relationship;
            this.isDefining = builder.isDefining;
            this.amount = ValidationSupport.choiceElement(builder.amount, "amount", Quantity.class, Range.class, Ratio.class, String.class);
            this.amountRatioLowLimit = builder.amountRatioLowLimit;
            this.amountType = builder.amountType;
            this.source = builder.source;
        }

        /**
         * <p>
         * A pointer to another substance, as a resource or just a representational code.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getSubstance() {
            return substance;
        }

        /**
         * <p>
         * For example "salt to parent", "active moiety", "starting material".
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getRelationship() {
            return relationship;
        }

        /**
         * <p>
         * For example where an enzyme strongly bonds with a particular substance, this is a defining relationship for that 
         * enzyme, out of several possible substance relationships.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Boolean}.
         */
        public Boolean getIsDefining() {
            return isDefining;
        }

        /**
         * <p>
         * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the 
         * active substance in relation to some other.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getAmount() {
            return amount;
        }

        /**
         * <p>
         * For use when the numeric.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Ratio}.
         */
        public Ratio getAmountRatioLowLimit() {
            return amountRatioLowLimit;
        }

        /**
         * <p>
         * An operator for the amount, for example "average", "approximately", "less than".
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getAmountType() {
            return amountType;
        }

        /**
         * <p>
         * Supporting literature.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getSource() {
            return source;
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
                    accept(substance, "substance", visitor, true);
                    accept(relationship, "relationship", visitor);
                    accept(isDefining, "isDefining", visitor);
                    accept(amount, "amount", visitor, true);
                    accept(amountRatioLowLimit, "amountRatioLowLimit", visitor);
                    accept(amountType, "amountType", visitor);
                    accept(source, "source", visitor, Reference.class);
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
            private Element substance;
            private CodeableConcept relationship;
            private Boolean isDefining;
            private Element amount;
            private Ratio amountRatioLowLimit;
            private CodeableConcept amountType;
            private List<Reference> source = new ArrayList<>();

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
             * A pointer to another substance, as a resource or just a representational code.
             * </p>
             * 
             * @param substance
             *     A pointer to another substance, as a resource or just a representational code
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder substance(Element substance) {
                this.substance = substance;
                return this;
            }

            /**
             * <p>
             * For example "salt to parent", "active moiety", "starting material".
             * </p>
             * 
             * @param relationship
             *     For example "salt to parent", "active moiety", "starting material"
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder relationship(CodeableConcept relationship) {
                this.relationship = relationship;
                return this;
            }

            /**
             * <p>
             * For example where an enzyme strongly bonds with a particular substance, this is a defining relationship for that 
             * enzyme, out of several possible substance relationships.
             * </p>
             * 
             * @param isDefining
             *     For example where an enzyme strongly bonds with a particular substance, this is a defining relationship for that 
             *     enzyme, out of several possible substance relationships
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder isDefining(Boolean isDefining) {
                this.isDefining = isDefining;
                return this;
            }

            /**
             * <p>
             * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the 
             * active substance in relation to some other.
             * </p>
             * 
             * @param amount
             *     A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the 
             *     active substance in relation to some other
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder amount(Element amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>
             * For use when the numeric.
             * </p>
             * 
             * @param amountRatioLowLimit
             *     For use when the numeric
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder amountRatioLowLimit(Ratio amountRatioLowLimit) {
                this.amountRatioLowLimit = amountRatioLowLimit;
                return this;
            }

            /**
             * <p>
             * An operator for the amount, for example "average", "approximately", "less than".
             * </p>
             * 
             * @param amountType
             *     An operator for the amount, for example "average", "approximately", "less than"
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder amountType(CodeableConcept amountType) {
                this.amountType = amountType;
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Reference... source) {
                for (Reference value : source) {
                    this.source.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Supporting literature.
             * </p>
             * 
             * @param source
             *     Supporting literature
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder source(Collection<Reference> source) {
                this.source.addAll(source);
                return this;
            }

            @Override
            public Relationship build() {
                return new Relationship(this);
            }

            private static Builder from(Relationship relationship) {
                Builder builder = new Builder();
                builder.id = relationship.id;
                builder.extension.addAll(relationship.extension);
                builder.modifierExtension.addAll(relationship.modifierExtension);
                builder.substance = relationship.substance;
                builder.relationship = relationship.relationship;
                builder.isDefining = relationship.isDefining;
                builder.amount = relationship.amount;
                builder.amountRatioLowLimit = relationship.amountRatioLowLimit;
                builder.amountType = relationship.amountType;
                builder.source.addAll(relationship.source);
                return builder;
            }
        }
    }
}
