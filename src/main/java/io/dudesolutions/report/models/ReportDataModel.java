/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ReportDataModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5698132529803567935L;
    private CostModel cost;
    private CountModel count;
    /** GETTER
     * Represents a cost object.
     */
    @JsonGetter("cost")
    public CostModel getCost ( ) { 
        return this.cost;
    }
    
    /** SETTER
     * Represents a cost object.
     */
    @JsonSetter("cost")
    public void setCost (CostModel value) { 
        this.cost = value;
    }
 
    /** GETTER
     * Represents a count object.
     */
    @JsonGetter("count")
    public CountModel getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * Represents a count object.
     */
    @JsonSetter("count")
    public void setCount (CountModel value) { 
        this.count = value;
    }
 
}
 