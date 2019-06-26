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
import com.ibm.watsonhealth.fhir.model.type.Code;
import com.ibm.watsonhealth.fhir.model.type.CodeableConcept;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.Integer;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are 
 * either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, 
 * recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This 
 * set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, 
 * peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class SubstanceProtein extends DomainResource {
    private final CodeableConcept sequenceType;
    private final Integer numberOfSubunits;
    private final List<String> disulfideLinkage;
    private final List<Subunit> subunit;

    private SubstanceProtein(Builder builder) {
        super(builder);
        this.sequenceType = builder.sequenceType;
        this.numberOfSubunits = builder.numberOfSubunits;
        this.disulfideLinkage = builder.disulfideLinkage;
        this.subunit = builder.subunit;
    }

    /**
     * <p>
     * The SubstanceProtein descriptive elements will only be used when a complete or partial amino acid sequence is 
     * available or derivable from a nucleic acid sequence.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getSequenceType() {
        return sequenceType;
    }

    /**
     * <p>
     * Number of linear sequences of amino acids linked through peptide bonds. The number of subunits constituting the 
     * SubstanceProtein shall be described. It is possible that the number of subunits can be variable.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Integer}.
     */
    public Integer getNumberOfSubunits() {
        return numberOfSubunits;
    }

    /**
     * <p>
     * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be 
     * described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit 
     * number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage 
     * positions shall actually contain the amino acid Cysteine at the respective positions.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link String}.
     */
    public List<String> getDisulfideLinkage() {
        return disulfideLinkage;
    }

    /**
     * <p>
     * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear 
     * sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished 
     * SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single 
     * sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by 
     * decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Subunit}.
     */
    public List<Subunit> getSubunit() {
        return subunit;
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
                accept(sequenceType, "sequenceType", visitor);
                accept(numberOfSubunits, "numberOfSubunits", visitor);
                accept(disulfideLinkage, "disulfideLinkage", visitor, String.class);
                accept(subunit, "subunit", visitor, Subunit.class);
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
        builder.sequenceType = sequenceType;
        builder.numberOfSubunits = numberOfSubunits;
        builder.disulfideLinkage.addAll(disulfideLinkage);
        builder.subunit.addAll(subunit);
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends DomainResource.Builder {
        // optional
        private CodeableConcept sequenceType;
        private Integer numberOfSubunits;
        private List<String> disulfideLinkage = new ArrayList<>();
        private List<Subunit> subunit = new ArrayList<>();

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
         * The SubstanceProtein descriptive elements will only be used when a complete or partial amino acid sequence is 
         * available or derivable from a nucleic acid sequence.
         * </p>
         * 
         * @param sequenceType
         *     The SubstanceProtein descriptive elements will only be used when a complete or partial amino acid sequence is 
         *     available or derivable from a nucleic acid sequence
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder sequenceType(CodeableConcept sequenceType) {
            this.sequenceType = sequenceType;
            return this;
        }

        /**
         * <p>
         * Number of linear sequences of amino acids linked through peptide bonds. The number of subunits constituting the 
         * SubstanceProtein shall be described. It is possible that the number of subunits can be variable.
         * </p>
         * 
         * @param numberOfSubunits
         *     Number of linear sequences of amino acids linked through peptide bonds. The number of subunits constituting the 
         *     SubstanceProtein shall be described. It is possible that the number of subunits can be variable
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder numberOfSubunits(Integer numberOfSubunits) {
            this.numberOfSubunits = numberOfSubunits;
            return this;
        }

        /**
         * <p>
         * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be 
         * described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit 
         * number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage 
         * positions shall actually contain the amino acid Cysteine at the respective positions.
         * </p>
         * 
         * @param disulfideLinkage
         *     The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be 
         *     described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit 
         *     number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage 
         *     positions shall actually contain the amino acid Cysteine at the respective positions
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder disulfideLinkage(String... disulfideLinkage) {
            for (String value : disulfideLinkage) {
                this.disulfideLinkage.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be 
         * described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit 
         * number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage 
         * positions shall actually contain the amino acid Cysteine at the respective positions.
         * </p>
         * 
         * @param disulfideLinkage
         *     The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be 
         *     described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit 
         *     number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage 
         *     positions shall actually contain the amino acid Cysteine at the respective positions
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder disulfideLinkage(Collection<String> disulfideLinkage) {
            this.disulfideLinkage.addAll(disulfideLinkage);
            return this;
        }

        /**
         * <p>
         * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear 
         * sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished 
         * SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single 
         * sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by 
         * decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
         * </p>
         * 
         * @param subunit
         *     This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear 
         *     sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished 
         *     SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single 
         *     sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by 
         *     decreasing molecular weight; subunits that have identical sequences will be repeated multiple times
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder subunit(Subunit... subunit) {
            for (Subunit value : subunit) {
                this.subunit.add(value);
            }
            return this;
        }

        /**
         * <p>
         * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear 
         * sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished 
         * SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single 
         * sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by 
         * decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
         * </p>
         * 
         * @param subunit
         *     This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear 
         *     sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished 
         *     SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single 
         *     sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by 
         *     decreasing molecular weight; subunits that have identical sequences will be repeated multiple times
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder subunit(Collection<Subunit> subunit) {
            this.subunit.addAll(subunit);
            return this;
        }

        @Override
        public SubstanceProtein build() {
            return new SubstanceProtein(this);
        }
    }

    /**
     * <p>
     * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear 
     * sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished 
     * SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single 
     * sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by 
     * decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
     * </p>
     */
    public static class Subunit extends BackboneElement {
        private final Integer subunit;
        private final String sequence;
        private final Integer length;
        private final Attachment sequenceAttachment;
        private final Identifier nTerminalModificationId;
        private final String nTerminalModification;
        private final Identifier cTerminalModificationId;
        private final String cTerminalModification;

        private Subunit(Builder builder) {
            super(builder);
            this.subunit = builder.subunit;
            this.sequence = builder.sequence;
            this.length = builder.length;
            this.sequenceAttachment = builder.sequenceAttachment;
            this.nTerminalModificationId = builder.nTerminalModificationId;
            this.nTerminalModification = builder.nTerminalModification;
            this.cTerminalModificationId = builder.cTerminalModificationId;
            this.cTerminalModification = builder.cTerminalModification;
        }

        /**
         * <p>
         * Index of primary sequences of amino acids linked through peptide bonds in order of decreasing length. Sequences of the 
         * same length will be ordered by molecular weight. Subunits that have identical sequences will be repeated and have 
         * sequential subscripts.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Integer}.
         */
        public Integer getSubunit() {
            return subunit;
        }

        /**
         * <p>
         * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-
         * letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed 
         * SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids 
         * that are not represented with a single letter code an X should be used within the sequence. The modified amino acids 
         * will be distinguished by their position in the sequence.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getSequence() {
            return sequence;
        }

        /**
         * <p>
         * Length of linear sequences of amino acids contained in the subunit.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Integer}.
         */
        public Integer getLength() {
            return length;
        }

        /**
         * <p>
         * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-
         * letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed 
         * SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids 
         * that are not represented with a single letter code an X should be used within the sequence. The modified amino acids 
         * will be distinguished by their position in the sequence.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Attachment}.
         */
        public Attachment getSequenceAttachment() {
            return sequenceAttachment;
        }

        /**
         * <p>
         * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Identifier}.
         */
        public Identifier getNTerminalModificationId() {
            return nTerminalModificationId;
        }

        /**
         * <p>
         * The name of the fragment modified at the N-terminal of the SubstanceProtein shall be specified.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getNTerminalModification() {
            return nTerminalModification;
        }

        /**
         * <p>
         * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Identifier}.
         */
        public Identifier getCTerminalModificationId() {
            return cTerminalModificationId;
        }

        /**
         * <p>
         * The modification at the C-terminal shall be specified.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link String}.
         */
        public String getCTerminalModification() {
            return cTerminalModification;
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
                    accept(subunit, "subunit", visitor);
                    accept(sequence, "sequence", visitor);
                    accept(length, "length", visitor);
                    accept(sequenceAttachment, "sequenceAttachment", visitor);
                    accept(nTerminalModificationId, "nTerminalModificationId", visitor);
                    accept(nTerminalModification, "nTerminalModification", visitor);
                    accept(cTerminalModificationId, "cTerminalModificationId", visitor);
                    accept(cTerminalModification, "cTerminalModification", visitor);
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
            private Integer subunit;
            private String sequence;
            private Integer length;
            private Attachment sequenceAttachment;
            private Identifier nTerminalModificationId;
            private String nTerminalModification;
            private Identifier cTerminalModificationId;
            private String cTerminalModification;

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
             * Index of primary sequences of amino acids linked through peptide bonds in order of decreasing length. Sequences of the 
             * same length will be ordered by molecular weight. Subunits that have identical sequences will be repeated and have 
             * sequential subscripts.
             * </p>
             * 
             * @param subunit
             *     Index of primary sequences of amino acids linked through peptide bonds in order of decreasing length. Sequences of the 
             *     same length will be ordered by molecular weight. Subunits that have identical sequences will be repeated and have 
             *     sequential subscripts
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder subunit(Integer subunit) {
                this.subunit = subunit;
                return this;
            }

            /**
             * <p>
             * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-
             * letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed 
             * SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids 
             * that are not represented with a single letter code an X should be used within the sequence. The modified amino acids 
             * will be distinguished by their position in the sequence.
             * </p>
             * 
             * @param sequence
             *     The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-
             *     letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed 
             *     SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids 
             *     that are not represented with a single letter code an X should be used within the sequence. The modified amino acids 
             *     will be distinguished by their position in the sequence
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>
             * Length of linear sequences of amino acids contained in the subunit.
             * </p>
             * 
             * @param length
             *     Length of linear sequences of amino acids contained in the subunit
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * <p>
             * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-
             * letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed 
             * SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids 
             * that are not represented with a single letter code an X should be used within the sequence. The modified amino acids 
             * will be distinguished by their position in the sequence.
             * </p>
             * 
             * @param sequenceAttachment
             *     The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-
             *     letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed 
             *     SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids 
             *     that are not represented with a single letter code an X should be used within the sequence. The modified amino acids 
             *     will be distinguished by their position in the sequence
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder sequenceAttachment(Attachment sequenceAttachment) {
                this.sequenceAttachment = sequenceAttachment;
                return this;
            }

            /**
             * <p>
             * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
             * </p>
             * 
             * @param nTerminalModificationId
             *     Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder nTerminalModificationId(Identifier nTerminalModificationId) {
                this.nTerminalModificationId = nTerminalModificationId;
                return this;
            }

            /**
             * <p>
             * The name of the fragment modified at the N-terminal of the SubstanceProtein shall be specified.
             * </p>
             * 
             * @param nTerminalModification
             *     The name of the fragment modified at the N-terminal of the SubstanceProtein shall be specified
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder nTerminalModification(String nTerminalModification) {
                this.nTerminalModification = nTerminalModification;
                return this;
            }

            /**
             * <p>
             * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
             * </p>
             * 
             * @param cTerminalModificationId
             *     Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder cTerminalModificationId(Identifier cTerminalModificationId) {
                this.cTerminalModificationId = cTerminalModificationId;
                return this;
            }

            /**
             * <p>
             * The modification at the C-terminal shall be specified.
             * </p>
             * 
             * @param cTerminalModification
             *     The modification at the C-terminal shall be specified
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder cTerminalModification(String cTerminalModification) {
                this.cTerminalModification = cTerminalModification;
                return this;
            }

            @Override
            public Subunit build() {
                return new Subunit(this);
            }

            private static Builder from(Subunit subunit) {
                Builder builder = new Builder();
                builder.id = subunit.id;
                builder.extension.addAll(subunit.extension);
                builder.modifierExtension.addAll(subunit.modifierExtension);
                builder.subunit = subunit.subunit;
                builder.sequence = subunit.sequence;
                builder.length = subunit.length;
                builder.sequenceAttachment = subunit.sequenceAttachment;
                builder.nTerminalModificationId = subunit.nTerminalModificationId;
                builder.nTerminalModification = subunit.nTerminalModification;
                builder.cTerminalModificationId = subunit.cTerminalModificationId;
                builder.cTerminalModification = subunit.cTerminalModification;
                return builder;
            }
        }
    }
}
