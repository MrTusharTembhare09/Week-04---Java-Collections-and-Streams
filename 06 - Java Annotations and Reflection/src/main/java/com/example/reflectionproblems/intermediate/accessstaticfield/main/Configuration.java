package com.example.reflectionproblems.intermediate.accessstaticfield.main;

/**
 * Class containing a private static field.
 */
public class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    public static String getApiKey() {
        return API_KEY;
    }
}

