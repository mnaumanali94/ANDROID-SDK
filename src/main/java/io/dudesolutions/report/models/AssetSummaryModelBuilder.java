/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class AssetSummaryModelBuilder {
    //the instance to build
    private AssetSummaryModel assetSummaryModel;

    /**
     * Default constructor to initialize the instance
     */
    public AssetSummaryModelBuilder() {
        assetSummaryModel = new AssetSummaryModel();
    }

    /**
     * Represents an asset with base properties.
     */
    public AssetSummaryModelBuilder asset(AssetModel asset) {
        assetSummaryModel.setAsset(asset);
        return this;
    }

    /**
     * Represents a cost object.
     */
    public AssetSummaryModelBuilder cost(CostModel cost) {
        assetSummaryModel.setCost(cost);
        return this;
    }

    /**
     * Represents a count object.
     */
    public AssetSummaryModelBuilder count(CountModel count) {
        assetSummaryModel.setCount(count);
        return this;
    }

    /**
     * Represents a report data object.
     */
    public AssetSummaryModelBuilder assetChildren(ReportDataModel assetChildren) {
        assetSummaryModel.setAssetChildren(assetChildren);
        return this;
    }

    /**
     * Represents a report data object.
     */
    public AssetSummaryModelBuilder totalsWithChildren(ReportDataModel totalsWithChildren) {
        assetSummaryModel.setTotalsWithChildren(totalsWithChildren);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AssetSummaryModel build() {
        return assetSummaryModel;
    }
}