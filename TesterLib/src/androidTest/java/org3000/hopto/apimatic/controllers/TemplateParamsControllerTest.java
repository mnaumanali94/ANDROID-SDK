/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 on 08/01/2016
 */
package org3000.hopto.apimatic.controllers;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org3000.hopto.apimatic.Configuration;
import org3000.hopto.apimatic.APIException;
import org3000.hopto.apimatic.APIHelper;
import org3000.hopto.apimatic.controllers.TemplateParamsController;
import org3000.hopto.apimatic.controllers.syncwrapper.APICallBackCatcher;
import org3000.hopto.apimatic.models.*;
import org3000.hopto.apimatic.testing.TestHelper;
import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TemplateParamsControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static TemplateParamsController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getTemplateParams();
        applyConfiguration();
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
     * Todo Add description for test testSendStringArray
     * @throws Throwable
     */
    @Test
    public void testSendStringArray() throws Throwable {
        // Parameters for the API call
        List<String> strings = APIHelper.deserialize("[\"abc\", \"def\"]", new TypeReference<List<String>>(){});

        // Set callback and perform API call
        EchoResponse result = null;
        APICallBackCatcher<EchoResponse> response = new APICallBackCatcher<EchoResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringArrayAsync(strings, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"path\":\"/abc/def\"}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendIntegerArray
     * @throws Throwable
     */
    @Test
    public void testSendIntegerArray() throws Throwable {
        // Parameters for the API call
        List<Integer> integers = APIHelper.deserialize("[1,2,3,4,5]", new TypeReference<List<Integer>>(){});

        // Set callback and perform API call
        EchoResponse result = null;
        APICallBackCatcher<EchoResponse> response = new APICallBackCatcher<EchoResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendIntegerArrayAsync(integers, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"path\":\"/1/2/3/4/5\"}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
