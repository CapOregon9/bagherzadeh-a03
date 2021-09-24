/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.Scanner;

public class PaymentCalculator {
    private static final Scanner in = new Scanner(System.in);
    private static final String INVALID_INPUT = "Not a numeric value. Try again.";
    //declare variables to store appropriate variables for months calculation
    double balance;
    double percentAPR;
    double monthlyPayment;

    public PaymentCalculator() {
    }

    public PaymentCalculator(double balance, double percentAPR, double monthlyPayment) {
        this.balance = balance;
        this.percentAPR = percentAPR / 100;
        this.monthlyPayment = monthlyPayment;
    }

    public int calculateMonthsUntilPaidOff() {
        //calculates the amount of months needed to pay off credit card and returns the amount of months
        double months = balance / monthlyPayment;
        months = months * (1 - Math.pow((1 + (percentAPR / 365)), 30));
        months = Math.log(1 + months);
        double temp = Math.log(1 + (percentAPR / 365));
        months = Math.ceil((((double) -1 / 30) * months / temp) * 100) / 100;
        return (int) Math.ceil(months);
    }

    public void setBalance() {
        //prompts user for balance and stores it in instance variable
        boolean state;
        System.out.println("What is your balance? ");
        do {
            try {
                balance = Double.parseDouble(in.nextLine());
                state = false;
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
                state = true;
            }
        } while (state);
    }

    public void setPercentAPR() {
        //prompts user for APR as a percentage and converts it to decimal and stores it in instance variable
        boolean state;
        System.out.println("What is the APR on the card (as a percent)? ");
        do {
            try {
                percentAPR = Double.parseDouble(in.nextLine()) / 100;
                state = false;
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
                state = true;
            }
        } while (state);
    }

    public void setMonthlyPayment() {
        //prompts user for monthly payment and stores it in instance variable
        boolean state;
        System.out.println("What is the monthly payment you can make? ");
        do {
            try {
                monthlyPayment = Double.parseDouble(in.nextLine());
                state = false;
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
                state = true;
            }
        } while (state);
    }

    public void printPayment(int months) {
        //prints result to user as formatted string
        System.out.printf("It will take you %d months to pay off this card.", months);
    }
}
