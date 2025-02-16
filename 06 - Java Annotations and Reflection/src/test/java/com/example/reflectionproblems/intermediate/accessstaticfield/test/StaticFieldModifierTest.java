package com.example.reflectionproblems.intermediate.accessstaticfield.test;

import com.example.reflectionproblems.intermediate.accessstaticfield.main.Configuration;
import com.example.reflectionproblems.intermediate.accessstaticfield.main.StaticFieldModifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for StaticFieldModifier.
 */
class StaticFieldModifierTest {

    @Test
    void testModifyApiKey() {
        // Modify API key
        StaticFieldModifier.modifyApiKey("TEST_KEY");

        // Verify modification
        assertEquals("TEST_KEY", Configuration.getApiKey());
    }
}

