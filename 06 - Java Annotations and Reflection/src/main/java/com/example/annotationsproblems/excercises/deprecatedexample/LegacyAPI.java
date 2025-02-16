package com.example.annotationsproblems.excercises.deprecatedexample;

// Creating a class LegacyAPI
public class LegacyAPI {

    // Marking oldFeature() as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("Warning: oldFeature() is deprecated. Use newFeature() instead.");
    }

    // Creating a new method to replace the old one
    public void newFeature() {
        System.out.println("This is the new and improved feature.");
    }
}

