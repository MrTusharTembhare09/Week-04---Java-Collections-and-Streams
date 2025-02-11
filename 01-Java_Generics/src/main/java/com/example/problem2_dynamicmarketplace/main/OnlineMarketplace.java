package com.example.problem2_dynamicmarketplace.main;

import com.example.problem2_dynamicmarketplace.models.*;
import com.example.problem2_dynamicmarketplace.products.*;
import com.example.problem2_dynamicmarketplace.utils.DiscountManager;

public class OnlineMarketplace {
    public static void main(String[] args) {
        // Creating product categories
        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetCategory gadgetCategory = new GadgetCategory();

        // Creating products
        Product<BookCategory> book = new Product<>("Java Programming", 40.0, bookCategory);
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 25.0, clothingCategory);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 500.0, gadgetCategory);

        // Displaying initial product details
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        // Applying discounts
        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 20);
        DiscountManager.applyDiscount(phone, 15);

        // Displaying updated product details
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}

