/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Status {
    NEWREQUEST, //TODO: Write general description for this element
    WORKINPROGRESS, //TODO: Write general description for this element
    COMPLETED, //TODO: Write general description for this element
    VOID; //TODO: Write general description for this element

    private static TreeMap<String, Status> valueMap = new TreeMap<String, Status>();
    private String value;

    static {
        NEWREQUEST.value = "NewRequest";
        WORKINPROGRESS.value = "WorkInProgress";
        COMPLETED.value = "Completed";
        VOID.value = "Void";

        valueMap.put("NewRequest", NEWREQUEST);
        valueMap.put("WorkInProgress", WORKINPROGRESS);
        valueMap.put("Completed", COMPLETED);
        valueMap.put("Void", VOID);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Status values to list of string values
     * @param toConvert The list of Status values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Status> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Status enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 