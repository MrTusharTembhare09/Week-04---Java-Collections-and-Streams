package com.example.reflectionproblems.intermediate.retrieveannotations.main;

/**
 * Demonstrates retrieving annotation values at runtime.
 */
public class RetrieveAnnotationsDemo {
    public static void main(String[] args) {
        // Retrieving annotation value from DocumentedClass
        AnnotationProcessor.retrieveAuthorInfo(DocumentedClass.class);
    }
}

