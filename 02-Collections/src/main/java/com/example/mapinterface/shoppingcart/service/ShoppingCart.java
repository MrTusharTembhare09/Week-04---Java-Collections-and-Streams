package com.example.mapinterface.shoppingcart.service;

import com.example.mapinterface.shoppingcart.model.Product;

import java.util.*;

// Creating a ShoppingCart class to manage products
public class ShoppingCart {
    private final Map<Product, Integer> cart;
    private final Map<Product, Integer> orderedCart;
    private final Map<Product, Integer> sortedCart;

    // Creating a constructor to initialize different maps
    public ShoppingCart() {
        this.cart = new HashMap<>(); // Storing product prices
        this.orderedCart = new LinkedHashMap<>(); // Maintaining order of insertion
        this.sortedCart = new TreeMap<>(); // Sorting items by price
    }

    // Adding a product to the cart
    public void addProduct(Product product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
        orderedCart.put(product, orderedCart.getOrDefault(product, 0) + quantity);
        sortedCart.put(product, sortedCart.getOrDefault(product, 0) + quantity);
    }

    // Removing a product from the cart
    public void removeProduct(Product product) {
        cart.remove(product);
        orderedCart.remove(product);
        sortedCart.remove(product);
    }

    // Getting all products with prices
    public Map<Product, Integer> getCart() {
        return cart;
    }

    // Getting products in the order they were added
    public Map<Product, Integer> getOrderedCart() {
        return orderedCart;
    }

    // Getting products sorted by price
    public Map<Product, Integer> getSortedCart() {
        return sortedCart;
    }
}

