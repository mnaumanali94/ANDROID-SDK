/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FailureSummaryModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5284831808896859715L;
    private AssetModel asset;
    private FailureReasonModel failureReason;
    private FailureDetailModel failureDetail;
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
     * Represents a failure reason with base properties.
     */
    @JsonGetter("failureReason")
    public FailureReasonModel getFailureReason ( ) { 
        return this.failureReason;
    }
    
    /** SETTER
     * Represents a failure reason with base properties.
     */
    @JsonSetter("failureReason")
    public void setFailureReason (FailureReasonModel value) { 
        this.failureReason = value;
    }
 
    /** GETTER
     * Represents a failure detail object.
     */
    @JsonGetter("failureDetail")
    public FailureDetailModel getFailureDetail ( ) { 
        return this.failureDetail;
    }
    
    /** SETTER
     * Represents a failure detail object.
     */
    @JsonSetter("failureDetail")
    public void setFailureDetail (FailureDetailModel value) { 
        this.failureDetail = value;
    }
 
}
 