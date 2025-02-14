package com.example.junitproblems.basic.performance.test;

import com.example.junitproblems.basic.performance.PerformanceTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

// Creating JUnit test class for PerformanceTester
public class PerformanceTesterTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Failing test if it exceeds 2 seconds
    void testLongRunningTask() throws InterruptedException {
        assertEquals("Task Completed", PerformanceTester.longRunningTask());
    }
}
