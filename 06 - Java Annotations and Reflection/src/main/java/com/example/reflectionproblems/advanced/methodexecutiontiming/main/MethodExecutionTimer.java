package com.example.reflectionproblems.advanced.methodexecutiontiming.main;

import java.lang.reflect.Method;

/**
 * Class to measure execution time of methods using Reflection.
 */
public class MethodExecutionTimer {

    /**
     * Measures execution time of a given method in an object.
     *
     * @param object      The object whose method should be executed.
     * @param methodName  The name of the method to be executed.
     */
    public static void measureExecutionTime(Object object, String methodName) {
        try {
            // Get the method by name
            Method method = object.getClass().getMethod(methodName);

            // Measure execution time
            long startTime = System.nanoTime();
            method.invoke(object); // Execute the method
            long endTime = System.nanoTime();

            // Calculate duration in milliseconds
            long duration = (endTime - startTime) / 1_000_000;
            System.out.println("Execution time of " + methodName + ": " + duration + " ms");

        } catch (Exception e) {
            System.out.println("Error executing method: " + methodName);
            e.printStackTrace();
        }
    }
}

