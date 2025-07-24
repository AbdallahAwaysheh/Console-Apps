package org.abdallah;

import java.util.Scanner;

public class ShoppingCart {
    private static void println(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            println("you can quit at any time by typing quit or 0");
            println("What item do you want to buy?");
            String item = scanner.nextLine();
            if (item.equals("quit")|| item.equals("0")) {
                break;
            }
            println("How many " + item + " do you want to buy?");
            int quantity = scanner.nextInt();
            if (quantity == 0) {
                break;
            }
            println("What is the price per item?");
            double price = scanner.nextDouble();
            if (price == 0) {
                break;
            }
            double total = price * quantity;
            println("Your total is $" + total + " for " + quantity + " " + item + " at $" + price + " per item.");

        }while (true);
    }
}
