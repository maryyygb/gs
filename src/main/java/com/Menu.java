package com;

import java.util.*;

public class Menu {
    private int choice;


    private Scanner sc;

    // 2. Modify the constructor to accept a Scanner instance
    public Menu(Scanner s) {
        this.sc = s; 
    }

    public void adminMenu() {
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("========= Admin's Menu ========");
        System.out.println(" ");
        System.out.println("Choose the number of your choice.");
        System.out.println(" ");
        System.out.println("0 -   Log Out");
        System.out.println("1 -   Add Grocery Item");
        System.out.println("2 -   View All Items");
        System.out.println("3 -   View All Customer User");
        System.out.println("4 -   View All Inventory Clerk User"); /*
                                                                    * Once the View All user then show another menu with
                                                                    * CRUD Method.
                                                                    */
        System.out.println("5 -   View All Admin User");
        System.out.println("6 -   Add new Admin User");
        System.out.println("7 -   Add new Customer User");
        System.out.println("8 -   Add new Clerk User");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        System.out.print("Enter your choice: ");

        // this.userChoice();

        this.userChoice();

        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("");
    }

    public void customerMenu() {
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("========= Customer's Menu ========");
        System.out.println(" ");
        System.out.println("Choose the number of your choice.");
        System.out.println(" ");
        System.out.println("0 -   Log Out");
        System.out.println("1 -   View all Items");
        System.out.println("2 -   Add item to cart");
        System.out.println("3 -   Update an Item in cart");
        System.out.println("4 -   Delete an Item in cart");
        System.out.println("5 -   Open Cart");
        System.out.println("6 -   Check Out");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        System.out.print("Enter your choice: ");

        this.userChoice();

        // this.setUserChoice(inp);

        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("");
    }

    public void clerkMenu() {
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("========= Inventory Clerk's Menu ========");
        System.out.println(" ");
        System.out.println("Choose the number of your choice.");
        System.out.println(" ");
        System.out.println("0 -   Log Out");
        System.out.println("1 -   View all Items");
        System.out.println("2 -   Add new Item");
        System.out.println("3 -   Update an Item");
        System.out.println("4 -   Delete an Item");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        System.out.print("Enter your choice: ");

        this.userChoice();

        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("");
    }

    public void setUserChoice(int choice) {
        this.choice = choice;
    }

    public int getUserChoice() {
        return this.choice;
    }

    public void userChoice() {
        this.choice = this.sc.nextInt();
        this.sc.nextLine();
    }

    public int getIntChoice() {
        return this.choice;
    }

}
