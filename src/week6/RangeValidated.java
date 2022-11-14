package week6;

import java.util.Scanner;

public class RangeValidated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startingNumber = 0;
        int endingNumber = 0;
        int multiplyNumber = 0;
        boolean dw1 = false;
        boolean dw2 = false;
        boolean dw3 = false;
        boolean dw4 = false;
        boolean dw5 = false;
        String input;

        do {// dw1
            // Reset
            dw1 = false;
            dw2 = false;
            dw3 = false;
            dw4 = false;
            dw5 = false;

            System.out.println(
                    "This program will ask the user for three numbers:\n * A starting number\n * An ending number\n * A multiplier");
            System.out.println(
                    "The program will multiply each number between the starting number and ending number by the multiplier");
            do {// dw2
                try {
                    System.out.println("Please enter the starting number:");
                    startingNumber = Integer.parseInt(in.nextLine());
                    dw2 = true;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a whole number.");
                }
            } while (!dw2);
            do {// dw3
                try {
                    System.out.println("Please enter the ending number:");
                    endingNumber = Integer.parseInt(in.nextLine());
                    dw3 = true;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a whole number.");
                }
            } while (!dw3);
            do {// dw4
                try {
                    System.out.println("Please enter the multiplier:");
                    multiplyNumber = Integer.parseInt(in.nextLine());
                    dw4 = true;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a whole number.");
                }
            } while (!dw4);

            System.out.println(
                    "The following table shows the balance of the account for each month of the designated savings period.");
            System.out.println("Month\t\tBalance");
            for (int i = startingNumber; i < endingNumber + 1; i++) {
                System.out.println("Multiplying " + i + " by " + multiplyNumber + " results in: "+i*multiplyNumber);
            }
            do {
                System.out.println("Would you like to make another calculation? (Y/N):");
                input = in.nextLine();
                if ("N".equalsIgnoreCase(input)) {
                    dw1 = true;
                    dw5 = true;
                } else if ("Y".equalsIgnoreCase(input)) {
                    dw5 = true;
                } else {
                    System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
                }
            } while (!dw5);
        } while (!dw1);
        in.close();
    }
}
