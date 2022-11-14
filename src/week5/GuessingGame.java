package week5;

import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean dw1 = false;
        boolean dw2 = false;
        boolean dw3 = false;
        boolean dw4 = false;
        int randNum;
        int userInput = 0;
        int guesses;
        String userAnswer = "";

        do { // Primary program dw1
            randNum = (int) (Math.random() * 100) + 1;
            guesses = 0;

            // Restart
            dw1 = false;
            dw2 = false;
            dw3 = false;
            dw4 = false;

            System.out.println("This program is a guessing game.");
            System.out.println(
                    "The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
            System.out.println("Let's get started! \n");
            System.out.println("I'm thinking of a number between 1 and 100.");
            do { // Game dw2
                do { // Numeric Input Validation dw3
                    try {
                        System.out.println("What is your guess?");
                        userInput = Integer.parseInt(in.nextLine());
                        dw3 = true;
                    } catch (Exception e) {
                        System.out.println("Invalid Response! Please enter a whole number.");
                    }
                } while (!dw3);
                if (randNum < userInput) {
                    System.out.println("Your guess is too high. Try again.");
                    guesses++;
                } else if (randNum > userInput) {
                    System.out.println("Your guess is too low. Try again.");
                    guesses++;
                } else {
                    guesses++;
                    System.out.println("CORRECT! You guessed it in " + guesses + " tries!!");
                    dw2 = true;
                }
            } while (!dw2);
            do { // Non-numeric input validation
                System.out.println("Would you like to play again? (Y/N):");
                userAnswer = in.nextLine();
                if ("N".equalsIgnoreCase(userAnswer)) {
                    dw1 = true;
                    dw4 = true;
                } else if ("Y".equalsIgnoreCase(userAnswer)) {
                    dw4 = true;
                } else {
                    System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
                }
            } while (!dw4);
        } while (!dw1);

        in.close();
    }

}
