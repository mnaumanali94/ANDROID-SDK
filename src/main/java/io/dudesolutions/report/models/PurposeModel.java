/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PurposeModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4815641009675434320L;
    private int id;
    private String value;
    private boolean isActive;
    /** GETTER
     * The unique ID for the purpose.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique ID for the purpose.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * The name of the purpose.
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * The name of the purpose.
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
    /** GETTER
     * IsActive check to ensure the purpose is active.
     */
    @JsonGetter("isActive")
    public boolean getIsActive ( ) { 
        return this.isActive;
    }
    
    /** SETTER
     * IsActive check to ensure the purpose is active.
     */
    @JsonSetter("isActive")
    public void setIsActive (boolean value) { 
        this.isActive = value;
    }
 
}
 