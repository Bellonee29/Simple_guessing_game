package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Guessing Game by Bellonee");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;
        while (true) {
            System.out.println("Enter your Guess Number: ");
            int guessNumber = scanner.nextInt();
            if (guessNumber == randomNumber) {
                System.out.println("Wow you are correct!!!");
                break;
            } else if (guessNumber < randomNumber) {
                System.out.println("Your Guess number is Lower");
            } else {
                System.out.println("your Guess number is higher");
            }
        }
    }
}