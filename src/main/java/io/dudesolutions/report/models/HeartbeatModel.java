/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HeartbeatModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4645022103265225199L;
    private boolean cachevitalcheck;
    private boolean reportdbvitalcheck;
    /** GETTER
     * true is cache is online.
     */
    @JsonGetter("cachevitalcheck")
    public boolean getCachevitalcheck ( ) { 
        return this.cachevitalcheck;
    }
    
    /** SETTER
     * true is cache is online.
     */
    @JsonSetter("cachevitalcheck")
    public void setCachevitalcheck (boolean value) { 
        this.cachevitalcheck = value;
    }
 
    /** GETTER
     * true if ReportDB is online
     */
    @JsonGetter("reportdbvitalcheck")
    public boolean getReportdbvitalcheck ( ) { 
        return this.reportdbvitalcheck;
    }
    
    /** SETTER
     * true if ReportDB is online
     */
    @JsonSetter("reportdbvitalcheck")
    public void setReportdbvitalcheck (boolean value) { 
        this.reportdbvitalcheck = value;
    }
 
}
 