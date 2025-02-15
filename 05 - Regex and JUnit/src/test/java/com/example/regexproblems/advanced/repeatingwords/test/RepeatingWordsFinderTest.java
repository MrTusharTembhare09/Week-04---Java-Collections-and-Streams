package com.example.regexproblems.advanced.repeatingwords.test;

import com.example.regexproblems.advanced.repeatingwords.utils.RepeatingWordsFinder;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatingWordsFinderTest {

    @Test
    void testValidRepeatingWords() {
        // Checking extraction of repeating words
        Set<String> result = RepeatingWordsFinder.findRepeatingWords("This is is a repeated repeated word test.");
        assertEquals(Set.of("is", "repeated"), result);
    }

    @Test
    void testMultipleRepeatingWords() {
        // Checking extraction with more repeating words
        Set<String> result = RepeatingWordsFinder.findRepeatingWords("Hello hello world world! This this is is fun fun.");
        assertEquals(Set.of("hello", "world", "this", "is", "fun"), result);
    }

    @Test
    void testNoRepeatingWords() {
        // Checking when no repeating words are present
        Set<String> result = RepeatingWordsFinder.findRepeatingWords("This sentence has no duplicate words.");
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullInput() {
        // Checking null input case
        Set<String> result = RepeatingWordsFinder.findRepeatingWords(null);
        assertTrue(result.isEmpty());
    }
}

