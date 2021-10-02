/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordsTest {
    Passwords password;
    @BeforeEach
    void createObjects() {
        password = new Passwords();
    }

    @Test
    void passwordValidator1() {
        String myPassword = "1337h@xor!";

        int actualResult = password.passwordValidator(myPassword);
        int expectedResult = 4;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void passwordValidator2() {
        String myPassword = "abc123xyz";

        int actualResult = password.passwordValidator(myPassword);
        int expectedResult = 3;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void passwordValidator3() {
        String myPassword = "abcdef";

        int actualResult = password.passwordValidator(myPassword);
        int expectedResult = 2;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void passwordValidator4() {
        String myPassword = "12345";

        int actualResult = password.passwordValidator(myPassword);
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }
}