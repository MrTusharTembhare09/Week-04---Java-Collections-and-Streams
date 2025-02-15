package com.example.regexproblems.advanced.creditcardvalidator.test;

import com.example.regexproblems.advanced.creditcardvalidator.utils.CreditCardValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {

    @Test
    void testValidVisaCards() {
        // Checking valid Visa card numbers
        assertEquals("Visa", CreditCardValidator.validateCard("4111111111111111"));
        assertEquals("Visa", CreditCardValidator.validateCard("4000123456789012"));
    }

    @Test
    void testValidMasterCards() {
        // Checking valid MasterCard numbers
        assertEquals("MasterCard", CreditCardValidator.validateCard("5105105105105100"));
        assertEquals("MasterCard", CreditCardValidator.validateCard("5555555555554444"));
    }

    @Test
    void testInvalidCards() {
        // Checking invalid credit card numbers
        assertEquals("Invalid", CreditCardValidator.validateCard("1234567812345678")); // Random number
        assertEquals("Invalid", CreditCardValidator.validateCard("411111111111111"));  // Too short
        assertEquals("Invalid", CreditCardValidator.validateCard("511111111111111111")); // Too long
        assertEquals("Invalid", CreditCardValidator.validateCard("6011111111111117"));  // Discover (not Visa/MasterCard)
        assertEquals("Invalid", CreditCardValidator.validateCard(null));               // Null input
    }
}

