import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using the length() method
    public static int lengthOfString(String str) {
        int length = 0; // Variable to store the length
        for (char c1 : str.toCharArray()) { // Convert the string to a character array and iterate through it
            length++; // Increment the length for each character
        }
        return length; // Return the calculated length
    }


    // Method to find unique characters in a string using the charAt() method
    public char[] extractUniqueCharacters(String text) {
        int length = lengthOfString(text);
        char[] tempUniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Creating a new array with the exact size of unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUniqueChars[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input text
        System.out.println("Enter a text to find unique characters:");
        String inputText = scanner.nextLine();

        // Creating an instance of UniqueCharacters class
        UniqueCharacters uniqueFinder = new UniqueCharacters();

        // Extracting unique characters
        char[] uniqueCharacters = uniqueFinder.extractUniqueCharacters(inputText);

        // Displaying the unique characters
        System.out.println("Unique characters in the text:");
        for (char character : uniqueCharacters) {
            System.out.print(character + " ");
        }
    }
}
