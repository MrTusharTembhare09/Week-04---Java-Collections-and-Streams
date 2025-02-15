package com.example.regexproblems.advanced.currencyextractor.test;

import com.example.regexproblems.advanced.currencyextractor.utils.CurrencyExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyExtractorTest {

    @Test
    void testValidExtraction() {
        // Checking extraction from valid text
        List<String> result = CurrencyExtractor.extractCurrencyValues("The price is $45.99, and the discount is 10.50.");
        assertEquals(List.of("$45.99", "10.50"), result);
    }

    @Test
    void testMultipleCurrencies() {
        // Checking extraction with multiple currency values
        List<String> result = CurrencyExtractor.extractCurrencyValues("Items cost $5.00, $20.99, and 8.75.");
        assertEquals(List.of("$5.00", "$20.99", "8.75"), result);
    }

    @Test
    void testNoCurrencies() {
        // Checking when no currency value is present
        List<String> result = CurrencyExtractor.extractCurrencyValues("There are no prices mentioned.");
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullInput() {
        // Checking null input case
        List<String> result = CurrencyExtractor.extractCurrencyValues(null);
        assertTrue(result.isEmpty());
    }
}

