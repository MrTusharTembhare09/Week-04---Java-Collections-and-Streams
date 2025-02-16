package com.example.reflectionproblems.intermediate.dynamicmethodinvocation.main;

import java.lang.reflect.Method;

/**
 * Utility class to invoke methods dynamically using Reflection.
 */
public class MethodInvoker {

    /**
     * Invokes a specified method dynamically on MathOperations class.
     * @param methodName The method name to invoke.
     * @param paramTypes The parameter types of the method.
     * @param params The arguments to pass to the method.
     * @return The result of the invoked method.
     */
    public static Object invokeMethod(String methodName, Class<?>[] paramTypes, Object... params) {
        try {
            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();

            // Get the specified method
            Method method = MathOperations.class.getMethod(methodName, paramTypes);

            // Invoke the method dynamically
            return method.invoke(mathOps, params);
        } catch (Exception e) {
            throw new RuntimeException("Error invoking method: " + e.getMessage());
        }
    }
}

