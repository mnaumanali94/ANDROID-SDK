/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import io.dudesolutions.report.*;
import io.dudesolutions.report.models.*;
import io.dudesolutions.report.exceptions.*;
import io.dudesolutions.report.http.client.HttpClient;
import io.dudesolutions.report.http.client.HttpContext;
import io.dudesolutions.report.http.request.HttpRequest;
import io.dudesolutions.report.http.response.HttpResponse;
import io.dudesolutions.report.http.response.HttpStringResponse;
import io.dudesolutions.report.http.client.APICallBack;
import io.dudesolutions.report.controllers.syncwrapper.APICallBackCatcher;

public class Dashboard extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static Dashboard instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Dashboard class 
     */
    public static Dashboard getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new Dashboard();
            }
        }
        return instance;
    }

    /**
     * This endpoint returns counts of work orders on time and over due for the given time frame base on scheduled date.
     * @param    GetOnTimeRatioInput    Object containing request parameters
     * @return    Returns the OnTimeRatioModel response from the API call 
     */
    public OnTimeRatioModel getOnTimeRatio(
                final GetOnTimeRatioInput input
    ) throws Throwable {
        APICallBackCatcher<OnTimeRatioModel> callback = new APICallBackCatcher<OnTimeRatioModel>();
        getOnTimeRatioAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This endpoint returns counts of work orders on time and over due for the given time frame base on scheduled date.
     * @param    GetOnTimeRatioInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getOnTimeRatioAsync(
                final GetOnTimeRatioInput input,
                final APICallBack<OnTimeRatioModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountId}/dashboard/ontimeratio");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5714832259593803637L;
            {
                    put( "accountId", input.getAccountId() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5619264061309443332L;
            {
                    put( "startDate", input.getStartDate() );
                    put( "endDate", input.getEndDate() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5266926306791952884L;
            {
                    put( "user-agent", "Dude SDK" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            OnTimeRatioModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OnTimeRatioModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}