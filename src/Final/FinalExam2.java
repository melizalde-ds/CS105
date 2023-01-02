/*
 * Program: Final Exam 2
 * Name: Miguel Angel Elizalde Cruz
 * Date: 12/10/2022
 * Description: Arrays and Functions
 */
package Final;

import java.util.Scanner;
import java.util.ArrayList;

public class FinalExam2 {

	public static void main(String[] args) {
		// Declaring variables and arrays
		Scanner sIn = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();

		// Instructions
		System.out.println("In this program, you will ask the user to enter a list of numbers.");
		System.out.println(
				"The program will then find the sum of the numbers and determine which of the numbers is the largest.\n");

		// Input
		boolean dw1 = false;
		String input;
		do {
			System.out.print("Please enter a number (or just hit enter to finish): ");
			input = sIn.nextLine();
			if (!input.equals("")) {
				numList.add(Integer.parseInt(input));
			} else {
				dw1 = true;
			}
		} while (!dw1);

		// Output
		System.out.printf("%nThe sum of the list of numbers is: %d.", addNumbers(numList));
		System.out.printf("%nThe largest number in the list is: %d.", largestNumber(numList));

		// Scanner close
		sIn.close();
	}// end of main()

	public static int addNumbers(ArrayList<Integer> numList) {
		int sum = 0;
		for (Integer integer : numList) {
			sum += integer;
		}
		return sum;
	}// end of addNumbers()

	public static int largestNumber(ArrayList<Integer> numList) {
		int largest = numList.get(0);
		for (Integer integer : numList) {
			if (largest < integer) {
				largest = integer;
			}
		}
		return largest;
	}// end of largestNumber()

}// end of class FinalExam2
