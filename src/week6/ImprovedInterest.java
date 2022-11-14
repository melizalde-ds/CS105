package week6;

import java.util.Scanner;

public class ImprovedInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double deposit = 0;
        double interest = 0;
        double balance = 0;
        int months = 0;
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
                    "This program will ask the user for a monthly deposit, an annual interest rate, and the number of months the user plans on saving.");
            System.out.println("It will then show the monthly balance over the period of planned savings.");
            do {// dw2
                try {
                    System.out.println("Please enter the amount to be deposited each month:");
                    deposit = Double.parseDouble(in.nextLine());
                    dw2 = true;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a number.");
                }
            } while (!dw2);
            do {// dw3
                try {
                    System.out.println("Please enter the annual interest rate:");
                    interest = Double.parseDouble(in.nextLine());
                    interest /= 1200;
                    dw3 = true;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a number.");
                }
            } while (!dw3);
            do {// dw4
                try {
                    System.out.println("Please enter the number of months you plan to save:");
                    months = Integer.parseInt(in.nextLine());
                    dw4 = true;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a whole number.");
                }
            } while (!dw4);

            System.out.println(
                    "The following table shows the balance of the account for each month of the designated savings period.");
            System.out.println("Month\t\tBalance");
            for (int i = 1; i < months + 1; i++) {
                balance += deposit;
                balance *= (1+interest);
                System.out.printf("Month "+i+":"+"\t$%,.2f\n",balance);
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
