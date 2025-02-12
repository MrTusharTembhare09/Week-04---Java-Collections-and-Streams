package com.example.mapinterface.shoppingcart.test;

import com.example.mapinterface.shoppingcart.model.Product;
import com.example.mapinterface.shoppingcart.service.ShoppingCart;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

// Creating a JUnit test class for ShoppingCart
public class ShoppingCartTest {
    @Test
    public void testShoppingCart() {
        // Creating a new shopping cart instance
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        Product apple = new Product("Apple", 1.50);
        Product banana = new Product("Banana", 0.75);
        Product milk = new Product("Milk", 3.00);

        cart.addProduct(apple, 2);
        cart.addProduct(banana, 5);
        cart.addProduct(milk, 1);

        // Checking if products are added correctly
        assertEquals(2, cart.getCart().get(apple));
        assertEquals(5, cart.getCart().get(banana));
        assertEquals(1, cart.getCart().get(milk));

        // Checking if LinkedHashMap maintains insertion order
        Map<Product, Integer> orderedCart = cart.getOrderedCart();
        assertTrue(orderedCart.keySet().toArray()[0].equals(apple));
        assertTrue(orderedCart.keySet().toArray()[1].equals(banana));
        assertTrue(orderedCart.keySet().toArray()[2].equals(milk));

        // Checking if TreeMap sorts products by price
        Map<Product, Integer> sortedCart = cart.getSortedCart();
        assertTrue(sortedCart.keySet().toArray()[0].equals(banana)); // Cheapest first
        assertTrue(sortedCart.keySet().toArray()[1].equals(apple));
        assertTrue(sortedCart.keySet().toArray()[2].equals(milk)); // Most expensive last

        // Removing a product and verifying
        cart.removeProduct(banana);
        assertNull(cart.getCart().get(banana));
    }
}

