package baseline;

public class Solution40 {
    public static void main(String[] args) {
        //I take the same approach as I did in exercise 39
        //create instance of record filter
        RecordFilter recordFilter = new RecordFilter();
        //call method to add each record
        recordFilter.addRecordMap("John", "Johnson", "Manager", "2016-12-31");
        recordFilter.addRecordMap("Tou", "Xiong", "Software Engineer", "2016-10-05");
        recordFilter.addRecordMap("Michela", "Michaelson", "District Manager", "2015-12-19");
        recordFilter.addRecordMap("Jake", "Jacobson", "Programmer", "");
        recordFilter.addRecordMap("Jacquelyn", "Jackson", "DBA", "");
        recordFilter.addRecordMap("Sally", "Webber", "Web Developer", "2015-12-18");
        recordFilter.compileRecordList();
        //call method filter records and print results
        recordFilter.filterRecords();
    }
}
