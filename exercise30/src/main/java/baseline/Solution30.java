package baseline;

public class Solution30 {
    public static void main(String[] args) {
        //create instance of multiplication table generator
        MultiplicationTableGenerator multTableGen = new MultiplicationTableGenerator();
        //call table creation method
        multTableGen.calculateMultiplicationTable();
        //print results in table format
        multTableGen.printMultiplicationTable();
    }
}
