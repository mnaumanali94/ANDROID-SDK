/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CostModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5009754245872502316L;
    private double labor;
    private double purchase;
    private double total;
    /** GETTER
     * The sum of labor costs.
     */
    @JsonGetter("labor")
    public double getLabor ( ) { 
        return this.labor;
    }
    
    /** SETTER
     * The sum of labor costs.
     */
    @JsonSetter("labor")
    public void setLabor (double value) { 
        this.labor = value;
    }
 
    /** GETTER
     * The sum of purchase costs.
     */
    @JsonGetter("purchase")
    public double getPurchase ( ) { 
        return this.purchase;
    }
    
    /** SETTER
     * The sum of purchase costs.
     */
    @JsonSetter("purchase")
    public void setPurchase (double value) { 
        this.purchase = value;
    }
 
    /** GETTER
     * The total sum of all costs.
     */
    @JsonGetter("total")
    public double getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * The total sum of all costs.
     */
    @JsonSetter("total")
    public void setTotal (double value) { 
        this.total = value;
    }
 
}
 