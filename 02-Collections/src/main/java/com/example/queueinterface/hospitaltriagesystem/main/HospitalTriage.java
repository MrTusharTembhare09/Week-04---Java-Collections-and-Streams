package com.example.queueinterface.hospitaltriagesystem.main;

import com.example.queueinterface.hospitaltriagesystem.utils.TriageSystem;
import com.example.queueinterface.hospitaltriagesystem.models.Patient;

public class HospitalTriage {
    public static void main(String[] args) {
        TriageSystem triageSystem = new TriageSystem();

        // Adding patients with different severity levels
        triageSystem.addPatient("John", 3);
        triageSystem.addPatient("Alice", 5);
        triageSystem.addPatient("Bob", 2);

        // Treating patients based on priority
        System.out.println("Patients treated in order of severity:");
        while (!triageSystem.isEmpty()) {
            System.out.println(triageSystem.treatPatient());
        }
    }
}

