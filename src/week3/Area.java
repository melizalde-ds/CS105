//Author: Miguel Elizalde

package week3;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        String input;
        int sqWidth;
        int recWidth;
        int recHeight;

        // Ask for input
        System.out.println("Please enter the width of the square:");
        input = in.nextLine();
        sqWidth = Integer.parseInt(input);
        System.out.println("Please enter width of the rectangle:");
        input = in.nextLine();
        recWidth = Integer.parseInt(input);
        System.out.println("Please enter height of the rectangle:");
        input = in.nextLine();
        recHeight = Integer.parseInt(input);

        // Results
        System.out
                .println("The area of a square with a width of " + sqWidth + " is " + (int) Math.pow(sqWidth, 2) + ".");
        System.out.println("The area of a rectangle with a width of " + recWidth + " and a height of " + recHeight
                + " is " + recHeight * recWidth + ".");

        // Close Scanner
        in.close();
    }
}
