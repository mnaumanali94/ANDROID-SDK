/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 on 08/03/2016
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
import org3000.hopto.apimatic.controllers.FormParamsController;
import org3000.hopto.apimatic.controllers.syncwrapper.APICallBackCatcher;
import org3000.hopto.apimatic.models.*;
import org3000.hopto.apimatic.testing.TestHelper;
import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FormParamsControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static FormParamsController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getFormParams();
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
     * Todo Add description for test testSendLong
     * @throws Throwable
     */
    @Test
    public void testSendLong() throws Throwable {
        // Parameters for the API call
        long value = 5147483647L;

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendLongAsync(value, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
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
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
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
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendModel
     * @throws Throwable
     */
    @Test
    public void testSendModel() throws Throwable {
        // Parameters for the API call
        Employee model = APIHelper.deserialize("{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}", new TypeReference<Employee>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendModelAsync(model, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendModelArray
     * @throws Throwable
     */
    @Test
    public void testSendModelArray() throws Throwable {
        // Parameters for the API call
        List<Employee> models = APIHelper.deserialize("[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}]", new TypeReference<List<Employee>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendModelArrayAsync(models, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendFile
     * @throws Throwable
     */
    @Test
    public void testSendFile() throws Throwable {
        // Parameters for the API call
        File file = TestHelper.getFile("https://dl.dropboxusercontent.com/u/31838656/binary.png");

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendFileAsync(file, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendMixedArray
     * @throws Throwable
     */
    @Test
    public void testSendMixedArray() throws Throwable {
        // Parameters for the API call
        SendMixedArrayInput input = new SendMixedArrayInput();
        input.setFile(TestHelper.getFile("https://dl.dropboxusercontent.com/u/31838656/binary.png"));
        input.setIntegers(APIHelper.deserialize("[1,2,3,4,5]", new TypeReference<List<Integer>>(){}));
        input.setModels(APIHelper.deserialize("[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}]", new TypeReference<List<Employee>>(){}));
        input.setStrings(APIHelper.deserialize("[\"abc\", \"def\"]", new TypeReference<List<String>>(){}));

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendMixedArrayAsync(input, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendString
     * @throws Throwable
     */
    @Test
    public void testSendString() throws Throwable {
        // Parameters for the API call
        String value = "TestString";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringAsync(value, response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendIntegerEnumArray
     * @throws Throwable
     */
    @Test
    public void testSendIntegerEnumArray() throws Throwable {
        // Parameters for the API call
        List<SuiteCode> suites = APIHelper.deserialize("[1, 3, 4, 2, 3]", new TypeReference<List<SuiteCode>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendIntegerEnumArrayAsync(suites, response);
        result = response.getResult();

        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 && 
                httpResponse.getResponse().getStatusCode() <= 208);

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringEnumArray
     * @throws Throwable
     */
    @Test
    public void testSendStringEnumArray() throws Throwable {
        // Parameters for the API call
        List<Days> days = APIHelper.deserialize("[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]", new TypeReference<List<Days>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringEnumArrayAsync(days, response);
        result = response.getResult();

        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 && 
                httpResponse.getResponse().getStatusCode() <= 208);

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
