package org.abdallah;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.########"); // Format for better readability

        while (true) {
            System.out.print("\nEnter the first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Exiting...");
                break;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /, ^) or 'q' to quit: ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter the second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Exiting...");
                break;
            }
            double num2 = scanner.nextDouble();

            if (operator == 'q') {
                System.out.println("Calculator exited. Goodbye!");
                break;
            }

            double result = 0;
            boolean isValid = true;

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        isValid = false;
                    }
                }
                case '^' -> result = Math.pow(num1, num2);
                default -> {
                    System.out.println("Invalid operator!");
                    isValid = false;
                }
            }

            if (isValid) {
                System.out.println("Result: " + df.format(result));
            }
        }

    }
}
