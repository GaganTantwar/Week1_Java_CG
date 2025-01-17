import java.util.*;

// Class to demonstrate StringIndexOutOfBoundsException
class StringIndexOutOfBoundsException {
    
    // Method to generate an exception
    public static void generateException(String text) {
        System.out.println("Value of a String at index : ");
        // This line will throw StringIndexOutOfBoundsException if text.length() is used as index
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle exceptions
    public static void handleException(String text) {
        try {
            // This line will throw StringIndexOutOfBoundsException if text.length() is used as index
            System.out.println(text.charAt(text.length()));
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // This block will catch the StringIndexOutOfBoundsException
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // This block will catch any other exceptions
            System.out.println(e.getMessage());
        }
    }

    // Main method
    public static void main(String args[]) {
        System.out.println("Enter a String for execution :");
        Scanner sc = new Scanner(System.in);
        String text;
        text = sc.next();
        try {
            // Call method to generate exception
            generateException(text);
        } catch (Exception e) {
            System.out.print("Exception Generated: ");
            // Call method to handle exception
            handleException(text);
        }
        sc.close();
    }
}
