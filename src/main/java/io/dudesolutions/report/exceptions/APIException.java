/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.exceptions;

import java.io.IOException;
import java.io.InputStream;
import io.dudesolutions.report.APIHelper;
import io.dudesolutions.report.http.client.HttpContext;
import io.dudesolutions.report.http.response.HttpStringResponse;

public class APIException extends Exception {
    //UID for serialization
    private static final long serialVersionUID = 6424174253911720338L;

    //private fields
    private int responseCode;

    //private fields
    private HttpContext httpContext;

    /**
    * The HTTP response code from the API request
    */
    public int getResponseCode() {
        return (httpContext != null) ? httpContext.getResponse().getStatusCode() : -1;
    }

    /**
     * The HTTP response body from the API request
     */
    public HttpContext getHttpContext() {
        return httpContext;
    }

    /**
     * Initialization constructor
     * @param reason The reason for throwing exception
     */
    public APIException(String reason) {
        super(reason);
    }

    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public APIException(String reason, HttpContext context) {
        super(reason);
        this.httpContext = context;

        //if a derived exception class is used, then perform deserialization of response body
        if (getClass().equals(APIException.class)
            || (context == null) || (context.getResponse() == null)
            || (context.getResponse().getRawBody() == null))
            return;

        try {            
            String response_body = ((HttpStringResponse)context.getResponse()).getBody();
            APIHelper.populate(response_body, this);
        } catch (IOException ioException) { }
    }
}