package com.sb;

import static com.sb.OnlineStore.cart;

public class Checkout {
    // Create static method called checkout that return nothing
    public static void checkout() {
        int cartSize = cart.size();
        // Create a variable to store the sum of the cart
        float cartSum = 0;
        for (Products products : cart) {
        // Add each item price to the sum variable
        cartSum += products.getPrice();
        }
        // Print out the total owed(sum variable) by the user
        System.out.printf("Your Subtotal is (%d Item): $%.2f\n", cartSize, cartSum);
        // Print a message to the user to pay for the items
        System.out.println("Please pay for your purchase with cash.");
        System.out.println("Enter the payment amount: $");

        // If the amount given by the user covers the entire amount owed
        // Print out the difference that is left over
        // Print all the items that the user has purchased
        // Clear the cart arraylist
        // Return to the main menu
        // Otherwise
        // Let the user know that the amount given doesn't cover the full amount
    }
}
