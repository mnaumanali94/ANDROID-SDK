/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 08/01/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EchoResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4620898742347648558L;
    private LinkedHashMap<String, Object> body;
    private LinkedHashMap<String, String> headers;
    private String method;
    private String path;
    private LinkedHashMap<String, String> query;
    private int uploadCount;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public LinkedHashMap<String, Object> getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (LinkedHashMap<String, Object> value) { 
        this.body = value;
        notifyObservers(this.body);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("headers")
    public LinkedHashMap<String, String> getHeaders ( ) { 
        return this.headers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("headers")
    public void setHeaders (LinkedHashMap<String, String> value) { 
        this.headers = value;
        notifyObservers(this.headers);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("method")
    public void setMethod (String value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * relativePath
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * relativePath
     */
    @JsonSetter("path")
    public void setPath (String value) { 
        this.path = value;
        notifyObservers(this.path);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("query")
    public LinkedHashMap<String, String> getQuery ( ) { 
        return this.query;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("query")
    public void setQuery (LinkedHashMap<String, String> value) { 
        this.query = value;
        notifyObservers(this.query);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("uploadCount")
    public int getUploadCount ( ) { 
        return this.uploadCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("uploadCount")
    public void setUploadCount (int value) { 
        this.uploadCount = value;
        notifyObservers(this.uploadCount);
    }
 
}
 