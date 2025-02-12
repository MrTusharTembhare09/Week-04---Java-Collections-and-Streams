package com.example.queueinterface.hospitaltriagesystem.utils;

import com.example.queueinterface.hospitaltriagesystem.models.Patient;
import java.util.PriorityQueue;
import java.util.Queue;

public class TriageSystem {
    private Queue<Patient> priorityQueue;

    // Creating constructor
    public TriageSystem() {
        this.priorityQueue = new PriorityQueue<>();
    }

    // Adding a patient to the queue
    public void addPatient(String name, int severity) {
        priorityQueue.offer(new Patient(name, severity));
    }

    // Treating the highest-priority patient
    public Patient treatPatient() {
        return priorityQueue.poll();
    }

    // Checking if the queue is empty
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    // Getting the queue size
    public int getQueueSize() {
        return priorityQueue.size();
    }
}

