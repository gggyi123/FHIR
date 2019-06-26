/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class LinkType extends Code {
    /**
     * Replaced-by
     */
    public static final LinkType REPLACED_BY = LinkType.of(ValueSet.REPLACED_BY);

    /**
     * Replaces
     */
    public static final LinkType REPLACES = LinkType.of(ValueSet.REPLACES);

    /**
     * Refer
     */
    public static final LinkType REFER = LinkType.of(ValueSet.REFER);

    /**
     * See also
     */
    public static final LinkType SEEALSO = LinkType.of(ValueSet.SEEALSO);

    private LinkType(Builder builder) {
        super(builder);
    }

    public static LinkType of(java.lang.String value) {
        return LinkType.builder().value(value).build();
    }

    public static LinkType of(ValueSet value) {
        return LinkType.builder().value(value).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.extension.addAll(extension);
        builder.value = value;
        return builder;
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (Builder) super.value(ValueSet.from(value).value());
        }

        public Builder value(ValueSet value) {
            return (Builder) super.value(value.value());
        }

        @Override
        public LinkType build() {
            return new LinkType(this);
        }
    }

    public enum ValueSet {
        /**
         * Replaced-by
         */
        REPLACED_BY("replaced-by"),

        /**
         * Replaces
         */
        REPLACES("replaces"),

        /**
         * Refer
         */
        REFER("refer"),

        /**
         * See also
         */
        SEEALSO("seealso");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}
