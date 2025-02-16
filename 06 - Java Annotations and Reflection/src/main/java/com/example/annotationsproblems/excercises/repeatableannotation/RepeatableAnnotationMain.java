package com.example.annotationsproblems.excercises.repeatableannotation;

import com.example.annotationsproblems.excercises.repeatableannotation.utils.AnnotationProcessor;
import com.example.annotationsproblems.excercises.repeatableannotation.BugTracker;

public class RepeatableAnnotationMain {
    public static void main(String[] args) {
        // Creating an instance of BugTracker and calling the method
        BugTracker bugTracker = new BugTracker();
        bugTracker.buggyMethod();

        // Processing annotations to display details
        AnnotationProcessor.processAnnotations();
    }
}

