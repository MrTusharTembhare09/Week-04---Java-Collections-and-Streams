package com.example.annotationsproblems.customannotations.bigginerlevel.todo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Creating a custom annotation to mark pending tasks
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Todo {
    String task(); // Task description
    String assignedTo(); // Developer responsible
    String priority() default "MEDIUM"; // Default priority is MEDIUM
}

