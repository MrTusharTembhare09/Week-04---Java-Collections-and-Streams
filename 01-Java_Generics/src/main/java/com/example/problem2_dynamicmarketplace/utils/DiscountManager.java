package com.example.problem2_dynamicmarketplace.utils;

import com.example.problem2_dynamicmarketplace.products.Product;

// Creating a utility class for discount operations
public class DiscountManager {
    // Applying a discount using a generic method
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
        System.out.println("Applied " + percentage + "% discount on " + product.getName() + ". New Price: $" + product.getPrice());
    }
}

