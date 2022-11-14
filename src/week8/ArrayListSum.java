package week8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int result;
        String input = " ";
        boolean dw1 = false;
        boolean dw2 = false;
        boolean dw3 = false;
        boolean dw4 = false;
        List<Integer> numberList = new ArrayList<Integer>();

        do { // dw1 (Y/N)

             // Reset
            dw1 = false;
            dw2 = false;
            dw3 = false;
            dw4 = false;
            numberList.clear();

            System.out.println("This program will ask the user to enter a series of numbers.");
            System.out.println(
                    "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.");
            System.out.println(
                    "The program will then display the array of numbers and the sum total of those numbers.\n");

            do { // dw2 Input
                if (!("".equals(input))) {
                    do {// dw3 Validate input
                        try {
                            System.out.println("Please enter a number (or just hit enter to finish):");
                            input = in.nextLine();
                            number = Integer.parseInt(input);
                            numberList.add(number);
                            dw3 = true;
                        } catch (Exception e) {
                            System.out.println("Invalid response. Please enter a whole number.\n");
                        }
                    } while (!dw3);
                } else {
                    dw2 = true;
                }
            } while (!dw2);

            // Calculate
            result = sumValues(numberList);

            // Print
            System.out.println("Index\tItem");
            for (int i = 0; i < numberList.size(); i++) {
                System.out.println(i + "\t" + numberList.get(i));
            }
            System.out.println("There are " + numberList.size() + " items in the ArrayList.");
            System.out.println("The sum total of numbers in the ArrayList is " + result);

            do {// dw4 Repeat
                System.out.println("Would you like to play again? (Y/N):");
                input = in.nextLine();
                if ("N".equalsIgnoreCase(input)) {
                    dw1 = true;
                    dw4 = true;
                } else if ("Y".equalsIgnoreCase(input)) {
                    dw4 = true;
                    System.out.println("\n\n");
                } else {
                    System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
                }
            } while (!dw4);
        } while (!dw1);

        // Close Scanner
        in.close();
    }

    public static int sumValues(List<Integer> listToSum) {
        int result = 0;
        for (int i = 0; i < listToSum.size(); i++) {
            result += listToSum.get(i);
        }
        return result;
    }
}
