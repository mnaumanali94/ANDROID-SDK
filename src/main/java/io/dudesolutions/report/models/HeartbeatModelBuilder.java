/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class HeartbeatModelBuilder {
    //the instance to build
    private HeartbeatModel heartbeatModel;

    /**
     * Default constructor to initialize the instance
     */
    public HeartbeatModelBuilder() {
        heartbeatModel = new HeartbeatModel();
    }

    /**
     * true is cache is online.
     */
    public HeartbeatModelBuilder cachevitalcheck(boolean cachevitalcheck) {
        heartbeatModel.setCachevitalcheck(cachevitalcheck);
        return this;
    }

    /**
     * true if ReportDB is online
     */
    public HeartbeatModelBuilder reportdbvitalcheck(boolean reportdbvitalcheck) {
        heartbeatModel.setReportdbvitalcheck(reportdbvitalcheck);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HeartbeatModel build() {
        return heartbeatModel;
    }
}