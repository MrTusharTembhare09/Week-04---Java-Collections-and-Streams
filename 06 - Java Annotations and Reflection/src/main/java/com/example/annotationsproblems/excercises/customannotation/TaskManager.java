package com.example.annotationsproblems.excercises.customannotation;

// Creating a class to demonstrate the custom annotation usage
public class TaskManager {

    // Applying @TaskInfo annotation to a method
    @TaskInfo(priority = "High", assignedTo = "John Doe")
    public void completeTask() {
        System.out.println("Completing an important task...");
    }
}

