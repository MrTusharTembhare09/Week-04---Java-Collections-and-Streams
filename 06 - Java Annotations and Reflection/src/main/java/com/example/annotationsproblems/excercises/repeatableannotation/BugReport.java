package com.example.annotationsproblems.excercises.repeatableannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Creating a repeatable annotation
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BugReport {
    String description();
}

