package com.example.annotationsproblems.excercises.customannotation;

import com.example.annotationsproblems.excercises.customannotation.AnnotationProcessor;
import com.example.annotationsproblems.excercises.customannotation.TaskManager;

public class CustomAnnotationMain {
    public static void main(String[] args) {
        // Creating an instance of TaskManager and calling the method
        TaskManager taskManager = new TaskManager();
        taskManager.completeTask();

        // Processing annotations to display details
        AnnotationProcessor.processAnnotations();
    }
}

