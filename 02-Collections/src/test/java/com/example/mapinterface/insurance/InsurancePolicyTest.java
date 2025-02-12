package com.example.mapinterface.insurance;

import com.example.mapinterface.insurance.model.Policy;
import com.example.mapinterface.insurance.service.PolicyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

public class InsurancePolicyTest {
    private PolicyService policyService;

    @BeforeEach
    void setUp() {
        policyService = new PolicyService();
        policyService.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(20), "Health", 5000.0));
        policyService.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 3000.0));
        policyService.addPolicy(new Policy("P103", "Charlie", LocalDate.now().plusDays(10), "Home", 7000.0));
        policyService.addPolicy(new Policy("P104", "Alice", LocalDate.now().minusDays(5), "Life", 4000.0));
    }

    @Test
    public void testGetPolicyByNumber() {
        assertNotNull(policyService.getPolicyByNumber("P101"));
        assertNull(policyService.getPolicyByNumber("P999"));
    }

    @Test
    public void testGetExpiringPolicies() {
        List<Policy> expiringPolicies = policyService.getExpiringPolicies();
        assertEquals(2, expiringPolicies.size());
    }

    @Test
    public void testRemoveExpiredPolicies() {
        policyService.removeExpiredPolicies();
        assertNull(policyService.getPolicyByNumber("P104"));
    }
}

