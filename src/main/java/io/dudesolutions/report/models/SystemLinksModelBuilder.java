/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class SystemLinksModelBuilder {
    //the instance to build
    private SystemLinksModel systemLinksModel;

    /**
     * Default constructor to initialize the instance
     */
    public SystemLinksModelBuilder() {
        systemLinksModel = new SystemLinksModel();
    }

    /**
     * The name of the endpoint.
     */
    public SystemLinksModelBuilder endpoint(String endpoint) {
        systemLinksModel.setEndpoint(endpoint);
        return this;
    }

    /**
     * The REST action.
     */
    public SystemLinksModelBuilder action(String action) {
        systemLinksModel.setAction(action);
        return this;
    }

    /**
     * The route to the endpoint.
     */
    public SystemLinksModelBuilder route(String route) {
        systemLinksModel.setRoute(route);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemLinksModel build() {
        return systemLinksModel;
    }
}