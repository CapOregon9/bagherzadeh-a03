/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator(new int[]{1, 2, 3, 4, 5});

    @Test
    void calculateTotal() {
        String expectedTotal = "The total is 15";
        String actualTotal = calculator.calculateTotal();

        assertEquals(expectedTotal, actualTotal);
    }
}