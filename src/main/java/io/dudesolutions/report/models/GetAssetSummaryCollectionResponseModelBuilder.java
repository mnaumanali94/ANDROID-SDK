/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetAssetSummaryCollectionResponseModelBuilder 
        extends BaseCollectionResponseModelBuilder {
    //the instance to build
    private GetAssetSummaryCollectionResponseModel getAssetSummaryCollectionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetAssetSummaryCollectionResponseModelBuilder() {
        getAssetSummaryCollectionResponseModel = new GetAssetSummaryCollectionResponseModel();
    }

    public GetAssetSummaryCollectionResponseModelBuilder data(List<AssetSummaryModel> data) {
        getAssetSummaryCollectionResponseModel.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAssetSummaryCollectionResponseModel build() {
        return getAssetSummaryCollectionResponseModel;
    }
}