package com.example.reflectionproblems.advanced.customobjectmapper.main;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Creating a utility class to map properties to object fields using Reflection.
 */
public class ObjectMapper {

    /**
     * Converting a map of properties to an object of the given class.
     * @param clazz The class type of the object.
     * @param properties A map containing field names and their values.
     * @return The instantiated and populated object.
     * @throws ReflectiveOperationException If any reflection error occurs.
     */
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws ReflectiveOperationException {
        // Creating a new instance of the class
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Iterating over the map and setting fields dynamically
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object value = entry.getValue();

            try {
                // Getting the field from the class
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // Making private fields accessible
                field.set(obj, value); // Setting the value to the field
            } catch (NoSuchFieldException e) {
                System.out.println("Skipping unknown field: " + fieldName);
            }
        }
        return obj;
    }
}

