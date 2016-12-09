/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetOnTimeRatioInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4649405852684425189L;
    private int accountId;
    private Date startDate;
    private Date endDate;
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
     * {DATETIME} The start date and time in ISO-8601
     */
    @JsonGetter("startDate")
    public Date getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * {DATETIME} The start date and time in ISO-8601
     */
    @JsonSetter("startDate")
    public void setStartDate (Date value) { 
        this.startDate = value;
    }
 
    /** GETTER
     * {DATETIME} The end date and time in ISO-8601
     */
    @JsonGetter("endDate")
    public Date getEndDate ( ) { 
        return this.endDate;
    }
    
    /** SETTER
     * {DATETIME} The end date and time in ISO-8601
     */
    @JsonSetter("endDate")
    public void setEndDate (Date value) { 
        this.endDate = value;
    }
 
}
 