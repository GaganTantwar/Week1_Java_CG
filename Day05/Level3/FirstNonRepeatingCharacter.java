import java.util.*;

class FirstNonRepeatingCharacter{
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String text) {
        int[] charFrequency = new int[256]; // Array to store the frequency of each character

        // Iterate through the string to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Iterate through the string to identify the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i); // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingChar(input);

        // Display the result to the user
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }

        sc.close();
    }
}
