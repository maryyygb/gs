package com;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create the single Scanner instance early in Main
        Scanner s = new Scanner(System.in);

        // Pass the scanner 's' when initializing the Menu object
        Menu menu = new Menu(s);

        GroceryList gl = new GroceryList();
        MenuActions action = new MenuActions();
        CustomerMenu cmenu = new CustomerMenu();
        ClerkMenu imenu = new ClerkMenu();

        SignIn sign = new SignIn();

        System.out.println("==================================================");
        System.out.println("========== WELCOME TO OUR GROCERY STORE ==========");

        while (true) {
            System.out.println("==================================================");
            System.out.println("");
            System.out.println("===== To proceed please select a role first. =====");
            System.out.println("");
            System.out.println("      1 - Admin Role");
            System.out.println("      2 - Customer Role");
            System.out.println("      3 - Inventory Clerk Role");
            System.out.println("      4 - Exit");
            System.out.println("==================================================");
            System.out.println("==================================================");
            System.out.println("");
            System.out.print("Your choice is: ");
            int id = s.nextInt();
            s.nextLine();

            sign.setIdRole(id);
            System.out.println("");
            System.out.println("==================================================");

            if (id == 1) {
                sign.setRole("Admin");

                System.out.println("");

                // ADMIN ACCESS
                System.out.println("Note: Only Admin is allowed to sign in here.");
                System.out.println("");

                // Calling the Admin Sign In Method in the Auth Class
                sign.adminSignIn();

                System.out.println("=============================");
                System.out.println(" ");
                System.out.println("Welcome back, " + sign.getName().toUpperCase() + "!");
                System.out.println(" ");

                while (sign.connect()) {

                    menu.adminMenu();

                    int choice = menu.getIntChoice();

                    if (choice == 0) {
                        System.out.println("You have successfully log out!");
                        break;
                    } else if (choice == 1) {
                        action.addGroceryItem();
                    } else if (choice == 2) {
                        action.viewAllItems();
                    } else if (choice == 3) {
                        action.viewAllCustomerUsers();
                    } else if (choice == 4) {
                        action.viewAllClerkUsers();
                    } else if (choice == 5) {
                        action.viewAllAdminUsers();
                    } else if (choice == 6) {
                        action.addNewAdminUser();
                    } else if (choice == 7) {
                        action.addNewCustomerUser();
                    } else if (choice == 8) {
                        action.addNewClerkUser();
                    } else if (choice > 8) {
                        System.out.println("Wrong Input. Try again.");
                    }
                }

            } else if (id == 2) {
                sign.setRole("Customer");

                System.out.println("");

                // ADMIN ACCESS
                System.out.println("Note: Only Customer Users are allowed to sign in here.");
                System.out.println("");

                // Calling the Customer Sign In Method in the Auth Class
                sign.customerSignIn();

                System.out.println("=============================");
                System.out.println(" ");
                System.out.println("Welcome back, " + sign.getName().toUpperCase() + "!");
                System.out.println(" ");

                while (sign.connect()) {

                    menu.customerMenu();

                    int choice = menu.getIntChoice();

                    if (choice == 0) {
                        System.out.println("You have successfully log out!");
                        System.out.println("");
                        break;
                    } else if (choice == 1) {
                        action.viewAllItems();
                    } else if (choice == 2) {

                        System.out.println("Please select the ID of the Product/Item you wish to add.");
                        System.out.println("");
                        System.out.println("");
                        System.out.print("Item selected: ID ");

                        int idC = s.nextInt();
                        s.nextLine(); // Consume the newline character

                        System.out.print("Enter Quantity: ");
                        int quantity = s.nextInt();
                        s.nextLine();

                        Object[] selectedProduct = gl.findProductInAllLists(idC);

                        if (selectedProduct != null) {
                            // Product found, extract the data from the returned array
                            int idS = (int) selectedProduct[0];
                            String name = (String) selectedProduct[1];
                            String size = (String) selectedProduct[2];
                            double price = (double) selectedProduct[3];
                            // int stocks = (int) selectedProduct[4];

                            double amount = quantity * price;

                            cmenu.addItemToCart(idS, name, size, quantity, price, amount);
                            System.out.println("");
                            System.out.println("");
                            System.out.println("Successfully added " + name + " to the cart.");
                            System.out.println("");

                        } else {
                            // If the search method returned null
                            System.out.println("Error: Product ID " + idC + " not found.");
                        }

                    } else if (choice == 3) {
                        cmenu.updateItemInCart();
                    } else if (choice == 4) {
                        cmenu.deleteItemInCart();
                    } else if (choice == 5) {
                        cmenu.openCart();
                    } else if (choice == 6) {
                        cmenu.checkOut(sign.getName(), sign.getEmail());
                    } else if (choice > 6) {
                        System.out.println("Wrong Input. Try again.");
                    }
                }

            } else if (id == 3) {
                sign.setRole("Clerk");

                System.out.println("");

                // ADMIN ACCESS
                System.out.println("Note: Only Customer Users are allowed to sign in here.");
                System.out.println("");

                // Calling the Clerk Sign In Method in the Auth Class
                sign.clerkSignIn();

                System.out.println("=============================");
                System.out.println(" ");
                System.out.println("Welcome back, " + sign.getName().toUpperCase() + "!");
                System.out.println(" ");

                while (sign.connect()) {
                    menu.clerkMenu();

                    int choice = menu.getIntChoice();

                    if (choice == 0) {
                        System.out.println("You have successfully log out!");
                        break;
                    } else if (choice == 1) {
                        action.viewAllItems();
                    } else if (choice == 2) {
                        action.addGroceryItem();
                    } else if (choice == 3) {
                        imenu.updateItem();
                    } else if (choice == 4) {
                        imenu.deleteItem();
                    } else if (choice > 4) {
                        System.out.println("Wrong Input. Try again.");
                    }
                }

            } else if (id == 4) {
                System.out.println("");
                System.out.println("You have successfully logout!");
                break;
            } else {
                System.out.println("");

                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("WARNING! Invalid input. Please try again.");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                System.out.println("");
            }

        }

    }
}
