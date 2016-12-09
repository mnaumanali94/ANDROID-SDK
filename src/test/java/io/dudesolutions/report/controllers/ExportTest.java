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
import io.dudesolutions.report.http.response.HttpResponse;
import io.dudesolutions.report.testing.TestHelper;
import io.dudesolutions.report.controllers.Export;

import com.fasterxml.jackson.core.type.TypeReference;

public class ExportTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static Export controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getExport();
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
     * This collection allows for workorder data to be returned as an excel document.
     * @throws Throwable
     */
    @Test
    public void testGetWorkOrders1() throws Throwable {
        // Parameters for the API call
        GetWorkOrdersInput input = new GetWorkOrdersInput();
        input.setAccountId(1);
        input.setOrderby("Quantity asc");
        input.setQ(null);
        input.setActiontaken("Fixed the chair");
        input.setAssignees(APIHelper.deserialize("[1]", new TypeReference<List<Integer>>(){}));
        input.setCompletiondatefrom(APIHelper.parseDate("01/01/2015 00:00:00"));
        input.setCompletiondateto(APIHelper.parseDate("01/01/2016 00:00:00"));
        input.setCreatedby(1);
        input.setDisplayid("123");
        input.setPriority(Priority.fromString("Low"));
        input.setPurpose(APIHelper.deserialize("[1]", new TypeReference<List<Integer>>(){}));
        input.setRequestdatefrom(APIHelper.parseDate("01/01/2015 00:00:00"));
        input.setRequestdateto(APIHelper.parseDate("01/01/2016 00:00:00"));
        input.setRequestedby(APIHelper.deserialize("[1]", new TypeReference<List<Integer>>(){}));
        input.setStatus(Status.fromString("NewRequest"));
        input.setWorkcategory(APIHelper.deserialize("[1]", new TypeReference<List<Integer>>(){}));
        input.setBusinessasset(APIHelper.deserialize("[1]", new TypeReference<List<Double>>(){}));

        // Set callback and perform API call
        HttpResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getWorkOrders(input);
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
        headers.put("Cache-Control", TestHelper.nullString);
        headers.put("Connection", TestHelper.nullString);
        headers.put("Content-Disposition", TestHelper.nullString);
        headers.put("Content-Length", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

}
