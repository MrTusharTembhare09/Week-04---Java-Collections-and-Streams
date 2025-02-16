package com.example.reflectionproblems.advanced.methodexecutiontiming.main;

/**
 * Testing Method Execution Timing via Reflection.
 */
public class ExecutionTimingDemo {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass();

        // Measure execution time of fastMethod
        MethodExecutionTimer.measureExecutionTime(sample, "fastMethod");

        // Measure execution time of slowMethod
        MethodExecutionTimer.measureExecutionTime(sample, "slowMethod");
    }
}

