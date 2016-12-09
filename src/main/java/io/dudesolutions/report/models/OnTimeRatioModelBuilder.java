/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class OnTimeRatioModelBuilder {
    //the instance to build
    private OnTimeRatioModel onTimeRatioModel;

    /**
     * Default constructor to initialize the instance
     */
    public OnTimeRatioModelBuilder() {
        onTimeRatioModel = new OnTimeRatioModel();
    }

    /**
     * Count of on time work orders.
     */
    public OnTimeRatioModelBuilder onTime(int onTime) {
        onTimeRatioModel.setOnTime(onTime);
        return this;
    }

    /**
     * Count of over due work orders.
     */
    public OnTimeRatioModelBuilder overDue(int overDue) {
        onTimeRatioModel.setOverDue(overDue);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OnTimeRatioModel build() {
        return onTimeRatioModel;
    }
}