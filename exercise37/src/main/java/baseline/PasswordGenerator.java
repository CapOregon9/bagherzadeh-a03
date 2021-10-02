package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    //initialize random object
    private static final Random random = new Random();
    //use Lists to store the characters used in the password
    private static final List<Character> letters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    private static final List<Character> specials = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '?');
    private static final List<Character> numbers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    //create list to store the password
    private List<Character> password = new ArrayList<>();


    public int getLength() {
        //prompt user and receive minimum length of password
        return 0;
    }

    public int getSpecial() {
        //prompts user and receives the amount of special characters in the password
        return 0;
    }

    public int getNumbers() {
        //prompts user and receives the amount of numbers in the password
        return 0;
    }

    public char getLetterList() {
        //retrieves letter from letter list
        return 'a';
    }

    public char getSpecialList() {
        //retrieves special character from special list
        return '!';
    }

    public char getNumberList() {
        //retrieves number from number list
        return '0';
    }

    public void generatePassword() {
        //generates password and calls other methods to do so
    }

    public void shufflePassword() {
        //shuffles order of password list to ensure the password is random
    }

    public void printPassword() {
        //converts password arraylist to a single string and prints results
    }
}
