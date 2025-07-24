package org.abdallah;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.from Celsius to Fahrenheit");
            System.out.println("2.from Fahrenheit to Celsius");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Enter a temperature in Celsius:");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
                } else if (choice == 2) {

                    System.out.println("Enter a temperature in Fahrenheit:");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
                } else if (choice == 3) {
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                }
            }else {
                System.out.println("Invalid input. Please enter a number.");
                System.out.println("Exiting... Goodbye!");
                return;
            }
        }
    }
}
//Formula
//        (32°F − 32) × 5/9 = 0°C

