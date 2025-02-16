package com.example.annotationsproblems.customannotations.bigginerlevel.todo;

import com.example.annotationsproblems.customannotations.bigginerlevel.todo.TaskManager;
import com.example.annotationsproblems.customannotations.bigginerlevel.todo.TodoProcessor;

public class TodoAnnotationMain {
    public static void main(String[] args) {
        // Creating an instance of TaskManager and calling methods
        TaskManager taskManager = new TaskManager();
        taskManager.authenticateUser();
        taskManager.optimizeDatabase();
        taskManager.logTaskCompletion();

        // Processing @Todo annotations to display details
        TodoProcessor.processTodos();
    }
}

