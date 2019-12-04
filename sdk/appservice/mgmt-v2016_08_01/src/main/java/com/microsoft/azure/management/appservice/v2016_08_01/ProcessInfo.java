/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.ProcessInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing ProcessInfo.
 */
public interface ProcessInfo extends HasInner<ProcessInfoInner>, Indexable, Refreshable<ProcessInfo>, HasManager<AppServiceManager> {
    /**
     * @return the children value.
     */
    List<String> children();

    /**
     * @return the commandLine value.
     */
    String commandLine();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the environmentVariables value.
     */
    Map<String, String> environmentVariables();

    /**
     * @return the fileName value.
     */
    String fileName();

    /**
     * @return the handleCount value.
     */
    Integer handleCount();

    /**
     * @return the href value.
     */
    String href();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the iisProfileTimeoutInSeconds value.
     */
    Double iisProfileTimeoutInSeconds();

    /**
     * @return the isIisProfileRunning value.
     */
    Boolean isIisProfileRunning();

    /**
     * @return the isProfileRunning value.
     */
    Boolean isProfileRunning();

    /**
     * @return the isScmSite value.
     */
    Boolean isScmSite();

    /**
     * @return the isWebJob value.
     */
    Boolean isWebJob();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the miniDump value.
     */
    String miniDump();

    /**
     * @return the moduleCount value.
     */
    Integer moduleCount();

    /**
     * @return the modules value.
     */
    List<ProcessModuleInfo> modules();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nonpagedSystemMemorySize64 value.
     */
    Long nonpagedSystemMemorySize64();

    /**
     * @return the openFileHandles value.
     */
    List<String> openFileHandles();

    /**
     * @return the pagedMemorySize64 value.
     */
    Long pagedMemorySize64();

    /**
     * @return the pagedSystemMemorySize64 value.
     */
    Long pagedSystemMemorySize64();

    /**
     * @return the parent value.
     */
    String parent();

    /**
     * @return the peakPagedMemorySize64 value.
     */
    Long peakPagedMemorySize64();

    /**
     * @return the peakVirtualMemorySize64 value.
     */
    Long peakVirtualMemorySize64();

    /**
     * @return the peakWorkingSet64 value.
     */
    Long peakWorkingSet64();

    /**
     * @return the privateMemorySize64 value.
     */
    Long privateMemorySize64();

    /**
     * @return the privilegedProcessorTime value.
     */
    String privilegedProcessorTime();

    /**
     * @return the processInfoId value.
     */
    Integer processInfoId();

    /**
     * @return the processInfoName value.
     */
    String processInfoName();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the threadCount value.
     */
    Integer threadCount();

    /**
     * @return the threads value.
     */
    List<ProcessThreadInfo> threads();

    /**
     * @return the timeStamp value.
     */
    DateTime timeStamp();

    /**
     * @return the totalProcessorTime value.
     */
    String totalProcessorTime();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userName value.
     */
    String userName();

    /**
     * @return the userProcessorTime value.
     */
    String userProcessorTime();

    /**
     * @return the virtualMemorySize64 value.
     */
    Long virtualMemorySize64();

    /**
     * @return the workingSet64 value.
     */
    Long workingSet64();

}