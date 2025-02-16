package com.example.annotationsproblems.customannotations.advanced.jsonserialization;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Creating JsonSerializer class to convert objects to JSON using reflection
public class JsonSerializer {

    public static String serializeToJson(Object object) {
        try {
            Map<String, String> jsonElements = new HashMap<>();
            Class<?> clazz = object.getClass();

            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonField.class)) {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    jsonElements.put(annotation.name(), field.get(object).toString());
                }
            }

            // Converting the map to JSON format
            StringBuilder jsonBuilder = new StringBuilder("{");
            for (Map.Entry<String, String> entry : jsonElements.entrySet()) {
                jsonBuilder.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
            }
            if (!jsonElements.isEmpty()) {
                jsonBuilder.setLength(jsonBuilder.length() - 2); // Remove last comma
            }
            jsonBuilder.append("}");

            return jsonBuilder.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error during JSON serialization", e);
        }
    }

    public static void main(String[] args) {
        User user = new User("Tushar", 23, "tushar@example.com");
        String jsonString = JsonSerializer.serializeToJson(user);
        System.out.println("Serialized JSON: " + jsonString);
    }
}

