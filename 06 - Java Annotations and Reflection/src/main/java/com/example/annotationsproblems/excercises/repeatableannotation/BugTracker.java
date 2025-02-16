package com.example.annotationsproblems.excercises.repeatableannotation;

// Creating a class to demonstrate the repeatable annotation
public class BugTracker {

    // Applying @BugReport multiple times on a method
    @BugReport(description = "NullPointerException when input is null")
    @BugReport(description = "ArrayIndexOutOfBoundsException when index is too high")
    public void buggyMethod() {
        System.out.println("Executing buggy method...");
    }
}

