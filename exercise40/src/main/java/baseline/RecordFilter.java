package baseline;

import java.util.*;

public class RecordFilter {
    private static final Scanner scanner = new Scanner(System.in);
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

    public String getString() {
        //gets string from user to filter with
        System.out.println("Enter a search string: ");
        return scanner.nextLine();
    }


    public void filterRecords() {
        //prints sorted records
        int formattingCounter = 0;
        boolean filteredState = false;
        String filter = getString();
        System.out.printf("%nResults:%n%n");
        StringBuilder stringBuilder;
        System.out.printf("Name\t\t\t\t| Position\t\t\t  | Separation Date%n--------------------|---------------------|----------------%n");
        for (Map.Entry<String, String> entry : lastNames.entrySet()) {
            stringBuilder = new StringBuilder("");
            for (Map<String, String> recordEntry:records) {
                stringBuilder = getStringBuilderPosition(formattingCounter, filteredState, stringBuilder);
                stringBuilder = getLengthCounter(formattingCounter, stringBuilder, recordEntry, entry);
                if (stringBuilder.toString().contains(filter) && formattingCounter < 2) {
                    filteredState = true;
                }
                formattingCounter++;
                if (formattingCounter > 1 && formattingCounter < 4) {
                    stringBuilder.append("| ");
                }
            }
            if (filteredState) {
                System.out.printf("%s", stringBuilder);
            }
            filteredState = false;
            formattingCounter = 0;
            System.out.println();
        }
    }

    private StringBuilder getStringBuilderPosition(int formattingCounter, boolean filteredState, StringBuilder stringBuilder) {
        if (filteredState && (formattingCounter > 1)) {
            System.out.printf("%s", stringBuilder);
            stringBuilder = new StringBuilder("");
        }
        return stringBuilder;
    }

    private StringBuilder getLengthCounter(int formattingCounter, StringBuilder stringBuilder, Map<String, String> recordEntry, Map.Entry<String, String> entry ) {
        //gets the length of the string used for organizing the table layout
        if (formattingCounter > 0) {
            stringBuilder.append(recordEntry.get(entry.getKey()));
            while (stringBuilder.length() < 20) {
                stringBuilder.append(" ");
            }
        } else {
            stringBuilder.append(recordEntry.get(entry.getKey()));
            stringBuilder.append(" ");
        }
        return stringBuilder;
    }
}
