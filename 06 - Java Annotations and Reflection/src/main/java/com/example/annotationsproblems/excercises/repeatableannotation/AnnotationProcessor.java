package com.example.annotationsproblems.excercises.repeatableannotation.utils;

import com.example.annotationsproblems.excercises.repeatableannotation.BugReport;
import com.example.annotationsproblems.excercises.repeatableannotation.BugReports;
import com.example.annotationsproblems.excercises.repeatableannotation.BugTracker;

import java.lang.reflect.Method;

// Creating a class to retrieve annotation details using Reflection API
public class AnnotationProcessor {

    // Retrieving and printing all @BugReport annotations
    public static void processAnnotations() {
        try {
            // Getting the BugTracker class
            Class<?> clazz = BugTracker.class;

            // Getting the buggyMethod()
            Method method = clazz.getMethod("buggyMethod");

            // Checking if the method has multiple @BugReport annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                // Retrieving the @BugReports annotation
                BugReports bugReports = method.getAnnotation(BugReports.class);

                System.out.println("Bug Reports for buggyMethod:");
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("- " + bugReport.description());
                }
            } else {
                System.out.println("No @BugReport annotations found.");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

