package de.neuefische;

public class StringChecker {
    public static boolean checkString(String input) {
        return input.length() > 20 && input.contains("fancy");
    }
}
