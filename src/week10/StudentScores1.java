package week10;
import java.util.Scanner;
import java.io.File;

public class StudentScores1 {
    public static void main(String[] args) {
        try {
            File str = new File("Student Assignment Scores.csv");
            Scanner in = new Scanner(str);
            do {
                System.out.println(in.nextLine());
            } while (in.hasNextLine());
            in.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
