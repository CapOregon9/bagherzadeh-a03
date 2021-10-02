/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {

    @Test
    void calculateKarvonenHeartRate1() {
        HeartRateCalculator hrc = new HeartRateCalculator(65, 22);
        double expectedHR = 178.00;
        double actualHR = hrc.calculateKarvonenHeartRate(85);

        assertEquals(expectedHR, actualHR, 0.000001);
    }

    @Test
    void calculateKarvonenHeartRate2() {
        HeartRateCalculator hrc = new HeartRateCalculator(65, 22);
        double expectedHR = 138.00;
        double actualHR = hrc.calculateKarvonenHeartRate(55);

        assertEquals(expectedHR, actualHR, 0.000001);
    }

    @Test
    void calculateKarvonenHeartRate3() {
        HeartRateCalculator hrc = new HeartRateCalculator(65, 22);
        double expectedHR = 158.00;
        double actualHR = hrc.calculateKarvonenHeartRate(70);

        assertEquals(expectedHR, actualHR, 0.000001);
    }
}