package com.example.reflectionproblems.advanced.loggingproxy.main;

/**
 * Implementing the Greeting interface.
 */
public class GreetingImpl implements Greeting {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}

