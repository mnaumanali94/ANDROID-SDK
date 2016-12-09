/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetPurposeSummaryCollectionInputBuilder {
    //the instance to build
    private GetPurposeSummaryCollectionInput getPurposeSummaryCollectionInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetPurposeSummaryCollectionInputBuilder() {
        getPurposeSummaryCollectionInput = new GetPurposeSummaryCollectionInput();
    }

    /**
     * {INT} ID of the account in the form of an integer
     */
    public GetPurposeSummaryCollectionInputBuilder accountId(int accountId) {
        getPurposeSummaryCollectionInput.setAccountId(accountId);
        return this;
    }

    /**
     * {INT} The page to request from the collection.
     */
    public GetPurposeSummaryCollectionInputBuilder page(Integer page) {
        getPurposeSummaryCollectionInput.setPage(page);
        return this;
    }

    /**
     * {INT} The number of records to load in a page from the collection.
     */
    public GetPurposeSummaryCollectionInputBuilder pagesize(Integer pagesize) {
        getPurposeSummaryCollectionInput.setPagesize(pagesize);
        return this;
    }

    /**
     * A string describing the ordering to perform on the collection.
     */
    public GetPurposeSummaryCollectionInputBuilder orderby(String orderby) {
        getPurposeSummaryCollectionInput.setOrderby(orderby);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPurposeSummaryCollectionInput build() {
        return getPurposeSummaryCollectionInput;
    }
}