/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetWorkOrderPDFExportInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5108919532173223400L;
    private int accountId;
    private int workOrderId;
    private String timeZone;
    /** GETTER
     * {INT} ID of the account in the form of an integer.
     */
    @JsonGetter("accountId")
    public int getAccountId ( ) { 
        return this.accountId;
    }
    
    /** SETTER
     * {INT} ID of the account in the form of an integer.
     */
    @JsonSetter("accountId")
    public void setAccountId (int value) { 
        this.accountId = value;
    }
 
    /** GETTER
     * {INT} ID of the work order in the form of an integer.
     */
    @JsonGetter("workOrderId")
    public int getWorkOrderId ( ) { 
        return this.workOrderId;
    }
    
    /** SETTER
     * {INT} ID of the work order in the form of an integer.
     */
    @JsonSetter("workOrderId")
    public void setWorkOrderId (int value) { 
        this.workOrderId = value;
    }
 
    /** GETTER
     * A string denoting the time zone.
     */
    @JsonGetter("timeZone")
    public String getTimeZone ( ) { 
        return this.timeZone;
    }
    
    /** SETTER
     * A string denoting the time zone.
     */
    @JsonSetter("timeZone")
    public void setTimeZone (String value) { 
        this.timeZone = value;
    }
 
}
 