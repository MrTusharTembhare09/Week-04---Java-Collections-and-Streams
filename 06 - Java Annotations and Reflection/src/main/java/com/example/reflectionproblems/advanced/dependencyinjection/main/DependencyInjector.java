package com.example.reflectionproblems.advanced.dependencyinjection.main;

import java.lang.reflect.Field;

/**
 * Simple Dependency Injection container using Reflection.
 */
public class DependencyInjector {

    /**
     * Injects dependencies into the fields annotated with @Inject.
     *
     * @param object The object in which dependencies need to be injected.
     */
    public static void injectDependencies(Object object) {
        Class<?> clazz = object.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    // Create a new instance of the dependency
                    Object dependency = field.getType().getDeclaredConstructor().newInstance();

                    // Allow access to private fields
                    field.setAccessible(true);

                    // Inject the dependency
                    field.set(object, dependency);

                } catch (Exception e) {
                    throw new RuntimeException("Failed to inject dependency: " + field.getName(), e);
                }
            }
        }
    }
}

