package com.example.regexproblems.basic.wordcensor;

import com.example.regexproblems.basic.censorwords.WordCensor;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for WordCensor
public class WordCensorTest {
    @Test
    void testCensorBadWords() {
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Testing normal cases
        assertEquals("This is a **** bad example with some **** words.",
                WordCensor.censorBadWords("This is a damn bad example with some stupid words.", badWords));

        assertEquals("No bad words here!",
                WordCensor.censorBadWords("No bad words here!", badWords));

        assertEquals("****, that was a **** move!",
                WordCensor.censorBadWords("Damn, that was a stupid move!", badWords));

        // Testing case insensitivity
        assertEquals("****, that was a **** move!",
                WordCensor.censorBadWords("DAMN, that was a Stupid move!", badWords));

        // Testing empty and null cases
        assertEquals("", WordCensor.censorBadWords("", badWords));
        assertNull(WordCensor.censorBadWords(null, badWords));
    }
}

