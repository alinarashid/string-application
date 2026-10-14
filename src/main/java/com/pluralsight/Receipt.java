package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        // Item details
        String item = "apples";
        int itemQuantity = 5 ;
        double itemPrice = 1.5;

        // Calculate total
        double totalCost = itemQuantity * itemPrice;

        // Print receipt
        System.out.println("You bought " + itemQuantity + " " + item + " for $" + totalCost);

    }
}
