/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FailureDetailModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4985526262802278608L;
    private int failures;
    private int downtimeMinutes;
    /** GETTER
     * The number of failures.
     */
    @JsonGetter("failures")
    public int getFailures ( ) { 
        return this.failures;
    }
    
    /** SETTER
     * The number of failures.
     */
    @JsonSetter("failures")
    public void setFailures (int value) { 
        this.failures = value;
    }
 
    /** GETTER
     * The number of downtime minutes.
     */
    @JsonGetter("downtimeMinutes")
    public int getDowntimeMinutes ( ) { 
        return this.downtimeMinutes;
    }
    
    /** SETTER
     * The number of downtime minutes.
     */
    @JsonSetter("downtimeMinutes")
    public void setDowntimeMinutes (int value) { 
        this.downtimeMinutes = value;
    }
 
}
 