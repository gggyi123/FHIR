/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class EpisodeOfCareStatus extends Code {
    /**
     * Planned
     */
    public static final EpisodeOfCareStatus PLANNED = EpisodeOfCareStatus.of(ValueSet.PLANNED);

    /**
     * Waitlist
     */
    public static final EpisodeOfCareStatus WAITLIST = EpisodeOfCareStatus.of(ValueSet.WAITLIST);

    /**
     * Active
     */
    public static final EpisodeOfCareStatus ACTIVE = EpisodeOfCareStatus.of(ValueSet.ACTIVE);

    /**
     * On Hold
     */
    public static final EpisodeOfCareStatus ONHOLD = EpisodeOfCareStatus.of(ValueSet.ONHOLD);

    /**
     * Finished
     */
    public static final EpisodeOfCareStatus FINISHED = EpisodeOfCareStatus.of(ValueSet.FINISHED);

    /**
     * Cancelled
     */
    public static final EpisodeOfCareStatus CANCELLED = EpisodeOfCareStatus.of(ValueSet.CANCELLED);

    /**
     * Entered in Error
     */
    public static final EpisodeOfCareStatus ENTERED_IN_ERROR = EpisodeOfCareStatus.of(ValueSet.ENTERED_IN_ERROR);

    private EpisodeOfCareStatus(Builder builder) {
        super(builder);
    }

    public static EpisodeOfCareStatus of(java.lang.String value) {
        return EpisodeOfCareStatus.builder().value(value).build();
    }

    public static EpisodeOfCareStatus of(ValueSet value) {
        return EpisodeOfCareStatus.builder().value(value).build();
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
        public EpisodeOfCareStatus build() {
            return new EpisodeOfCareStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Planned
         */
        PLANNED("planned"),

        /**
         * Waitlist
         */
        WAITLIST("waitlist"),

        /**
         * Active
         */
        ACTIVE("active"),

        /**
         * On Hold
         */
        ONHOLD("onhold"),

        /**
         * Finished
         */
        FINISHED("finished"),

        /**
         * Cancelled
         */
        CANCELLED("cancelled"),

        /**
         * Entered in Error
         */
        ENTERED_IN_ERROR("entered-in-error");

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
