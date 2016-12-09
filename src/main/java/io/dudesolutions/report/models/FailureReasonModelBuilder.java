/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class FailureReasonModelBuilder {
    //the instance to build
    private FailureReasonModel failureReasonModel;

    /**
     * Default constructor to initialize the instance
     */
    public FailureReasonModelBuilder() {
        failureReasonModel = new FailureReasonModel();
    }

    /**
     * The unique ID for the failure reason.
     */
    public FailureReasonModelBuilder id(int id) {
        failureReasonModel.setId(id);
        return this;
    }

    /**
     * The name of the failure reason.
     */
    public FailureReasonModelBuilder name(String name) {
        failureReasonModel.setName(name);
        return this;
    }

    /**
     * IsActive check to ensure the failure reason is active.
     */
    public FailureReasonModelBuilder isActive(boolean isActive) {
        failureReasonModel.setIsActive(isActive);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FailureReasonModel build() {
        return failureReasonModel;
    }
}