package com.example.annotationsproblems.customannotations.intemediatelevel.maxlength;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Creating annotation to enforce max length validation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MaxLength {
    int value(); // Specifying max length as an integer
}

