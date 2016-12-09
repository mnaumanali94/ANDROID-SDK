/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemInformationModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4959567799020894587L;
    private String application;
    private String version;
    private String apiVersion;
    private HeartbeatModel vitals;
    private List<SystemLinksModel> links;
    /** GETTER
     * The name of the application.
     */
    @JsonGetter("application")
    public String getApplication ( ) { 
        return this.application;
    }
    
    /** SETTER
     * The name of the application.
     */
    @JsonSetter("application")
    public void setApplication (String value) { 
        this.application = value;
    }
 
    /** GETTER
     * The assembly version.
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * The assembly version.
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
    /** GETTER
     * The API version.
     */
    @JsonGetter("apiVersion")
    public String getApiVersion ( ) { 
        return this.apiVersion;
    }
    
    /** SETTER
     * The API version.
     */
    @JsonSetter("apiVersion")
    public void setApiVersion (String value) { 
        this.apiVersion = value;
    }
 
    /** GETTER
     * Represents a heartbeat response.
     */
    @JsonGetter("vitals")
    public HeartbeatModel getVitals ( ) { 
        return this.vitals;
    }
    
    /** SETTER
     * Represents a heartbeat response.
     */
    @JsonSetter("vitals")
    public void setVitals (HeartbeatModel value) { 
        this.vitals = value;
    }
 
    /** GETTER
     * The API routes.
     */
    @JsonGetter("links")
    public List<SystemLinksModel> getLinks ( ) { 
        return this.links;
    }
    
    /** SETTER
     * The API routes.
     */
    @JsonSetter("links")
    public void setLinks (List<SystemLinksModel> value) { 
        this.links = value;
    }
 
}
 