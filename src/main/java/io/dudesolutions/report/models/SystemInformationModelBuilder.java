/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class SystemInformationModelBuilder {
    //the instance to build
    private SystemInformationModel systemInformationModel;

    /**
     * Default constructor to initialize the instance
     */
    public SystemInformationModelBuilder() {
        systemInformationModel = new SystemInformationModel();
    }

    /**
     * The name of the application.
     */
    public SystemInformationModelBuilder application(String application) {
        systemInformationModel.setApplication(application);
        return this;
    }

    /**
     * The assembly version.
     */
    public SystemInformationModelBuilder version(String version) {
        systemInformationModel.setVersion(version);
        return this;
    }

    /**
     * The API version.
     */
    public SystemInformationModelBuilder apiVersion(String apiVersion) {
        systemInformationModel.setApiVersion(apiVersion);
        return this;
    }

    /**
     * Represents a heartbeat response.
     */
    public SystemInformationModelBuilder vitals(HeartbeatModel vitals) {
        systemInformationModel.setVitals(vitals);
        return this;
    }

    /**
     * The API routes.
     */
    public SystemInformationModelBuilder links(List<SystemLinksModel> links) {
        systemInformationModel.setLinks(links);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemInformationModel build() {
        return systemInformationModel;
    }
}