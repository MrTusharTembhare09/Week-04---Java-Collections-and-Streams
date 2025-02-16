package com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod;

import com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod.CriticalOperations;
import com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod.AnnotationProcessor;

public class CustomAnnotationMain {
    public static void main(String[] args) {
        // Creating an instance of CriticalOperations and calling methods
        CriticalOperations operations = new CriticalOperations();
        operations.processTransaction();
        operations.generateReport();
        operations.logActivity();

        // Processing annotations to display details
        AnnotationProcessor.processAnnotations();
    }
}

