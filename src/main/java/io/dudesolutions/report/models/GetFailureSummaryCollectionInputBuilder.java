/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetFailureSummaryCollectionInputBuilder {
    //the instance to build
    private GetFailureSummaryCollectionInput getFailureSummaryCollectionInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetFailureSummaryCollectionInputBuilder() {
        getFailureSummaryCollectionInput = new GetFailureSummaryCollectionInput();
    }

    /**
     * {INT} ID of the account in the form of an integer
     */
    public GetFailureSummaryCollectionInputBuilder accountId(int accountId) {
        getFailureSummaryCollectionInput.setAccountId(accountId);
        return this;
    }

    /**
     * {INT} The page to request from the collection.
     */
    public GetFailureSummaryCollectionInputBuilder page(Integer page) {
        getFailureSummaryCollectionInput.setPage(page);
        return this;
    }

    /**
     * {INT} The number of records to load in a page from the collection.
     */
    public GetFailureSummaryCollectionInputBuilder pagesize(Integer pagesize) {
        getFailureSummaryCollectionInput.setPagesize(pagesize);
        return this;
    }

    /**
     * A string describing the ordering to perform on the collection.
     */
    public GetFailureSummaryCollectionInputBuilder orderby(String orderby) {
        getFailureSummaryCollectionInput.setOrderby(orderby);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetFailureSummaryCollectionInput build() {
        return getFailureSummaryCollectionInput;
    }
}