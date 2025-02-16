package com.example.reflectionproblems.advanced.dependencyinjection.main;

/**
 * Client class that depends on the Service.
 */
public class Client {

    @Inject
    private Service service; // Dependency to be injected

    /**
     * Using the injected service.
     */
    public void doSomething() {
        if (service != null) {
            service.serve();
        } else {
            System.out.println("Service not injected!");
        }
    }
}

