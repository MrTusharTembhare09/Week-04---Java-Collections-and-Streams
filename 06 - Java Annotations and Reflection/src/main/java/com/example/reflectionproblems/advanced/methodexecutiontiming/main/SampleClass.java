package com.example.reflectionproblems.advanced.methodexecutiontiming.main;

/**
 * Sample class with methods to measure execution time.
 */
public class SampleClass {

    /**
     * Method that simulates a fast operation.
     */
    public void fastMethod() {
        System.out.println("Executing fastMethod...");
    }

    /**
     * Method that simulates a slow operation.
     */
    public void slowMethod() {
        System.out.println("Executing slowMethod...");
        try {
            Thread.sleep(500); // Simulates delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

