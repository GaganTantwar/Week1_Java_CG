import java.util.*; // Importing the Scanner class for user input

// Class to check if a string is a palindrome
class Palindrome {
    private String input; // Input string

    // Constructor to initialize the input string
    public Palindrome(String input) {
        this.input = input;
    }

    // Method to check if the input string is a palindrome
    public boolean checkPalindrome() {
        input = input.toLowerCase(); // Convert the input string to lowercase
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare characters from the beginning and end of the string
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false; // Return false if characters do not match
            }
        }
        return true; // Return true if the string is a palindrome
    }
}

// Main class to interact with the Palindrome class
public class MainPlaindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user to enter a string
        System.out.println("Enter a String: ");
        String text = sc.next();
        
        // Creating a Palindrome object with user-provided string
        Palindrome palindrome = new Palindrome(text);
        
        // Checking if the string is a palindrome
        boolean ispalindrome = palindrome.checkPalindrome();
        
        // Displaying the result
        System.out.println("String is Palindrome: " + ispalindrome);
        
        sc.close(); // Closing the Scanner object
    }
}
