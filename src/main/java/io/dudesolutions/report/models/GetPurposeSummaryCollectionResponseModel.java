/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetPurposeSummaryCollectionResponseModel 
        extends BaseCollectionResponseModel {
    private static final long serialVersionUID = 5646416253914324503L;
    private List<PurposeSummaryModel> data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public List<PurposeSummaryModel> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (List<PurposeSummaryModel> value) { 
        this.data = value;
    }
 
}
 