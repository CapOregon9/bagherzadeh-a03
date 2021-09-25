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
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            try {
                numbers[i] = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Input must be an integer.");
            }
        }
    }

    public String calculateTotal() {
        //calculates total using the integer array as its values and returns as a string
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return String.format("The total is %d", total);
    }

    public void printTotal() {
        //Print results from calculate total
        System.out.println(calculateTotal());
    }
}
