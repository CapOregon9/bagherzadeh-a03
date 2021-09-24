/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution25 {

    public static void main(String[] args) {
        //create new instance of password
        Passwords password = new Passwords();
        //call input method for string and store it;
        String myPassword = password.setPassword();
        //call validation function and store result as an integer
        int validationResult = password.passwordValidator(myPassword);
        //call strength check function to generate result string
        String strengthResult = password.setPasswordStrength(validationResult, myPassword);
        //print results
        password.printResult(strengthResult);
    }
}
