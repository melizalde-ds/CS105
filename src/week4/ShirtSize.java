//Author: Miguel Elizalde
package week4;

import java.util.Scanner;

public class ShirtSize {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        int chestSize;

        // Input
        System.out.println(
                "In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.");
        System.out.println("Please enter the customer's chest measurement in inches:");
        chestSize = Integer.parseInt(in.nextLine());

        // Decision making
        if (chestSize < 38) {
            System.out.println(
                    "A customer with a chest measurement of " + chestSize + " inches needs to order a size S.");
        } else if (chestSize >= 38 && chestSize < 40) {
            System.out.println(
                    "A customer with a chest measurement of " + chestSize + " inches needs to order a size M.");
        } else if (chestSize >= 40 && chestSize < 43) {
            System.out.println(
                    "A customer with a chest measurement of " + chestSize + " inches needs to order a size L.");
        } else if (chestSize >= 43 && chestSize < 46) {
            System.out.println(
                    "A customer with a chest measurement of " + chestSize + " inches needs to order a size XL.");
        } else {
            System.out.println(
                    "A customer with a chest measurement of " + chestSize + " inches needs to order a size XXL.");
        }

        // Close Scanner
        in.close();

    }
}
