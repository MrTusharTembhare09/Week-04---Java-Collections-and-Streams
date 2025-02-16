package com.example.annotationsproblems.customannotations.intemediatelevel.logexecutiontime;

// Creating a class to test @LogExecutionTime
public class ExecutionTester {

    @LogExecutionTime
    public void fastMethod() {
        // Creating a fast executing method
        System.out.println("Executing fast method...");
    }

    @LogExecutionTime
    public void slowMethod() {
        // Creating a slow executing method
        System.out.println("Executing slow method...");
        try {
            Thread.sleep(1000); // Adding delay to simulate slow execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutionTester tester = new ExecutionTester();
        LogExecutionTimeProcessor.process(tester);
    }
}

