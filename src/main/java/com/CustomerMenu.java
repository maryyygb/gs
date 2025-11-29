package com;

import java.time.LocalDate;
import java.util.*;

public class CustomerMenu {

    Scanner s = new Scanner(System.in);
    // Get the current date
    LocalDate today = LocalDate.now();

    private ArrayList<Object[]> cart;

    public CustomerMenu() {
        cart = new ArrayList<>();
    }

    public void addItemToCart(int id, String name, String size, int quantity, double price, double amount) {
        cart.add(new Object[] { id, name, size, quantity, price, amount });
    }

    public void updateItemInCart() {

    }

    public void deleteItemInCart() {

    }

    public void openCart() {
        System.out.println("\n========== CART ==========");
        System.out.printf("%-5s %-15s %-13s %-12s %-15s %-15s%n", "ID", "Name", "Size", "Quantity", "Price", "Amount");

        for (Object[] item : cart) {
            System.out.printf("%-5s %-15s %-13s %-12s PHP%-12.2f PHP%-12.2f%n",
                    item[0], item[1], item[2], item[3], (double) item[4],
                    (double) item[5]);
        }
    }

    public void checkOut(String name, String email) {
        System.out.println("==================================================");
        System.out.println("");

        double totalAmount = 0.0;

        for (Object[] item : cart) {
            totalAmount = totalAmount + (double) item[5];
        }

        System.out.println("Please select your Prefer Payment Method:");
        System.out.println("");
        System.out.println(" 1 - Cash (Cash on Delivery)");
        System.out.println(" 2 - Card Payments");
        System.out.println(" 3 - Bank Transfer");
        System.out.println(" 4 - Mobile Wallet");
        System.out.println(" 5 - Online Payment (GCash/PayMaya/Alipay)");
        System.out.println(" 6 - Back");
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("");
        System.out.print("Your Choice: ");

        int choice = s.nextInt();
        s.nextLine();

        while (true) {
            if (choice == 6) {
                System.out.println("You have successfully canceled Check Out!");
                break;
            } else if (choice >= 1 && choice <= 5) {
                System.out.println("==================================================");
                System.out.println("");
                try {

                    System.out.println("Please wait for a moment. We're still processing.");
                    System.out.println("");
                    System.out.println("--------------------- PROCESSING ---------------------");
                    System.out.println("");

                    // Pause execution for 5 seconds (3000 milliseconds)
                    Thread.sleep(5000);
                    System.out.println("");
                    System.out.println("Your Total Amount : PHP" + totalAmount);
                    System.out.println("");
                    System.out.println("Enter the Amount of your Money: ");
                    double money = s.nextDouble();

                    while (true) {
                        if (money < totalAmount) {
                            System.out.println("");
                            System.out.println("The money is short!");
                            System.out.print("Enter another amount: ");

                            money = s.nextDouble();
                        } else if (totalAmount < money) {
                            break;
                        }
                    }

                    System.out.println("");

                    System.out.println("Please wait. The payment process might take awhile.");
                    System.out.println("");
                    System.out.println("--------------------- PROCESSING ---------------------");
                    System.out.println("");

                    // Pause execution for 3 seconds (3000 milliseconds)
                    Thread.sleep(3000);
                    System.out.println("");

                    System.out.println("Process complete!");

                    System.out.println("");
                    System.out.println("");
                    System.out.println("    Payment Successful! Thank you for purchasing!");
                    System.out.println("    Please come back again!");
                    System.out.println("");
                    System.out.println("==================================================");
                    System.out.println("");
                    System.out.println("    Here's your receipt below: ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                    // RECEIPT
                    System.out.println("===================================================");
                    System.out.println("");
                    System.out.println("--------------------- RECEIPT ---------------------");
                    System.out.println("");
                    System.out.println("---------------ONLINE GROCERY STORE----------------");
                    System.out.println("");
                    System.out.println("          onlinegrocerystore@group3.oop           ");
                    System.out.println("    STI St., Brgy. 2nd Year, BS IT, College City        ");
                    System.out.println("                09-IT301P-1st Sem");
                    System.out.println("");
                    System.out.println("==================================================");

                    // Display the name of the Customer
                    System.out.printf("%-36s %10s%n",
                            "Account Name: ", name);

                    // Display the email of the Customer
                    System.out.printf("%-36s %10s%n",
                            "Account Email: ", email);

                    // Print the date
                    System.out.printf("%-36s %10s%n",
                            "Date: ", today);

                    System.out.println("==================================================");

                    System.out.printf("%-5s %-18s %-14s %-11s%n", "Qty.", "Item Name", "Price", "Amount");

                    System.out.println("==================================================");
                    for (Object[] item : cart) {

                        System.out.printf("%-5d %-18s P%-12.2f P%10.2f%n", item[3], item[1], (double) item[4],
                                (double) item[5]);
                    }

                    // Display the Total Amount in Receipt
                    System.out.println("--------------------------------------------------");
                    System.out.println("--------------------------------------------------");
                    System.out.printf("%-36s PHP%10.2f%n",
                            "Total amount ", totalAmount);

                    // Display the Total Cash in Receipt
                    System.out.println("--------------------------------------------------");
                    System.out.printf("%-36s PHP%10.2f%n",
                            "Cash ", money);

                    // Display the total Balance in Receipt
                    System.out.println("--------------------------------------------------");

                    double balance = totalAmount - money;
                    System.out.printf("%-36s PHP%10.2f%n",
                            "Balance ", balance);
                    System.out.println("");

                    System.out.println("**************************************************");
                    System.out.println("");
                    System.out.println("       THANK YOU AND BUY AGAIN NEXT TIME   ");
                    System.out.println("");
                    System.out.println("**************************************************");

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("       Please slide up to see the printed Receipt. Thank you!");
                    System.out.println("");

                    System.out.println("--------------------------------------------------");
                    System.out.println("       Please wait for 5 seconds. ");
                    System.out.println("       We're bringing you back to Home page.");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                    // Pause execution for 5 seconds (3000 milliseconds)
                    Thread.sleep(5000);
                    System.out.println("");

                    break;
                } catch (InterruptedException e) {
                    // If the wait is interrupted by another part of the program,
                    // this block catches the error.
                    System.out.println("Error: The payment has been cancelled!");
                    e.printStackTrace();
                }

            }
        }

    }
}
