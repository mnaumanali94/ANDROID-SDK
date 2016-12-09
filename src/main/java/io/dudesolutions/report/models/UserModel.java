/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4964960170691474941L;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    /** GETTER
     * The ID of the user.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The ID of the user.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * The first name of the user.
     */
    @JsonGetter("firstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * The first name of the user.
     */
    @JsonSetter("firstName")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * The last name of the user.
     */
    @JsonGetter("lastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * The last name of the user.
     */
    @JsonSetter("lastName")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * The email address of the user.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * The email address of the user.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
}
 