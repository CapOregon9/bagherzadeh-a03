/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class StatisticsCalculator {
    //Create Scanner object to be used
    private static final Scanner scanner = new Scanner(System.in);
    //create an arraylist to store inputs
    ArrayList<Double> numbers = new ArrayList<>();

    public StatisticsCalculator() {
        //used for main method instantiation
    }

    public StatisticsCalculator(double num1, double num2, double num3, double num4) {
        //used for junit testing
        this.numbers.add(num1);
        this.numbers.add(num2);
        this.numbers.add(num3);
        this.numbers.add(num4);
    }

    public double getInput() {
        //receives input from user and validates it
        do {
            try {
                System.out.println("Enter a number:");
                String input;
                input = scanner.nextLine();
                if (input.equals("done") || input.equals("Done")) {
                    return 0;
                } else {
                    return Double.parseDouble(input);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
            }
        } while (true);
    }

    public void processInput() {
        //calls the input based on a loop and stores it in an arraylist
        double userInput = getInput();

        while (userInput > 0) {
            numbers.add(userInput);
            userInput = getInput();
        }
    }

    public double getAverage() {
        //calculates average of the numbers
        double average = 0;

        for (double number: numbers) {
            average += number;
        }

        return average / numbers.size();
    }

    public double getMax() {
        //calculates max value of the numbers
        double max = 0;
        for (double number: numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public double getMin() {
        //calculates min value of the numbers
        double min = numbers.get(0);
        for (double number: numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public double getSTD() {
        //calculates the standard deviation of the numbers
        double average = 0;
        double standardDev = 0;
        for (double number: numbers) {
            average += number;
        }
        average /= numbers.size();
        for (double number: numbers) {
            standardDev += Math.pow(number - average, 2);
        }
        return Math.sqrt(standardDev/numbers.size());
    }

    public void printNumbersList() {
        StringBuilder formattedString = new StringBuilder("Numbers: ");
        for (double number: numbers) {
            formattedString.append(String.format("%.0f, ", number));
        }
        System.out.println(formattedString);
    }

    @Override
    public String toString() {
        //calls the calculation functions and returns an organized string of results
        return String.format("The average is %.1f%nThe minimum is %.0f%nThe maximum is %.0f%nThe standard deviation is %.2f", getAverage(), getMin(), getMax(), getSTD());
    }
}
