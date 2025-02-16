package com.example.reflectionproblems.basic.invokeprivatemethod.test;

import com.example.reflectionproblems.basic.invokeprivatemethod.main.Calculator;
import com.example.reflectionproblems.basic.invokeprivatemethod.main.PrivateMethodInvoker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for PrivateMethodInvoker.
 */
class PrivateMethodInvokerTest {

    @Test
    void testInvokePrivateMethod() {
        Calculator calculator = new Calculator();

        // Invoke private multiply method
        int result = PrivateMethodInvoker.invokeMultiply(calculator, 4, 2);

        // Verify result
        assertEquals(8, result);
    }
}

