/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringFilterTest {
    StringFilter stringFilter;
    @BeforeEach
    void createObjects() {
        stringFilter = new StringFilter();
    }

    @Test
    void filterEvenNumbers1() {
        Object[] expectedNumbers = new Object[] {2, 4, 6, 8};
        stringFilter.filterEvenNumbers("1 2 3 4 5 6 7 8");
        Object[] actualNumbers = stringFilter.getFilteredNumbers();
        assertArrayEquals(expectedNumbers, actualNumbers);
    }

    @Test
    void filterEvenNumbers2() {
        Object[] expectedNumbers = new Object[] {2, 4, 6, 8, 10};
        stringFilter.filterEvenNumbers("1 2 3 4 5 6 7 8 9 10");
        Object[] actualNumbers = stringFilter.getFilteredNumbers();
        assertArrayEquals(expectedNumbers, actualNumbers);
    }

    @Test
    void filterEvenNumbers3() {
        Object[] expectedNumbers = new Object[] {2, 4, 6, 8, 10, 12};
        stringFilter.filterEvenNumbers("1 2 3 4 5 6 7 8 9 10 11 12");
        Object[] actualNumbers = stringFilter.getFilteredNumbers();
        assertArrayEquals(expectedNumbers, actualNumbers);
    }

    @Test
    void filterEvenNumbers4() {
        Object[] expectedNumbers = new Object[] {2, 4, 6, 8, 10, 12, 36, 42, 28, 22};
        stringFilter.filterEvenNumbers("1 2 3 4 5 6 7 8 9 10 11 12 36 42 28 22");
        Object[] actualNumbers = stringFilter.getFilteredNumbers();
        assertArrayEquals(expectedNumbers, actualNumbers);
    }
}