package com.example.regexproblems.basic.wordextractor;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for CapitalizedWordExtractor
public class CapitalizedWordExtractorTest {

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertEquals(8, words.size());
        assertTrue(words.contains("Eiffel"));
        assertTrue(words.contains("Tower"));
        assertTrue(words.contains("Paris"));
        assertTrue(words.contains("Statue"));
        assertTrue(words.contains("Liberty"));
        assertTrue(words.contains("New"));
        assertTrue(words.contains("York"));
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this is a sentence with no capitalized words.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);
        assertTrue(words.isEmpty());
    }

    @Test
    void testSingleCapitalizedWord() {
        String text = "Hello world!";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertEquals(1, words.size());
        assertTrue(words.contains("Hello"));
    }
}

