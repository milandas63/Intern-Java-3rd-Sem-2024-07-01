public class NextTenNumbersInSeries {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        System.out.println("First 12 numbers in the series:");
        System.out.print(firstNumber + " "); 
        System.out.print(secondNumber + " "); 
        for (int i = 3; i <= 12; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
class TooSmallUsernameException extends InvalidLoginException {
    public TooSmallUsernameException(String message) {
        super(message);
    }
}
class TooLongUsernameException extends InvalidLoginException {
    public TooLongUsernameException(String message) {
        super(message);
    }
}
class WrongStartCharacterException extends InvalidLoginException {
    public WrongStartCharacterException(String message) {
        super(message);
    }
}
class SpaceInUsernameException extends InvalidLoginException {
    public SpaceInUsernameException(String message) {
        super(message);
    }
}
import com.password.*;

public class LoginValidator {
    private static final String[][] users = {
            {"Milan", "das"},
            {"Prateekshya", "patnaik"},
            {"Goutam", "gosain"},
            {"Chinmay", "maharana"},
            {"Satyam", "behera"},
            {"Purna", "panda"},
            {"Soumya", "mishra"}
    };

    public static void main(String[] args) {
        String username = "Milan";
        String password = "wrongpassword";

        try {
            validateLogin(username, password);
            System.out.println("Login successful!");
        } catch (LoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
 public static void validateLogin(String username, String password) throws LoginException {
        boolean validUsername = false;
        boolean validPassword = false;

        for (String[] user : users) {
            if (user[0].equals(username)) {
                validUsername = true;
                if (user[1].equals(password)) {
                    validPassword = true;
                    break;
                } else {
                    throw new WrongPasswordException("Incorrect password");
                }
            }
        }

        if (!validUsername) {
            throw new WrongUsernameException("Username not found");
        }

        if (!validPassword) {
            throw new WrongPasswordException("Incorrect password");
        }
    }
}

