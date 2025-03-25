class Authenticator {
    private String correctPassword = "admin123";

    // Member inner class for validation
    private class Validator {
        private boolean validate(String password) {
            return correctPassword.equals(password);
        }
    }

    public void login(String password) {
        Validator validator = new Validator(); // Creating instance of inner class
        if (validator.validate(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Incorrect Password");
        }
    }
}

public class AuthenticatorTest {
    public static void main(String[] args) {
        Authenticator auth = new Authenticator();
        auth.login("admin123"); // Expected output: Login Successful
        auth.login("wrongpass"); // Expected output: Incorrect Password
    }
}
