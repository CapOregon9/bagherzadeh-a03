/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class MagicBallGenerator {
    private static final Scanner in = new Scanner(System.in);
    //create a constant variable storing the strings and initialize random to be used later
    private final String[] magicBallOutput = {"Yes", "No", "Maybe", "Ask again later."};
    private static final Random random = new Random(1);

    public String setUserQuestion() {
        //prompts user for question
        System.out.println("What's your question?");
        return in.nextLine();
    }

    public int getRandomNumber() {
        //gives random number to be used for indexing output array
        return random.nextInt(magicBallOutput.length);
    }

    public void askMagicBall() {
        //generates magic ball results
        setUserQuestion();
        System.out.println(magicBallOutput[getRandomNumber()]);
    }
}
