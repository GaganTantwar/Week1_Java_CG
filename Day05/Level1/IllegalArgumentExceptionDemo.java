import java.util.*;

// Class to demonstrate IllegalArgumentException
class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        int size = text.length();
        // This line will generate IllegalArgumentException
        String subString = text.substring(2, 0);
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
        try {
            int size = text.length();
            // This line will generate IllegalArgumentException
            String subString = text.substring(2, 0);
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Caught an Exception: " + e.getMessage());
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner class object
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        // Call the method to generate IllegalArgumentException
        // Uncomment the line below to generate IllegalArgumentException
        // generateIllegalArgumentException(text);

        // Call the method to handle IllegalArgumentException
        handleIllegalArgumentException(text);

        // Close the Scanner Object
        sc.close();
    }
}
