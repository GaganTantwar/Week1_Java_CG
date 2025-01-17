import java.util.*; // Importing utility package for Scanner class

// Class to process strings and compare them
class StringsArrayCompare {

    // Method to manually split a string into an array of words
    private static String[] stringArray(String str) {
        int count = 0; // Counter to count the number of words
        
        // Loop through the string to count words based on spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // Increment count for each space
                count += 1;
                continue;
            } else if ((i == (str.length() - 1)) && str.charAt(i) != ' ') {
                // Increment count for the last word if the string doesn't end with a space
                count += 1;
            }
        }

        // Create an array to store the words
        String[] words = new String[count];
        String temp = ""; // Temporary string to build words
        int j = 0; // Index for the words array

        // Loop through the string to populate the words array
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // If space is encountered
                words[j] = temp; // Assign the word to the array
                j += 1; // Move to the next index in the array
                temp = ""; // Reset the temporary string
                continue;
            } else if ((i == (str.length() - 1)) && str.charAt(i) != ' ') {
                // Handle the last word in the string
                temp = temp + str.charAt(i);
                words[count - 1] = temp; // Assign the last word to the array
            } else {
                temp = temp + str.charAt(i); // Build the word character by character
            }
        }
        return words; // Return the array of words
    }

    // Method to compare two arrays of strings
    private static boolean stringCompare(String[] words1, String[] words2) {
        // Print lengths of both arrays for debugging
        System.out.println(words1.length + " " + words2.length);

        boolean isTrue = false; // Variable to store the comparison result

        // Check if the lengths of the two arrays are equal
        if (words1.length == words2.length) {
            for (int i = 0; i < words1.length; i++) {
                // Compare each word using equals() to check for content equality
                if (words1[i].equals(words2[i])) {
                    isTrue = true; // Words match
                } else {
                    isTrue = false; // Words don't match
                    break; // Exit the loop early if a mismatch is found
                }
            }
        }
        return isTrue; // Return the comparison result
    }

    // Main method to execute the program
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for user input
        System.out.println("Enter a String for Execution ");

        String input = sc.nextLine(); // Taking string input from the user

        // Splitting the string into words using the custom method
        String[] words1 = stringArray(input);
        // Splitting the string into words using the built-in split() method
        String[] words2 = input.split(" ");

        // Printing the words generated by the custom method
        for (int i = 0; i < words1.length; i++) {
            System.out.println("Words of String: " + words1[i]);
            System.out.println("Words of String: " + words2[i]); // Printing words from split() method
        }

        // Comparing the arrays of words
        boolean isTrue = stringCompare(words1, words2);

        // Display the comparison result
        System.out.println("Strings are equal: " + isTrue);
    }
}
