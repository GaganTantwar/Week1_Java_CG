import java.util.*;
class NullPointerException {
    
    // Method to generate an exception
    public static void generateException(String text) {
        // This line will throw NullPointerException if text is null
        System.out.println("Length of a String: " + text.length());
    }

    // Method to handle exceptions
    public static void handleException(String text) {
        try {
            // This line will throw NullPointerException if text is null
            System.out.println("Length of a String: " + text.length());
        } catch (java.lang.NullPointerException e) {
            // This block will catch the NullPointerException
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // This block will catch any other exceptions
            System.out.println(e.getMessage());
        }
    }

    // Main method
    public static void main(String args[]) {
        String text = null;
        try {
            // Call method to generate exception
            generateException(text);
        } catch (Exception e) {
            System.out.print("Exception Generated: ");
            // Call method to handle exception
            handleException(text);
        }
    }
}
