package testregex;

import org.junit.Assert;
import org.junit.Test;
import regex.UserRegistration;
import regex.UserRegistrationException;


public class TestUserRegistration {

    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            Boolean result = user.emailCheck(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean name = user.firstName("");
            Assert.assertTrue(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPasswordPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean password = user.checkPassword(null);
            Assert.assertTrue(password);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAMobileNumberPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean number = user.numberCheck("");
            Assert.assertTrue(number);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPatternOfLastNameWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean lastName = user.lastName(null);
            Assert.assertTrue(lastName);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

}
