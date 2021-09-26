/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {

    @Test
    void calculateKarvonenHeartRate() {
        HeartRateCalculator hrc = new HeartRateCalculator(65, 22);
        double expectedHR = 178.00;
        double actualHR = hrc.calculateKarvonenHeartRate(85);

        assertEquals(expectedHR, actualHR, 0.000001);
    }
}