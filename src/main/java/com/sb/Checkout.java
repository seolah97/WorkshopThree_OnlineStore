package com.sb;

import static com.sb.OnlineStore.cart;
import static com.sb.OnlineStore.scanner;

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
        System.out.print("Enter the payment amount: $");
        float paymentAmount = scanner.nextFloat();

        // If the amount given by the user covers the entire amount owed
        float difference = 0;
        if (paymentAmount >= cartSum) {
            difference = paymentAmount - cartSum ;
            // Print out the difference that is left over
            System.out.printf("Purchase Successful! Your change is $%.2f\n", difference);
            // Print all the items that the user has purchased
            System.out.println("Items purchased:");
            for (Products products : cart){
                System.out.print(products.toString());
            }
            cart.clear(); // Clear the cart arraylist

            return; // Return to the main menu
        } else { // Otherwise
            // Let the user know that the amount given doesn't cover the full amount
            System.out.println("The amount provided does not cover your total cost.");

        }
        scanner.close();
    }
}
