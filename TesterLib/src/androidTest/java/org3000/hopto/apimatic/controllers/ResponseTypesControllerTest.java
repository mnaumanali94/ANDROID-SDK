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
import org3000.hopto.apimatic.controllers.ResponseTypesController;
import org3000.hopto.apimatic.controllers.syncwrapper.APICallBackCatcher;
import org3000.hopto.apimatic.models.*;
import org3000.hopto.apimatic.testing.TestHelper;
import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ResponseTypesControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static ResponseTypesController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getResponseTypes();
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
     * Todo Add description for test testGetLong
     * @throws Throwable
     */
    @Test
    public void testGetLong() throws Throwable {

        // Set callback and perform API call
        long result = 0;
        APICallBackCatcher<Long> response = new APICallBackCatcher<Long>();
        controller.setHttpCallBack(httpResponse);
        controller.getLongAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

 
        assertEquals("Response does not match expected value", 
            5147483647L, result);
    }

    /**
     * Todo Add description for test testGetModel
     * @throws Throwable
     */
    @Test
    public void testGetModel() throws Throwable {

        // Set callback and perform API call
        Employee result = null;
        APICallBackCatcher<Employee> response = new APICallBackCatcher<Employee>();
        controller.setHttpCallBack(httpResponse);
        controller.getModelAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testGetStringEnumArray
     * @throws Throwable
     */
    @Test
    public void testGetStringEnumArray() throws Throwable {

        // Set callback and perform API call
        List<Days> result = null;
        APICallBackCatcher<List<Days>> response = new APICallBackCatcher<List<Days>>();
        controller.setHttpCallBack(httpResponse);
        controller.getStringEnumArrayAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        // Deserialize expected output
        List<Days> expected = APIHelper.deserialize(
            "[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]", 
            new TypeReference<List<Days>>(){});

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Todo Add description for test testGetStringEnum
     * @throws Throwable
     */
    @Test
    public void testGetStringEnum() throws Throwable {

        // Set callback and perform API call
        Days result = null;
        APICallBackCatcher<Days> response = new APICallBackCatcher<Days>();
        controller.setHttpCallBack(httpResponse);
        controller.getStringEnumAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

 
        assertEquals("Response does not match expected value", 
            Days.fromString("Monday"), result);
    }

    /**
     * Todo Add description for test testGetModelArray
     * @throws Throwable
     */
    @Test
    public void testGetModelArray() throws Throwable {

        // Set callback and perform API call
        List<Employee> result = null;
        APICallBackCatcher<List<Employee>> response = new APICallBackCatcher<List<Employee>>();
        controller.setHttpCallBack(httpResponse);
        controller.getModelArrayAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isArrayOfJsonObjectsProperSubsetOf(
                "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"name\":\"Zeeshan Ejaz\",\"age\":5147483647,\"address\":\"I-9/1\",\"uid\":\"241123\"},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\"}]}]", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testGetIntEnum
     * @throws Throwable
     */
    @Test
    public void testGetIntEnum() throws Throwable {

        // Set callback and perform API call
        SuiteCode result = null;
        APICallBackCatcher<SuiteCode> response = new APICallBackCatcher<SuiteCode>();
        controller.setHttpCallBack(httpResponse);
        controller.getIntEnumAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

 
        assertEquals("Response does not match expected value", 
            SuiteCode.fromInteger(Integer.parseInt("3")), result);
    }

    /**
     * Todo Add description for test testGetIntEnumArray
     * @throws Throwable
     */
    @Test
    public void testGetIntEnumArray() throws Throwable {

        // Set callback and perform API call
        List<SuiteCode> result = null;
        APICallBackCatcher<List<SuiteCode>> response = new APICallBackCatcher<List<SuiteCode>>();
        controller.setHttpCallBack(httpResponse);
        controller.getIntEnumArrayAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        // Deserialize expected output
        List<SuiteCode> expected = APIHelper.deserialize(
            "[1, 3, 4, 2, 3]", 
            new TypeReference<List<SuiteCode>>(){});

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Todo Add description for test testGetPrecision
     * @throws Throwable
     */
    @Test
    public void testGetPrecision() throws Throwable {

        // Set callback and perform API call
        double result = 0;
        APICallBackCatcher<Double> response = new APICallBackCatcher<Double>();
        controller.setHttpCallBack(httpResponse);
        controller.getPrecisionAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

 
        assertEquals("Response does not match expected value", 
            4.999, result, ASSERT_PRECISION);
    }

    /**
     * Todo Add description for test testGetBinary
     * @throws Throwable
     */
    @Test
    public void testGetBinary() throws Throwable {

        // Set callback and perform API call
        InputStream result = null;
        APICallBackCatcher<InputStream> response = new APICallBackCatcher<InputStream>();
        controller.setHttpCallBack(httpResponse);
        controller.getBinaryAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Binary result does not match the given file", 
            TestHelper.isSameAsFile("https://dl.dropboxusercontent.com/u/31838656/binary.png", result));
    }

    /**
     * Todo Add description for test testGetInteger
     * @throws Throwable
     */
    @Test
    public void testGetInteger() throws Throwable {

        // Set callback and perform API call
        int result = 0;
        APICallBackCatcher<Integer> response = new APICallBackCatcher<Integer>();
        controller.setHttpCallBack(httpResponse);
        controller.getIntegerAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

 
        assertEquals("Response does not match expected value", 
            4, result);
    }

    /**
     * Todo Add description for test testGetIntegerArray
     * @throws Throwable
     */
    @Test
    public void testGetIntegerArray() throws Throwable {

        // Set callback and perform API call
        List<Integer> result = null;
        APICallBackCatcher<List<Integer>> response = new APICallBackCatcher<List<Integer>>();
        controller.setHttpCallBack(httpResponse);
        controller.getIntegerArrayAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        // Deserialize expected output
        List<Integer> expected = APIHelper.deserialize(
            "[1,2,3,4,5]", 
            new TypeReference<List<Integer>>(){});

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Todo Add description for test testGetDynamic
     * @throws Throwable
     */
    @Test
    public void testGetDynamic() throws Throwable {

        // Set callback and perform API call
        DynamicResponse result = null;
        APICallBackCatcher<DynamicResponse> response = new APICallBackCatcher<DynamicResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.getDynamicAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"method\":\"GET\",\"body\":{},\"uploadCount\":0}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testGetDynamicArray
     * @throws Throwable
     */
    @Test
    public void testGetDynamicArray() throws Throwable {

        // Set callback and perform API call
        DynamicResponse result = null;
        APICallBackCatcher<DynamicResponse> response = new APICallBackCatcher<DynamicResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.getDynamicArrayAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"method\":\"GET\",\"body\":{},\"uploadCount\":0}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testGetDatetime
     * @throws Throwable
     */
    @Test
    public void testGetDatetime() throws Throwable {

        // Set callback and perform API call
        Date result = null;
        APICallBackCatcher<Date> response = new APICallBackCatcher<Date>();
        controller.setHttpCallBack(httpResponse);
        controller.getDatetimeAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

 
        assertEquals("Response does not match expected value", 
            APIHelper.parseDate("2016-03-13T12:52:32.123Z"), result);
    }

    /**
     * Todo Add description for test testGetDatetimeArray
     * @throws Throwable
     */
    @Test
    public void testGetDatetimeArray() throws Throwable {

        // Set callback and perform API call
        List<Date> result = null;
        APICallBackCatcher<List<Date>> response = new APICallBackCatcher<List<Date>>();
        controller.setHttpCallBack(httpResponse);
        controller.getDatetimeArrayAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        // Deserialize expected output
        List<Date> expected = APIHelper.deserialize(
            "[\"2016-03-13T12:52:32.123Z\",\"2016-03-13T12:52:32.123Z\",\"2016-03-13T12:52:32.123Z\"]", 
            new TypeReference<List<Date>>(){});

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Todo Add description for test testGetBoolean
     * @throws Throwable
     */
    @Test
    public void testGetBoolean() throws Throwable {

        // Set callback and perform API call
        boolean result = false;
        APICallBackCatcher<Boolean> response = new APICallBackCatcher<Boolean>();
        controller.setHttpCallBack(httpResponse);
        controller.getBooleanAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

 
        assertEquals("Response does not match expected value", 
            true, result);
    }

    /**
     * Todo Add description for test testGetBooleanArray
     * @throws Throwable
     */
    @Test
    public void testGetBooleanArray() throws Throwable {

        // Set callback and perform API call
        List<Boolean> result = null;
        APICallBackCatcher<List<Boolean>> response = new APICallBackCatcher<List<Boolean>>();
        controller.setHttpCallBack(httpResponse);
        controller.getBooleanArrayAsync(response);
        result = response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        // Deserialize expected output
        List<Boolean> expected = APIHelper.deserialize(
            "[true, false, true, true, false]", 
            new TypeReference<List<Boolean>>(){});

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Todo Add description for test testGetHeadersAllowExtra
     * @throws Throwable
     */
    @Test
    public void testGetHeadersAllowExtra() throws Throwable {

        // Set callback and perform API call
        APICallBackCatcher<Object> response = new APICallBackCatcher<Object>();
        controller.setHttpCallBack(httpResponse);
        controller.getHeadersAsync(response);
        response.getResult();

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("NauManAli", TestHelper.nullString);
        headers.put("WaseemHasAn", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

}
