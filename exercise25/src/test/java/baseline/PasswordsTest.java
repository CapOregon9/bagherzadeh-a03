/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordsTest {

    @Test
    void passwordValidator() {
        Passwords password = new Passwords();
        String myPassword = "1337h@xor!";

        int actualResult = password.passwordValidator(myPassword);
        int expectedResult = 4;

        assertEquals(expectedResult, actualResult);
    }

}