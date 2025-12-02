package com;

import java.util.ArrayList;
import java.util.Scanner;

public class ClerkMenu extends AddMenu {

    private GroceryList gl;

    Scanner s;

    private ArrayList<Object[]> deletedItems;

    public ClerkMenu(GroceryList gl) {
        s = new Scanner(System.in);
        deletedItems = new ArrayList<>();

        this.gl = gl;
        // cred.checkEmailActiveC("trigger");
    }

    public void addItem() {

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

        gl.addNewItems(id, itemName, itemWeight, itemPrice, itemStock);
        gl.alert();
    }

    public void updateItem() {
        System.out.println("");
        System.out.println("Note: To update an item in the list,");
        System.out.println("      you must provide the ID first.");
        System.out.println("");
        System.out.print("ID: ");
        int c = s.nextInt();
        s.nextLine();
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        Object[] selectedItem = gl.findProductInAllLists(c);

        int idI = (Integer) selectedItem[0];
        String nameI = (String) selectedItem[1];
        String sizeI = (String) selectedItem[2];
        double priceI = (Double) selectedItem[3];
        int stockI = (Integer) selectedItem[4];

        if (selectedItem != null) {
            System.out.println("The item is found.");

            System.out.println("");
            System.out.println("Before Update: ");
            System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "NAME", "SIZE", "PRICE", "STOCK");

            System.out.printf("%-5s %-15s %-10s %-12.2f %-10s%n", idI, nameI, sizeI, priceI, stockI);

        }

        System.out.println("");

        System.out.println("Now, type below the New Info.");
        System.out.println("");
        System.out.println("--------------------------------------------------");

        System.out.print("Name: ");
        nameI = s.nextLine();

        System.out.print("Size: ");
        sizeI = s.nextLine();

        System.out.print("Price: ");
        priceI = s.nextDouble();
        s.nextLine();

        System.out.print("Stock: ");
        stockI = s.nextInt();
        s.nextLine();

        System.out.println("--------------------------------------------------");

        gl.updateProductInAllLists(c, nameI, sizeI, priceI, stockI);
        System.out.println("--------------------------------------------------");

    }

    public void deleteItem() {
        System.out.println("");
        System.out.println("Note: To remove an item in the list,");
        System.out.println("      you must provide the ID first.");
        System.out.println("");
        System.out.print("ID: ");
        int c = s.nextInt();
        s.nextLine();
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        Object[] selectedItem = gl.findProductInAllLists(c);

        int idI = (Integer) selectedItem[0];
        String nameI = (String) selectedItem[1];
        String sizeI = (String) selectedItem[2];
        double priceI = (Double) selectedItem[3];
        int stockI = (Integer) selectedItem[4];

        if (selectedItem != null) {
            System.out.println("The item is found.");

            System.out.println("");
            System.out.println("Before Deletion: ");
            System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "NAME", "SIZE", "PRICE", "STOCK");

            System.out.printf("%-5s %-15s %-10s %-12.2f %-10s%n", idI, nameI, sizeI, priceI, stockI);

        }

        deletedItems.add(new Object[] { idI, nameI, sizeI, priceI, stockI });

        System.out.println("");

        gl.deleteProductInAllLists(idI, nameI, sizeI, priceI, stockI);

    }

    public void viewAllDeletedItems() {

        System.out.println("\n==================== DELETED ====================");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Weight", "Price", "Stock");
        for (Object[] item : deletedItems) {
            System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
                    item[0], item[1], item[2], item[3], item[4]);
        }
    }

}
