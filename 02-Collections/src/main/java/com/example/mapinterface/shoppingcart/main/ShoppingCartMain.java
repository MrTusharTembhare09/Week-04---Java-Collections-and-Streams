package com.example.mapinterface.shoppingcart.main;

import com.example.mapinterface.shoppingcart.model.Product;
import com.example.mapinterface.shoppingcart.service.ShoppingCart;

import java.util.Map;

// Creating a main class to test the shopping cart system
public class ShoppingCartMain {
    public static void main(String[] args) {
        // Creating a new shopping cart instance
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        Product apple = new Product("Apple", 1.50);
        Product banana = new Product("Banana", 0.75);
        Product milk = new Product("Milk", 3.00);

        cart.addProduct(apple, 2);
        cart.addProduct(banana, 5);
        cart.addProduct(milk, 1);

        // Displaying all products
        System.out.println("Products in HashMap (Price-Based Storage): " + cart.getCart());

        // Displaying ordered products
        System.out.println("Products in LinkedHashMap (Order of Addition): " + cart.getOrderedCart());

        // Displaying sorted products
        System.out.println("Products in TreeMap (Sorted by Price): " + cart.getSortedCart());
    }
}

