package baseline;

import java.util.*;

public class RecordSorter {
    //create maps for all Parts of each method
    Map<String, String> firstNames = new TreeMap<>();
    Map<String, String> lastNames = new TreeMap<>();
    Map<String, String> position = new TreeMap<>();
    Map<String, String> separationDate = new TreeMap<>();

    //create list  to store maps
    List<Map<String, String>> records = new ArrayList<>();

    public void addRecordMap(String firstName, String lastName, String position, String separationDate) {
        //adds a record to each map based on passed in strings using last name as the key
        this.firstNames.put(lastName, firstName);
        this.lastNames.put(lastName, lastName);
        this.position.put(lastName, position);
        this.separationDate.put(lastName, separationDate);
    }

    public void compileRecordList() {
        //adds all maps to list
        records.add(firstNames);
        records.add(lastNames);
        records.add(position);
        records.add(separationDate);
    }

    public void sortRecords() {
        //sorts the records based off of the key of maps
    }

    public void printRecords() {
        //prints sorted records
        int lengthCounter = 0;
        int formattingCounter = 0;
        StringBuilder stringBuilder;
        System.out.printf("Name\t\t\t\t| Position\t\t\t  | Separation Date%n--------------------|---------------------|----------------%n");
        for (Map.Entry<String, String> entry : lastNames.entrySet()) {
            for (Map<String, String> recordEntry:records) {
                stringBuilder = new StringBuilder(recordEntry.get(entry.getKey()));
                if (formattingCounter > 1) {
                    while (stringBuilder.length() < 20) {
                        stringBuilder.append(" ");
                        lengthCounter = 0;
                    }
                } else if (formattingCounter > 0) {
                    lengthCounter += stringBuilder.length();
                    while (lengthCounter < 20) {
                        stringBuilder.append(" ");
                        lengthCounter++;
                    }
                } else {
                    stringBuilder.append(" ");
                    lengthCounter += stringBuilder.length();
                }
                System.out.printf("%s", stringBuilder);
                formattingCounter++;
                if (formattingCounter > 1 && formattingCounter < 4) {
                    System.out.printf("%s", "| ");
                }else {
                    System.out.printf("%s", "");
                }
            }
            formattingCounter = 0;
            System.out.println();
        }

    }
}
