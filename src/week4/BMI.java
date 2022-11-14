//Author: Miguel Elizalde
package week4;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        double height;
        double weight;
        double bmi;

        // Input
        System.out.println("In this program we will calculate a person's BMI.\n");
        System.out.println("Please enter a person's height in inches:");
        height = Double.parseDouble(in.nextLine());
        System.out.println("Please enter a person's weight in pounds:");
        weight = Double.parseDouble(in.nextLine());

        // Compute
        weight *= 0.45359237;
        height *= 0.0254;
        bmi = (weight / Math.pow(height, 2));

        // Decision
        if (bmi < 18.5) {
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Overweight");
        } else {
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Obese");
        }

        // Close Scanner
        in.close();
    }
}
