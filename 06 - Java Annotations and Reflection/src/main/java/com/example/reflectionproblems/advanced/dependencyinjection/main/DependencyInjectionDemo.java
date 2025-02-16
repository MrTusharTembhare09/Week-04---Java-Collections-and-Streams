package com.example.reflectionproblems.advanced.dependencyinjection.main;

/**
 * Testing Dependency Injection via Reflection.
 */
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        // Create Client instance (dependency is not set yet)
        Client client = new Client();

        // Perform Dependency Injection
        DependencyInjector.injectDependencies(client);

        // Check if the service is injected
        client.doSomething();  // Should print "Service is executing..."
    }
}

