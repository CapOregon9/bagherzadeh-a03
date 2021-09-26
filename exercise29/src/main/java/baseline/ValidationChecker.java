/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.Scanner;

public class ValidationChecker {
    private static final Scanner in = new Scanner(System.in);
    //store input and result of formula in an instance variable
    private int yearsToDoubleInvestment;

    public ValidationChecker() {
        //used in main method instantiation
    }

    public ValidationChecker(int inputRate) {
        //used for junit testing
        try {
                this.yearsToDoubleInvestment = 72 / inputRate;
        } catch (ArithmeticException e) {
            this.yearsToDoubleInvestment = 0;
        }
    }

    public int getYearsToDoubleInvestment() {
        //used for junit testing
        return yearsToDoubleInvestment;
    }

    public void setYearsToDoubleInvestment() {
        //checks if input is valid by checking if the value can be divided
        int inputRate;
        final String INVALID_INPUT = "Sorry. That's not a valid input.";
        boolean invalidState = false;
        do {
            try {
                System.out.println("What is the rate of return? ");
                inputRate = Integer.parseInt(in.nextLine());
                yearsToDoubleInvestment = 72 / inputRate;
                invalidState = false;
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println(INVALID_INPUT);
                invalidState = true;
            }
        } while (invalidState);
    }

    public void printInvestmentTime() {
        //prints results from valid input
        System.out.printf("It will take %d years to double your initial investment.", yearsToDoubleInvestment);
    }
}
