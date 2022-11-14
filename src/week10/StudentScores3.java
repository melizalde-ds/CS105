package week10;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentScores3 {
    public static void main(String[] args) {
        List<String> temp = new ArrayList<>();
        String format ="%s \t\t%s\n";
        try {
            File str = new File("Student Assignment Scores.csv");
            Scanner in = new Scanner(str);
            in.nextLine();
            System.out.printf(format, "Student", "Assignment with 0");
            System.out.println("-------------------------------------------------------\n");
            do {
                temp = Arrays.asList(in.nextLine().split(","));
                for (int i = 0; i < temp.size(); i++) {
                    if (temp.get(i).equals("0")){
                        System.out.printf(format, temp.get(0), i);
                    }   
                }
            } while (in.hasNextLine());
            in.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

