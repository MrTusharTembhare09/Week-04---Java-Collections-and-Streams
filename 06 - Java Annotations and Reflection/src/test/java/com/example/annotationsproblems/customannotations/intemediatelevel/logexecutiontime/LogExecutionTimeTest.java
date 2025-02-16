package com.example.annotationsproblems.customannotations.intemediatelevel.logexecutiontime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a JUnit test to verify execution time logging
public class LogExecutionTimeTest {

    @Test
    void testExecutionTimeLogging() throws Exception {
        ExecutionTester tester = new ExecutionTester();
        long startTime = System.nanoTime();

        // Processing the execution time logging
        LogExecutionTimeProcessor.process(tester);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        // Asserting that execution time is non-negative
        assertTrue(executionTime > 0, "Execution time should be greater than zero");
    }
}

