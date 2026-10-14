package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String item = "apples";
        int itemQuantity = 5 ;
        double itemPrice = 1.5;

        System.out.printf("You bought "+itemQuantity +" "+ item+ " for $"+ itemQuantity*itemPrice );

    }
}
