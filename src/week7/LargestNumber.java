package week7;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
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
                    "This program will ask the user for three numbers and determine which of the three is the largest.\n");
            do {// dw2
                try {
                    System.out.println("Please enter the first number:");
                    num1 = Integer.parseInt(in.nextLine());
                    dw2 = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.");
                }
            } while (!dw2);
            do {// dw3
                try {
                    System.out.println("Please enter the second number:");
                    num2 = Integer.parseInt(in.nextLine());
                    dw3 = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.");
                }
            } while (!dw3);
            do {// dw4
                try {
                    System.out.println("Please enter the third number:");
                    num3 = Integer.parseInt(in.nextLine());
                    dw4 = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.");
                }
            } while (!dw4);
            System.out.println("The largest of the three numbers is: " + largestNumber(num1, num2, num3));
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

    public static int largestNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

}
