/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class CompartmentType extends Code {
    /**
     * Patient
     */
    public static final CompartmentType PATIENT = CompartmentType.of(ValueSet.PATIENT);

    /**
     * Encounter
     */
    public static final CompartmentType ENCOUNTER = CompartmentType.of(ValueSet.ENCOUNTER);

    /**
     * RelatedPerson
     */
    public static final CompartmentType RELATED_PERSON = CompartmentType.of(ValueSet.RELATED_PERSON);

    /**
     * Practitioner
     */
    public static final CompartmentType PRACTITIONER = CompartmentType.of(ValueSet.PRACTITIONER);

    /**
     * Device
     */
    public static final CompartmentType DEVICE = CompartmentType.of(ValueSet.DEVICE);

    private CompartmentType(Builder builder) {
        super(builder);
    }

    public static CompartmentType of(java.lang.String value) {
        return CompartmentType.builder().value(value).build();
    }

    public static CompartmentType of(ValueSet value) {
        return CompartmentType.builder().value(value).build();
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
        public CompartmentType build() {
            return new CompartmentType(this);
        }
    }

    public enum ValueSet {
        /**
         * Patient
         */
        PATIENT("Patient"),

        /**
         * Encounter
         */
        ENCOUNTER("Encounter"),

        /**
         * RelatedPerson
         */
        RELATED_PERSON("RelatedPerson"),

        /**
         * Practitioner
         */
        PRACTITIONER("Practitioner"),

        /**
         * Device
         */
        DEVICE("Device");

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
