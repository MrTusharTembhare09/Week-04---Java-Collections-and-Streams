package com.example.reflectionproblems.advanced.methodexecutiontiming.test;

import com.example.reflectionproblems.advanced.methodexecutiontiming.main.MethodExecutionTimer;
import com.example.reflectionproblems.advanced.methodexecutiontiming.main.SampleClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Unit test for Method Execution Timing.
 */
class MethodExecutionTimerTest {

    @Test
    void testExecutionTimeMeasurement() {
        SampleClass sample = new SampleClass();

        // Ensure method execution does not throw exceptions
        assertDoesNotThrow(() -> MethodExecutionTimer.measureExecutionTime(sample, "fastMethod"));
        assertDoesNotThrow(() -> MethodExecutionTimer.measureExecutionTime(sample, "slowMethod"));
    }
}

