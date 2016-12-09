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
import io.dudesolutions.report.controllers.PDF;

import com.fasterxml.jackson.core.type.TypeReference;

public class PDFTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static PDF controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getPDF();
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
     * This endpoint returns a work order in a printable PDF format.
     * @throws Throwable
     */
    @Test
    public void testGetWorkOrderPDFExport1() throws Throwable {
        // Parameters for the API call
        GetWorkOrderPDFExportInput input = new GetWorkOrderPDFExportInput();
        input.setAccountId(2);
        input.setWorkOrderId(12345);
        input.setTimeZone("Etc/UTC");

        // Set callback and perform API call
        InputStream result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getWorkOrderPDFExport(input);
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
