/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetAssetFailureReasonCollectionInputBuilder {
    //the instance to build
    private GetAssetFailureReasonCollectionInput getAssetFailureReasonCollectionInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetAssetFailureReasonCollectionInputBuilder() {
        getAssetFailureReasonCollectionInput = new GetAssetFailureReasonCollectionInput();
    }

    /**
     * {INT} ID of the account in the form of an integer
     */
    public GetAssetFailureReasonCollectionInputBuilder accountId(int accountId) {
        getAssetFailureReasonCollectionInput.setAccountId(accountId);
        return this;
    }

    public GetAssetFailureReasonCollectionInputBuilder assetId(double assetId) {
        getAssetFailureReasonCollectionInput.setAssetId(assetId);
        return this;
    }

    /**
     * {INT} The page to request from the collection.
     */
    public GetAssetFailureReasonCollectionInputBuilder page(Integer page) {
        getAssetFailureReasonCollectionInput.setPage(page);
        return this;
    }

    /**
     * {INT} The number of records to load in a page from the collection.
     */
    public GetAssetFailureReasonCollectionInputBuilder pagesize(Integer pagesize) {
        getAssetFailureReasonCollectionInput.setPagesize(pagesize);
        return this;
    }

    /**
     * A string describing the ordering to perform on the collection.
     */
    public GetAssetFailureReasonCollectionInputBuilder orderby(String orderby) {
        getAssetFailureReasonCollectionInput.setOrderby(orderby);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAssetFailureReasonCollectionInput build() {
        return getAssetFailureReasonCollectionInput;
    }
}