/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    PasswordGenerator passwordGenerator;
    @BeforeEach
    void createObjects() {
        passwordGenerator = new PasswordGenerator();
    }
    @Test
    void getLetterCFromList() {
        assertEquals('c', passwordGenerator.getLetterList(2));
    }

    @Test
    void getSpecialFromList() {
        assertEquals('$', passwordGenerator.getSpecialList(3));
    }

    @Test
    void getNumberList() {
        assertEquals('5', passwordGenerator.getNumberList(5));
    }

    @Test
    void getLetterAmount() {
        assertEquals(4, passwordGenerator.getLetterAmount(8, 2, 2));
    }
}