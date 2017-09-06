

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        String username;
        String password;
        String password2;
        int totalErrors;

        Scanner scan = new Scanner(System.in);

        do {
            totalErrors = 0;
            System.out.print("Please enter username: ");
            username = scan.nextLine();

            //store the errors the method found
            totalErrors = checkUsername(username);

            //password
            System.out.print("Please enter password: ");
            password = scan.nextLine();

            System.out.print("Please re-enter password: ");
            password2 = scan.nextLine();

            //add the password errors into totalErrors
            totalErrors += checkPassword(password);

            //second password must match first
            if (password.contains(username)) {
                System.out.println("Password cannot contain username. ");
                totalErrors++;

            if (totalErrors > 0) {
                System.out.println("You have " + totalErrors + " errors.");
                System.out.println("You must fix all errors to continue.");
                System.out.println();
            }

        } while(totalErrors > 0);
            {

        System.out.println("Thank you for following the rules");
        System.out.println("Username: " + username);
    }

    public static int checkPassword(String password, int totalErrors) {
            int errors = 0;
        //must be at least 8 char, must be at most 32
        if (password.length() < 8 || password.length() > 32) {
            System.out.println("Password must be 8-32 chars");
            errors++;
        }
        //add the password errora into totalErrors
        totalErrors += checkPassword(password);


        //cannot be username
        if (password.contains(username)) {
            System.out.println("Password cannot contain username. ");
            totalErrors++;
        }
        //must contain 1+ uppercase
        //must contain 1+ lowercase
        //must contain at least one digit
        return errors;
    }

    public static int checkUsername(String username) {
        int errors = 0;
        //username
        //must be 8-16 characters
        if (username.length() < 8 || username.length() > 16) {
            System.out.println("Username must be 8-16 chars");
            errors++;
        }
        //cannot contain spaces
        if (username.contains(" ")) {
            System.out.println("Username cannot contain any spaces");
            errors++;
        }
        //cannot contain @
        if (username.contains("@")) {
            System.out.println("Username cannot contain @ symbol");
            errors++;
        }
        //must contain an _
        if (!username.contains("_")) {
            System.out.println("Username must include an _");
            errors++;
        }

        return errors;
    }
}
