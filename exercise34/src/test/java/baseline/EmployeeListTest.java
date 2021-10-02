/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void removeChrisJonesEmployeeFromArrayList() {
        EmployeeList employeeList = new EmployeeList();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Amanda Cullen");
        employees.add("jeremy Goodwin");
        employeeList.removeEmployeeFromArrayList("Chris Jones");

        assertArrayEquals(employees.toArray(), employeeList.getEmployeeList());
    }
}