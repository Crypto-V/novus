package week1;

import java.util.Scanner;

public class LoginScriptUpgraded {

    public static void main(String[] args) {
        String[] validUsernames = {"admin", "vasile", "peter", "john", "root"};
        String[] validPasswords = {"Password", "12345667", "admin", "noclue", "idontknow"};

        Scanner scanner = new Scanner(System.in);
        String enteredUsername = "";
        String enteredPassword = "";
        boolean isPasswordFound = false;
        boolean isUsernameValid = false;
        byte attempts = 0;
        byte maxAttempts = 3;


        while (enteredUsername.isEmpty()) {
            System.out.println("Enter your username: ");
            enteredUsername = scanner.nextLine().toLowerCase();

            if (enteredUsername.isEmpty()) System.out.println("Username cant be left empty!");

            for (String name : validUsernames) {
                if (name.equals(enteredUsername)) {
                    isUsernameValid = true;
                    break;
                }
            }

        }

        while (attempts < maxAttempts && !isPasswordFound) {
            System.out.println("Enter your password: ");
            enteredPassword = scanner.nextLine();

            for (String pass : validPasswords) {
                if (pass.equals(enteredPassword)) {
                    isPasswordFound = true;
                    break;
                }
            }
            if (!isPasswordFound) {
                attempts++;
                System.out.println("Number of attempts left: " + (maxAttempts - attempts));
            }
        }

        if (isPasswordFound && isUsernameValid) {
            System.out.println("Welcome...");
        } else {
            System.out.println("ACCESS DENIED");
            if (!isUsernameValid) System.out.println("Wrong Username");
            else System.out.println("Invalid Password");
        }
    }
}
