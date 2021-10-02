/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution38 {
    public static void main(String[] args) {
        //Initialize string filter object
        StringFilter stringFilter = new StringFilter();
        //call method to filter even numbers and pass in a string
        stringFilter.filterEvenNumbers(stringFilter.getNumbers());
        //print resulting String
        stringFilter.printNumbers();
    }
}
