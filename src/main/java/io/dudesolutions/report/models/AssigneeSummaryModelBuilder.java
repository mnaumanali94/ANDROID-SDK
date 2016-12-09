/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class AssigneeSummaryModelBuilder {
    //the instance to build
    private AssigneeSummaryModel assigneeSummaryModel;

    /**
     * Default constructor to initialize the instance
     */
    public AssigneeSummaryModelBuilder() {
        assigneeSummaryModel = new AssigneeSummaryModel();
    }

    /**
     * Represents a user with base properties.
     */
    public AssigneeSummaryModelBuilder assignee(UserModel assignee) {
        assigneeSummaryModel.setAssignee(assignee);
        return this;
    }

    /**
     * Represents a count object.
     */
    public AssigneeSummaryModelBuilder count(CountModel count) {
        assigneeSummaryModel.setCount(count);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AssigneeSummaryModel build() {
        return assigneeSummaryModel;
    }
}