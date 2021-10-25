package orgbridgelabz.assignmenttwentyone;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class UserValidatorTest {
    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateFirstName("Sameer");
            assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateLastName("Jadhav");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmailIDeWhenValidShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try{
            boolean result = validator.validateEmailAddress("abc+100@yahoo.com");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenMobileNumberWhenValidFormatShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateMobileNumber("0 7568438745");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenPasswordWhenValidPattern1ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validatePasswordPattern1("PassWordSam");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPasswordWhenValidPattern2ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
//        boolean result = validator.validatePasswordPattern2("passwordsam"); // This case should fail as there is not at least one uppercase character
        try {
            boolean result = validator.validatePasswordPattern2("passwordSam");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    //Handled With Custom Exception
    @Test
    public void givenPasswordWhenValidPattern3ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validatePasswordPattern3("pas swordSam19");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenPasswordWhenValidPattern4ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validatePasswordPattern4("Sameer@@1994");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenEmailIDSamplesWhenValidShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        try {
            boolean result1 = validator.validateEmailAddress("abc+100@yahoo.com");
            boolean result2 = validator.validateEmailAddress("abc@yahoo.com");
            boolean result3 = validator.validateEmailAddress("abc-100@yahoo.com");
            boolean result4 = validator.validateEmailAddress("abc.100@yahoo.com");
            boolean result5 = validator.validateEmailAddress("abc111@abc.com");
            boolean result6 = validator.validateEmailAddress("abc-100@abc.net");
            boolean result7 = validator.validateEmailAddress("abc.100@abc.com.au");
            boolean result8 = validator.validateEmailAddress("abc@1.com");
            boolean result9 = validator.validateEmailAddress("abc@gmail.com.com");
            boolean[] test = {result1, result2, result3, result4, result5, result6, result7, result8, result9};
            for (boolean element : test) {
                Assert.assertTrue(element);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
