/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetWorkOrderPDFExportInputBuilder {
    //the instance to build
    private GetWorkOrderPDFExportInput getWorkOrderPDFExportInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetWorkOrderPDFExportInputBuilder() {
        getWorkOrderPDFExportInput = new GetWorkOrderPDFExportInput();
    }

    /**
     * {INT} ID of the account in the form of an integer.
     */
    public GetWorkOrderPDFExportInputBuilder accountId(int accountId) {
        getWorkOrderPDFExportInput.setAccountId(accountId);
        return this;
    }

    /**
     * {INT} ID of the work order in the form of an integer.
     */
    public GetWorkOrderPDFExportInputBuilder workOrderId(int workOrderId) {
        getWorkOrderPDFExportInput.setWorkOrderId(workOrderId);
        return this;
    }

    /**
     * A string denoting the time zone.
     */
    public GetWorkOrderPDFExportInputBuilder timeZone(String timeZone) {
        getWorkOrderPDFExportInput.setTimeZone(timeZone);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetWorkOrderPDFExportInput build() {
        return getWorkOrderPDFExportInput;
    }
}