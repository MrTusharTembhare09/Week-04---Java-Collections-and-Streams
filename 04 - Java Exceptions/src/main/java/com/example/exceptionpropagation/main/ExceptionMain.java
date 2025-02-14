package com.example.exceptionpropagation.main;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            // Calling method2, which eventually calls method1
            ExceptionPropagation.method2();
        } catch (ArithmeticException e) {
            // Handling propagated exception in main()
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}

