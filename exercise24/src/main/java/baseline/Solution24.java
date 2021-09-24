package baseline;

public class Solution24 {
    public static void main(String[] args) {
        //create anagram instance
        Anagram anagram = new Anagram();
        //call input methods
        //store in array variables
        char[] firstString = anagram.setFirstString();
        char[] secondString = anagram.setSecondString();
        //call anagram checker and print result
        anagram.printResult(firstString, secondString, anagram.isAnagram(firstString, secondString));
    }
}
