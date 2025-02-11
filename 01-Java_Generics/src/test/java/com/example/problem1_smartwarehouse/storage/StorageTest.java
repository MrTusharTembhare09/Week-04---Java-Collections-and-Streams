package com.example.problem1_smartwarehouse.storage;

import com.example.problem1_smartwarehouse.models.Electronics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    @Test
    void testAddItem() {
        // Creating a storage for electronics
        Storage<Electronics> storage = new Storage<>();

        // Creating an electronic item
        Electronics laptop = new Electronics("Laptop");

        // Adding the item to storage
        storage.addItem(laptop);

        // Checking if the item is correctly added
        assertEquals(laptop, storage.getItem(0));
    }

    @Test
    void testGetInvalidItem() {
        Storage<Electronics> storage = new Storage<>();

        // Trying to get an item from an empty storage
        assertNull(storage.getItem(0));
    }
}
