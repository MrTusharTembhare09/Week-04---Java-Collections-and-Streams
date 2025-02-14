package com.example.exceptionpropagation.main;

public class ExceptionPropagation {

    // Throwing ArithmeticException in method1
    public static void method1() {
        // Performing division by zero to cause exception
        int result = 10 / 0;
    }

    // Calling method1, allowing exception to propagate
    public static void method2() {
        method1();
    }
}

