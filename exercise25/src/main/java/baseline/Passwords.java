/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwords {
    private static final Scanner in = new Scanner(System.in);

    public String setPassword() {
        //Prompt user for password and returns the string
        System.out.println("Enter your password: ");
        return in.nextLine();
    }

    public int passwordValidator(String password) {
        //checks many requirements to see how strong a password is using java's matcher and pattern functionality
        int state = 0;
        Pattern letters = Pattern.compile("[a-zA-Z]");
        Pattern numbers = Pattern.compile("[0-9]");
        Pattern specials = Pattern.compile("[!@#$%^&*()_+=|{}?~-]");

        Matcher containsLetters = letters.matcher(password);
        Matcher containsNumbers = numbers.matcher(password);
        Matcher containsSpecials = specials.matcher(password);

        if (password.length() >= 8) {
            if (containsLetters.find() && containsNumbers.find() && containsSpecials.find()) {
                state += 4;
                return state;
            }
            else if (containsLetters.find() && containsNumbers.find()) {
                state+= 3;
                return state;
            }
        }
        else if (containsLetters.find() && !(containsNumbers.find())) {
            state += 2;
            return state;
        }
        else if (containsNumbers.find() && !(containsLetters.find())) {
            state++;
            return state;
        }
        return state;
    }

    public String setPasswordStrength(int state, String password) {
        //returns string based off of level of strength from password validator
        switch (state) {
            case 0:
                return String.format("The password '%s' is a password of unknown strength.", password);
            case 1:
                return String.format("The password '%s' is a very weak password.", password);
            case 2:
                return String.format("The password '%s' is a weak password.", password);
            case 3:
                return String.format("The password '%s' is a strong password.", password);
            case 4:
                return String.format("The password '%s' is a very strong password.", password);
            default:
                return String.format("Incorrect validation result.");
        }
    }

    public void printResult(String result) {
        //prints passed in result
        System.out.println(result);
    }
}
