package com.example.regexproblems.advanced.languageextractor.test;

import com.example.regexproblems.advanced.languageextractor.utils.LanguageExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LanguageExtractorTest {

    @Test
    void testValidExtraction() {
        // Checking extraction from valid text
        List<String> result = LanguageExtractor.extractLanguages("I love Java, Python, and JavaScript.");
        assertEquals(List.of("Java", "Python", "JavaScript"), result);
    }

    @Test
    void testDifferentLanguages() {
        // Checking extraction with more languages
        List<String> result = LanguageExtractor.extractLanguages("Swift, C++, and Kotlin are powerful!");
        assertEquals(List.of("Swift", "C++", "Kotlin"), result);
    }

    @Test
    void testNoLanguages() {
        // Checking when no programming language is present
        List<String> result = LanguageExtractor.extractLanguages("I love cooking and traveling.");
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullInput() {
        // Checking null input case
        List<String> result = LanguageExtractor.extractLanguages(null);
        assertTrue(result.isEmpty());
    }
}

