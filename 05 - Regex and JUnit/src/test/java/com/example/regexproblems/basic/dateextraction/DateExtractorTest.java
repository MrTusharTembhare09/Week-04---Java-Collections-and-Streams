package com.example.regexproblems.basic.dateextraction;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for DateExtractor
public class DateExtractorTest {

    @Test
    void testExtractValidDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = DateExtractor.extractDates(text);

        assertEquals(3, dates.size());
        assertTrue(dates.contains("12/05/2023"));
        assertTrue(dates.contains("15/08/2024"));
        assertTrue(dates.contains("29/02/2020"));
    }

    @Test
    void testNoValidDates() {
        String text = "No dates are present here.";
        List<String> dates = DateExtractor.extractDates(text);
        assertTrue(dates.isEmpty());
    }

    @Test
    void testInvalidDatesNotExtracted() {
        String text = "These are not valid dates: 32/01/2024, 00/12/2023, 15-08-2024.";
        List<String> dates = DateExtractor.extractDates(text);

        assertTrue(dates.isEmpty()); // Invalid formats should not be extracted
    }
}

