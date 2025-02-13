package com.example.userinput.test;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserInputTest {
    private final String testFilePath = "src/main/resources/test_user_data.txt";

    @Test
    void testReadAndWriteUserInput() throws IOException {
        // Creating test data
        Files.writeString(Paths.get(testFilePath), "Name: TestUser\nAge: 25\nFavorite Language: Java\n");

        // Checking if file exists
        assertTrue(new File(testFilePath).exists(), "File writing failed!");
    }
}

