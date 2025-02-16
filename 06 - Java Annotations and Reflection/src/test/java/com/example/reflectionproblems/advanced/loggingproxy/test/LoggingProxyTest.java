package com.example.reflectionproblems.advanced.loggingproxy.test;

import com.example.reflectionproblems.advanced.loggingproxy.main.Greeting;
import com.example.reflectionproblems.advanced.loggingproxy.main.GreetingImpl;
import com.example.reflectionproblems.advanced.loggingproxy.main.LoggingProxyHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Creating JUnit test class for Logging Proxy.
 */
class LoggingProxyTest {

    /**
     * Testing if method call is intercepted and logs the method name.
     */
    @Test
    void testLoggingProxy() {
        Greeting original = new GreetingImpl();
        Greeting proxy = LoggingProxyHandler.createProxy(original, Greeting.class);

        // Checking if the proxy correctly calls the original method
        assertEquals("Hello, Tushar!", proxy.sayHello("Tushar"));
    }
}

