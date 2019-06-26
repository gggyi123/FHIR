/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class DetectedIssueSeverity extends Code {
    /**
     * High
     */
    public static final DetectedIssueSeverity HIGH = DetectedIssueSeverity.of(ValueSet.HIGH);

    /**
     * Moderate
     */
    public static final DetectedIssueSeverity MODERATE = DetectedIssueSeverity.of(ValueSet.MODERATE);

    /**
     * Low
     */
    public static final DetectedIssueSeverity LOW = DetectedIssueSeverity.of(ValueSet.LOW);

    private DetectedIssueSeverity(Builder builder) {
        super(builder);
    }

    public static DetectedIssueSeverity of(java.lang.String value) {
        return DetectedIssueSeverity.builder().value(value).build();
    }

    public static DetectedIssueSeverity of(ValueSet value) {
        return DetectedIssueSeverity.builder().value(value).build();
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
        public DetectedIssueSeverity build() {
            return new DetectedIssueSeverity(this);
        }
    }

    public enum ValueSet {
        /**
         * High
         */
        HIGH("high"),

        /**
         * Moderate
         */
        MODERATE("moderate"),

        /**
         * Low
         */
        LOW("low");

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
