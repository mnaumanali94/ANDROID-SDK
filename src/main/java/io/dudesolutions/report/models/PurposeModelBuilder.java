/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class PurposeModelBuilder {
    //the instance to build
    private PurposeModel purposeModel;

    /**
     * Default constructor to initialize the instance
     */
    public PurposeModelBuilder() {
        purposeModel = new PurposeModel();
    }

    /**
     * The unique ID for the purpose.
     */
    public PurposeModelBuilder id(int id) {
        purposeModel.setId(id);
        return this;
    }

    /**
     * The name of the purpose.
     */
    public PurposeModelBuilder value(String value) {
        purposeModel.setValue(value);
        return this;
    }

    /**
     * IsActive check to ensure the purpose is active.
     */
    public PurposeModelBuilder isActive(boolean isActive) {
        purposeModel.setIsActive(isActive);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PurposeModel build() {
        return purposeModel;
    }
}