package com.example.userinput.main;

import com.example.userinput.utils.UserInputHandler;

public class UserInputMain {
    public static void main(String[] args) {
        String filePath = "src/main/resources/user_data.txt"; // File location
        UserInputHandler.readAndWriteUserInput(filePath);
    }
}

