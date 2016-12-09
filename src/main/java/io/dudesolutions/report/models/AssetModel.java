/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AssetModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5182130360999290736L;
    private int id;
    private String value;
    private boolean isActive;
    private String ancestorIdPath;
    private String ancestorNamePath;
    private String description;
    /** GETTER
     * The unique ID for the asset.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique ID for the asset.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * The name of the asset.
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * The name of the asset.
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
    /** GETTER
     * IsActive check to ensure the asset is active.
     */
    @JsonGetter("isActive")
    public boolean getIsActive ( ) { 
        return this.isActive;
    }
    
    /** SETTER
     * IsActive check to ensure the asset is active.
     */
    @JsonSetter("isActive")
    public void setIsActive (boolean value) { 
        this.isActive = value;
    }
 
    /** GETTER
     * The anscestor id path.
     */
    @JsonGetter("AncestorIdPath")
    public String getAncestorIdPath ( ) { 
        return this.ancestorIdPath;
    }
    
    /** SETTER
     * The anscestor id path.
     */
    @JsonSetter("AncestorIdPath")
    public void setAncestorIdPath (String value) { 
        this.ancestorIdPath = value;
    }
 
    /** GETTER
     * The anscestor name path.
     */
    @JsonGetter("AncestorNamePath")
    public String getAncestorNamePath ( ) { 
        return this.ancestorNamePath;
    }
    
    /** SETTER
     * The anscestor name path.
     */
    @JsonSetter("AncestorNamePath")
    public void setAncestorNamePath (String value) { 
        this.ancestorNamePath = value;
    }
 
    /** GETTER
     * The name of the asset.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * The name of the asset.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
}
 