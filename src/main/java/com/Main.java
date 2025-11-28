package com;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create the single Scanner instance early in Main
        Scanner s = new Scanner(System.in);

        // Pass the scanner 's' when initializing the Menu object
        Menu menu = new Menu(s);

        // Menu menu = new Menu();
        MenuActions action = new MenuActions();

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

                    menu.clerkMenu();

                    int choice = menu.getIntChoice();

                    if (choice == 0) {
                        System.out.println("You have successfully log out!");
                        break;
                    } else if (choice == 1) {
                        action.viewAllItems();
                    } else if (choice == 2) {
                        action.addItemToCart();
                    } else if (choice == 3) {
                        action.updateItemInCart();
                    } else if (choice == 4) {
                        action.viewAllAdminUsers();
                    } else if (choice == 5) {
                        action.addNewAdminUser();
                    } else if (choice == 6) {
                        action.addNewAdminUser();
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
