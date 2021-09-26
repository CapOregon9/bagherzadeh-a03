/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution29 {
    public static void main(String[] args) {
        //Create instance of the validation checker
        ValidationChecker validation = new ValidationChecker();
        //call input method for validating
        validation.setYearsToDoubleInvestment();
        //print result from validation
        validation.printInvestmentTime();
    }
}
