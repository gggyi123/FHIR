/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.type.RelatedArtifactType;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class RelatedArtifact extends Element {
    private final RelatedArtifactType type;
    private final String label;
    private final String display;
    private final Markdown citation;
    private final Url url;
    private final Attachment document;
    private final Canonical resource;

    private RelatedArtifact(Builder builder) {
        super(builder);
        this.type = ValidationSupport.requireNonNull(builder.type, "type");
        this.label = builder.label;
        this.display = builder.display;
        this.citation = builder.citation;
        this.url = builder.url;
        this.document = builder.document;
        this.resource = builder.resource;
    }

    /**
     * <p>
     * The type of relationship to the related artifact.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link RelatedArtifactType}.
     */
    public RelatedArtifactType getType() {
        return type;
    }

    /**
     * <p>
     * A short label that can be used to reference the citation from elsewhere in the containing artifact, such as a footnote 
     * index.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getDisplay() {
        return display;
    }

    /**
     * <p>
     * A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation 
     * format.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Markdown}.
     */
    public Markdown getCitation() {
        return citation;
    }

    /**
     * <p>
     * A url for the artifact that can be followed to access the actual content.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Url}.
     */
    public Url getUrl() {
        return url;
    }

    /**
     * <p>
     * The document being referenced, represented as an attachment. This is exclusive with the resource element.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Attachment}.
     */
    public Attachment getDocument() {
        return document;
    }

    /**
     * <p>
     * The related resource, such as a library, value set, profile, or other knowledge resource.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Canonical}.
     */
    public Canonical getResource() {
        return resource;
    }

    @Override
    public void accept(java.lang.String elementName, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, this);
            if (visitor.visit(elementName, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(extension, "extension", visitor, Extension.class);
                accept(type, "type", visitor);
                accept(label, "label", visitor);
                accept(display, "display", visitor);
                accept(citation, "citation", visitor);
                accept(url, "url", visitor);
                accept(document, "document", visitor);
                accept(resource, "resource", visitor);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder(type);
        builder.id = id;
        builder.extension.addAll(extension);
        builder.label = label;
        builder.display = display;
        builder.citation = citation;
        builder.url = url;
        builder.document = document;
        builder.resource = resource;
        return builder;
    }

    public static Builder builder(RelatedArtifactType type) {
        return new Builder(type);
    }

    public static class Builder extends Element.Builder {
        // required
        private final RelatedArtifactType type;

        // optional
        private String label;
        private String display;
        private Markdown citation;
        private Url url;
        private Attachment document;
        private Canonical resource;

        private Builder(RelatedArtifactType type) {
            super();
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
         * A short label that can be used to reference the citation from elsewhere in the containing artifact, such as a footnote 
         * index.
         * </p>
         * 
         * @param label
         *     Short label
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>
         * A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
         * </p>
         * 
         * @param display
         *     Brief description of the related artifact
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder display(String display) {
            this.display = display;
            return this;
        }

        /**
         * <p>
         * A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation 
         * format.
         * </p>
         * 
         * @param citation
         *     Bibliographic citation for the artifact
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder citation(Markdown citation) {
            this.citation = citation;
            return this;
        }

        /**
         * <p>
         * A url for the artifact that can be followed to access the actual content.
         * </p>
         * 
         * @param url
         *     Where the artifact can be accessed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder url(Url url) {
            this.url = url;
            return this;
        }

        /**
         * <p>
         * The document being referenced, represented as an attachment. This is exclusive with the resource element.
         * </p>
         * 
         * @param document
         *     What document is being referenced
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder document(Attachment document) {
            this.document = document;
            return this;
        }

        /**
         * <p>
         * The related resource, such as a library, value set, profile, or other knowledge resource.
         * </p>
         * 
         * @param resource
         *     What resource is being referenced
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder resource(Canonical resource) {
            this.resource = resource;
            return this;
        }

        @Override
        public RelatedArtifact build() {
            return new RelatedArtifact(this);
        }
    }
}
