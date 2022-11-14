package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScores {
    public static void main(String[] args) {
        ArrayList<String[]> classRoster = new ArrayList<String[]>();
        String data;
        try {
            File gradesFile = new File("Student Test Grades.csv");
            Scanner fileScanner = new Scanner(gradesFile);
            while (fileScanner.hasNextLine()) {
                data = fileScanner.nextLine();
                classRoster.add(data.split(","));
            }
            fileScanner.close();
            System.out.println("------------------------------------------------------");
            System.out.println("Student\t\tTest 1\tTest 2\tTest 3");
            System.out.println("------------------------------------------------------\n");
            for (int i = 1; i < classRoster.size(); i++) {
                System.out.printf("%s\t%s\t%s\t%s\n", classRoster.get(i)[0],
                        setGrade(Integer.parseInt(classRoster.get(i)[1])),
                        setGrade(Integer.parseInt(classRoster.get(i)[2])),
                        setGrade(Integer.parseInt(classRoster.get(i)[3])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static String setGrade(Integer grade) {
        if (grade > 94) {
            return "A";
        } else if (grade > 90) {
            return "A-";
        } else if (grade > 87) {
            return "B+";
        } else if (grade > 84) {
            return "B";
        } else if (grade > 80) {
            return "B-";
        } else if (grade > 77) {
            return "C+";
        } else if (grade > 74) {
            return "C";
        } else if (grade > 70) {
            return "C-";
        } else if (grade > 67) {
            return "D+";
        } else if (grade > 64) {
            return "D";
        } else if (grade > 60) {
            return "D-";
        } else {
            return "E";
        }
    }
}