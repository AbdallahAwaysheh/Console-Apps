package org.abdallah;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int min =1;
        int max = 100;
        int attempts= 1;
        int answer = 0;
        System.out.println("Guess The Number Game");
        System.out.printf("Enter a Number Between %d - %d\n",min,max);
        answer = random.nextInt(min,max+1);
        do {

            System.out.print("What is The Number? : ");
            guess = scanner.nextInt();
            if (guess > answer){
                System.out.println("TOO HIGH, TRY AGAIN!");
            }else if (guess < answer){
                System.out.println("TOO LOW, TRY AGAIN!");
            }else {
                System.out.println("CORRECT THE NUMBER WAS: "+answer);
                System.out.println("The Number Of Attempts : "+attempts);
            }
            attempts++;

        }while (guess != answer);

    }
}
