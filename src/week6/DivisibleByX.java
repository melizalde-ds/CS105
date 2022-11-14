package week6;

import java.util.Scanner;

public class DivisibleByX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startingNumber = 0;
        int endingNumber = 0;
        int testNumber = 0;
        boolean dw1 = false;
        boolean dw2 = false;
        boolean dw3 = false;
        String input = "";

        do { // dw1
             // Reset
            dw1 = false;
            dw2 = false;
            dw3 = false;

            System.out.println(
                    "In this program, we will display a series of numbers divisible by an integer specified by the user.");
            System.out.println(
                    "You will ask the user for the starting number, the ending number, and the integer to be considered.\n");
            do { // dw2
                try {
                    System.out.println("Please enter the starting number:");
                    startingNumber = Integer.parseInt(in.nextLine());
                    System.out.println("Please enter the ending number:");
                    endingNumber = Integer.parseInt(in.nextLine());
                    System.out.println("Please enter the test number:");
                    testNumber = Integer.parseInt(in.nextLine());
                    dw2 = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.");
                }
            } while (!dw2);
            System.out.println("Here are the numbers between " + startingNumber + " and " + endingNumber
                    + " that are divisible by " + testNumber + ":");
            for (int i = startingNumber; i < endingNumber + 1; i++) {
                if (i % testNumber == 0) {
                    System.out.println(i);
                }
            }
            do {
                System.out.println("Would you like to play again? (Y/N):");
                input = in.nextLine();
                if ("N".equalsIgnoreCase(input)) {
                    dw1 = true;
                    dw3 = true;
                } else if ("Y".equalsIgnoreCase(input)) {
                    dw3 = true;
                } else {
                    System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
                }
            } while (!dw3);

        } while (!dw1);

        in.close();
    }
}
