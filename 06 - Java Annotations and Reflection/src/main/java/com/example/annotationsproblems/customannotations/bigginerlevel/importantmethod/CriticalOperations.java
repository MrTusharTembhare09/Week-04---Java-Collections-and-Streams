package com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod;

// Creating a class to demonstrate the use of @ImportantMethod annotation
public class CriticalOperations {

    // Marking an important method with default level
    @ImportantMethod
    public void processTransaction() {
        System.out.println("Processing a critical transaction...");
    }

    // Marking another important method with a custom level
    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Generating a financial report...");
    }

    // A normal method without annotation
    public void logActivity() {
        System.out.println("Logging user activity...");
    }
}
