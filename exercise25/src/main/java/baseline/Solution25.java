package baseline;

public class Solution25 {

    public static void main(String[] args) {
        //create new instance of password
        Passwords password = new Passwords();
        //call input method for string and store it;
        String myPassword = password.setPassword();
        //call validation function and store result as an integer
        int validationResult = password.passwordValidator();
        //call strengh check function to generate result string
        String strenthResult = password.setPasswordStrength(validationResult, myPassword);
        //print results
        password.printResult(strenthResult);
    }
}
