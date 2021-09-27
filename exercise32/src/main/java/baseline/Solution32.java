/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.Random;

public class Solution32 {
    public static void main(String[] args) {
        Random random = new Random(1);
        System.out.println(random.nextInt(1000));
        System.out.println(random.nextInt(1000));
        //create instance of the guessing game
        GuessingGame guessingGame = new GuessingGame();
        //call method to play the guessing game
        guessingGame.playGuessingGame();
    }
}
