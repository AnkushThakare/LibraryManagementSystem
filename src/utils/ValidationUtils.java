package utils;

/**
 * Utility class for input validation.
 */
public class ValidationUtils {

    /**
     * Checks if a string is valid (not null and not empty).
     * @param input The input string.
     * @return true if valid, false otherwise.
     */
    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    /**
     * Checks if a number is valid (greater than zero).
     * @param number The number to check.
     * @return true if valid, false otherwise.
     */
    public static boolean isValidNumber(int number) {
        return number > 0;
    }
}
