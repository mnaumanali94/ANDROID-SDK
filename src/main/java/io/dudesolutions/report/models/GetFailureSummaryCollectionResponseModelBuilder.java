/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetFailureSummaryCollectionResponseModelBuilder 
        extends BaseCollectionResponseModelBuilder {
    //the instance to build
    private GetFailureSummaryCollectionResponseModel getFailureSummaryCollectionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetFailureSummaryCollectionResponseModelBuilder() {
        getFailureSummaryCollectionResponseModel = new GetFailureSummaryCollectionResponseModel();
    }

    public GetFailureSummaryCollectionResponseModelBuilder data(List<FailureSummaryModel> data) {
        getFailureSummaryCollectionResponseModel.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetFailureSummaryCollectionResponseModel build() {
        return getFailureSummaryCollectionResponseModel;
    }
}