/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class AssetModelBuilder {
    //the instance to build
    private AssetModel assetModel;

    /**
     * Default constructor to initialize the instance
     */
    public AssetModelBuilder() {
        assetModel = new AssetModel();
    }

    /**
     * The unique ID for the asset.
     */
    public AssetModelBuilder id(int id) {
        assetModel.setId(id);
        return this;
    }

    /**
     * The name of the asset.
     */
    public AssetModelBuilder value(String value) {
        assetModel.setValue(value);
        return this;
    }

    /**
     * IsActive check to ensure the asset is active.
     */
    public AssetModelBuilder isActive(boolean isActive) {
        assetModel.setIsActive(isActive);
        return this;
    }

    /**
     * The anscestor id path.
     */
    public AssetModelBuilder ancestorIdPath(String ancestorIdPath) {
        assetModel.setAncestorIdPath(ancestorIdPath);
        return this;
    }

    /**
     * The anscestor name path.
     */
    public AssetModelBuilder ancestorNamePath(String ancestorNamePath) {
        assetModel.setAncestorNamePath(ancestorNamePath);
        return this;
    }

    /**
     * The name of the asset.
     */
    public AssetModelBuilder description(String description) {
        assetModel.setDescription(description);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AssetModel build() {
        return assetModel;
    }
}