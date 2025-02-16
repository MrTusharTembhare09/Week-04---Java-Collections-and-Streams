package com.example.annotationsproblems.customannotations.bigginerlevel.todo;

// Creating a class to demonstrate the use of @Todo annotation
public class TaskManager {

    // Marking a method with @Todo for a pending feature
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void authenticateUser() {
        System.out.println("Authenticating user... (Pending)");
    }

    // Another pending method with @Todo annotation
    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Optimizing database... (Pending)");
    }

    // A normal method without annotation
    public void logTaskCompletion() {
        System.out.println("Logging task completion...");
    }
}

