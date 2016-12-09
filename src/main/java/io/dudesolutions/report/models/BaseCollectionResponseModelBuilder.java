/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class BaseCollectionResponseModelBuilder {
    //the instance to build
    private BaseCollectionResponseModel baseCollectionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public BaseCollectionResponseModelBuilder() {
        baseCollectionResponseModel = new BaseCollectionResponseModel();
    }

    /**
     * The current page provided in the response data.
     */
    public BaseCollectionResponseModelBuilder page(int page) {
        baseCollectionResponseModel.setPage(page);
        return this;
    }

    /**
     * The page size returned in the response data.
     */
    public BaseCollectionResponseModelBuilder pageSize(int pageSize) {
        baseCollectionResponseModel.setPageSize(pageSize);
        return this;
    }

    /**
     * The total records returned in the response.
     */
    public BaseCollectionResponseModelBuilder dataSize(int dataSize) {
        baseCollectionResponseModel.setDataSize(dataSize);
        return this;
    }

    /**
     * The total number of records available in the collection.
     */
    public BaseCollectionResponseModelBuilder total(int total) {
        baseCollectionResponseModel.setTotal(total);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseCollectionResponseModel build() {
        return baseCollectionResponseModel;
    }
}