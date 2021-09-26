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

    public int[][] getMultiplicationTable() {
        //used for junit testing
        return multiplicationTable;
    }

    public void calculateMultiplicationTable() {
        //generates multiplication table and stores it in instance variable
        for (int i = 1; i <= multiplicationTable.length; i++) {
            for (int j = 1; j <= multiplicationTable.length; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }
    }

    public void printMultiplicationTable() {
        //prints multiplication table adding appropriate tabs
        for (int[] ints : multiplicationTable) {
            StringBuilder tableRow = new StringBuilder(50);
            for (int j = 0; j < multiplicationTable.length; j++) {
                tableRow.append(String.format("%d\t", ints[j]));
            }
            System.out.println(tableRow);
        }
    }
}
