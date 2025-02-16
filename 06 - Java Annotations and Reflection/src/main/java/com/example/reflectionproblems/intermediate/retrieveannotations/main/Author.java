package com.example.reflectionproblems.intermediate.retrieveannotations.main;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Custom annotation to store author information.
 */
@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime for Reflection
public @interface Author {
    String name();
}

