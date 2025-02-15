package com.example.regexproblems.basic.stringmodifier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for StringModifier
public class StringModifierTest {
    @Test
    void testReplaceMultipleSpaces() {
        // Testing normal cases
        assertEquals("This is an example with multiple spaces.",
                StringModifier.replaceMultipleSpaces("This  is   an   example   with   multiple   spaces."));

        assertEquals("Hello World!", StringModifier.replaceMultipleSpaces("Hello   World!"));

        // Testing edge cases
        assertEquals(" Leading and trailing spaces ",
                StringModifier.replaceMultipleSpaces("   Leading  and   trailing  spaces    "));

        assertEquals("OnlyOneWord", StringModifier.replaceMultipleSpaces("OnlyOneWord"));

        // Testing empty and null cases
        assertEquals("", StringModifier.replaceMultipleSpaces(""));
        assertNull(StringModifier.replaceMultipleSpaces(null));
    }
}

