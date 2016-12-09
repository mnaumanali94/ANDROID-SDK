/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetPurposeSummaryCollectionResponseModelBuilder 
        extends BaseCollectionResponseModelBuilder {
    //the instance to build
    private GetPurposeSummaryCollectionResponseModel getPurposeSummaryCollectionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetPurposeSummaryCollectionResponseModelBuilder() {
        getPurposeSummaryCollectionResponseModel = new GetPurposeSummaryCollectionResponseModel();
    }

    public GetPurposeSummaryCollectionResponseModelBuilder data(List<PurposeSummaryModel> data) {
        getPurposeSummaryCollectionResponseModel.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPurposeSummaryCollectionResponseModel build() {
        return getPurposeSummaryCollectionResponseModel;
    }
}