package regex;

import java.util.regex.Pattern;

public class UserRegistration {
    /**
     * @param name to check the name pattern
     */
    public boolean emailCheck(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("([a-zA-Z0-9-_]{3,})[a-zA-Z0-9.-_]*[@][a-zA-Z0-9]*[a-zA-Z0-9.-_]{3,}[a-zA-Z0-9.-_]*", name);
            return check;
        };
        return verification.validate(name);
    }

    /**
     * @param name is used to check pattern for first name
     */
    public boolean firstName(String name) throws UserRegistrationException {

        if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
            return check;
        };
        return verification.validate(name);

    }

    /**
     * @param name checks the pattern of last name
     */
    public boolean lastName(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
            return check;
        };
        return verification.validate(name);
    }

    /**
     * @param number checks the number pattern
     */

    public boolean numberCheck(String number) throws UserRegistrationException {
        if (number == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (number.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("[9][1][\s][0-9]{10}", number);
            return check;
        };
        return verification.validate(number);
    }

    /**
     * @param password checks the password pattern
     */

    public boolean checkPassword(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (password.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        ValidateUser verification = ln -> {
            boolean check = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9]{8,}[@$!%*?&]{1}$", password);
            return check;
        };
        return verification.validate(password);
    }

}
