package com.example.annotationsproblems.customannotations.advanced.caching;

import java.lang.reflect.Method;

// Creating ExpensiveComputation class to demonstrate caching
public class ExpensiveComputation {

    @CacheResult
    public int computeFactorial(int number) {
        // Checking if result exists in cache
        String cacheKey = "factorial_" + number;
        Object cachedResult = CacheManager.getFromCache(cacheKey);
        if (cachedResult != null) {
            System.out.println("Returning cached result for " + number);
            return (int) cachedResult;
        }

        // If not cached, compute factorial
        System.out.println("Computing factorial for " + number);
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        // Store result in cache
        CacheManager.addToCache(cacheKey, result);
        return result;
    }

    public static void main(String[] args) {
        ExpensiveComputation computation = new ExpensiveComputation();

        // First execution (should compute)
        System.out.println("Factorial: " + computation.computeFactorial(5));

        // Second execution (should return cached result)
        System.out.println("Factorial: " + computation.computeFactorial(5));
    }
}

