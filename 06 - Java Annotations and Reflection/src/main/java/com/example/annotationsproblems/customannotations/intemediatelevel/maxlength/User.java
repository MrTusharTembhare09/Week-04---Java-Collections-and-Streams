package com.example.annotationsproblems.customannotations.intemediatelevel.maxlength;

import java.lang.reflect.Field;

// Creating User class with a max length constraint on username
public class User {

    @MaxLength(10) // Applying max length constraint
    private String username;

    // Constructor for User class
    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }

    // Validating max length using reflection
    private void validateMaxLength(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (username.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength.value());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    // Displaying username
    public void displayUsername() {
        System.out.println("Username: " + username);
    }

    public static void main(String[] args) {
        // Creating valid user
        User user1 = new User("Tushar");
        user1.displayUsername();

        // Creating invalid user (Exceeding max length)
        try {
            User user2 = new User("VeryLongUsername");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
