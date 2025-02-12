package com.example.insurancepolicymanagement.main;

import com.example.insurancepolicymanagement.models.InsurancePolicy;
import com.example.insurancepolicymanagement.utils.PolicyUtil;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    public static void main(String[] args) {
        // Creating insurance policies
        InsurancePolicy policy1 = new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(15), "Health", 5000);
        InsurancePolicy policy2 = new InsurancePolicy("P124", "Bob", LocalDate.now().plusDays(45), "Auto", 3000);
        InsurancePolicy policy3 = new InsurancePolicy("P125", "Charlie", LocalDate.now().plusDays(25), "Home", 4000);
        InsurancePolicy policy4 = new InsurancePolicy("P126", "David", LocalDate.now().plusDays(10), "Health", 3500);

        // Storing policies in different sets
        Set<InsurancePolicy> hashSet = new HashSet<>(Arrays.asList(policy1, policy2, policy3, policy4));
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>(Arrays.asList(policy1, policy2, policy3, policy4));
        Set<InsurancePolicy> treeSet = new TreeSet<>(hashSet);

        // Displaying all policies
        System.out.println("All Policies (TreeSet - Sorted by Expiry Date):");
        treeSet.forEach(System.out::println);

        // Retrieving expiring policies
        Set<InsurancePolicy> expiringPolicies = PolicyUtil.getExpiringPolicies(treeSet);
        System.out.println("\nPolicies Expiring Soon:");
        expiringPolicies.forEach(System.out::println);

        // Retrieving policies by coverage type
        Set<InsurancePolicy> healthPolicies = PolicyUtil.getPoliciesByCoverage(hashSet, "Health");
        System.out.println("\nHealth Policies:");
        healthPolicies.forEach(System.out::println);
    }
}

