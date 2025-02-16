package com.example.annotationsproblems.customannotations.advanced.caching;

import java.util.HashMap;
import java.util.Map;

// Creating CacheManager to store method results
public class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object getFromCache(String key) {
        return cache.get(key);
    }

    public static void addToCache(String key, Object value) {
        cache.put(key, value);
    }
}

