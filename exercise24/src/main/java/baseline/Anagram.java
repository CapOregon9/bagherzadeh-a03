package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    private static final Scanner in = new Scanner(System.in);
    String firstString;
    String secondString;


    public char[] setFirstString() {
        //prompts user and stores strings
        System.out.println("Enter the first string: ");
        return in.next().toCharArray();
    }

    public char[] setSecondString() {
        System.out.println("Enter the second string: ");
        return in.next().toCharArray();
    }

    public boolean isAnagram(char[] first, char[] second) {
        //compares the two strings by length
        int firstLength = first.length;
        int secondLength = second.length;

        if (firstLength != secondLength) {
            return false;
        }
        //sorts the strings before checking each character to simplify the loops
        //store strings for later before sort
        firstString = new String(first);
        secondString = new String(second);

        Arrays.sort(first);
        Arrays.sort(second);

        //compares by each character
        for (int i = 0; i < firstLength; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public void printResult(boolean state) {
        //prints out to user result based on previously calculated state
        System.out.println(state ? String.format("\"%s\" and \"%s\" are anagrams.", firstString, secondString) : String.format("\"%s\" and \"%s\" are not anagrams.", firstString, secondString));
    }
}
