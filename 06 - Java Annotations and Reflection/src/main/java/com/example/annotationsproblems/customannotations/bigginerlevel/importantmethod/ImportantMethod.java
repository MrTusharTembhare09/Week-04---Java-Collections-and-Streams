package com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Creating a custom annotation to mark important methods
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod {
    String level() default "HIGH"; // Optional parameter with default value "HIGH"
}

