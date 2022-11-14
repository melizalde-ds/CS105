//Author Miguel Elizalde
package week4;
import java.util.Scanner;

public class SundaySchool {
    public static void main(String[] args) {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        int age;
        String sex;

        //Input
        System.out.println("This program will ask a member's age and sex and determine which class they should attend on Sunday.\n");
        System.out.println("Please enter the member's age:");
        age = Integer.parseInt(in.nextLine());

        //Decision
        if(age>=12){
            System.out.println("Please enter the member's sex:");
            sex= in.nextLine();
            if("Male".equalsIgnoreCase(sex)){
                if(age < 18){
                    System.out.println("The member should attend Young Men.");
                } else {
                    System.out.println("The member should attend Elders Quorum.");
                }
            } else {
                if(age < 18){
                    System.out.println("The member should attend Young Women.");
                } else {
                    System.out.println("The member should attend Relief Society.");
                }
            }
        } else if(age >= 3){
            System.out.println("The member should attend Primary.");
        } else if(age >= 1){
            System.out.println("The member should be in Nursery.");
        } else {
            System.out.println("The member is a Babe in Arms.");
        }

        //Close Scanner
        in.close();
    }
}
