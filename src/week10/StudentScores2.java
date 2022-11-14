package week10;

import java.io.File;
import java.util.Scanner;

public class StudentScores2 {
    public static void main(String[] args) {
        String[] temp;
        String format ="%s \t\t%s\t%s\t%s\t%s\t%s\t%s\n";
        try {
            File str = new File("Student Assignment Scores.csv");
            Scanner in = new Scanner(str);
            temp = in.nextLine().split(",");
            System.out.printf(format, temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
            System.out.println("-------------------------------------------------------------------------------------\n");
            do {
                temp = in.nextLine().split(",");
                System.out.printf(format, temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
            } while (in.hasNextLine());
            in.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
