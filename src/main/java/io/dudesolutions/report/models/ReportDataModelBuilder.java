/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class ReportDataModelBuilder {
    //the instance to build
    private ReportDataModel reportDataModel;

    /**
     * Default constructor to initialize the instance
     */
    public ReportDataModelBuilder() {
        reportDataModel = new ReportDataModel();
    }

    /**
     * Represents a cost object.
     */
    public ReportDataModelBuilder cost(CostModel cost) {
        reportDataModel.setCost(cost);
        return this;
    }

    /**
     * Represents a count object.
     */
    public ReportDataModelBuilder count(CountModel count) {
        reportDataModel.setCount(count);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ReportDataModel build() {
        return reportDataModel;
    }
}