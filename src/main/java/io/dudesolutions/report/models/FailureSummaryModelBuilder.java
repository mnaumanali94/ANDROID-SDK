/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class FailureSummaryModelBuilder {
    //the instance to build
    private FailureSummaryModel failureSummaryModel;

    /**
     * Default constructor to initialize the instance
     */
    public FailureSummaryModelBuilder() {
        failureSummaryModel = new FailureSummaryModel();
    }

    /**
     * Represents an asset with base properties.
     */
    public FailureSummaryModelBuilder asset(AssetModel asset) {
        failureSummaryModel.setAsset(asset);
        return this;
    }

    /**
     * Represents a failure reason with base properties.
     */
    public FailureSummaryModelBuilder failureReason(FailureReasonModel failureReason) {
        failureSummaryModel.setFailureReason(failureReason);
        return this;
    }

    /**
     * Represents a failure detail object.
     */
    public FailureSummaryModelBuilder failureDetail(FailureDetailModel failureDetail) {
        failureSummaryModel.setFailureDetail(failureDetail);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FailureSummaryModel build() {
        return failureSummaryModel;
    }
}