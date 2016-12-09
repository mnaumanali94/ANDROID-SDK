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

public class Reports extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static Reports instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Reports class 
     */
    public static Reports getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new Reports();
            }
        }
        return instance;
    }

    /**
     * This collection allows for workorder data to be organized by purposes and return relevant counts.
     * @param    GetPurposeSummaryCollectionInput    Object containing request parameters
     * @return    Returns the GetPurposeSummaryCollectionResponseModel response from the API call 
     */
    public GetPurposeSummaryCollectionResponseModel getPurposeSummaryCollection(
                final GetPurposeSummaryCollectionInput input
    ) throws Throwable {
        APICallBackCatcher<GetPurposeSummaryCollectionResponseModel> callback = new APICallBackCatcher<GetPurposeSummaryCollectionResponseModel>();
        getPurposeSummaryCollectionAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This collection allows for workorder data to be organized by purposes and return relevant counts.
     * @param    GetPurposeSummaryCollectionInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getPurposeSummaryCollectionAsync(
                final GetPurposeSummaryCollectionInput input,
                final APICallBack<GetPurposeSummaryCollectionResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountId}/reports/purposes/summary");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5690670665780244679L;
            {
                    put( "accountId", input.getAccountId() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5076856039952344612L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "orderby", input.getOrderby() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5177031673910313122L;
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
                            GetPurposeSummaryCollectionResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetPurposeSummaryCollectionResponseModel>(){});

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

    /**
     * This collection allows for workorder data to be organized by overall failures and return relevant counts.
     * @param    GetFailureSummaryCollectionInput    Object containing request parameters
     * @return    Returns the GetFailureSummaryCollectionResponseModel response from the API call 
     */
    public GetFailureSummaryCollectionResponseModel getFailureSummaryCollection(
                final GetFailureSummaryCollectionInput input
    ) throws Throwable {
        APICallBackCatcher<GetFailureSummaryCollectionResponseModel> callback = new APICallBackCatcher<GetFailureSummaryCollectionResponseModel>();
        getFailureSummaryCollectionAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This collection allows for workorder data to be organized by overall failures and return relevant counts.
     * @param    GetFailureSummaryCollectionInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getFailureSummaryCollectionAsync(
                final GetFailureSummaryCollectionInput input,
                final APICallBack<GetFailureSummaryCollectionResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountId}/reports/failures/summary");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5608663035626731829L;
            {
                    put( "accountId", input.getAccountId() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5489338448517922371L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "orderby", input.getOrderby() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4778290064653470783L;
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
                            GetFailureSummaryCollectionResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetFailureSummaryCollectionResponseModel>(){});

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

    /**
     * This collection allows for workorder data to be organized by assignee and return relevant counts.
     * @param    GetAssigneeSummaryCollectionInput    Object containing request parameters
     * @return    Returns the GetAssigneeSummaryCollectionResponseModel response from the API call 
     */
    public GetAssigneeSummaryCollectionResponseModel getAssigneeSummaryCollection(
                final GetAssigneeSummaryCollectionInput input
    ) throws Throwable {
        APICallBackCatcher<GetAssigneeSummaryCollectionResponseModel> callback = new APICallBackCatcher<GetAssigneeSummaryCollectionResponseModel>();
        getAssigneeSummaryCollectionAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This collection allows for workorder data to be organized by assignee and return relevant counts.
     * @param    GetAssigneeSummaryCollectionInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getAssigneeSummaryCollectionAsync(
                final GetAssigneeSummaryCollectionInput input,
                final APICallBack<GetAssigneeSummaryCollectionResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountId}/reports/assignees/summary");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5418387515742081551L;
            {
                    put( "accountId", input.getAccountId() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4881302569026366626L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "orderby", input.getOrderby() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5402138483225989169L;
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
                            GetAssigneeSummaryCollectionResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetAssigneeSummaryCollectionResponseModel>(){});

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

    /**
     * This collection allows for workorder data to be organized by asset and return relevant counts.
     * @param    GetAssetSummaryCollectionInput    Object containing request parameters
     * @return    Returns the GetAssetSummaryCollectionResponseModel response from the API call 
     */
    public GetAssetSummaryCollectionResponseModel getAssetSummaryCollection(
                final GetAssetSummaryCollectionInput input
    ) throws Throwable {
        APICallBackCatcher<GetAssetSummaryCollectionResponseModel> callback = new APICallBackCatcher<GetAssetSummaryCollectionResponseModel>();
        getAssetSummaryCollectionAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This collection allows for workorder data to be organized by asset and return relevant counts.
     * @param    GetAssetSummaryCollectionInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getAssetSummaryCollectionAsync(
                final GetAssetSummaryCollectionInput input,
                final APICallBack<GetAssetSummaryCollectionResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountId}/reports/assets/summary");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5318774418251613091L;
            {
                    put( "accountId", input.getAccountId() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4824292116269730658L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "orderby", input.getOrderby() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4993568170845465863L;
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
                            GetAssetSummaryCollectionResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetAssetSummaryCollectionResponseModel>(){});

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

    /**
     * This collection allows for workorder data to be organized by asset failure reasons and return relevant counts.
     * @param    GetAssetFailureReasonCollectionInput    Object containing request parameters
     * @return    Returns the GetAssetFailureReasonCollectionResponseModel response from the API call 
     */
    public GetAssetFailureReasonCollectionResponseModel getAssetFailureReasonCollection(
                final GetAssetFailureReasonCollectionInput input
    ) throws Throwable {
        APICallBackCatcher<GetAssetFailureReasonCollectionResponseModel> callback = new APICallBackCatcher<GetAssetFailureReasonCollectionResponseModel>();
        getAssetFailureReasonCollectionAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This collection allows for workorder data to be organized by asset failure reasons and return relevant counts.
     * @param    GetAssetFailureReasonCollectionInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getAssetFailureReasonCollectionAsync(
                final GetAssetFailureReasonCollectionInput input,
                final APICallBack<GetAssetFailureReasonCollectionResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountId}/reports/assets/{assetId}/failures");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5435372844340139710L;
            {
                    put( "accountId", input.getAccountId() );
                    put( "assetId", input.getAssetId() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5384898970332054740L;
            {
                    put( "page", input.getPage() );
                    put( "pagesize", input.getPagesize() );
                    put( "orderby", input.getOrderby() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5589481316059161187L;
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
                            GetAssetFailureReasonCollectionResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetAssetFailureReasonCollectionResponseModel>(){});

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