/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ContenderList {
    private static final Scanner in = new Scanner(System.in);
    //initialize random object and use seed to be able to test with test case
    private final Random random = new Random(23);
    //create an array list to store the contenders
    private final ArrayList<String> contenders = new ArrayList<>();

    public String getUserContender() {
        //gets contender from user
        System.out.println("Enter a name:");
        return in.nextLine();
    }

    public void addContender(String contender) {
        //adds contender to the contenders array list if input is not blank
        if (!contender.isBlank()) {
            contenders.add(contender);
        }
    }

    public int getRandomNumber(int randomBounds) {
        //gives a random number based on the given bounds
        return random.nextInt(randomBounds);
    }

    public void printWinner() {
        //prints the winning contender
        System.out.printf("The winner is... %s", contenders.get(getRandomNumber(contenders.size())));
    }

    public Object[] getContendersList() {
        //used in junit testing to verify the array list
        return this.contenders.toArray();
    }
}
