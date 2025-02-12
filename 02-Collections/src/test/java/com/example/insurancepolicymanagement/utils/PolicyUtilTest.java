package com.example.insurancepolicymanagement.utils;

import com.example.insurancepolicymanagement.models.InsurancePolicy;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicyUtilTest {

    @Test
    public void testGetExpiringPolicies() {
        Set<InsurancePolicy> policies = new HashSet<>();
        policies.add(new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(15), "Health", 5000));
        policies.add(new InsurancePolicy("P124", "Bob", LocalDate.now().plusDays(45), "Auto", 3000));

        Set<InsurancePolicy> result = PolicyUtil.getExpiringPolicies(policies);

        assertEquals(1, result.size());
    }

    @Test
    public void testGetPoliciesByCoverage() {
        Set<InsurancePolicy> policies = new HashSet<>();
        policies.add(new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(15), "Health", 5000));
        policies.add(new InsurancePolicy("P124", "Bob", LocalDate.now().plusDays(45), "Auto", 3000));

        Set<InsurancePolicy> result = PolicyUtil.getPoliciesByCoverage(policies, "Health");

        assertEquals(1, result.size());
    }
}


