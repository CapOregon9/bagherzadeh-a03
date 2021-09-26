/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    @Test
    void setRandomNumberToGuess() {
        //used to check java random functionality;
        GuessingGame guessingGame = new GuessingGame();

        int expectedValue = guessingGame.setRandomNumberToGuess(3);
        int actualValue = 0;

        assertEquals(expectedValue, actualValue);
    }
}