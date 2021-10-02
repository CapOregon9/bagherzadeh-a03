/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution35 {
    public static void main(String[] args) {
        //initialize contender list
        ContenderList contenderList = new ContenderList();
        //call method to add contender multiple times
        for (int i = 0; i < 6; i++) {
            contenderList.addContender(contenderList.getUserContender());
        }
        //call method to choose winner
        contenderList.printWinner();
    }
}
