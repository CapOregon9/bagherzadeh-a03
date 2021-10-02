/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallGeneratorTest {
    Random random;
    MagicBallGenerator magicBallGenerator;
    @BeforeEach
    void createObjects() {
        random = new Random(1);
        magicBallGenerator = new MagicBallGenerator();
    }

    @Test
    void getRandomNumber1() {
        //only works if random is the same seed as random in MagicBallGenerator class
        int expectedValue = random.nextInt(4);
        int actualValue = magicBallGenerator.getRandomNumber();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getRandomNumber2() {
        //only works if random is the same seed as random in MagicBallGenerator class
        random.nextInt(4);
        int expectedValue = random.nextInt(4);
        int actualValue = magicBallGenerator.getRandomNumber();

        assertEquals(expectedValue, actualValue);
    }
}