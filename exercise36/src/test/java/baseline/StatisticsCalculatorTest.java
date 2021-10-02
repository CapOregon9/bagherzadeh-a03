/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsCalculatorTest {
    StatisticsCalculator statisticsCalculator;

    @BeforeEach
    void createObjects() {
        statisticsCalculator = new StatisticsCalculator(100.00, 200.00, 1000.00, 300.00);
    }

    @Test
    void getAverage() {
        assertEquals(400.0, statisticsCalculator.getAverage(), 0.0001);
    }

    @Test
    void getMax() {
        assertEquals(1000.0, statisticsCalculator.getMax(), 0.0001);
    }

    @Test
    void getMin() {
        assertEquals(100.0, statisticsCalculator.getMin(), 0.0001);
    }

    @Test
    void getSTD() {
        assertEquals(353.55, statisticsCalculator.getSTD(), 0.01);
    }
}