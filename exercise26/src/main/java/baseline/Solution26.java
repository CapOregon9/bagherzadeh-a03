/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution26 {
    public static void main(String[] args) {
        //create instance of payment calculator
        PaymentCalculator pc = new PaymentCalculator();
        //call input methods
        pc.setBalance();
        pc.setPercentAPR();
        pc.setMonthlyPayment();
        //call calculation method and store result in int
        int monthsResult = pc.calculateMonthsUntilPaidOff();
        //print result using appropriate method
        pc.printPayment(monthsResult);
    }
}
