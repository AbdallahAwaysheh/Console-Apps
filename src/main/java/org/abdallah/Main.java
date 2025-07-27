package org.abdallah;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            System.out.println("What Application do you want to run?");
            System.out.println("1. Shopping Cart");
            System.out.println("2. Temperature Converter");
            System.out.println("3. Calculator");
            System.out.println("4. Weight Converter");
            System.out.println("5. Number Guessing Game ");
            System.out.println("6. Banking Application");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1 -> ShoppingCart.main(args);
                case 2 -> TempConverter.main(args);
                case 3 -> Calculator.main(args);
                case 4 -> WeightConverter.main(args);
                case 5 -> GuessTheNumber.main(args);
                case 6 -> BankingApplication.main(args);
                case 7 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
