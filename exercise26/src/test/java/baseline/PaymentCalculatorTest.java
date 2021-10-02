/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff1() {
        PaymentCalculator pc = new PaymentCalculator(5000, 12, 100);

        int actualResult = pc.calculateMonthsUntilPaidOff();
        int expectedResult = 70;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateMonthsUntilPaidOff2() {
        PaymentCalculator pc = new PaymentCalculator(10000, 12, 210);

        int actualResult = pc.calculateMonthsUntilPaidOff();
        int expectedResult = 65;

        assertEquals(expectedResult, actualResult);
    }
}