/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class PurposeSummaryModelBuilder {
    //the instance to build
    private PurposeSummaryModel purposeSummaryModel;

    /**
     * Default constructor to initialize the instance
     */
    public PurposeSummaryModelBuilder() {
        purposeSummaryModel = new PurposeSummaryModel();
    }

    /**
     * Represents a purpose with base properties.
     */
    public PurposeSummaryModelBuilder purpose(PurposeModel purpose) {
        purposeSummaryModel.setPurpose(purpose);
        return this;
    }

    /**
     * Represents a cost object.
     */
    public PurposeSummaryModelBuilder cost(CostModel cost) {
        purposeSummaryModel.setCost(cost);
        return this;
    }

    /**
     * Represents a count object.
     */
    public PurposeSummaryModelBuilder count(CountModel count) {
        purposeSummaryModel.setCount(count);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PurposeSummaryModel build() {
        return purposeSummaryModel;
    }
}