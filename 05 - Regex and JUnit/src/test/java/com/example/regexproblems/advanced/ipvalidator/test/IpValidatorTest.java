package com.example.regexproblems.advanced.ipvalidator.test;

import com.example.regexproblems.advanced.ipvalidator.utils.IpValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IpValidatorTest {

    @Test
    void testValidIps() {
        // Checking valid IPs
        assertTrue(IpValidator.isValidIp("192.168.1.1"));
        assertTrue(IpValidator.isValidIp("255.255.255.255"));
        assertTrue(IpValidator.isValidIp("0.0.0.0"));
        assertTrue(IpValidator.isValidIp("127.0.0.1"));
    }

    @Test
    void testInvalidIps() {
        // Checking invalid IPs
        assertFalse(IpValidator.isValidIp("256.256.256.256")); // Out of range
        assertFalse(IpValidator.isValidIp("192.168.1"));       // Missing part
        assertFalse(IpValidator.isValidIp("abc.def.ghi.jkl")); // Non-numeric
        assertFalse(IpValidator.isValidIp("192.168.1.999"));   // Out of range
        assertFalse(IpValidator.isValidIp("192.168.01.1"));    // Leading zero
    }
}

