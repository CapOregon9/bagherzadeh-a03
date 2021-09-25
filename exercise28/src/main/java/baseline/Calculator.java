package baseline;

import java.util.Scanner;

public class Calculator {
    private static final Scanner in = new Scanner(System.in);
    //Store input in integer array
    int[] numbers = new int[5];

    public Calculator() {
        //constructor used for main method
    }

    public Calculator(int[] numbers) {
        //constructor used for junit testing
        this.numbers = numbers;
    }

    public void setNumbers() {
        //Takes input of numbers in a loop
    }

    public String calculateTotal() {
        //calculates total using the integer array as its values and returns as a string
        return "";
    }

    public void printTotal() {
        //Print results from calculate total
    }
}
