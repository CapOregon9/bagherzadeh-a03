/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.Scanner;

public class HeartRateCalculator {
    private static final Scanner in = new Scanner(System.in);
    //store resting heart rate and age in instance variables
    private int restingHeartRate;
    private int currentAge;

    public HeartRateCalculator() {
        //used for main function initialization
    }

    public HeartRateCalculator(int restingHeartRate, int currentAge) {
        //used for junit testing
        this.restingHeartRate = restingHeartRate;
        this.currentAge = currentAge;
    }

    public void setRestingHeartRate() {
        //prompts user and sets the resting heart rate
        //use try catch to verify input as a number
        boolean invalidState = false;
        do {
            try {
                System.out.println("What is your resting heart rate? ");
                restingHeartRate = Integer.parseInt(in.nextLine());
                invalidState = false;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect Input. Please enter an integer for the resting heart rate.");
                invalidState = true;
            }
        } while (invalidState);
    }

    public void setCurrentAge() {
        //prompts user and sets the current age
        //use try catch to verify input as a number
        boolean invalidState = false;
        do {
            try {
                System.out.println("What is your current age? ");
                currentAge = Integer.parseInt(in.nextLine());
                invalidState = false;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect Input. Please enter an integer for the current age.");
                invalidState = true;
            }
        } while (invalidState);
    }

    public double calculateKarvonenHeartRate(double intensity) {
        //calculates the bpm based on the karvonen formula
        return Math.round((((220 - currentAge) - restingHeartRate) * (intensity / 100)) + restingHeartRate);
    }

    public void printHeartRateTable() {
        //uses a loop to produce a heart rate table based on a range of intensity
        //calls the calculation function to get the heart rate
        System.out.printf("Resting Pulse: %d\t\tAge: %d%n%n", restingHeartRate, currentAge);
        System.out.printf("Intensity\t| Rate%n------------|--------%n");
        for (int i = 55; i <= 95; i += 5) {
            System.out.printf("%d%%\t\t\t| %.0f bpm%n", i, calculateKarvonenHeartRate(i));
        }
    }

}
