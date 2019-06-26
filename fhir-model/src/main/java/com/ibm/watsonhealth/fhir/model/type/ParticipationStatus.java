/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class ParticipationStatus extends Code {
    /**
     * Accepted
     */
    public static final ParticipationStatus ACCEPTED = ParticipationStatus.of(ValueSet.ACCEPTED);

    /**
     * Declined
     */
    public static final ParticipationStatus DECLINED = ParticipationStatus.of(ValueSet.DECLINED);

    /**
     * Tentative
     */
    public static final ParticipationStatus TENTATIVE = ParticipationStatus.of(ValueSet.TENTATIVE);

    /**
     * Needs Action
     */
    public static final ParticipationStatus NEEDS_ACTION = ParticipationStatus.of(ValueSet.NEEDS_ACTION);

    private ParticipationStatus(Builder builder) {
        super(builder);
    }

    public static ParticipationStatus of(java.lang.String value) {
        return ParticipationStatus.builder().value(value).build();
    }

    public static ParticipationStatus of(ValueSet value) {
        return ParticipationStatus.builder().value(value).build();
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
        public ParticipationStatus build() {
            return new ParticipationStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Accepted
         */
        ACCEPTED("accepted"),

        /**
         * Declined
         */
        DECLINED("declined"),

        /**
         * Tentative
         */
        TENTATIVE("tentative"),

        /**
         * Needs Action
         */
        NEEDS_ACTION("needs-action");

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
