package com.example.problem2_dynamicmarketplace.models;

// Creating an abstract class for product categories
public abstract class ProductCategory {
    private String categoryName;

    // Creating a constructor to initialize category name
    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    // Getting the category name
    public String getCategoryName() {
        return categoryName;
    }

    // Converting object to string representation
    @Override
    public String toString() {
        return categoryName;
    }
}

