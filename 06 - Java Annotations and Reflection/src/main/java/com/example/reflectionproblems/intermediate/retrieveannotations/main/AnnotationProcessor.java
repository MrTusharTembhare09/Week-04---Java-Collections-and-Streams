package com.example.reflectionproblems.intermediate.retrieveannotations.main;

import java.lang.annotation.Annotation;

/**
 * Utility class to process and retrieve annotation values.
 */
public class AnnotationProcessor {

    /**
     * Retrieves and prints the Author annotation value.
     * @param clazz The class to inspect.
     */
    public static void retrieveAuthorInfo(Class<?> clazz) {
        // Check if the class has the Author annotation
        if (clazz.isAnnotationPresent(Author.class)) {
            // Get the annotation
            Author authorAnnotation = clazz.getAnnotation(Author.class);

            // Print annotation value
            System.out.println("Author: " + authorAnnotation.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}

