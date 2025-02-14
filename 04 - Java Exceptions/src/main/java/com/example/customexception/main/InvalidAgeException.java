package com.example.customexception.main;

// Creating custom exception by extending Exception class
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
