package com.example.problem2_dynamicmarketplace.utils;

import com.example.problem2_dynamicmarketplace.models.BookCategory;
import com.example.problem2_dynamicmarketplace.products.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountManagerTest {
    @Test
    void testApplyDiscount() {
        // Creating a book product
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());

        // Applying a 20% discount
        DiscountManager.applyDiscount(book, 20);

        // Verifying the discounted price
        assertEquals(40.0, book.getPrice(), 0.01);
    }

    @Test
    void testZeroDiscount() {
        Product<BookCategory> book = new Product<>("Python Basics", 30.0, new BookCategory());

        // Applying a 0% discount
        DiscountManager.applyDiscount(book, 0);

        // Checking that the price remains the same
        assertEquals(30.0, book.getPrice(), 0.01);
    }
}

