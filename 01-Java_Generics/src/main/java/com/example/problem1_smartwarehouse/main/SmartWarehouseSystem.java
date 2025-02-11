package com.example.problem1_smartwarehouse.main;

import com.example.problem1_smartwarehouse.models.*;
import com.example.problem1_smartwarehouse.storage.*;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        // Creating storage for different types of items
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to respective storage
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Displaying stored items
        Storage.displayItems(electronicsStorage);
        Storage.displayItems(groceriesStorage);
        Storage.displayItems(furnitureStorage);
    }
}

