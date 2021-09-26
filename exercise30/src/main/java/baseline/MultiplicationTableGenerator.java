package baseline;

public class MultiplicationTableGenerator {
    //Store table in double array
    private int[][] multiplicationTable = new int[12][12];

    public MultiplicationTableGenerator() {
        //used for main function initialization
    }

    public MultiplicationTableGenerator(int[][] multiplicationTable) {
        //used for junit testing
        this.multiplicationTable = multiplicationTable;
    }

    public void calculateMultiplicationTable() {
        //generates multiplication table and stores it in instance variable
    }

    public void printMultiplicationTable() {
        //prints multiplication table adding appropriate tabs
    }
}
