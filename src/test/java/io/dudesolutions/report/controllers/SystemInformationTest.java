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
import io.dudesolutions.report.controllers.SystemInformation;

import com.fasterxml.jackson.core.type.TypeReference;

public class SystemInformationTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static SystemInformation controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getSystemInformation();
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
     * Retrieve api version, vitals, links, etc.
     * @throws Throwable
     */
    @Test
    public void testGetSICheck1() throws Throwable {

        // Set callback and perform API call
        SystemInformationModel result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getSICheck();
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
