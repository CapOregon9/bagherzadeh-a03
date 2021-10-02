/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ContenderListTest {
    ContenderList contenderList;
    ArrayList<String> contenders;
    @BeforeEach
    void createObjects() {
        contenderList = new ContenderList();
        contenders = new ArrayList<>();
    }

    @Test
    void addHomerContender() {
        contenders.add("Homer");
        contenderList.addContender("Homer");

        assertArrayEquals(contenders.toArray(), contenderList.getContendersList());
    }

    @Test
    void getRandomNumber() {
        Random random = new Random(23);
        contenders.add("Homer");
        int expectedValue = random.nextInt(1);
        int actualValue = contenderList.getRandomNumber(contenders.size());

        assertEquals(expectedValue, actualValue);
    }
}