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
                    }
                    System.out.println("Hey");

                }

            } else if (id == 2) {
                sign.setRole("Customer");
                sign.customerSignIn();

            } else if (id == 3) {
                sign.setRole("Clerk");
                sign.clerkSignIn();

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
