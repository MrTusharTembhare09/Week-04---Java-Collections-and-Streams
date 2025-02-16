package com.example.annotationsproblems.customannotations.advanced.rolebasedaccess;

import java.lang.reflect.Method;

// Creating SecureService class with restricted methods
public class SecureService {

    @RoleAllowed("ADMIN") // Restricting this method to ADMIN only
    public void performAdminTask() {
        System.out.println("Admin task executed successfully.");
    }

    // Method to check access before invoking restricted methods
    public void invokeMethodIfAllowed(User user, String methodName) {
        try {
            Method method = this.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (user.getRole().equals(roleAllowed.value())) {
                    method.invoke(this);
                } else {
                    System.out.println("Access Denied! Only " + roleAllowed.value() + " can execute this method.");
                }
            } else {
                method.invoke(this); // If no restriction, execute normally
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SecureService service = new SecureService();

        // Creating users with different roles
        User adminUser = new User("ADMIN");
        User normalUser = new User("USER");

        // Testing access control
        System.out.println("Attempting access with ADMIN user:");
        service.invokeMethodIfAllowed(adminUser, "performAdminTask");

        System.out.println("\nAttempting access with USER:");
        service.invokeMethodIfAllowed(normalUser, "performAdminTask");
    }
}

