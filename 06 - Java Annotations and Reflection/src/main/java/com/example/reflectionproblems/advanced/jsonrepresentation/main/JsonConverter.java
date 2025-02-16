package com.example.reflectionproblems.advanced.jsonrepresentation.main;

import java.lang.reflect.Field;

/**
 * Creating a utility class to convert an object into a JSON-like string using Reflection.
 */
public class JsonConverter {

    /**
     * Converting an object to a JSON-like string representation.
     * @param obj The object to convert.
     * @return JSON representation as a String.
     */
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder("{");

        // Getting all declared fields from the object's class
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true); // Making private fields accessible
            try {
                String name = fields[i].getName();
                Object value = fields[i].get(obj);

                json.append("\"").append(name).append("\": ");

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else if (value instanceof Number || value instanceof Boolean) {
                    json.append(value);
                } else {
                    json.append(toJson(value)); // Handling nested objects
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access field: " + fields[i].getName(), e);
            }
        }

        json.append("}");
        return json.toString();
    }
}

