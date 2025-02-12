package com.example.queueinterface.hospitaltriagesystem.utils;

import com.example.queueinterface.hospitaltriagesystem.models.Patient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriageSystemTest {

    @Test
    public void testTriageOrder() {
        TriageSystem triageSystem = new TriageSystem();

        // Adding patients
        triageSystem.addPatient("John", 3);
        triageSystem.addPatient("Alice", 5);
        triageSystem.addPatient("Bob", 2);

        // Checking order of treatment
        assertEquals("Alice", triageSystem.treatPatient().getName());
        assertEquals("John", triageSystem.treatPatient().getName());
        assertEquals("Bob", triageSystem.treatPatient().getName());
    }
}

