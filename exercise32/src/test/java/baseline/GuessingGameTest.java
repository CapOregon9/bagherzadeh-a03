/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    @Test
    void setRandomNumberToGuess() {
        //used to check java random functionality;
        GuessingGame guessingGame = new GuessingGame();
        Random random = new Random(1);

        int expectedValue = guessingGame.setRandomNumberToGuess(3);
        int actualValue = random.nextInt(1000);

        assertEquals(expectedValue, actualValue);
    }
}