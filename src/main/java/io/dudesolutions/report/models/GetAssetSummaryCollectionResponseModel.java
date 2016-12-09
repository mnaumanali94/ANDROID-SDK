/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAssetSummaryCollectionResponseModel 
        extends BaseCollectionResponseModel {
    private static final long serialVersionUID = 4908837490773099089L;
    private List<AssetSummaryModel> data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public List<AssetSummaryModel> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (List<AssetSummaryModel> value) { 
        this.data = value;
    }
 
}
 