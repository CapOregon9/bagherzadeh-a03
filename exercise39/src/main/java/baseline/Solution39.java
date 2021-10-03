package baseline;

public class Solution39 {
    public static void main(String[] args) {
        //create instance of record sorter
        RecordSorter recordSorter = new RecordSorter();
        //call method to add each record
        recordSorter.addRecordMap("John", "Johnson", "Manager", "2016-12-31");
        recordSorter.addRecordMap("Tou", "Xiong", "Software Engineer", "2016-10-05");
        recordSorter.addRecordMap("Michela", "Michaelson", "District Manager", "2015-12-19");
        recordSorter.addRecordMap("Jake", "Jacobson", "Programmer", "");
        recordSorter.addRecordMap("Jacquelyn", "Jackson", "DBA", "");
        recordSorter.addRecordMap("Sally", "Webber", "Web Developer", "2015-12-18");
        recordSorter.compileRecordList();
        //call method to print records
        recordSorter.printRecords();
    }
}
