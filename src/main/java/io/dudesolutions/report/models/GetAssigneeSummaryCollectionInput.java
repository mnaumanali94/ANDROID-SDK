/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAssigneeSummaryCollectionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4906467023884046885L;
    private int accountId;
    private Integer page;
    private Integer pagesize;
    private String orderby;
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
     * {INT} The page to request from the collection.
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * {INT} The page to request from the collection.
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * {INT} The number of records to load in a page from the collection.
     */
    @JsonGetter("pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * {INT} The number of records to load in a page from the collection.
     */
    @JsonSetter("pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
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
 
}
 