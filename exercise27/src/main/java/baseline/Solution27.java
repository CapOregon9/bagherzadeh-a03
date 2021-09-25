package baseline;

public class Solution27 {
    public static void main(String[] args) {
        //Create instance of validation object
        Validation vd = new Validation();
        //Call input methods
        vd.setFirstName();
        vd.setLastName();
        vd.setZipCode();
        vd.setEmployeeID();
        //Call validation method
        vd.validateInput();
        //Call print method
        vd.printValidationResults();
    }
}
