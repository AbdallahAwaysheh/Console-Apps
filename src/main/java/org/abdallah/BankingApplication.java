package org.abdallah;

import java.util.Scanner;



public class BankingApplication {

    static double balance = 0;
    static Scanner scanner = new Scanner(System.in);
    static int getChoice() {
        System.out.println("Choose an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        return scanner.nextInt();
    }
    static void deposit() {
        System.out.println("Enter the amount to deposit:");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
            System.out.println("press any key and Enter to continue...");
            scanner.next();
        } else {
            System.out.println("deposit amount cannot be negative.");
            System.out.println("press any key and Enter to continue...");
            scanner.next();
        }

    }
    static void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Current balance: $" + balance);
                System.out.println("press any key and Enter to continue...");
                scanner.next();
            } else {
                System.out.println("Insufficient funds. Current balance: $" + balance);
                System.out.println("press any key and Enter to continue...");
                scanner.next();
            }
        } else {
            System.out.println("withdrawal amount cannot be negative.");
            System.out.println("press any key and Enter to continue...");
            scanner.next();
        }
    }
    public static void main(String[] args) {
        do {
            System.out.println("Welcome to the Banking Application");
            int choice = getChoice();

            switch (choice) {
                case 1 -> {
                    deposit();
                }
                case 2 -> {
                    withdraw();
                }
                case 3 -> {
                    System.out.println("Current balance: $" + balance);
                    System.out.println("press any key and Enter to continue...");
                    scanner.next();
                }
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");

            }
        }while (true);
    }
}
