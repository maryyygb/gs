package com;

import java.util.*;

public class MenuActions {
    Scanner s = new Scanner(System.in);

    private GroceryList storeItems = new GroceryList();
    private SignIn cred = new SignIn();

    public MenuActions() {
        cred.checkEmailActiveC("trigger");
    }

    // 1
    public void addGroceryItem() {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the desired ID for the item: ");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("");

        System.out.print("Enter the Name of the item: ");
        String itemName = s.nextLine();
        System.out.println("");

        System.out.print("Enter the Weight/Size of the item: ");
        String itemWeight = s.nextLine();
        System.out.println("");

        System.out.print("Enter the Price of the item: ");
        double itemPrice = s.nextDouble();
        s.nextLine();
        System.out.println("");

        System.out.print("Enter the Number of Stock of the item: ");
        int itemStock = s.nextInt();
        s.nextLine();
        System.out.println("");

        storeItems.addNewItems(id, itemName, itemWeight, itemPrice, itemStock);
        storeItems.alert();

    }

    // 2
    public void viewAllItems() {
        storeItems.groceryList();
    }

    // 3
    public void viewAllCustomerUsers() {
        cred.getCustomersEmails();
    }

    // 4
    public void viewAllClerkUsers() {
        cred.getClerkEmails();
    }

    // 5
    public void viewAllAdminUsers() {
        cred.getAdminEmails();
    }

    // 6
    public void addNewAdminUser() {
        System.out.print("Type the new email: ");
        String email = s.nextLine();

        System.out.println("");

        System.out.println("Type the password: ");
        String pass = s.nextLine();

        cred.addNewAdmin(email, pass);
    }

    // 7
    public void addNewCustomerUser() {
        System.out.print("Type the new email: ");
        String email = s.nextLine();

        System.out.println("");

        System.out.println("Type the password: ");
        String pass = s.nextLine();

        cred.addNewCustomer(email, pass);
    }

    // 8
    public void addNewClerkUser() {
        System.out.print("Type the new email: ");
        String email = s.nextLine();

        System.out.println("");

        System.out.println("Type the password: ");
        String pass = s.nextLine();

        cred.addNewClerk(email, pass);
    }

}
