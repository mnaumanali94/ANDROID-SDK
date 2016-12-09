/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CountModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5028629925604465366L;
    private int workOrders;
    private double laborHours;
    /** GETTER
     * The number of workorders.
     */
    @JsonGetter("workOrders")
    public int getWorkOrders ( ) { 
        return this.workOrders;
    }
    
    /** SETTER
     * The number of workorders.
     */
    @JsonSetter("workOrders")
    public void setWorkOrders (int value) { 
        this.workOrders = value;
    }
 
    /** GETTER
     * The number of labor hours.
     */
    @JsonGetter("laborHours")
    public double getLaborHours ( ) { 
        return this.laborHours;
    }
    
    /** SETTER
     * The number of labor hours.
     */
    @JsonSetter("laborHours")
    public void setLaborHours (double value) { 
        this.laborHours = value;
    }
 
}
 