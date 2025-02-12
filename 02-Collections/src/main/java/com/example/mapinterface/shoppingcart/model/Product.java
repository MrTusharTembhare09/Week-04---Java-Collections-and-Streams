package com.example.mapinterface.shoppingcart.model;

// Creating a Product class to represent each item
public class Product implements Comparable<Product> {
    private final String name;
    private final double price;

    // Creating a constructor to initialize Product object
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getting the product name
    public String getName() {
        return name;
    }

    // Getting the product price
    public double getPrice() {
        return price;
    }

    // Overriding equals and hashCode for proper HashMap behavior
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // Overriding compareTo for sorting based on price
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

