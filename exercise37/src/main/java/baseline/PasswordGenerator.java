/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.*;

public class PasswordGenerator {
    //initialize random object and scanner object
    private final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    //use Lists to store the characters used in the password
    private static final List<Character> letters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    private static final List<Character> specials = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '?');
    private static final List<Character> numbers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    //create list to store the password
    private List<Character> password = new ArrayList<>();
    private static final String INVALID_INPUT = "Invalid input. Try again.";


    public int getLength() {
        //prompt user and receive minimum length of password
        String input;
        do {
            try {
                System.out.println("What's the minimum length? ");
                input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
            }
        } while (true);
    }

    public int getSpecial() {
        //prompts user and receives the amount of special characters in the password
        String input;
        do {
            try {
                System.out.println("How many special characters? ");
                input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
            }
        } while (true);
    }

    public int getNumbers() {
        //prompts user and receives the amount of numbers in the password
        String input;
        do {
            try {
                System.out.println("How many numbers? ");
                input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
            }
        } while (true);
    }

    public char getLetterList(int index) {
        //retrieves letter from letter list
        return letters.get(index);
    }

    public char getSpecialList(int index) {
        //retrieves special character from special list
        return specials.get(index);
    }

    public char getNumberList(int index) {
        //retrieves number from number list
        return numbers.get(index);
    }

    public void generatePassword() {
        //generates password and calls other methods to do so
        int length = getLength();
        int specialsAmount = getSpecial();
        int numbersAmount = getNumbers();
        int letterAmount = getLetterAmount(length, specialsAmount, numbersAmount);
        for (int i = 0; i < letterAmount; i++) {
            password.add(getLetterList(random.nextInt(letters.size())));
        }
        for (int i = 0; i < specialsAmount; i++) {
            password.add(getSpecialList(random.nextInt(specials.size())));
        }
        for (int i = 0; i < numbersAmount; i++) {
            password.add(getNumberList(random.nextInt(numbers.size())));
        }
        shufflePassword();
    }

    public int getLetterAmount(int length, int specialsAmount, int numbersAmount) {
        int letterAmount = length - (specialsAmount + numbersAmount);
        while (letterAmount < (specialsAmount + numbersAmount)) {
            letterAmount++;
        }
        return letterAmount;
    }

    private void shufflePassword() {
        //shuffles order of password list to ensure the password is random
        Collections.shuffle(password, new Random());
    }

    public void printPassword() {
        //converts password arraylist to a single string and prints results
        StringBuilder stringBuilder = new StringBuilder();
        for (char passwordCharacter: password) {
            stringBuilder.append(passwordCharacter);
        }
        System.out.println(stringBuilder);
    }
}
