/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution37 {
    public static void main(String[] args) {
        //create instance of password generator
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        //call method for password generation
        passwordGenerator.generatePassword();
        //print password result
        passwordGenerator.printPassword();
    }
}
