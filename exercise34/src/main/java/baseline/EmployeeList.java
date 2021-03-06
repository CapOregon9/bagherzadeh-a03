/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    private static final Scanner in = new Scanner(System.in);
    //Initialize arraylist to store the employees
    private ArrayList<String> employees = new ArrayList<>();

    //constructor to initialize the employee array list
    public EmployeeList() {
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("jeremy Goodwin");
    }

    public String getEmployeeToRemove() {
        //take input of an employee from the user
        System.out.printf("%nEnter an employee name to remove:%n");
        return in.nextLine();
    }

    public void removeEmployeeFromArrayList(String employee) {
        //check through the arrayList and remove the specific employee
        employees.remove(employee);
    }

    public void printEmployeeList() {
        //outputs list of employees to users
        System.out.printf("%nThere are %d employees:%n", employees.size());
        for (String employee:
             employees) {
            System.out.println(employee);
        }
    }

    public Object[] getEmployeeList() {
        //used for junit testing
        return this.employees.toArray();
    }
}
