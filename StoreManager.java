/*
Program that creates seperate lists of product names and prices, and allows
the user to search for a product by name. 
Author: James Smith
E-mail: jsmith1863@kctcs.edu
Last Changed: October 31, 2018
*/
import java.util.Scanner;

public class StoreManager {
    
    //globally declared constants
    static final int INVENTORY_SIZE = 10; 
    static final int CREATE_PRODUCT_LIST = 1; 
    static final int SEARCH = 2; 
    static final int ENTER_PRODUCT = 3;
    static final int QUIT = 9; 
    static final int INVALID_OPTION = -1; 
    static final String INVALID_MESSAGE = "\nThat is not a valid option";
    
    //gloablly declared variables
    static Scanner keyboard = new Scanner(System.in); 
    static String[] productName = new String[INVENTORY_SIZE];
    static double[] productPrice = new double[INVENTORY_SIZE];
    static int count; 
    
    public static void main(String[] args) { 
        int userChoice = INVALID_OPTION; 
        
        System.out.println("=================================================================================================================");
        System.out.println("This program will help store products and their prices. You will also be able to search for items in your system."); 
        System.out.println("=================================================================================================================\n");
            
        do {
            printMainMenu(); 
            userChoice = getUserChoice(); 
            
            
            switch (userChoice) {
                case CREATE_PRODUCT_LIST: 
                    System.out.println("\n==============================================================================");
                    createProductList(); 
                    System.out.println("==============================================================================\n");
                    break;
                case SEARCH: 
                    System.out.println("\n==============================================================================");
                    searchProduct(); 
                    System.out.println("==============================================================================\n");
                    break; 
                default: 
                    System.out.println(INVALID_OPTION); 
            }
        } while(userChoice != QUIT); 
    } //end of main() method
    
    static void printMainMenu() {
        System.out.println("\t" + CREATE_PRODUCT_LIST + "\tTo create the product list\n"); 
        System.out.println("\t" + SEARCH + "\tTo search for a specific product\n");
        System.out.println("\t" + QUIT + "\tTo exit\n"); 
    } //end of printMainMenu() method
    
    static void printEntryMenu() {
        System.out.println("==============================================================================\n");
        System.out.println("\t" + ENTER_PRODUCT + "\tTo enter a product\n"); 
        System.out.println("\t" + QUIT + "\tTo return to the main menu\n"); 
    } //end of printEntryMenu() method
    
    static int getUserChoice() {
        int choice; 
        
        System.out.print("Please enter your choice: "); 
        choice = keyboard.nextInt(); 
        keyboard.nextLine(); 
        
        return choice; 
    } //end of getUserChoice() method
    
    static void createProductList() {
        int userChoice = INVALID_OPTION; 
        
        clearProductList(); 
        count = 0; 
        
        System.out.println("\nPlease enter names and prices of products, maximum of " + INVENTORY_SIZE + ". \n"); 
        
        do { 
            printEntryMenu(); 
            userChoice = getUserChoice(); 
            
            switch (userChoice) {
                case ENTER_PRODUCT: 
                    enterProduct(); 
                    break; 
                case QUIT: 
                    break; 
                default: 
                    System.out.println(INVALID_OPTION); 
            }
        } while(userChoice != QUIT); 
    } //end of createProductList() method
    
    static void enterProduct() {
        
        System.out.println("\n==============================================================================");
        //stores the product in the productName array
        System.out.println("\nProduct Name: "); 
        productName[count] = keyboard.nextLine(); 
        
        //stores the price of the product in the productPrice array
        System.out.println("\nProduct's Price: "); 
        productPrice[count] = keyboard.nextDouble();
    
        //increases count each time the enterProduct() is called, to fill the arrays 
        count++;
    } //end of enterProduct() 
    
    static void searchProduct() {
        int foundIndex = -1; 
        boolean found = false; 
        String name = null; 
        
        System.out.print("\nPlease enter the name of the product you would like to search for: "); 
        name = keyboard.nextLine(); 
        
        for (int i = 0; i < count; i++) {
            if (name.equals(productName[i])) {
                found = true;
                foundIndex = i; 
            }
        }
        
        if (found) {
            System.out.println("\n\tFound " + name + " in our inventory."); 
            System.out.println("\n\tPrice " + productPrice[foundIndex]); 
        }
        else {
            System.out.println("\n\tDid not find " + name + " in our inventory.");
        }
    } //end of searchProduct method
    
    static void clearProductList() {
        for (int i = 0; i < count; i++) {
            productName[i] = null; 
            productPrice[i] = 0; 
        }
        
        count = 0; 
    } //end of clearProductList() method
    
    

} //end of class
