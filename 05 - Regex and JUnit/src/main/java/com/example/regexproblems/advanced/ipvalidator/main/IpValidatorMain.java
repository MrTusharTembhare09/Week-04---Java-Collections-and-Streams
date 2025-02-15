package com.example.regexproblems.advanced.ipvalidator.main;

import com.example.regexproblems.advanced.ipvalidator.utils.IpValidator;
import java.util.Scanner;

public class IpValidatorMain {
    public static void main(String[] args) {
        // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter an IP address to validate: ");
        String ip = scanner.nextLine();

        // Checking if IP is valid
        boolean isValid = IpValidator.isValidIp(ip);
        System.out.println("Is the entered IP valid? " + isValid);

        // Closing scanner
        scanner.close();
    }
}

