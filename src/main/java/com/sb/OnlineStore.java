package com.sb;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import static com.sb.Cart.showCart;

public class OnlineStore {
    static ArrayList<Products> inventory = new ArrayList<Products>();
    static ArrayList<Products> cart = new ArrayList<Products>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        loadProductsFromFile();
        // Initialize variable for user input
        String input;

        do { // Main screen that shows user possible options and asks for input
            System.out.println("Welcome to the Online Store!");
            System.out.println("Choose an option from below- ");
            System.out.println("\t1- View Products for Purchase");
            System.out.println("\t2- View my Cart");
            System.out.println("\t3- Exit the Store");
            System.out.println("Enter a Command: ");

            input = scanner.nextLine();
            // Create switch statement that handles cases related to each menu item
            switch (input) {
                // Case "1": Show Products
                case "1":
                    showProducts();
                    break;
                // Case "2": Show Cart
                case "2":
                    showCart();
                    // Case "3": Exit
                case "3":
                    System.out.println("You have exited the store");
                    break;
                    // Default:
                default:
                    System.out.println("Input command not found. ");


                    //inventory.add(currentProduct);   add later

            }
        } while (!input.equalsIgnoreCase("3"));
    }

    // Create static method called loadProductsFromFile that return nothing
    public static void loadProductsFromFile () {
        try {
            FileReader inventoryReader = new FileReader("./src/main/java/com/sb/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(inventoryReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                //input split ||
                String[] splitInput = input.split("\\|");

                // Create variables that stores each property
                String productsIdInput = splitInput[0];
                String productsNameInput = splitInput[1];
                float productsPriceInput = Float.parseFloat(splitInput[2]);

                // Create a variable that stores a Product instance using the data from the current line
                Products currentProduct = new Products(productsIdInput, productsNameInput, productsPriceInput);
                // Add the variable to the static inventory variable
                inventory.add(currentProduct);
            }
            // Close the scanner instance
            bufferedReader.close();
            // Handle catch/exception
        } catch (IOException e) {
            System.out.println("From the catch statement");
            e.printStackTrace();
        }


    }

        // Create static method called showProducts that return nothing
    public static void showProducts () {
        // Go through inventory & print each item one at a time
        for(Products currentProducts: inventory) {
            System.out.println(currentProducts);
        }
        // Initialize variable for productIdInput
        String productIdInput;
        // Create do-while loop that runs unless user enters "x"
        do {
            System.out.println("\nEnter the Item ID to add to cart OR Go back to the Main Screen with \"X\". ");
            productIdInput = scanner.nextLine();

            if(!productIdInput.equalsIgnoreCase("x")){
                for(Products products : inventory) {
                    if(products.getProductId().equalsIgnoreCase(productIdInput)){
                    cart.add(products);
                    System.out.println(products.getProductName() + " was added to your cart.");
                    break;
                    }
                }
            }

        } while (!productIdInput.equalsIgnoreCase("X"));
    }
}
