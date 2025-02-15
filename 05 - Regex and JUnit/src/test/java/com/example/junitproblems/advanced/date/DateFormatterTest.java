package com.example.junitproblems.advanced.date;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for DateFormatter
public class DateFormatterTest {
    @Test
    void testValidDateFormat() {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"));
        assertEquals("01-01-2024", DateFormatter.formatDate("2024-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("15/02/2025");
        });
        assertEquals("Invalid date format. Use yyyy-MM-dd.", exception.getMessage());
    }
}
