/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FailureReasonModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5371351029274739978L;
    private int id;
    private String name;
    private boolean isActive;
    /** GETTER
     * The unique ID for the failure reason.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique ID for the failure reason.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * The name of the failure reason.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the failure reason.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * IsActive check to ensure the failure reason is active.
     */
    @JsonGetter("isActive")
    public boolean getIsActive ( ) { 
        return this.isActive;
    }
    
    /** SETTER
     * IsActive check to ensure the failure reason is active.
     */
    @JsonSetter("isActive")
    public void setIsActive (boolean value) { 
        this.isActive = value;
    }
 
}
 