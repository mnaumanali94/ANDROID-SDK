/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetAssetSummaryCollectionInputBuilder {
    //the instance to build
    private GetAssetSummaryCollectionInput getAssetSummaryCollectionInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetAssetSummaryCollectionInputBuilder() {
        getAssetSummaryCollectionInput = new GetAssetSummaryCollectionInput();
    }

    /**
     * {INT} ID of the account in the form of an integer
     */
    public GetAssetSummaryCollectionInputBuilder accountId(int accountId) {
        getAssetSummaryCollectionInput.setAccountId(accountId);
        return this;
    }

    /**
     * {INT} The page to request from the collection.
     */
    public GetAssetSummaryCollectionInputBuilder page(Integer page) {
        getAssetSummaryCollectionInput.setPage(page);
        return this;
    }

    /**
     * {INT} The number of records to load in a page from the collection.
     */
    public GetAssetSummaryCollectionInputBuilder pagesize(Integer pagesize) {
        getAssetSummaryCollectionInput.setPagesize(pagesize);
        return this;
    }

    /**
     * A string describing the ordering to perform on the collection.
     */
    public GetAssetSummaryCollectionInputBuilder orderby(String orderby) {
        getAssetSummaryCollectionInput.setOrderby(orderby);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAssetSummaryCollectionInput build() {
        return getAssetSummaryCollectionInput;
    }
}