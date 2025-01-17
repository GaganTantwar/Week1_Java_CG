import java.util.*; // Importing utility package for Scanner class

// Class to calculate the length of a string using custom logic
class LengthOfString {

    private static int lengthOfString(String str) {
        int count = 0; // Counter to track the length of the string
        try {
            int i = 0; // Index to traverse the string
            while (true) { // Infinite loop to iterate over the string
                // Check if the character is an alphabet (both lowercase and uppercase)
                if ((str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 65 && str.charAt(i) <= 90)) {
                    i += 1; // Increment index
                    count += 1; // Increment counter
                }
            }
        }
        // Catch block to handle StringIndexOutOfBoundsException when the loop exceeds string bounds
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("The String length is generated"); // Message indicating calculation completion
        }
        // Catch block for any other unexpected exceptions
        catch (Exception e) {
            System.out.println(e.getMessage()); // Print exception message
        }
        return count; // Return the calculated length of the string
    }



    // Main method to execute the program
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for user input
        String input = sc.next(); // Taking string input from the user
        int length = lengthOfString(input); // Calling the method to calculate string length
        System.out.println("Length of String: " + length); // Printing the length of the string
    }
}
