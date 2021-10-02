package baseline;

public class Solution34 {
    public static void main(String[] args) {
        //create instance of employee list
        EmployeeList employeeList = new EmployeeList();

        employeeList.printEmployeeList();
        //call method to remove employee
        employeeList.removeEmployeeFromArrayList(employeeList.getEmployeeToRemove());
        //call method to print list of employees
        employeeList.printEmployeeList();
    }
}
