/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetAssigneeSummaryCollectionInputBuilder {
    //the instance to build
    private GetAssigneeSummaryCollectionInput getAssigneeSummaryCollectionInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetAssigneeSummaryCollectionInputBuilder() {
        getAssigneeSummaryCollectionInput = new GetAssigneeSummaryCollectionInput();
    }

    /**
     * {INT} ID of the account in the form of an integer
     */
    public GetAssigneeSummaryCollectionInputBuilder accountId(int accountId) {
        getAssigneeSummaryCollectionInput.setAccountId(accountId);
        return this;
    }

    /**
     * {INT} The page to request from the collection.
     */
    public GetAssigneeSummaryCollectionInputBuilder page(Integer page) {
        getAssigneeSummaryCollectionInput.setPage(page);
        return this;
    }

    /**
     * {INT} The number of records to load in a page from the collection.
     */
    public GetAssigneeSummaryCollectionInputBuilder pagesize(Integer pagesize) {
        getAssigneeSummaryCollectionInput.setPagesize(pagesize);
        return this;
    }

    /**
     * A string describing the ordering to perform on the collection.
     */
    public GetAssigneeSummaryCollectionInputBuilder orderby(String orderby) {
        getAssigneeSummaryCollectionInput.setOrderby(orderby);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAssigneeSummaryCollectionInput build() {
        return getAssigneeSummaryCollectionInput;
    }
}