/*
 * DudeReportApiLib
 *
 * This file was automatically generated for Dude Solutions, Inc. by APIMATIC v2.0 ( https://apimatic.io ) on 12/09/2016
 */
package io.dudesolutions.report.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Priority {
    LOW, //TODO: Write general description for this element
    MEDIUM, //TODO: Write general description for this element
    HIGH, //TODO: Write general description for this element
    EMERGENCY; //TODO: Write general description for this element

    private static TreeMap<String, Priority> valueMap = new TreeMap<String, Priority>();
    private String value;

    static {
        LOW.value = "Low";
        MEDIUM.value = "Medium";
        HIGH.value = "High";
        EMERGENCY.value = "Emergency";

        valueMap.put("Low", LOW);
        valueMap.put("Medium", MEDIUM);
        valueMap.put("High", HIGH);
        valueMap.put("Emergency", EMERGENCY);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Priority fromString(String toConvert) {
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
     * Convert list of Priority values to list of string values
     * @param toConvert The list of Priority values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Priority> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Priority enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 