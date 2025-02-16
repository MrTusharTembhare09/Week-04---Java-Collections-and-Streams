package com.example.annotationsproblems.excercises.repeatableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Container annotation for @BugReport
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BugReports {
    BugReport[] value();
}

