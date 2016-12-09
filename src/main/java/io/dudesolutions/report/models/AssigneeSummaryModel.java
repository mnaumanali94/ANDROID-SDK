/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AssigneeSummaryModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5154037790594090420L;
    private UserModel assignee;
    private CountModel count;
    /** GETTER
     * Represents a user with base properties.
     */
    @JsonGetter("assignee")
    public UserModel getAssignee ( ) { 
        return this.assignee;
    }
    
    /** SETTER
     * Represents a user with base properties.
     */
    @JsonSetter("assignee")
    public void setAssignee (UserModel value) { 
        this.assignee = value;
    }
 
    /** GETTER
     * Represents a count object.
     */
    @JsonGetter("count")
    public CountModel getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * Represents a count object.
     */
    @JsonSetter("count")
    public void setCount (CountModel value) { 
        this.count = value;
    }
 
}
 