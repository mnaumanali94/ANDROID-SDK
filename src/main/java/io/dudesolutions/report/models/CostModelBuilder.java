/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class CostModelBuilder {
    //the instance to build
    private CostModel costModel;

    /**
     * Default constructor to initialize the instance
     */
    public CostModelBuilder() {
        costModel = new CostModel();
    }

    /**
     * The sum of labor costs.
     */
    public CostModelBuilder labor(double labor) {
        costModel.setLabor(labor);
        return this;
    }

    /**
     * The sum of purchase costs.
     */
    public CostModelBuilder purchase(double purchase) {
        costModel.setPurchase(purchase);
        return this;
    }

    /**
     * The total sum of all costs.
     */
    public CostModelBuilder total(double total) {
        costModel.setTotal(total);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CostModel build() {
        return costModel;
    }
}