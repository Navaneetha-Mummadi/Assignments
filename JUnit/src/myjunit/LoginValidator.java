package myjunit;

public class LoginValidator {

    public static boolean validate(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username or password cannot be null or empty");
        }

        // Assume these are correct credentials
        return username.equals("admin") && password.equals("password123");
    }
}
