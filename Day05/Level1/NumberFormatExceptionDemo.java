import java.util.*;

// Class to demonstrate NumberFormatException
class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // This line will generate NumberFormatException
        int number = Integer.parseInt(text);
    } 

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            // This line will generate NumberFormatException
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Caught an Exception: " + e.getMessage());
        }
    } 

    // Main method
    public static void main(String[] args) {

        // Create a Scanner class object
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        // Call the method to generate NumberFormatException
        // Uncomment the below line to generate NumberFormatException
        try {
            generateNumberFormatException(text);
        } catch (Exception e) {
            // Call the method to handle NumberFormatException
            handleNumberFormatException(text);
        }

        // Close the Scanner object
        sc.close();
    }
}
