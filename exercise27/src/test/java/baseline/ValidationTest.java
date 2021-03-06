/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
    Validation vd;
    String expectedValue;
    String actualValue;

    @BeforeEach
    void createObjects() {
        vd = new Validation("J", "", "ABCDE", "A12-1234");
    }
    @Test
    void validateFirstName() {
        actualValue = vd.validateFirstName();
        expectedValue = String.format("The first name must be at least 2 characters long.%n");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void validateLastName() {
        actualValue = vd.validateLastName();
        expectedValue = String.format("The last name must be at least 2 characters long.%nThe last name must be filled in.%n");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void validateZIPCode() {
        actualValue =vd.validateZIPCode();
        expectedValue = String.format("The zipcode must be a 5 digit number.%n");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void validateEmployeeID() {
        actualValue = vd.validateEmployeeID();
        expectedValue = String.format("The employee ID must be in the format of AA-1234.%n");

        assertEquals(expectedValue, actualValue);
    }
}