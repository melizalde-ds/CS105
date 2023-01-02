/*
 * Program: Final Exam 1
 * Name: Miguel Elizalde
 * Date: 12/10/2022
 * Description: Strings
 */
package Final;

import java.util.Scanner;

public class FinalExam1 {
	public static void main(String[] args) {
		// Declaring variables
		Scanner sIn = new Scanner(System.in);
		String name;
		String ward;
		int males = 0;
		int females = 0;
		int adults;

		// Asking fro name and ward's name
		System.out.print("Please enter your name: ");
		name = sIn.nextLine();
		System.out.print("\nPlease enter the name of your Ward: ");
		ward = sIn.nextLine();

		// Input Validation - Male
		boolean dw1 = false;
		do {
			try {
				System.out.print("\nPlease enter the approximate number of adult males in the ward: ");
				males = Integer.parseInt(sIn.nextLine());
				dw1 = true;
			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
			}
		} while (!dw1);

		// Input Validation - Female
		boolean dw2 = false;
		do {
			try {
				System.out.print("\nPlease enter the approximate number of adult females in the ward: ");
				females = Integer.parseInt(sIn.nextLine());
				dw2 = true;
			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
			}
		} while (!dw2);

		// Sum
		adults = males + females;

		// Output
		System.out.printf("%nThere are %d adult members in %s's %s ward.", adults, name, ward);
		
		// Close Scanner
		sIn.close();
	}// end of main()

}// end of class FinalExam1
