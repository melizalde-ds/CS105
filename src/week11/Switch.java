package week11;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        int sInput;
        boolean dw1 = false;
        ArrayList<String> apostles = new ArrayList<String>();
        Collections.addAll(apostles, "Russell M. Nelson", "Dallin H. Oaks", "M. Russell Ballard", "Jeffrey R. Holland",
                "Henry B. Eyring", "Dieter F. Uchtdorf", "David A. Bednar", "Quentin L. Cook", "D. Todd Christofferson",
                "Neil L. Andersen", "Ronald A. Rasband", "Gary E. Stevenson", "Dale G. Renlund", "Gerrit W. Gong",
                "Ulisses Soares");
        do {
            System.out.println(
                    "/nThis program will show the name of an Apostle based on the order he was called, with the Prophet positioned at #1.");
            System.out.println(
                    "Enter a number between 1 and 15 to display the corresponding Apostle (or press Enter to quit):");
            input = in.nextLine();
            if (!"".equals(input)) {
                sInput = Integer.parseInt(input);
                switch (sInput) {
                    case 1:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 2:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 3:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 4:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 5:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 6:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 7:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 8:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 9:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 10:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 11:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 12:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 13:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 14:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    case 15:
                        System.out.println("Number " + input + " is: " + apostles.get(sInput - 1));
                        break;
                    default:
                        System.out.println("That's not a valid choice. Try again.");
                        break;
                }
            } else {
                dw1 = true;
            }
        } while (!dw1);
        in.close();
    }
}
