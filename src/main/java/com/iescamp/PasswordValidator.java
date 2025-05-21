package com.iescamp;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password.length() > 7) {
            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            java.util.Scanner scanner = new java.util.Scanner(password);
            scanner.useDelimiter(""); // separa cada carácter
            java.util.Iterator<String> iterator = scanner.tokens().iterator();

            while (iterator.hasNext()) {
                String s = iterator.next();
                char c = s.charAt(0);
                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (hasUpper && hasLower && hasDigit) {
                return true;
            }
        }
        return false;
    }
}
