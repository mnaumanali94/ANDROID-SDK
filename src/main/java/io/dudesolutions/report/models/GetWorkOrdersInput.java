/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetWorkOrdersInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5195889159423091271L;
    private int accountId;
    private String orderby;
    private String q;
    private String actiontaken;
    private List<Integer> assignees;
    private Date completiondatefrom;
    private Date completiondateto;
    private Integer createdby;
    private String displayid;
    private Priority priority;
    private List<Integer> purpose;
    private Date requestdatefrom;
    private Date requestdateto;
    private List<Integer> requestedby;
    private Status status;
    private List<Integer> workcategory;
    private List<Double> businessasset;
    /** GETTER
     * {INT} ID of the account in the form of an integer
     */
    @JsonGetter("accountId")
    public int getAccountId ( ) { 
        return this.accountId;
    }
    
    /** SETTER
     * {INT} ID of the account in the form of an integer
     */
    @JsonSetter("accountId")
    public void setAccountId (int value) { 
        this.accountId = value;
    }
 
    /** GETTER
     * A string describing the ordering to perform on the collection.
     */
    @JsonGetter("orderby")
    public String getOrderby ( ) { 
        return this.orderby;
    }
    
    /** SETTER
     * A string describing the ordering to perform on the collection.
     */
    @JsonSetter("orderby")
    public void setOrderby (String value) { 
        this.orderby = value;
    }
 
    /** GETTER
     * A free form filter mechanism.
     */
    @JsonGetter("q")
    public String getQ ( ) { 
        return this.q;
    }
    
    /** SETTER
     * A free form filter mechanism.
     */
    @JsonSetter("q")
    public void setQ (String value) { 
        this.q = value;
    }
 
    /** GETTER
     * Filter by action taken text.
     */
    @JsonGetter("actiontaken")
    public String getActiontaken ( ) { 
        return this.actiontaken;
    }
    
    /** SETTER
     * Filter by action taken text.
     */
    @JsonSetter("actiontaken")
    public void setActiontaken (String value) { 
        this.actiontaken = value;
    }
 
    /** GETTER
     * {INT} Filter by assignees.
     */
    @JsonGetter("assignees")
    public List<Integer> getAssignees ( ) { 
        return this.assignees;
    }
    
    /** SETTER
     * {INT} Filter by assignees.
     */
    @JsonSetter("assignees")
    public void setAssignees (List<Integer> value) { 
        this.assignees = value;
    }
 
    /** GETTER
     * {DATETIME} Filter by completion date, starting from.
     */
    @JsonGetter("completiondatefrom")
    public Date getCompletiondatefrom ( ) { 
        return this.completiondatefrom;
    }
    
    /** SETTER
     * {DATETIME} Filter by completion date, starting from.
     */
    @JsonSetter("completiondatefrom")
    public void setCompletiondatefrom (Date value) { 
        this.completiondatefrom = value;
    }
 
    /** GETTER
     * {DATETIME} Filter by completion date, until.
     */
    @JsonGetter("completiondateto")
    public Date getCompletiondateto ( ) { 
        return this.completiondateto;
    }
    
    /** SETTER
     * {DATETIME} Filter by completion date, until.
     */
    @JsonSetter("completiondateto")
    public void setCompletiondateto (Date value) { 
        this.completiondateto = value;
    }
 
    /** GETTER
     * {INT} Filter by the user who created the work order.
     */
    @JsonGetter("createdby")
    public Integer getCreatedby ( ) { 
        return this.createdby;
    }
    
    /** SETTER
     * {INT} Filter by the user who created the work order.
     */
    @JsonSetter("createdby")
    public void setCreatedby (Integer value) { 
        this.createdby = value;
    }
 
    /** GETTER
     * Filter by the display ID of the work order.
     */
    @JsonGetter("displayid")
    public String getDisplayid ( ) { 
        return this.displayid;
    }
    
    /** SETTER
     * Filter by the display ID of the work order.
     */
    @JsonSetter("displayid")
    public void setDisplayid (String value) { 
        this.displayid = value;
    }
 
    /** GETTER
     * Filter by the priority of work orders.
     */
    @JsonGetter("priority")
    public Priority getPriority ( ) { 
        return this.priority;
    }
    
    /** SETTER
     * Filter by the priority of work orders.
     */
    @JsonSetter("priority")
    public void setPriority (Priority value) { 
        this.priority = value;
    }
 
    /** GETTER
     * {INT} Filter by the purpose of work orders.
     */
    @JsonGetter("purpose")
    public List<Integer> getPurpose ( ) { 
        return this.purpose;
    }
    
    /** SETTER
     * {INT} Filter by the purpose of work orders.
     */
    @JsonSetter("purpose")
    public void setPurpose (List<Integer> value) { 
        this.purpose = value;
    }
 
    /** GETTER
     * {DATETIME} Filter by request date, starting from.
     */
    @JsonGetter("requestdatefrom")
    public Date getRequestdatefrom ( ) { 
        return this.requestdatefrom;
    }
    
    /** SETTER
     * {DATETIME} Filter by request date, starting from.
     */
    @JsonSetter("requestdatefrom")
    public void setRequestdatefrom (Date value) { 
        this.requestdatefrom = value;
    }
 
    /** GETTER
     * {DATETIME} Filter by the request date, until.
     */
    @JsonGetter("requestdateto")
    public Date getRequestdateto ( ) { 
        return this.requestdateto;
    }
    
    /** SETTER
     * {DATETIME} Filter by the request date, until.
     */
    @JsonSetter("requestdateto")
    public void setRequestdateto (Date value) { 
        this.requestdateto = value;
    }
 
    /** GETTER
     * {INT} Filter by the work order requester.
     */
    @JsonGetter("requestedby")
    public List<Integer> getRequestedby ( ) { 
        return this.requestedby;
    }
    
    /** SETTER
     * {INT} Filter by the work order requester.
     */
    @JsonSetter("requestedby")
    public void setRequestedby (List<Integer> value) { 
        this.requestedby = value;
    }
 
    /** GETTER
     * Filter by the work order status.
     */
    @JsonGetter("status")
    public Status getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Filter by the work order status.
     */
    @JsonSetter("status")
    public void setStatus (Status value) { 
        this.status = value;
    }
 
    /** GETTER
     * {INT} Filter by the work category assigned to the work order.
     */
    @JsonGetter("workcategory")
    public List<Integer> getWorkcategory ( ) { 
        return this.workcategory;
    }
    
    /** SETTER
     * {INT} Filter by the work category assigned to the work order.
     */
    @JsonSetter("workcategory")
    public void setWorkcategory (List<Integer> value) { 
        this.workcategory = value;
    }
 
    /** GETTER
     * Filter by the business asset assigned to the work order.
     */
    @JsonGetter("businessasset")
    public List<Double> getBusinessasset ( ) { 
        return this.businessasset;
    }
    
    /** SETTER
     * Filter by the business asset assigned to the work order.
     */
    @JsonSetter("businessasset")
    public void setBusinessasset (List<Double> value) { 
        this.businessasset = value;
    }
 
}
 