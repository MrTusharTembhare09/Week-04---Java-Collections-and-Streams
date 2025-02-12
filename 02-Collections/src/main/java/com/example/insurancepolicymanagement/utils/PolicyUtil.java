package com.example.insurancepolicymanagement.utils;

import com.example.insurancepolicymanagement.models.InsurancePolicy;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class PolicyUtil {
    // Filtering policies expiring within the next 30 days
    public static Set<InsurancePolicy> getExpiringPolicies(Set<InsurancePolicy> policies) {
        LocalDate today = LocalDate.now();
        LocalDate thresholdDate = today.plusDays(30);

        return policies.stream()
                .filter(policy -> policy.getExpiryDate().isBefore(thresholdDate))
                .collect(Collectors.toSet());
    }

    // Filtering policies by coverage type
    public static Set<InsurancePolicy> getPoliciesByCoverage(Set<InsurancePolicy> policies, String coverageType) {
        return policies.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .collect(Collectors.toSet());
    }
}

