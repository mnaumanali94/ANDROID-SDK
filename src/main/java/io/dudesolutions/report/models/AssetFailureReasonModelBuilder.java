/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class AssetFailureReasonModelBuilder {
    //the instance to build
    private AssetFailureReasonModel assetFailureReasonModel;

    /**
     * Default constructor to initialize the instance
     */
    public AssetFailureReasonModelBuilder() {
        assetFailureReasonModel = new AssetFailureReasonModel();
    }

    /**
     * Represents a failure reason with base properties.
     */
    public AssetFailureReasonModelBuilder failureReason(FailureReasonModel failureReason) {
        assetFailureReasonModel.setFailureReason(failureReason);
        return this;
    }

    /**
     * The number of failure reasons.
     */
    public AssetFailureReasonModelBuilder count(int count) {
        assetFailureReasonModel.setCount(count);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AssetFailureReasonModel build() {
        return assetFailureReasonModel;
    }
}