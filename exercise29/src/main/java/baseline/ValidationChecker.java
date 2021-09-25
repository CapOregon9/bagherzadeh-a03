package baseline;

public class ValidationChecker {
    //store input and result of formula in an instance variable

    double yearsToDoubleInvestment;

    public ValidationChecker() {
        //used in main method instantiation
    }

    public ValidationChecker(double yearsToDoubleInvestment) {
        //used for junit testing
        this.yearsToDoubleInvestment = yearsToDoubleInvestment;
    }

    public void setYearsToDoubleInvestment() {
        //checks if input is valid by checking if the value can be divided
        double inputRate;
    }

    public void printInvestmentTime() {
        //prints results from valid input
    }
}
