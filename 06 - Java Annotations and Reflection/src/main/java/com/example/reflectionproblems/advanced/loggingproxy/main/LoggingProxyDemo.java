package com.example.reflectionproblems.advanced.loggingproxy.main;

/**
 * Running the Logging Proxy with an example.
 */
public class LoggingProxyDemo {
    public static void main(String[] args) {
        // Creating the original object
        Greeting original = new GreetingImpl();

        // Creating a proxy
        Greeting proxy = LoggingProxyHandler.createProxy(original, Greeting.class);

        // Calling the method through proxy
        System.out.println(proxy.sayHello("Tushar"));
    }
}

