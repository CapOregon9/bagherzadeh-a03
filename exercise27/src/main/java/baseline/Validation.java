package baseline;

public class Validation {
    //store inputs as instance variables
    String firstName;
    String lastName;
    String zipCode;
    String employeeID;
    Boolean validState;

    public Validation() {
        //general constructor to use in main method
    }

    public Validation(String firstName, String lastName, String zipCode, String employeeID, Boolean validState) {
        //constructor made to use with junit testing
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.employeeID = employeeID;
        this.validState = validState;
    }

    public void setFirstName() {
        //prompt user and set first name
    }

    public void setLastName() {
        //prompt user and set last name
    }

    public void setZipCode() {
        //prompt user and set ZIP code
    }

    public void setEmployeeID() {
        //prompt user and set employee ID
    }

    public String validateInput() {
        //validates all inputs and returns results as a string
        return "";
    }

    public void printValidationResults() {
        //Return results from validate input to user

    }
}
