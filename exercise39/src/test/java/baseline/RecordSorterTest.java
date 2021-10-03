package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class RecordSorterTest {
    RecordSorter recordSorter;
    Map<String, String> firstNames;
    Map<String, String> lastNames;
    Map<String, String> position;
    Map<String, String> separationDate;
    List<Map<String, String>> records;
    @BeforeEach
    void createObjects() {
        recordSorter = new RecordSorter();
        firstNames = new TreeMap<>();
        lastNames = new TreeMap<>();
        position = new TreeMap<>();
        separationDate = new TreeMap<>();
        recordSorter.addRecordMap("John", "Johnson", "Manager", "2016-12-31");
        firstNames.put("Johnson", "John");
        lastNames.put("Johnson", "Johnson");
        position.put("Johnson", "Manager");
        separationDate.put("Johnson", "2016-12-31");
        records = new ArrayList<>();
        records.add(firstNames);
        records.add(lastNames);
        records.add(position);
        records.add(separationDate);
    }

    @Test
    void addRecordMap() {
        assertEquals(firstNames, recordSorter.getFirstNames());
        assertEquals(lastNames, recordSorter.getLastNames());
        assertEquals(position, recordSorter.getPosition());
        assertEquals(separationDate, recordSorter.getSeparationDate());
    }

    @Test
    void compileRecordList() {
        recordSorter.addRecordMap("John", "Johnson", "Manager", "2016-12-31");
        firstNames.put("Johnson", "John");
        lastNames.put("Johnson", "Johnson");
        position.put("Johnson", "Manager");
        separationDate.put("Johnson", "2016-12-31");

        recordSorter.compileRecordList();

        assertEquals(records, recordSorter.getRecords());
    }
}