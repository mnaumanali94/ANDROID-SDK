/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 on 12/09/2016
 */
package io.dudesolutions.report.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import io.dudesolutions.report.models.*;
import io.dudesolutions.report.exceptions.*;
import io.dudesolutions.report.APIHelper;
import io.dudesolutions.report.Configuration;
import io.dudesolutions.report.testing.TestHelper;
import io.dudesolutions.report.controllers.Reports;

import com.fasterxml.jackson.core.type.TypeReference;

public class ReportsTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static Reports controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getReports();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * This collection allows for workorder data to be organized by purposes and return relevant counts.
     * @throws Throwable
     */
    @Test
    public void testGetPurposeSummaryCollection1() throws Throwable {
        // Parameters for the API call
        GetPurposeSummaryCollectionInput input = new GetPurposeSummaryCollectionInput();
        input.setAccountId(2);
        input.setPage(1);
        input.setPagesize(1000);
        input.setOrderby("Id desc");

        // Set callback and perform API call
        GetPurposeSummaryCollectionResponseModel result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getPurposeSummaryCollection(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * This collection allows for workorder data to be organized by overall failures and return relevant counts.
     * @throws Throwable
     */
    @Test
    public void testGetFailureSummaryCollection1() throws Throwable {
        // Parameters for the API call
        GetFailureSummaryCollectionInput input = new GetFailureSummaryCollectionInput();
        input.setAccountId(2);
        input.setPage(1);
        input.setPagesize(1000);
        input.setOrderby("Id desc");

        // Set callback and perform API call
        GetFailureSummaryCollectionResponseModel result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getFailureSummaryCollection(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * This collection allows for workorder data to be organized by assignee and return relevant counts.
     * @throws Throwable
     */
    @Test
    public void testGetAssigneeSummaryCollection1() throws Throwable {
        // Parameters for the API call
        GetAssigneeSummaryCollectionInput input = new GetAssigneeSummaryCollectionInput();
        input.setAccountId(2);
        input.setPage(1);
        input.setPagesize(1000);
        input.setOrderby("Id desc");

        // Set callback and perform API call
        GetAssigneeSummaryCollectionResponseModel result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getAssigneeSummaryCollection(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * This collection allows for workorder data to be organized by asset and return relevant counts.
     * @throws Throwable
     */
    @Test
    public void testGetAssetSummaryCollection1() throws Throwable {
        // Parameters for the API call
        GetAssetSummaryCollectionInput input = new GetAssetSummaryCollectionInput();
        input.setAccountId(2);
        input.setPage(1);
        input.setPagesize(1000);
        input.setOrderby("Id desc");

        // Set callback and perform API call
        GetAssetSummaryCollectionResponseModel result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getAssetSummaryCollection(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * This collection allows for workorder data to be organized by asset failure reasons and return relevant counts.
     * @throws Throwable
     */
    @Test
    public void testGetAssetFailureReasonCollection1() throws Throwable {
        // Parameters for the API call
        GetAssetFailureReasonCollectionInput input = new GetAssetFailureReasonCollectionInput();
        input.setAccountId(2);
        input.setAssetId(1d);
        input.setPage(1);
        input.setPagesize(1000);
        input.setOrderby("Id desc");

        // Set callback and perform API call
        GetAssetFailureReasonCollectionResponseModel result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getAssetFailureReasonCollection(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

}
