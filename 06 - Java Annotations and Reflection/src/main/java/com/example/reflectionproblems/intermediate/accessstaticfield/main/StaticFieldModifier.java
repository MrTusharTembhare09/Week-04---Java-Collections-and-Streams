package com.example.reflectionproblems.intermediate.accessstaticfield.main;

import java.lang.reflect.Field;

/**
 * Utility class to modify static fields using Reflection.
 */
public class StaticFieldModifier {

    /**
     * Modifies the private static API_KEY field in the Configuration class.
     * @param newApiKey The new API key value.
     */
    public static void modifyApiKey(String newApiKey) {
        try {
            // Get the Configuration class
            Class<?> clazz = Configuration.class;

            // Get the private static field API_KEY
            Field field = clazz.getDeclaredField("API_KEY");

            // Make the field accessible
            field.setAccessible(true);

            // Modify the static field
            field.set(null, newApiKey); // Static fields belong to class, so pass `null`

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

