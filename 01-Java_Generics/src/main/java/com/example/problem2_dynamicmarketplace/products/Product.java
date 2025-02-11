package com.example.problem2_dynamicmarketplace.products;

import com.example.problem2_dynamicmarketplace.models.ProductCategory;

// Creating a generic product class with bounded type parameter
public class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    // Creating a constructor to initialize product details
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getting the product name
    public String getName() {
        return name;
    }

    // Getting the product price
    public double getPrice() {
        return price;
    }

    // Setting a new price after discount
    public void setPrice(double price) {
        this.price = price;
    }

    // Getting the product category
    public T getCategory() {
        return category;
    }

    // Converting object to string representation
    @Override
    public String toString() {
        return "Product: " + name + " | Category: " + category + " | Price: $" + price;
    }
}

