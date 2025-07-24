package org.abdallah;

import java.util.Scanner;

public class WeightConverter {
//    kg × 2.205 = lb
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg;
        double lbs;
        double result = 0;
        int choice = 0;
        do {

            System.out.println("Welcome to Weight Converter Application");
            System.out.println("choose one ...");
            System.out.println("1 from kg to lbs");
            System.out.println("2 from lbs to kg ");
            System.out.println("3 Exit the app");
            System.out.print("Enter Your Choice : ");
            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
            }else {
                System.out.println("invalid input..");
            }
            switch (choice){
                case 1 -> {
                    System.out.println("Enter the weight in kg : ");
                    kg = scanner.nextDouble();
                    result = kg *2.205;
                    System.out.println(kg  + "kg is ="+result+"lbs");
                }
                case 2 ->{
                    System.out.println("Enter the weight in lbs : ");
                    lbs = scanner.nextDouble();
                    result = lbs/2.205;
                    System.out.println(lbs+"lbs is = "+result+"kg");
                }
                case 3-> {
                    return;
                }
                default -> System.out.println("Invalid input Please Enter A number between 1 - 3 ");
            }
        }while (true);
    }
}
