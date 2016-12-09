/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAssigneeSummaryCollectionResponseModel 
        extends BaseCollectionResponseModel {
    private static final long serialVersionUID = 4752712850491618117L;
    private List<AssigneeSummaryModel> data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public List<AssigneeSummaryModel> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (List<AssigneeSummaryModel> value) { 
        this.data = value;
    }
 
}
 