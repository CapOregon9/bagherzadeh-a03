package baseline;

import java.util.*;

public class RecordSorter {
    //create maps for all Parts of each method
    Map<String, String> firstNames = new HashMap<>();
    Map<String, String> lastNames = new HashMap<>();
    Map<String, String> position = new HashMap<>();
    Map<String, String> separationDate = new HashMap<>();

    //create list  to store maps
    List<Map> records = new ArrayList<>();

    public void addRecord(String firstName, String lastName, String position, String separationDate) {
        //adds a record to each map based on passed in strings using last name as the key
    }

    public void sortRecords() {
        //sorts the records based off of the key of maps
    }

    public void printRecords() {
        //prints sorted records
    }
}
