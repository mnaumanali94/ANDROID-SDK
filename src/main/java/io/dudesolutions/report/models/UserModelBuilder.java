/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.*;

public class UserModelBuilder {
    //the instance to build
    private UserModel userModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserModelBuilder() {
        userModel = new UserModel();
    }

    /**
     * The ID of the user.
     */
    public UserModelBuilder id(int id) {
        userModel.setId(id);
        return this;
    }

    /**
     * The first name of the user.
     */
    public UserModelBuilder firstName(String firstName) {
        userModel.setFirstName(firstName);
        return this;
    }

    /**
     * The last name of the user.
     */
    public UserModelBuilder lastName(String lastName) {
        userModel.setLastName(lastName);
        return this;
    }

    /**
     * The email address of the user.
     */
    public UserModelBuilder email(String email) {
        userModel.setEmail(email);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserModel build() {
        return userModel;
    }
}