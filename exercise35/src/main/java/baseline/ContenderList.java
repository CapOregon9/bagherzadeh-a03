package baseline;

import java.util.ArrayList;
import java.util.Random;

public class ContenderList {
    //initialize random object
    private final Random random = new Random(1);
    //create an array list to store the contenders
    private final ArrayList<String> contenders = new ArrayList<>();

    public String getUserContender() {
        //gets contender from user and verifies if the input is not blank
        return "";
    }

    public void addContender() {
        //adds contender to the contenders array list
    }

    public int getRandomNumber(int randomBounds) {
        //gives a random number based on the given bounds
        return 0;
    }

    public void printWinner() {
        //prints the winning contender
    }

    public ArrayList<String> getContenders() {
        //used in junit testing to verify the array list
        return this.contenders;
    }
}
