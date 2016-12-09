/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BaseCollectionResponseModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4784515463383142358L;
    private int page;
    private int pageSize;
    private int dataSize;
    private int total;
    /** GETTER
     * The current page provided in the response data.
     */
    @JsonGetter("page")
    public int getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The current page provided in the response data.
     */
    @JsonSetter("page")
    public void setPage (int value) { 
        this.page = value;
    }
 
    /** GETTER
     * The page size returned in the response data.
     */
    @JsonGetter("pageSize")
    public int getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * The page size returned in the response data.
     */
    @JsonSetter("pageSize")
    public void setPageSize (int value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * The total records returned in the response.
     */
    @JsonGetter("dataSize")
    public int getDataSize ( ) { 
        return this.dataSize;
    }
    
    /** SETTER
     * The total records returned in the response.
     */
    @JsonSetter("dataSize")
    public void setDataSize (int value) { 
        this.dataSize = value;
    }
 
    /** GETTER
     * The total number of records available in the collection.
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * The total number of records available in the collection.
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
    }
 
}
 