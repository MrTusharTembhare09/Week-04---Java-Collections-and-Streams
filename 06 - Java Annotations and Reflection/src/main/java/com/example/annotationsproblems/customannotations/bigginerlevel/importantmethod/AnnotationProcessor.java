package com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod;

import com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod.CriticalOperations;
import com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod.ImportantMethod;

import java.lang.reflect.Method;

// Creating a class to retrieve and display annotated methods using Reflection API
public class AnnotationProcessor {

    // Retrieving and printing all @ImportantMethod annotations
    public static void processAnnotations() {
        try {
            // Getting the CriticalOperations class
            Class<?> clazz = CriticalOperations.class;

            System.out.println("Important Methods in CriticalOperations class:");

            // Iterating through all declared methods
            for (Method method : clazz.getDeclaredMethods()) {
                // Checking if method has @ImportantMethod annotation
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    // Retrieving the annotation
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("- " + method.getName() + " (Level: " + annotation.level() + ")");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

