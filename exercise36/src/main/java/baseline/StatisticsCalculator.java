package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class StatisticsCalculator {
    //Create Scanner object to be used
    private static final Scanner scanner = new Scanner(System.in);
    //create instance variable to store input to be used in multiple methods
    private double userInput;
    //create an arraylist to store inputs
    ArrayList<Double> numbers = new ArrayList<>();

    public void getInput() {
        //receives input from user and validates it
    }

    public void processInput() {
        //calls the input based on a loop and stores it in an arraylist
    }

    public double getAverage() {
        //calculates average of the numbers
        return 0;
    }

    public double getMax() {
        //calculates max value of the numbers
        return 0;
    }

    public double getMin() {
        //calculates min value of the numbers
        return 0;
    }

    public double getSTD() {
        //calculates the standard deviation of the numbers
        return 0;
    }

    @Override
    public String toString() {
        //calls the calculation functions and returns an organized string of results
        return "StatisticsCalculator{}";
    }
}
