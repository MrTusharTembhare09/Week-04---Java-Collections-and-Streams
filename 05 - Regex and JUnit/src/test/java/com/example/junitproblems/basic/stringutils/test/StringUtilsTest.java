package com.example.junitproblems.basic.stringutils.test;

// Creating JUnit test class for StringUtils
import com.example.junitproblems.basic.stringutils.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // Creating an instance of StringUtils for testing
    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("cba", stringUtils.reverse("abc"));
        assertEquals("", stringUtils.reverse(""));
        assertEquals("madam", stringUtils.reverse("madam"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertTrue(stringUtils.isPalindrome("Racecar"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("World"));
    }

    @Test
    void testReverseWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stringUtils.reverse(null));
        assertEquals("Input cannot be null", exception.getMessage());
    }

    @Test
    void testIsPalindromeWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stringUtils.isPalindrome(null));
        assertEquals("Input cannot be null", exception.getMessage());
    }

    @Test
    void testToUpperCaseWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stringUtils.toUpperCase(null));
        assertEquals("Input cannot be null", exception.getMessage());
    }
}
