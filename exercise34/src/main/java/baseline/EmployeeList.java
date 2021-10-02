package baseline;

import java.util.ArrayList;

public class EmployeeList {
    //Initialize arraylist to store the employees
    ArrayList<String> employees = new ArrayList<>();

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
        return "";
    }

    public void removeEmployeeFromArrayList(String userInput) {
        //check through the arrayList and remove the specific employee
    }

    public void printEmployeeList() {
        //outputs list of employees to users
    }
}
