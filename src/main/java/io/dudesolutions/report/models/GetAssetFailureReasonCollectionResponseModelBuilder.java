/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetAssetFailureReasonCollectionResponseModelBuilder 
        extends BaseCollectionResponseModelBuilder {
    //the instance to build
    private GetAssetFailureReasonCollectionResponseModel getAssetFailureReasonCollectionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetAssetFailureReasonCollectionResponseModelBuilder() {
        getAssetFailureReasonCollectionResponseModel = new GetAssetFailureReasonCollectionResponseModel();
    }

    public GetAssetFailureReasonCollectionResponseModelBuilder data(List<AssetFailureReasonModel> data) {
        getAssetFailureReasonCollectionResponseModel.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAssetFailureReasonCollectionResponseModel build() {
        return getAssetFailureReasonCollectionResponseModel;
    }
}