import java.util.*;

class VowelAndConsonent {
    // Method to determine if a character is a vowel, consonant, or neither
    public static String vowelConsonent(char c) {
        int cases = (int) c; // Get ASCII value of the character
        char ch;

        // Check if the character is a lowercase alphabet
        if (cases >= 97 && cases <= 122) {
            ch = (char) cases;
            if ((ch == 'a') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'e')) {
                return "vowel"; // Return "vowel" if the character is a vowel
            } else {
                return "consonet"; // Return "consonet" if it's a consonant
            }
        }
        // Check if the character is an uppercase alphabet
        else if (cases >= 65 && cases <= 90) {
            cases += 32; // Convert to lowercase
            ch = (char) cases;
            if ((ch == 'a') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'e')) {
                return "vowel"; // Return "vowel" if the character is a vowel
            } else {
                return "consonet"; // Return "consonet" if it's a consonant
            }
        } else {
            return "not"; // Return "not" if it's not an alphabetic character
        }
    }

    // Method to determine the vowel/consonant status of each character in a string
    public static String[][] vowelConsonent2D(String str) {
        String lowercase = str.toLowerCase(); // Convert the input string to lowercase
        String[][] vowelConsonentArray = new String[str.length()][2]; // Initialize 2D array

        // Fill the first column of the array with characters from the string
        for (int i = 0; i < str.length(); i++) {
            vowelConsonentArray[i][0] = Character.toString(str.charAt(i));
        }

        // Determine the status (vowel, consonant, or not) for each character
        for (int i = 0; i < lowercase.length(); i++) {
            int tempc = lowercase.charAt(i);
            int cases = (int) tempc;

            if (cases >= 97 && cases <= 122) { // Check if it's an alphabet
                char ch = (char) cases;
                if ((ch == 'a') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'e')) {
                    vowelConsonentArray[i][1] = "vowel"; // Mark as vowel
                } else {
                    vowelConsonentArray[i][1] = "consonet"; // Mark as consonant
                }
            } else {
                vowelConsonentArray[i][1] = "not"; // Mark as not an alphabet
            }
        }
        return vowelConsonentArray;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter A String:");
        String input = sc.next();

        // Check the status of each character using vowelConsonent method
        for (int i = 0; i < input.length(); i++) {
            String status = vowelConsonent(input.charAt(i));
            System.out.println("Status of Character " + input.charAt(i) + " is " + status);
        }

        // Get the 2D array with characters and their statuses
        String[][] charStatus = vowelConsonent2D(input);

        // Print the statuses from the 2D array
        for (int i = 0; i < input.length(); i++) {
            System.out.println("Status of Character " + charStatus[i][0] + " is " + charStatus[i][1]);
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
