/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OnTimeRatioModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5559874425963715303L;
    private int onTime;
    private int overDue;
    /** GETTER
     * Count of on time work orders.
     */
    @JsonGetter("onTime")
    public int getOnTime ( ) { 
        return this.onTime;
    }
    
    /** SETTER
     * Count of on time work orders.
     */
    @JsonSetter("onTime")
    public void setOnTime (int value) { 
        this.onTime = value;
    }
 
    /** GETTER
     * Count of over due work orders.
     */
    @JsonGetter("overDue")
    public int getOverDue ( ) { 
        return this.overDue;
    }
    
    /** SETTER
     * Count of over due work orders.
     */
    @JsonSetter("overDue")
    public void setOverDue (int value) { 
        this.overDue = value;
    }
 
}
 