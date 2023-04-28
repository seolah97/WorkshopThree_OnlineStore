package com.sb;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class OnlineStore {
    static ArrayList<Products> inventory = new ArrayList<Products>();
    static ArrayList<Products> cart = new ArrayList<Products>();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        // Run custom static method called loadProductsFromFile

        // Create main menu:
        // Initialize variable for user input
        // Show prompt for user showing the possible options and asking for an input
        // Create do-while loop that runs unless the user enters "3"
        // Create switch statement that handles cases related to each menu item
        // Case "1": Show Products
        // Runs custom static method called showProducts
        // Case "2": Show Cart
        // Runs custom static method called showCart
        // Case "3": Exit
        // Print message that says "Exiting"
        // Default:
        // Show message "Input command not found"

    }

    // Create static method called loadProductsFromFile that return nothing
    static void loadProductsFromFile() {
        try{
            FileReader inventoryReader = new FileReader("./src/main/java/com/sb/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(inventoryReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                //input split ||
                String[] splitInput = input.split(Pattern.quote("|"));

                String id = splitInput[0];
                String name = splitInput[1];
                float price = Float.parseFloat(splitInput[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    // Create an instance of FileReader with an approximate path of "./src/main/java/com/<YourInitial>/inventory.csv"
    // Create an instance of BufferedReader that takes in the FileInputStream instance above

    // Create a while loop that iterates through each line of the file
    // Parse/Split the line on "|" and store in variable: Hint .split("\\|");

    // Create variables that stores each property
    // int id
    // String name
    // float price

    // Create a variable that stores a Product instance using the data from the current line

    // Add the variable to the static inventory variable
    // Close the scanner instance
    // Handle catch/exception

    // Create static method called showProducts that return nothing

    // Create static method called showCart that return nothing
    // Create sub-menu
    // Initialize subInput variable for user input
    // Show prompt for user showing the possible options and asking for an input
    // Create do-while loop that runs unless the user enters "2"
    // Create switch statement that handles cases related to each menu item
    // Case "1": Checkout
    // Runs custom static method called checkout
    // Case "2": Go Back To Home Screen
    // Print message that says "Going back to home screen"
    // Default:
    // Show message "Input command not found"





    }
}