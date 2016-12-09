/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class FailureDetailModelBuilder {
    //the instance to build
    private FailureDetailModel failureDetailModel;

    /**
     * Default constructor to initialize the instance
     */
    public FailureDetailModelBuilder() {
        failureDetailModel = new FailureDetailModel();
    }

    /**
     * The number of failures.
     */
    public FailureDetailModelBuilder failures(int failures) {
        failureDetailModel.setFailures(failures);
        return this;
    }

    /**
     * The number of downtime minutes.
     */
    public FailureDetailModelBuilder downtimeMinutes(int downtimeMinutes) {
        failureDetailModel.setDowntimeMinutes(downtimeMinutes);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FailureDetailModel build() {
        return failureDetailModel;
    }
}