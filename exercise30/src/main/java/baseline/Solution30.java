/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution30 {
    public static void main(String[] args) {
        //create instance of multiplication table generator
        MultiplicationTableGenerator multiplicationTableGenerator = new MultiplicationTableGenerator();
        //call table creation method
        multiplicationTableGenerator.calculateMultiplicationTable();
        //print results in table format
        multiplicationTableGenerator.printMultiplicationTable();
    }
}
