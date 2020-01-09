/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Recovery plan InMage failover input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
public class RecoveryPlanInMageFailoverInput extends RecoveryPlanProviderSpecificFailoverInput {
    /**
     * The recovery point type. Possible values include: 'LatestTime',
     * 'LatestTag', 'Custom'.
     */
    @JsonProperty(value = "recoveryPointType", required = true)
    private RpInMageRecoveryPointType recoveryPointType;

    /**
     * Get the recovery point type. Possible values include: 'LatestTime', 'LatestTag', 'Custom'.
     *
     * @return the recoveryPointType value
     */
    public RpInMageRecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recovery point type. Possible values include: 'LatestTime', 'LatestTag', 'Custom'.
     *
     * @param recoveryPointType the recoveryPointType value to set
     * @return the RecoveryPlanInMageFailoverInput object itself.
     */
    public RecoveryPlanInMageFailoverInput withRecoveryPointType(RpInMageRecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

}