package com.example.mapinterface.insurance.main;

import com.example.mapinterface.insurance.model.Policy;
import com.example.mapinterface.insurance.service.PolicyService;

import java.time.LocalDate;

public class InsuranceManagementSystem {
    public static void main(String[] args) {
        PolicyService policyService = new PolicyService();

        // Adding sample policies
        policyService.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(20), "Health", 5000.0));
        policyService.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 3000.0));
        policyService.addPolicy(new Policy("P103", "Charlie", LocalDate.now().plusDays(10), "Home", 7000.0));
        policyService.addPolicy(new Policy("P104", "Alice", LocalDate.now().minusDays(5), "Life", 4000.0));

        // Display all policies
        System.out.println("All Policies:");
        policyService.displayAllPolicies();

        // Retrieve a policy by its number
        System.out.println("\nRetrieving Policy P101:");
        System.out.println(policyService.getPolicyByNumber("P101"));

        // List policies expiring within the next 30 days
        System.out.println("\nPolicies Expiring in 30 Days:");
        for (Policy p : policyService.getExpiringPolicies()) {
            System.out.println(p);
        }

        // List policies for a specific policyholder
        System.out.println("\nPolicies for Alice:");
        for (Policy p : policyService.getPoliciesByHolder("Alice")) {
            System.out.println(p);
        }

        // Remove expired policies
        System.out.println("\nRemoving Expired Policies...");
        policyService.removeExpiredPolicies();

        // Display policies after removal of expired ones
        System.out.println("\nAll Policies After Removing Expired Ones:");
        policyService.displayAllPolicies();
    }
}

