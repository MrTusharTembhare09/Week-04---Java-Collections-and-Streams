package com.example.junitproblems.basic.parameterized.test;

import com.example.junitproblems.basic.parameterized.EvenNumberChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for EvenNumberChecker
public class EvenNumberCheckerTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        if (number % 2 == 0) {
            assertTrue(EvenNumberChecker.isEven(number), number + " should be even");
        } else {
            assertFalse(EvenNumberChecker.isEven(number), number + " should be odd");
        }
    }
}

