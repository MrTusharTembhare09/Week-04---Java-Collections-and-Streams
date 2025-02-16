package com.example.annotationsproblems.customannotations.intemediatelevel.logexecutiontime;

import java.lang.reflect.Method;

// Creating a processor to measure execution time of annotated methods
public class LogExecutionTimeProcessor {

    // Processing methods with @LogExecutionTime
    public static void process(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();

                // Invoking the annotated method
                method.invoke(obj);

                long endTime = System.nanoTime();
                long executionTime = endTime - startTime;

                // Printing execution time
                System.out.println("Execution time of " + method.getName() + ": " + executionTime + " nanoseconds");
            }
        }
    }
}

