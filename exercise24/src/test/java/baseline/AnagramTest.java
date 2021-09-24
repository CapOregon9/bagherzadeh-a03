package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    //tests the isAnagram function with multiple inputs to check functionality
    @Test
    void isAnagram() {
        Anagram anagram = new Anagram();
        char[] firstString = {'n', 'o', 't', 'e'};
        char[] secondString = {'t', 'o', 'n', 'e'};

        boolean expectedState = true;
        boolean actualState = anagram.isAnagram(firstString,secondString);

        assertEquals(expectedState, actualState);
    }

}