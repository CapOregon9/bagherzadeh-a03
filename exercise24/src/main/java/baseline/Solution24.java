/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */
package baseline;

public class Solution24 {
    public static void main(String[] args) {
        //create anagram instance
        Anagram anagram = new Anagram();
        //call input methods
        //store in array variables
        char[] firstString = anagram.setFirstString();
        char[] secondString = anagram.setSecondString();
        //call anagram checker and print result
        anagram.printResult(anagram.isAnagram(firstString, secondString));
    }
}
