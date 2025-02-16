package com.example.annotationsproblems.excercises.deprecatedexample;

import com.example.annotationsproblems.excercises.deprecatedexample.LegacyAPI;

public class DeprecatedExampleMain {
    public static void main(String[] args) {
        // Creating an instance of LegacyAPI
        LegacyAPI api = new LegacyAPI();

        // Calling the deprecated method (will show a warning)
        api.oldFeature();

        // Calling the new recommended method
        api.newFeature();
    }
}

