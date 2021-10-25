package orgbridgelabz.assignmenttwentyone;
import java.util.regex.Pattern;

class InvalidUserInputException extends Exception {
    @Override
    public String getMessage(){
        return "Please Enter Valid Inputs.";
    }
}
class InvalidMobileNumberException extends Exception {
    @Override
    public String getMessage(){
        return "Mobile Number Should Start With Country Code Followed By Space" + " " + "And Then Number.";
    }
}
class InvalidPasswordException1 extends Exception {
    @Override
    public String getMessage(){
        return "Password Must Contain Minimum 8 Characters.";
    }
}
class InvalidPasswordException2 extends Exception {
    @Override
    public String getMessage(){
        return "Password Must Contain Minimum 8 Characters: Mandatory Fields-> 1 Upper Case.";
    }
}
class InvalidPasswordException3 extends Exception {
    @Override
    public String getMessage(){
        return "Password Must Contain Minimum 8 Characters: Mandatory Fields-> 1 Upper Case, 1 Numeric.";
    }
}
class InvalidPasswordException4 extends Exception {
    @Override
    public String getMessage(){
        return "Password Must Contain Minimum 8 Characters: Mandatory Fields-> 1 Upper Case, 1 Numeric, 1 Special.";
    }
}

public class UserValidator {
    private static final String firstNamePattern = "^[A-Z][a-z]{2,}$"; //regex
    private static final String lastNamePattern = "^[A-Z][a-z]{2,}$"; //regex
    private static final String emailIDPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"; //regex
    private static final String mobileNumberPattern = "(0|91)*[ ][7-9][0-9]{9}"; //regex
    private static final String passwordPattern1 = "^[a-zA-Z]{8,}$"; //regex
    private static final String passwordPattern2 = "^(?=.*[A-Z])[A-Za-z]{8,}$"; //regex
    private static final String passwordPattern3 = "^(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{8,}$"; //regex
    private static final String passwordPattern4 = "^(?=.*[0-9])(?=.*[A-Z])(?=.*([$&+,:;=?@#|/'<>.^*()%!-]))(?=.{8,}$).*$"; //regex


    /***
     *
     * @param email Paraeterized
     * @return
     */
    public boolean validateEmailAddressParameterized(String email){
        Pattern pattern8 = Pattern.compile(emailIDPattern);
        return pattern8.matcher(email).matches();
    }

    /***
     *
     * @param fName for valid first name
     * @return
     */
    public boolean validateFirstName(String fName) throws InvalidUserInputException {
        Pattern pattern = Pattern.compile(firstNamePattern);
        if (!pattern.matcher(fName).matches()){
            throw new InvalidUserInputException();
        }
        return pattern.matcher(fName).matches();
    }

    /***
     *
     * @param lName for valid last name
     * @return
     */
    public boolean validateLastName(String lName) throws InvalidUserInputException {
        Pattern pattern2 = Pattern.compile(lastNamePattern);
        if (!pattern2.matcher(lName).matches()){
            throw new InvalidUserInputException();
        }
        return pattern2.matcher(lName).matches();
    }

    /***
     *
     * @param email for valid e-mail
     * @return
     */
    public boolean validateEmailAddress(String email) throws InvalidUserInputException {
        Pattern pattern3 = Pattern.compile(emailIDPattern);
        if (!pattern3.matcher(email).matches()){
            throw new InvalidUserInputException();
        }
        return pattern3.matcher(email).matches();
    }

    /***
     *
     * @param mobileNumber for valid mobile number
     * @return
     */
    public boolean validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        Pattern pattern3 = Pattern.compile(mobileNumberPattern);
        if (!pattern3.matcher(mobileNumber).matches()){
            throw new InvalidMobileNumberException();
        }
        return pattern3.matcher(mobileNumber).matches();
    }

    /***
     *
     * @param passwordPattern for minimum 8 characters
     * @return
     */
    public boolean validatePasswordPattern1(String passwordPattern) throws InvalidPasswordException1 {
        Pattern pattern4 = Pattern.compile(passwordPattern1);
        if (!pattern4.matcher(passwordPattern).matches()){
            throw new InvalidPasswordException1();
        }
        return pattern4.matcher(passwordPattern).matches();
    }

    /***
     *
     * @param passwordPattern for at least 1 Upper Case Character
     * @return
     */
    public boolean validatePasswordPattern2(String passwordPattern) throws InvalidPasswordException2 {
        Pattern pattern5 = Pattern.compile(passwordPattern2);
        if (!pattern5.matcher(passwordPattern).matches()){
            throw new InvalidPasswordException2();
        }
        return pattern5.matcher(passwordPattern).matches();
    }

    /***
     *
     * @param passwordPattern for at least 1 Numeric Character
     * @return
     */
    public boolean validatePasswordPattern3(String passwordPattern) throws InvalidPasswordException3 {
        Pattern pattern6 = Pattern.compile(passwordPattern3);
        if (!pattern6.matcher(passwordPattern).matches()){
            throw new InvalidPasswordException3();
        }
        return pattern6.matcher(passwordPattern).matches();
    }

    /***
     *
     * @param passwordPattern for at least 1 Special Character
     * @return
     */
    public boolean validatePasswordPattern4(String passwordPattern) throws InvalidPasswordException4 {
        Pattern pattern7 = Pattern.compile(passwordPattern4);
        if (!pattern7.matcher(passwordPattern).matches()){
            throw new InvalidPasswordException4();
        }
        return pattern7.matcher(passwordPattern).matches();
    }

}
