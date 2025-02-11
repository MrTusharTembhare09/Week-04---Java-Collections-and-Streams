package com.example.problem1_smartwarehouse.storage;

import com.example.problem1_smartwarehouse.models.WarehouseItem;
import java.util.ArrayList;
import java.util.List;

// Creating a generic class for warehouse storage
public class Storage<T extends WarehouseItem> {
    private List<T> items;

    // Initializing the list in the constructor
    public Storage() {
        this.items = new ArrayList<>();
    }

    // Adding an item to the storage
    public void addItem(T item) {
        items.add(item);
    }

    // Getting an item from storage by index
    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    // Displaying all items using wildcard '? extends WarehouseItem'
    public static void displayItems(Storage<? extends WarehouseItem> storage) {
        System.out.println("Warehouse Items:");
        for (WarehouseItem item : storage.items) {
            System.out.println(item);
        }
    }
}

