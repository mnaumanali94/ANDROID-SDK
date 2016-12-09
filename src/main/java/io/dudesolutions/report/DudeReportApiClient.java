/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report;

import io.dudesolutions.report.controllers.*;
import io.dudesolutions.report.http.client.HttpClient;

public class DudeReportApiClient {
    /**
     * Singleton access to Heartbeat controller
     * @return	Returns the Heartbeat instance 
     */
    public Heartbeat getHeartbeat() {
        return Heartbeat.getInstance();
    }

    /**
     * Singleton access to SystemInformation controller
     * @return	Returns the SystemInformation instance 
     */
    public SystemInformation getSystemInformation() {
        return SystemInformation.getInstance();
    }

    /**
     * Singleton access to Export controller
     * @return	Returns the Export instance 
     */
    public Export getExport() {
        return Export.getInstance();
    }

    /**
     * Singleton access to PDF controller
     * @return	Returns the PDF instance 
     */
    public PDF getPDF() {
        return PDF.getInstance();
    }

    /**
     * Singleton access to Reports controller
     * @return	Returns the Reports instance 
     */
    public Reports getReports() {
        return Reports.getInstance();
    }

    /**
     * Singleton access to Dashboard controller
     * @return	Returns the Dashboard instance 
     */
    public Dashboard getDashboard() {
        return Dashboard.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public DudeReportApiClient() {	
	}

    /**
     * Client initialization constructor 
     */     
    public DudeReportApiClient(String oAuthAccessToken) {
        this();
        Configuration.oAuthAccessToken = oAuthAccessToken;
    }
}