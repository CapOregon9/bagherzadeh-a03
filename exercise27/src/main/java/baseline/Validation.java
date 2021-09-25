package baseline;

import java.util.Scanner;

public class Validation {
    private static final Scanner in = new Scanner(System.in);
    //store inputs as instance variables
    String firstName;
    String lastName;
    String zipCode;
    String employeeID;
    String validationResult;

    public Validation() {
        //general constructor to use in main method
    }

    public Validation(String firstName, String lastName, String zipCode, String employeeID) {
        //constructor made to use with junit testing
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.employeeID = employeeID;
    }

    public void setFirstName() {
        //prompt user and set first name
        System.out.println("Enter the first name: ");
        firstName = in.nextLine();
    }

    public void setLastName() {
        //prompt user and set last name
        System.out.println("Enter the last name: ");
        lastName = in.nextLine();
    }

    public void setZipCode() {
        //prompt user and set ZIP code
        System.out.println("Enter the ZIP code: ");
        zipCode = in.nextLine();
    }

    public void setEmployeeID() {
        //prompt user and set employee ID
        System.out.println("Enter the employee ID: ");
        employeeID = in.nextLine();
    }

    public void validateInput() {
        //validates all inputs and returns results as a string
        validationResult = validateFirstName() + validateLastName() + validateZIPCode() + validateEmployeeID();
    }

    public String validateFirstName() {
        if (firstName.length() < 2) {
            if (firstName.length() == 0) {
                return String.format("The first name must be at least 2 characters long.%nThe first name must be filled in.%n");
            }
            return String.format("The first name must be at least 2 characters long.%n");
        }
        return "";
    }

    public String validateLastName() {
        if (lastName.length() < 2) {
            if (lastName.length() == 0) {
                return String.format("The last name must be at least 2 characters long.%nThe last name must be filled in.%n");
            }
            return String.format("The last name must be at least 2 characters long.%n");
        }
        return "";
    }

    public String validateZIPCode() {
        String patternZIP = "\\d{5}";
        if (!zipCode.matches(patternZIP)) {
            return (String.format("The zipcode must be a 5 digit number.%n"));
        }
        return "";
    }

    public String validateEmployeeID() {
        String patternID = "[a-zA-Z][a-zA-Z]-\\d{4}";
        if (!employeeID.matches(patternID)) {
            return (String.format("The employee ID must be in the format of AA-1234.%n"));
        }
        return "";
    }

    public void printValidationResults() {
        //Return results from validate input to user
        System.out.println((validationResult.length() > 0) ? validationResult : "There were no errors found.");
    }
}
