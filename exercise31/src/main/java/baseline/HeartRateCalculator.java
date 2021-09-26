package baseline;

import java.util.Scanner;

public class HeartRateCalculator {
    private static final Scanner in = new Scanner(System.in);
    //store resting heart rate and age in instance variables
    private int restingHeartRate;
    private int currentAge;

    public HeartRateCalculator() {
        //used for main function initialization
    }

    public HeartRateCalculator(int restingHeartRate, int currentAge) {
        //used for junit testing
        this.restingHeartRate = restingHeartRate;
        this.currentAge = currentAge;
    }

    public void setRestingHeartRate() {
        //prompts user and sets the resting heart rate
        //use try catch to verify input as a number
    }

    public void setCurrentAge() {
        //prompts user and sets the current age
        //use try catch to verify input as a number
    }

    public int calculateKarvonenHeartRate(double intensity) {
        //calculates the bpm based on the karvonen formula
        return 0;
    }

    public void printHeartRateTable() {
        //uses a loop to produce a heart rate table based on a range of intensity
        //calls the calculation function to get the heart rate
    }

}
