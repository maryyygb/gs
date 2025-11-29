package com;

import java.util.*;

public class CustomerMenu {

    private ArrayList<Object[]> cart;

    public CustomerMenu() {
        cart = new ArrayList<>();
    }

    public void addItemToCart(int id, String name, String size, double amount, int quantity) {
        cart.add(new Object[] { id, name, size, quantity, amount });
    }

    public void updateItemInCart() {

    }

    public void deleteItemInCart() {

    }

    public void openCart() {
        System.out.println("\n========== CART ==========");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Size", "Price", "Stock");

        for (Object[] item : cart) {
            System.out.printf("%-5s %-15s %-10s PHP%-9.2f %-10s%n",
                    item[0], item[1], item[2], (double) (Integer) item[3], item[4]);
        }
    }

    public void checkOut() {

    }
}
