/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class StringFilter {
    //Initialized scanner object
    private static final Scanner scanner = new Scanner(System.in);
    //Integer array to store filtered numbers
    private ArrayList<Integer> filteredNumbers = new ArrayList<>();

    public String getNumbers() {
        //get numbers from user and store it in a string
        System.out.println("Enter a list of numbers, separated by spaces: ");
        return scanner.nextLine();
    }

    public void filterEvenNumbers(String numbers) {
        String[] input = numbers.split(" ");
        for (int i = 0; i < input.length; i++) {
            if (Integer.parseInt(input[i]) % 2 == 0) {
                filteredNumbers.add(Integer.parseInt(input[i]));
            }
        }
    }

    public Object[] getFilteredNumbers() {
        //gives filtered numbers array for junit testing
        return filteredNumbers.toArray();
    }

    public void printNumbers() {
        //prints numbers that were filtered to user
        StringBuilder stringBuilder = new StringBuilder("The even numbers are");
        for (int number: filteredNumbers) {
            stringBuilder.append(String.format(" %d", number));
        }
        stringBuilder.append(".");
        System.out.println(stringBuilder);
    }
}
