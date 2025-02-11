package com.example.problem1_smartwarehouse.models;

// Creating an abstract class to represent warehouse items
public abstract class WarehouseItem {
    private String name;

    // Creating a constructor to initialize item name
    public WarehouseItem(String name) {
        this.name = name;
    }

    // Getting the name of the item
    public String getName() {
        return name;
    }

    // Setting the name of the item
    public void setName(String name) {
        this.name = name;
    }

    // Converting object to string representation
    @Override
    public String toString() {
        return "Item: " + name;
    }
}



