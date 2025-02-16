package com.example.annotationsproblems.customannotations.advanced.rolebasedaccess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// Creating a JUnit test for role-based access control
public class RoleAllowedTest {

    @Test
    void testAdminAccess() {
        SecureService service = new SecureService();
        User adminUser = new User("ADMIN");

        // Capturing console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        service.invokeMethodIfAllowed(adminUser, "performAdminTask");

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Admin task executed successfully."));
    }

    @Test
    void testUserAccessDenied() {
        SecureService service = new SecureService();
        User normalUser = new User("USER");

        // Capturing console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        service.invokeMethodIfAllowed(normalUser, "performAdminTask");

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Access Denied! Only ADMIN can execute this method."));
    }
}

