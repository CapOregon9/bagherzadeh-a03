package baseline;

public class Solution39 {
    public static void main(String[] args) {
        //create instance of record sorter
        RecordSorter recordSorter = new RecordSorter();
        //call method to add each record
        recordSorter.addRecord("", "", "", "");
        recordSorter.addRecord("", "", "", "");
        recordSorter.addRecord("", "", "", "");
        recordSorter.addRecord("", "", "", "");
        //call method to sort records
        recordSorter.sortRecords();
        //call method to print records
        recordSorter.printRecords();
    }
}
