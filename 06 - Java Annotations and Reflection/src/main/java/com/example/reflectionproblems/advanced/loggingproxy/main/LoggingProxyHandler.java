package com.example.reflectionproblems.advanced.loggingproxy.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Creating a Logging Proxy Handler using Java Reflection.
 */
public class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    /**
     * Initializing the proxy handler with the target object.
     * @param target The real object that needs proxying.
     */
    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    /**
     * Intercepts method calls, logs the method name, and invokes the actual method.
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[LOG] Method called: " + method.getName());
        return method.invoke(target, args);
    }

    /**
     * Creating a dynamic proxy for a given interface.
     */
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LoggingProxyHandler(target)
        );
    }
}

