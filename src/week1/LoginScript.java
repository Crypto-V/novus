package week1;

import java.util.Scanner;

public class LoginScript {


    public static void main(String[] args) {
        String validUsername = "Admin";
        String validPassword = "Password";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
            System.out.println("Welcome...");
        } else {
            System.out.println("ACCESS DENIED!");
        }

        scanner.close();
    }

}
