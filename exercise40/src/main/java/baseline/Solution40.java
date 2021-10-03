package baseline;

public class Solution40 {
    public static void main(String[] args) {
        //I take the same approach as I did in exercise 39
        //create instance of record filter
        RecordFilter recordFilter = new RecordFilter();
        //call method to add each record
        recordFilter.addRecordMap("", "", "", "");
        recordFilter.addRecordMap("", "", "", "");
        recordFilter.addRecordMap("", "", "", "");
        recordFilter.addRecordMap("", "", "", "");
        recordFilter.addRecordMap("", "", "", "");
        recordFilter.addRecordMap("", "", "", "");
        recordFilter.compileRecordList();
        //call method filter records and print results
        recordFilter.filterRecords();
    }
}
