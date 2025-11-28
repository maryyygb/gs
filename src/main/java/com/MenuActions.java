package com;

import java.util.*;

public class MenuActions {
    private GroceryList storeItems = new GroceryList();

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

    public void viewAllItems() {
        storeItems.groceryList();
    }

    public void viewAllCustomerUsers() {

    }
}
