/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetAssigneeSummaryCollectionResponseModelBuilder 
        extends BaseCollectionResponseModelBuilder {
    //the instance to build
    private GetAssigneeSummaryCollectionResponseModel getAssigneeSummaryCollectionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetAssigneeSummaryCollectionResponseModelBuilder() {
        getAssigneeSummaryCollectionResponseModel = new GetAssigneeSummaryCollectionResponseModel();
    }

    public GetAssigneeSummaryCollectionResponseModelBuilder data(List<AssigneeSummaryModel> data) {
        getAssigneeSummaryCollectionResponseModel.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAssigneeSummaryCollectionResponseModel build() {
        return getAssigneeSummaryCollectionResponseModel;
    }
}