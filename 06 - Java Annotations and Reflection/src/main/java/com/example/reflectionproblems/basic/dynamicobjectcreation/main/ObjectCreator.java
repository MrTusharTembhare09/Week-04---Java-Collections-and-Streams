package com.example.reflectionproblems.basic.dynamicobjectcreation.main;

import java.lang.reflect.Constructor;

/**
 * Utility class to create objects dynamically using Reflection.
 */
public class ObjectCreator {

    /**
     * Creates an instance of a class dynamically using Reflection.
     * @param className The fully qualified class name.
     * @return Object instance of the specified class.
     */
    public static Object createInstance(String className) {
        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName(className);

            // Get the default constructor and create an instance
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error creating object dynamically: " + e.getMessage());
        }
    }
}

