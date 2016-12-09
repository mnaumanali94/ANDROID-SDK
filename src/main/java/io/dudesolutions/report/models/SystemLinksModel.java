/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemLinksModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5583776182387742422L;
    private String endpoint;
    private String action;
    private String route;
    /** GETTER
     * The name of the endpoint.
     */
    @JsonGetter("endpoint")
    public String getEndpoint ( ) { 
        return this.endpoint;
    }
    
    /** SETTER
     * The name of the endpoint.
     */
    @JsonSetter("endpoint")
    public void setEndpoint (String value) { 
        this.endpoint = value;
    }
 
    /** GETTER
     * The REST action.
     */
    @JsonGetter("action")
    public String getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * The REST action.
     */
    @JsonSetter("action")
    public void setAction (String value) { 
        this.action = value;
    }
 
    /** GETTER
     * The route to the endpoint.
     */
    @JsonGetter("route")
    public String getRoute ( ) { 
        return this.route;
    }
    
    /** SETTER
     * The route to the endpoint.
     */
    @JsonSetter("route")
    public void setRoute (String value) { 
        this.route = value;
    }
 
}
 