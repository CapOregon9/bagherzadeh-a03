/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private static final Scanner in = new Scanner(System.in);
    private Random rand = new Random(1);
    //Store number generated by random generation
    private int randomNumberToGuess;
    //use counter to store amount of guesses
    private int numberOfGuesses = 1;

    public int getRandomNumberToGuess() {
        //used for junit testing
        return randomNumberToGuess;
    }

    public int setDifficultyLevel() {
        String difficultyPattern = "[1-3]";
        String difficultyInput;
        do {
            System.out.printf("%nEnter the difficulty level (1, 2, 3): %n");
            difficultyInput = in.nextLine();
            if (!difficultyInput.matches(difficultyPattern)) {
                System.out.println("Incorrect difficulty level. Try again.");
            } else {
                return Integer.parseInt(difficultyInput);
            }
        } while (true);
    }

    public int setRandomNumberToGuess(int difficulty) {
        return rand.nextInt((int) Math.pow(10, difficulty));
    }

    public int setGuessNumber() {
        //prompt user for a guess and store it if it's a numeric entry
        int numberGuess = 0;
        boolean invalidState = false;
        System.out.println("I have my number. What's your guess? ");
        do {
            try {
                numberGuess = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect value. Guess again:");
                invalidState = true;
            }
        } while (invalidState);
        return numberGuess;
    }

    public void playGuessingGame() {
        //contains the loop for playing the game and an inner loop for guesses.
        //also calls other functions that are needed.
        //use boolean to tell if the guess is too high or too low.
        System.out.println("Let's play guess the Number!");
        String playState;
        int guessedNumber;
        do {
            randomNumberToGuess = setRandomNumberToGuess(setDifficultyLevel());
            guessedNumber = setGuessNumber();
            numberOfGuesses = 1;
            while (randomNumberToGuess != guessedNumber) {
                if (randomNumberToGuess < guessedNumber) {
                    guessedNumber = setGuessAgain(true);
                } else {
                    guessedNumber = setGuessAgain(false);
                }
            }
            System.out.printf("You got it in %d guesses!%n%nDo you wish to play again (Y/N)?%n", numberOfGuesses);
            playState = in.nextLine();
        } while (playState.equals("Y") || playState.equals("y"));

    }

    public int setGuessAgain(boolean guessState) {
        //prompts for guess after getting it wrong
        int numberGuess = 0;
        boolean invalidState = false;
        numberOfGuesses++;
        do {
            try {
                if (guessState) {
                    System.out.println("Too high. Guess again: ");
                    numberGuess = Integer.parseInt(in.nextLine());
                    invalidState = false;
                } else {
                    System.out.println("Too low. Guess again: ");
                    numberGuess = Integer.parseInt(in.nextLine());
                    invalidState = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect value. Guess Again: ");
                invalidState = true;
            }
        } while (invalidState);
        return numberGuess;
    }
}
