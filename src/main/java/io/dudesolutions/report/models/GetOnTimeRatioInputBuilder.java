/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetOnTimeRatioInputBuilder {
    //the instance to build
    private GetOnTimeRatioInput getOnTimeRatioInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetOnTimeRatioInputBuilder() {
        getOnTimeRatioInput = new GetOnTimeRatioInput();
    }

    /**
     * {INT} ID of the account in the form of an integer
     */
    public GetOnTimeRatioInputBuilder accountId(int accountId) {
        getOnTimeRatioInput.setAccountId(accountId);
        return this;
    }

    /**
     * {DATETIME} The start date and time in ISO-8601
     */
    public GetOnTimeRatioInputBuilder startDate(Date startDate) {
        getOnTimeRatioInput.setStartDate(startDate);
        return this;
    }

    /**
     * {DATETIME} The end date and time in ISO-8601
     */
    public GetOnTimeRatioInputBuilder endDate(Date endDate) {
        getOnTimeRatioInput.setEndDate(endDate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOnTimeRatioInput build() {
        return getOnTimeRatioInput;
    }
}