/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution36 {
    public static void main(String[] args) {
        //create instance of Statistics calculator
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //call method to process inputs
        statisticsCalculator.processInput();
        //print numbers contained in arraylist
        statisticsCalculator.printNumbersList();
        //print results with its to-string method
        System.out.println(statisticsCalculator);
    }
}
