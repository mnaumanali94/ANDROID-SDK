/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class CountModelBuilder {
    //the instance to build
    private CountModel countModel;

    /**
     * Default constructor to initialize the instance
     */
    public CountModelBuilder() {
        countModel = new CountModel();
    }

    /**
     * The number of workorders.
     */
    public CountModelBuilder workOrders(int workOrders) {
        countModel.setWorkOrders(workOrders);
        return this;
    }

    /**
     * The number of labor hours.
     */
    public CountModelBuilder laborHours(double laborHours) {
        countModel.setLaborHours(laborHours);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CountModel build() {
        return countModel;
    }
}