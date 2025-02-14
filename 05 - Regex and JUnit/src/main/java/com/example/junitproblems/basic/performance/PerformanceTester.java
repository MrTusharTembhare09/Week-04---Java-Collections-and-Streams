package com.example.junitproblems.basic.performance;

// Creating PerformanceTester class to test execution time
public class PerformanceTester {
    // Simulating a long-running task
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Sleeping for 3 seconds
        return "Task Completed";
    }
}
