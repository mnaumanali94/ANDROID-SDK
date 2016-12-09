/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AssetSummaryModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5415874811488441057L;
    private AssetModel asset;
    private CostModel cost;
    private CountModel count;
    private ReportDataModel assetChildren;
    private ReportDataModel totalsWithChildren;
    /** GETTER
     * Represents an asset with base properties.
     */
    @JsonGetter("asset")
    public AssetModel getAsset ( ) { 
        return this.asset;
    }
    
    /** SETTER
     * Represents an asset with base properties.
     */
    @JsonSetter("asset")
    public void setAsset (AssetModel value) { 
        this.asset = value;
    }
 
    /** GETTER
     * Represents a cost object.
     */
    @JsonGetter("cost")
    public CostModel getCost ( ) { 
        return this.cost;
    }
    
    /** SETTER
     * Represents a cost object.
     */
    @JsonSetter("cost")
    public void setCost (CostModel value) { 
        this.cost = value;
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
 
    /** GETTER
     * Represents a report data object.
     */
    @JsonGetter("assetChildren")
    public ReportDataModel getAssetChildren ( ) { 
        return this.assetChildren;
    }
    
    /** SETTER
     * Represents a report data object.
     */
    @JsonSetter("assetChildren")
    public void setAssetChildren (ReportDataModel value) { 
        this.assetChildren = value;
    }
 
    /** GETTER
     * Represents a report data object.
     */
    @JsonGetter("totalsWithChildren")
    public ReportDataModel getTotalsWithChildren ( ) { 
        return this.totalsWithChildren;
    }
    
    /** SETTER
     * Represents a report data object.
     */
    @JsonSetter("totalsWithChildren")
    public void setTotalsWithChildren (ReportDataModel value) { 
        this.totalsWithChildren = value;
    }
 
}
 