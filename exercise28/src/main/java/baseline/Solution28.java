/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution28 {
    public static void main(String[] args) {
        //create new instance of calculator
        Calculator calculator = new Calculator();
        //call input method of numbers
        calculator.setNumbers();
        //call print method of total which also calls the total calculation
        calculator.printTotal();
    }
}
