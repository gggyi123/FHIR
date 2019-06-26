/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class BiologicallyDerivedProductCategory extends Code {
    /**
     * Organ
     */
    public static final BiologicallyDerivedProductCategory ORGAN = BiologicallyDerivedProductCategory.of(ValueSet.ORGAN);

    /**
     * Tissue
     */
    public static final BiologicallyDerivedProductCategory TISSUE = BiologicallyDerivedProductCategory.of(ValueSet.TISSUE);

    /**
     * Fluid
     */
    public static final BiologicallyDerivedProductCategory FLUID = BiologicallyDerivedProductCategory.of(ValueSet.FLUID);

    /**
     * Cells
     */
    public static final BiologicallyDerivedProductCategory CELLS = BiologicallyDerivedProductCategory.of(ValueSet.CELLS);

    /**
     * BiologicalAgent
     */
    public static final BiologicallyDerivedProductCategory BIOLOGICAL_AGENT = BiologicallyDerivedProductCategory.of(ValueSet.BIOLOGICAL_AGENT);

    private BiologicallyDerivedProductCategory(Builder builder) {
        super(builder);
    }

    public static BiologicallyDerivedProductCategory of(java.lang.String value) {
        return BiologicallyDerivedProductCategory.builder().value(value).build();
    }

    public static BiologicallyDerivedProductCategory of(ValueSet value) {
        return BiologicallyDerivedProductCategory.builder().value(value).build();
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
        public BiologicallyDerivedProductCategory build() {
            return new BiologicallyDerivedProductCategory(this);
        }
    }

    public enum ValueSet {
        /**
         * Organ
         */
        ORGAN("organ"),

        /**
         * Tissue
         */
        TISSUE("tissue"),

        /**
         * Fluid
         */
        FLUID("fluid"),

        /**
         * Cells
         */
        CELLS("cells"),

        /**
         * BiologicalAgent
         */
        BIOLOGICAL_AGENT("biologicalAgent");

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
