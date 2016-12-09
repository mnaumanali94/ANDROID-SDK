/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

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

public class Export extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static Export instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Export class 
     */
    public static Export getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new Export();
            }
        }
        return instance;
    }

    /**
     * This collection allows for workorder data to be returned as an excel document.
     * @param    GetWorkOrdersInput    Object containing request parameters
     * @return    Returns the HttpResponse response from the API call 
     */
    public HttpResponse getWorkOrders(
                final GetWorkOrdersInput input
    ) throws Throwable {
        APICallBackCatcher<HttpResponse> callback = new APICallBackCatcher<HttpResponse>();
        getWorkOrdersAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This collection allows for workorder data to be returned as an excel document.
     * @param    GetWorkOrdersInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getWorkOrdersAsync(
                final GetWorkOrdersInput input,
                final APICallBack<HttpResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountId}/export/workorders");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5644583084673557365L;
            {
                    put( "accountId", input.getAccountId() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5248585406157679941L;
            {
                    put( "orderby", input.getOrderby() );
                    put( "q", input.getQ() );
                    put( "actiontaken", input.getActiontaken() );
                    put( "assignees", input.getAssignees() );
                    put( "completiondatefrom", input.getCompletiondatefrom() );
                    put( "completiondateto", input.getCompletiondateto() );
                    put( "createdby", input.getCreatedby() );
                    put( "displayid", input.getDisplayid() );
                    put( "priority", (null != input.getPriority()) ? input.getPriority().value() : null );
                    put( "purpose", input.getPurpose() );
                    put( "requestdatefrom", input.getRequestdatefrom() );
                    put( "requestdateto", input.getRequestdateto() );
                    put( "requestedby", input.getRequestedby() );
                    put( "status", (null != input.getStatus()) ? input.getStatus().value() : null );
                    put( "workcategory", input.getWorkcategory() );
                    put( "businessasset", input.getBusinessasset() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5624676535937548033L;
            {
                    put( "user-agent", "Dude SDK" );
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
                            HttpResponse _result = _response;
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
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