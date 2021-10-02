/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    //tests the isAnagram function with multiple inputs to check functionality
    Anagram anagram;
    @BeforeEach
    void createObjects() {
        anagram = new Anagram();
    }

    @Test
    void isAnagram1() {

        char[] firstString = {'n', 'o', 't', 'e'};
        char[] secondString = {'t', 'o', 'n', 'e'};

        boolean expectedState = true;
        boolean actualState = anagram.isAnagram(firstString,secondString);

        assertEquals(expectedState, actualState);
    }

    @Test
    void isAnagram2() {
        char[] firstString = {'n', 'o', 't', 'e', 'r'};
        char[] secondString = {'t', 'o', 'n', 'e', 'r'};

        boolean expectedState = true;
        boolean actualState = anagram.isAnagram(firstString,secondString);

        assertEquals(expectedState, actualState);
    }

    @Test
    void isAnagram3() {
        char[] firstString = {'e', 'l', 'b', 'o', 'w'};
        char[] secondString = {'b', 'e', 'l', 'o', 'w'};

        boolean expectedState = true;
        boolean actualState = anagram.isAnagram(firstString,secondString);

        assertEquals(expectedState, actualState);
    }
}