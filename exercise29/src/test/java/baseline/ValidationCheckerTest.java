/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationCheckerTest {
    //tests try catch code due to not being able to test input.
    @Test
    void setYearsToDoubleInvestment() {
        ValidationChecker vc = new ValidationChecker(4);
        int expectedValidation = 18;
        int actualValidation = vc.getYearsToDoubleInvestment();

        assertEquals(expectedValidation, actualValidation);
    }
}