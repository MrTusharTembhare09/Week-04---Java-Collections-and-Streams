package com.example.reflectionproblems.basic.invokeprivatemethod.main;

import java.lang.reflect.Method;

/**
 * Utility class to invoke private methods using Reflection.
 */
public class PrivateMethodInvoker {

    /**
     * Invokes the private multiply method dynamically.
     * @param calculator The Calculator object
     * @param a First number
     * @param b Second number
     * @return Result of multiplication
     */
    public static int invokeMultiply(Calculator calculator, int a, int b) {
        try {
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Allow access to private method
            return (int) multiplyMethod.invoke(calculator, a, b);
        } catch (Exception e) {
            throw new RuntimeException("Error invoking private method: " + e.getMessage());
        }
    }
}
