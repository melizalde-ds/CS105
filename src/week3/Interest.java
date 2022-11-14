package week3;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        // Declare variables
        Scanner in = new Scanner(System.in);
        int deposit;
        float interestRate;
        float balance;

        // Input
        System.out.println(
                "This program will ask the user for a monthly deposit, and an annual interest rate, and then calculate the balance after 6 months.\n");
        System.out.println("Please enter the amount to be deposited each month:");
        deposit = Integer.parseInt(in.nextLine());
        System.out.println("Please enter the annual interest rate percent:");
        interestRate = Float.parseFloat(in.nextLine());
        interestRate /= (1200);

        // Month 1
        balance = deposit*(1+interestRate);

        // Month 2
        balance += deposit;
        balance *= (1+interestRate);

        // Month 3
        balance += deposit;
        balance *= (1+interestRate);
        
        // Month 4
        balance += deposit;
        balance *= (1+interestRate);

        // Month 5
        balance += deposit;
        balance *= (1+interestRate);

        // Month 6
        balance += deposit;
        balance *= (1+interestRate);

        // Output
        System.out.println("The ending balance after 6 months is: $"+balance);

        // Close Scanner
        in.close();
    }
}
