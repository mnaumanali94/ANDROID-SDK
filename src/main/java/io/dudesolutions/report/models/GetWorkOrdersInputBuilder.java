/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class GetWorkOrdersInputBuilder {
    //the instance to build
    private GetWorkOrdersInput getWorkOrdersInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetWorkOrdersInputBuilder() {
        getWorkOrdersInput = new GetWorkOrdersInput();
    }

    /**
     * {INT} ID of the account in the form of an integer
     */
    public GetWorkOrdersInputBuilder accountId(int accountId) {
        getWorkOrdersInput.setAccountId(accountId);
        return this;
    }

    /**
     * A string describing the ordering to perform on the collection.
     */
    public GetWorkOrdersInputBuilder orderby(String orderby) {
        getWorkOrdersInput.setOrderby(orderby);
        return this;
    }

    /**
     * A free form filter mechanism.
     */
    public GetWorkOrdersInputBuilder q(String q) {
        getWorkOrdersInput.setQ(q);
        return this;
    }

    /**
     * Filter by action taken text.
     */
    public GetWorkOrdersInputBuilder actiontaken(String actiontaken) {
        getWorkOrdersInput.setActiontaken(actiontaken);
        return this;
    }

    /**
     * {INT} Filter by assignees.
     */
    public GetWorkOrdersInputBuilder assignees(List<Integer> assignees) {
        getWorkOrdersInput.setAssignees(assignees);
        return this;
    }

    /**
     * {DATETIME} Filter by completion date, starting from.
     */
    public GetWorkOrdersInputBuilder completiondatefrom(Date completiondatefrom) {
        getWorkOrdersInput.setCompletiondatefrom(completiondatefrom);
        return this;
    }

    /**
     * {DATETIME} Filter by completion date, until.
     */
    public GetWorkOrdersInputBuilder completiondateto(Date completiondateto) {
        getWorkOrdersInput.setCompletiondateto(completiondateto);
        return this;
    }

    /**
     * {INT} Filter by the user who created the work order.
     */
    public GetWorkOrdersInputBuilder createdby(Integer createdby) {
        getWorkOrdersInput.setCreatedby(createdby);
        return this;
    }

    /**
     * Filter by the display ID of the work order.
     */
    public GetWorkOrdersInputBuilder displayid(String displayid) {
        getWorkOrdersInput.setDisplayid(displayid);
        return this;
    }

    /**
     * Filter by the priority of work orders.
     */
    public GetWorkOrdersInputBuilder priority(Priority priority) {
        getWorkOrdersInput.setPriority(priority);
        return this;
    }

    /**
     * {INT} Filter by the purpose of work orders.
     */
    public GetWorkOrdersInputBuilder purpose(List<Integer> purpose) {
        getWorkOrdersInput.setPurpose(purpose);
        return this;
    }

    /**
     * {DATETIME} Filter by request date, starting from.
     */
    public GetWorkOrdersInputBuilder requestdatefrom(Date requestdatefrom) {
        getWorkOrdersInput.setRequestdatefrom(requestdatefrom);
        return this;
    }

    /**
     * {DATETIME} Filter by the request date, until.
     */
    public GetWorkOrdersInputBuilder requestdateto(Date requestdateto) {
        getWorkOrdersInput.setRequestdateto(requestdateto);
        return this;
    }

    /**
     * {INT} Filter by the work order requester.
     */
    public GetWorkOrdersInputBuilder requestedby(List<Integer> requestedby) {
        getWorkOrdersInput.setRequestedby(requestedby);
        return this;
    }

    /**
     * Filter by the work order status.
     */
    public GetWorkOrdersInputBuilder status(Status status) {
        getWorkOrdersInput.setStatus(status);
        return this;
    }

    /**
     * {INT} Filter by the work category assigned to the work order.
     */
    public GetWorkOrdersInputBuilder workcategory(List<Integer> workcategory) {
        getWorkOrdersInput.setWorkcategory(workcategory);
        return this;
    }

    /**
     * Filter by the business asset assigned to the work order.
     */
    public GetWorkOrdersInputBuilder businessasset(List<Double> businessasset) {
        getWorkOrdersInput.setBusinessasset(businessasset);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetWorkOrdersInput build() {
        return getWorkOrdersInput;
    }
}