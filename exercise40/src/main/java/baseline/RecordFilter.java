package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RecordFilter {
    //create maps for all Parts of each method
    private Map<String, String> firstNames = new TreeMap<>();
    private Map<String, String> lastNames = new TreeMap<>();
    private Map<String, String> position = new TreeMap<>();
    private Map<String, String> separationDate = new TreeMap<>();

    //create list  to store maps
    private List<Map<String, String>> records = new ArrayList<>();

    //added get methods for junit testing
    public Map<String, String> getFirstNames() {
        return firstNames;
    }

    public Map<String, String> getLastNames() {
        return lastNames;
    }

    public Map<String, String> getPosition() {
        return position;
    }

    public Map<String, String> getSeparationDate() {
        return separationDate;
    }

    public List<Map<String, String>> getRecords() {
        return records;
    }

    public void addRecordMap(String firstName, String lastName, String position, String separationDate) {
        //adds a record to each map based on passed in strings using last name as the key
    }

    public void compileRecordList() {
        //adds all maps to list
    }

    public void filterRecords() {
        //prints sorted records

    }

    private int getLengthCounter(int lengthCounter, int formattingCounter, StringBuilder stringBuilder) {
        //gets the length of the string used for organizing the table layout
        return 0;
    }
}
