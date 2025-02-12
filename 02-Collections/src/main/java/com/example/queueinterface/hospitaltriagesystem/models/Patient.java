package com.example.queueinterface.hospitaltriagesystem.models;

public class Patient implements Comparable<Patient> {
    private String name;
    private int severity; // Higher value means higher severity

    // Creating constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Getting patient's name
    public String getName() {
        return name;
    }

    // Getting severity level
    public int getSeverity() {
        return severity;
    }

    // Overriding compareTo method to prioritize higher severity
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity); // Higher severity first
    }

    // Overriding toString method
    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

