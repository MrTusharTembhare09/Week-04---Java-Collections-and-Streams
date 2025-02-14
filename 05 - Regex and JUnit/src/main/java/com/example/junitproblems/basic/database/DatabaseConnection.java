package com.example.junitproblems.basic.database;

// Creating DatabaseConnection class to demonstrate @BeforeEach and @AfterEach annotations
public class DatabaseConnection {
    private boolean connected;

    // Connecting to the database
    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    // Disconnecting from the database
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    // Checking if the database is connected
    public boolean isConnected() {
        return connected;
    }
}