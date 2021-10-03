/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {
    GuessingGame guessingGame;
    Random random;
    @BeforeEach
    void createObjects() {
        guessingGame = new GuessingGame(true);
        random = new Random(1);
    }

    @Test
    void setRandomNumberToGuess() {
        //used to check java random functionality;
        int expectedValue = guessingGame.setRandomNumberToGuess(3);
        int actualValue = random.nextInt(1000);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void setRandomNumberToGuess2() {
        //used to check java random functionality;
        int expectedValue = guessingGame.setRandomNumberToGuess(2);
        int actualValue = random.nextInt(100);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void setRandomNumberToGuess3() {
        //used to check java random functionality;
        int expectedValue = guessingGame.setRandomNumberToGuess(1);
        int actualValue = random.nextInt(10);

        assertEquals(expectedValue, actualValue);
    }
}