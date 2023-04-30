package com.sb;

import static com.sb.Checkout.checkout;
import static com.sb.OnlineStore.cart;
import static com.sb.OnlineStore.scanner;

public class Cart {
    // Create static method called showCart that return nothing
    public static void showCart() {
        // Display total number of items in the cart
        int cartSize = cart.size();
        System.out.println("\nNumber of items in Cart: " + cartSize);
        for (Products currentProducts : cart) {
            System.out.println(currentProducts);
        }

        // Create sub-menu & Initialize subInput variable for user input
        String subInput;

        do{ // Show prompt for user showing the possible options and asking for an input
            System.out.println("\tC :Go to Checkout");
            System.out.println("\tX :Go back to Main Screen");
            System.out.println("Enter Command: ");
            subInput = scanner.nextLine();

            // Create switch statement
            switch (subInput){
                // Case "c": Checkout
                 case "C":   // Runs custom static method called checkout
                     checkout();
                 // Case "x": Go Back To Home Screen
                 case "X":
                    System.out.println("Going back to Main Screen");
                    break;
                 // Default: Show message "Input command not found"
                default:
                    System.out.println("Input command not found. Please try again.");
                    break;
            }

        }while (!subInput.equalsIgnoreCase("X"));
    }
}
