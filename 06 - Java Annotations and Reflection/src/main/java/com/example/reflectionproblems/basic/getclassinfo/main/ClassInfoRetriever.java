package com.example.reflectionproblems.basic.getclassinfo.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Utility class to retrieve class details using Reflection.
 */
public class ClassInfoRetriever {

    /**
     * Prints the details (fields, methods, constructors) of a given class.
     *
     * @param className Fully qualified class name
     */
    public static void printClassInfo(String className) {
        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName(className);

            // Print class name
            System.out.println("Class Name: " + clazz.getName());

            // Print fields
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("\nFields:");
            Arrays.stream(fields).forEach(field ->
                    System.out.println(field.getType().getSimpleName() + " " + field.getName()));

            // Print methods
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("\nMethods:");
            Arrays.stream(methods).forEach(method ->
                    System.out.println(method.getReturnType().getSimpleName() + " " + method.getName() + "()"));

            // Print constructors
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("\nConstructors:");
            Arrays.stream(constructors).forEach(constructor ->
                    System.out.println(constructor.getName() + "(" + Arrays.toString(constructor.getParameterTypes()) + ")"));

        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found - " + className);
        }
    }
}

