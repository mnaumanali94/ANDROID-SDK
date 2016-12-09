/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AssetFailureReasonModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5756134173666866321L;
    private FailureReasonModel failureReason;
    private int count;
    /** GETTER
     * Represents a failure reason with base properties.
     */
    @JsonGetter("failureReason")
    public FailureReasonModel getFailureReason ( ) { 
        return this.failureReason;
    }
    
    /** SETTER
     * Represents a failure reason with base properties.
     */
    @JsonSetter("failureReason")
    public void setFailureReason (FailureReasonModel value) { 
        this.failureReason = value;
    }
 
    /** GETTER
     * The number of failure reasons.
     */
    @JsonGetter("count")
    public int getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * The number of failure reasons.
     */
    @JsonSetter("count")
    public void setCount (int value) { 
        this.count = value;
    }
 
}
 