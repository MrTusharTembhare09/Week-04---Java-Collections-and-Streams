package com.example.reflectionproblems.intermediate.dynamicmethodinvocation.test;

import com.example.reflectionproblems.intermediate.dynamicmethodinvocation.main.MethodInvoker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for MethodInvoker.
 */
class MethodInvokerTest {

    @Test
    void testAddition() {
        Object result = MethodInvoker.invokeMethod("add", new Class<?>[]{int.class, int.class}, 5, 3);
        assertEquals(8, result);
    }

    @Test
    void testSubtraction() {
        Object result = MethodInvoker.invokeMethod("subtract", new Class<?>[]{int.class, int.class}, 10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiplication() {
        Object result = MethodInvoker.invokeMethod("multiply", new Class<?>[]{int.class, int.class}, 6, 7);
        assertEquals(42, result);
    }
}

