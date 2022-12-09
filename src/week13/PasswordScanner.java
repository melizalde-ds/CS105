package week13;

//import libraries
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class PasswordScanner {
    public static void main(String[] args) {
        System.out.println("Beginning password analysis…");
        try {
            // File and ArrayList prep
            System.out.println("Opening file 'Pwd.txt'.");
            File passFile = new File("Pwd.txt");
            Scanner passScan = new Scanner(passFile);
            ArrayList<String> pwdList = new ArrayList<String>();
            while (passScan.hasNext()) {
                pwdList.add(passScan.nextLine());
            }
            passScan.close();

            // Valid and invalid files created
            File invalid = new File("invalidpwd.txt");
            invalid.createNewFile();
            FileWriter invalidPwd = new FileWriter(invalid);
            File valid = new File("validpwd.txt");
            valid.createNewFile();
            FileWriter validPwd = new FileWriter(valid);

            // Analyze the passwords
            ArrayList<String> errorCode = new ArrayList<String>();
            for (int i = 0; i < pwdList.size(); i++) {
                if (hasUpper(pwdList.get(i), errorCode) && hasLower(pwdList.get(i), errorCode) && hasNumber(pwdList.get(i), errorCode) && hasSpecial(pwdList.get(i), errorCode)) {
                    validPwd.write(pwdList.get(i)+errorCode.get(i));
                } else {
                    invalidPwd.write(pwdList.get(i)+errorCode.get(i));
                }
            }

            //Close all Scanners
            System.out.println("Analysis complete. Closing files.");
            System.out.println("Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the C:\\MyLDSBC\\CS105\\eclipse-workspace\\CD105\\ directory.");
            invalidPwd.close();
            validPwd.close();

        } catch (Exception e) {
            System.out.println("An error occured.");
        }
    }

    //Check for Upper Case
    public static boolean hasUpper(String pwd, ArrayList<String> errorCode) {
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isUpperCase(pwd.charAt(i))) {
                return true;
            }
        }
        errorCode.add(": The password needs at least an Upper Case | Error code 1\n");
        return false;
    }

    //Check for Lower Case
    public static boolean hasLower(String pwd, ArrayList<String> errorCode) {
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isLowerCase(pwd.charAt(i))) {
                return true;
            }
        }
        errorCode.add(": The password needs at least a Lower Case | Error code 2\n");
        return false;
    }

    //Check for Numbers
    public static boolean hasNumber(String pwd, ArrayList<String> errorCode) {
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isDigit(pwd.charAt(i))) {
                return true;
            }
        }
        errorCode.add(": The password needs at least a Number | Error code 3\n");
        return false;
    }

    //Check for Special Characters
    public static boolean hasSpecial(String pwd, ArrayList<String> errorCode) {
        String[] special = { "@", "#", "%", "-", "&", "*" };
        for (String string : special) {
            if (pwd.contains(string)) {
                errorCode.add("\n");
                return true;
            }
        }
        errorCode.add(": The password needs at least a Special Character | Error code 4\n");
        return false;
    }

}
