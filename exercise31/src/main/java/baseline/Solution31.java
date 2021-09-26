/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution31 {
    public static void main(String[] args) {
        //create instance of heart rate calculator
        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        //call input methods
        heartRateCalculator.setRestingHeartRate();
        heartRateCalculator.setCurrentAge();
        //call print method for heart rate table
        heartRateCalculator.printHeartRateTable();
    }
}
