package com.example.reflectionproblems.advanced.dependencyinjection.test;

import com.example.reflectionproblems.advanced.dependencyinjection.main.Client;
import com.example.reflectionproblems.advanced.dependencyinjection.main.DependencyInjector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Dependency Injection.
 */
class DependencyInjectionTest {

    @Test
    void testDependencyInjection() {
        Client client = new Client();
        DependencyInjector.injectDependencies(client);

        // Check if dependency is injected
        assertDoesNotThrow(client::doSomething);
    }
}

