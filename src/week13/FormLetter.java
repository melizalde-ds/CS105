package week13;

// import libraries
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;

public class FormLetter {
    public static void main(String[] args) {
        try {
            // Declaring variables and constructing objects for Students
            File gradesFile = new File("Student Assignment Scores.csv");
            Scanner gradesScan = new Scanner(gradesFile);

            // Array List for Assiagments & Students
            ArrayList<String> titleList = new ArrayList<String>(Arrays.asList(gradesScan.nextLine().split(",")));
            ArrayList<String[]> studentList = new ArrayList<String[]>();
            while (gradesScan.hasNext()) {
                studentList.add(gradesScan.nextLine().split(","));
            }
            ArrayList<String[]> studentLetters = zeroAssignmentStudents(studentList, titleList);

            // Declaring variables and constructing objects for Letters
            File letterFile = new File("Warning Letter to Student -.txt");
            Scanner letterScan = new Scanner(letterFile);
            ArrayList<String> letterList = new ArrayList<String>();
            while (letterScan.hasNext()) {
                letterList.add(letterScan.nextLine());
            }

            // Create letters
            System.out.println("Creating letters for:\n");
            for (String[] student : studentLetters) {
                letterBuilder(student, letterList);
            }

            // Closing Scanner
            letterScan.close();
            gradesScan.close();
        } catch (Exception e) {
            System.out.println("An error occured");
        }

    }

    // Filters the Students with Assignments with Zero
    public static ArrayList<String[]> zeroAssignmentStudents(ArrayList<String[]> studentsList,
            ArrayList<String> titleList) {
        ArrayList<String[]> studentsZero = new ArrayList<String[]>();
        ArrayList<String> temp = new ArrayList<String>();

        // Checks the grade of the Students
        for (String[] studentGrade : studentsList) {
            temp.add(studentGrade[0]);
            for (int i = 0; i < studentGrade.length; i++) {
                if (studentGrade[i].equals("0")) {
                    temp.add(titleList.get(i));
                }
            }
            if (temp.size() < 2) {
                temp.clear();
            } else {
                studentsZero.add(temp.toArray(new String[temp.size()]));
                temp.clear();
            }
        }
        return studentsZero;
    }

    // Builds the letters
    public static void letterBuilder(String[] studentZero, ArrayList<String> letterBody) {
        try {
            // Create the Letter
            File student = new File("Warning Letter to Student -" + studentZero[0] + ".txt");
            student.createNewFile();
            FileWriter letter = new FileWriter(student);

            // Creating letters
            letter.write(studentZero[0]+"\n");
            for (String string : letterBody) {
                letter.write(string+"\n");
            }
            for (int i = 1; i < studentZero.length; i++) {
                letter.write(studentZero[i]+" ");
            }
            System.out.println(studentZero[0]);
            
            // Closing the File Writer
            letter.close();
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
