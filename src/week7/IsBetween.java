package week7;

import java.util.Scanner;

public class IsBetween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lowNumber = 0;
        int testNumber = 0;
        int highNumber = 0;
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
                    "This program will ask the user for three numbers and determine if the second number lies between the first and the third.\n");
            do {// dw2
                try {
                    System.out.println("Please enter the low number:");
                    lowNumber = Integer.parseInt(in.nextLine());
                    dw2 = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.");
                }
            } while (!dw2);
            do {// dw3
                try {
                    System.out.println("Please enter the number to be tested (the between number):");
                    testNumber = Integer.parseInt(in.nextLine());
                    dw3 = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.");
                }
            } while (!dw3);
            do {// dw4
                try {
                    System.out.println("Please enter the high number:");
                    highNumber = Integer.parseInt(in.nextLine());
                    dw4 = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.");
                }
            } while (!dw4);
            if (isBetween(lowNumber, testNumber, highNumber)) {
                System.out.println(testNumber + " lies between the numbers " + lowNumber + " and " + highNumber + ".");
            } else {
                System.out.println(
                        testNumber + " DOES NOT lie between the numbers " + lowNumber + " and " + highNumber + ".");
            }
            do {
                System.out.println("Would you like to play again? (Y/N):");
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

    public static boolean isBetween(int num1, int num2, int num3) {
        for (int i = num1; i < num3+1 ; i++) {
            if (i == num2) {
                return true;
            }
        }
        return false;
    }
}
