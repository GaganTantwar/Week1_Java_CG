import java.util.*;

class CharacterFrequency2{

    // Method to determine the length of the string without using the built-in length() method
    public static int calculateStringLength(String input) {
        int length = 0; // Variable to store the length
        for (char c1 : input.toCharArray()) { // Convert the string to a character array and iterate through it
            length++; // Increment the length for each character
        }
        return length; // Return the calculated length
    }

    // Method to identify unique characters in a given string
    public static char[] extractUniqueCharacters(String inputString) {
        int stringLength = calculateStringLength(inputString);
        char[] temporaryStorage = new char[stringLength];
        int uniqueCharacterCount = 0;

        for (int i = 0; i < stringLength; i++) {
            char currentCharacter = inputString.charAt(i);
            boolean isUnique = true;

            // Check if the character is already encountered
            for (int j = 0; j < i; j++) {
                if (inputString.charAt(j) == currentCharacter) {
                    isUnique = false;
                    break;
                }
            }

            // Add the character to temporary storage if it's unique
            if (isUnique) {
                temporaryStorage[uniqueCharacterCount++] = currentCharacter;
            }
        }

        // Create an array to store only the unique characters
        char[] uniqueCharacters = new char[uniqueCharacterCount];
        for (int i = 0; i < uniqueCharacterCount; i++) {
            uniqueCharacters[i] = temporaryStorage[i];
        }

        return uniqueCharacters;
    }

    // Method to compute the frequency of unique characters in a string
    public static String[][] calculateCharacterFrequency(String inputString) {
        char[] uniqueChars = extractUniqueCharacters(inputString);
        int[] frequencyArray = new int[256]; // Array to track frequency of ASCII characters

        // Count the frequency of each character in the string
        for (int i = 0; i < calculateStringLength(inputString); i++) {
            frequencyArray[inputString.charAt(i)]++;
        }

        // Create a 2D array to store characters and their frequencies
        String[][] characterFrequency = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            characterFrequency[i][0] = String.valueOf(uniqueChars[i]); // Character
            characterFrequency[i][1] = String.valueOf(frequencyArray[uniqueChars[i]]); // Frequency
        }

        return characterFrequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Enter the text:");
        String userInput = sc.nextLine();

        // Calculate character frequencies
        String[][] characterFrequencies = calculateCharacterFrequency(userInput);

        // Display the frequency of each unique character
        System.out.println("Character frequencies:");
        for (int i = 0; i < characterFrequencies.length; i++) {
            System.out.println(characterFrequencies[i][0] + ": " + characterFrequencies[i][1]);
        }
        sc.close();
    }
}
