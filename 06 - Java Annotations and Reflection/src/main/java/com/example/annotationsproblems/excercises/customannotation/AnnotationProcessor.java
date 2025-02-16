package com.example.annotationsproblems.excercises.customannotation;

import com.example.annotationsproblems.excercises.customannotation.TaskInfo;
import com.example.annotationsproblems.excercises.customannotation.TaskManager;

import java.lang.reflect.Method;

// Creating a class to retrieve annotation details using Reflection API
public class AnnotationProcessor {

    // Retrieving annotation details using Reflection
    public static void processAnnotations() {
        try {
            // Getting the TaskManager class
            Class<?> clazz = TaskManager.class;

            // Getting the completeTask() method
            Method method = clazz.getMethod("completeTask");

            // Checking if the method has @TaskInfo annotation
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Retrieving the annotation
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                // Printing annotation details
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            } else {
                System.out.println("No @TaskInfo annotation found.");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

