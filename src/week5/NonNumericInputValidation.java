package week5;
import java.util.Scanner;

public class NonNumericInputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;
        boolean validate = false;

        do {
            System.out.println("Do you like to code in Java?:");
            userInput = in.nextLine();
            if(userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N")){
                validate = true;
                if(userInput.equalsIgnoreCase("Y")){
                    System.out.println("That's great! I do too!");
                } else {
                    System.out.println("That's ok. There are many other wonderful things in life to learn.");
                }
            } else {
                System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
            }
        } while(!validate);

        in.close();
    }
}
