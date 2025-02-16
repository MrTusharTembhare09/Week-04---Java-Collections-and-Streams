package com.example.annotationsproblems.customannotations.bigginerlevel.todo;

import com.example.annotationsproblems.customannotations.bigginerlevel.todo.TaskManager;
import com.example.annotationsproblems.customannotations.bigginerlevel.todo.Todo;

import java.lang.reflect.Method;

// Creating a class to retrieve and display @Todo annotations using Reflection API
public class TodoProcessor {

    // Retrieving and printing all @Todo annotations
    public static void processTodos() {
        try {
            // Getting the TaskManager class
            Class<?> clazz = TaskManager.class;

            System.out.println("Pending Tasks in TaskManager class:");

            // Iterating through all declared methods
            for (Method method : clazz.getDeclaredMethods()) {
                // Checking if method has @Todo annotation
                if (method.isAnnotationPresent(Todo.class)) {
                    // Retrieving the annotation
                    Todo annotation = method.getAnnotation(Todo.class);
                    System.out.println("- Task: " + annotation.task());
                    System.out.println("  Assigned To: " + annotation.assignedTo());
                    System.out.println("  Priority: " + annotation.priority());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

