import java.util.*;

 class CharacterFrequency{

    // Method to find the length of the string without using the length() method
    public int calculateLength(String input) {
        int length = 0; // Variable to store the length
        for (char c1 : input.toCharArray()) { // Convert the string to a character array and iterate through it
            length++; // Increment the length for each character
        }
        return length; // Return the calculated length
    }

    // Method to calculate the frequency of each character in a string
    public int[][] computeCharFrequency(String input) {
        int length = calculateLength(input);
        int[] frequencyArray = new int[256]; // Array to store frequency of characters

        // Calculate frequency of each character
        for (int i = 0; i < length; i++) {
            frequencyArray[input.charAt(i)]++;
        }

        // Count the number of unique characters
        int uniqueCharCount = 0;
        for (int frequency : frequencyArray) {
            if (frequency > 0) {
                uniqueCharCount++;
            }
        }

        // Create an array to store unique characters and their frequencies
        int[][] charFrequencyData = new int[uniqueCharCount][2];
        int index = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                charFrequencyData[index][0] = i; // Store ASCII value of the character
                charFrequencyData[index][1] = frequencyArray[i]; // Store character frequency
                index++;
            }
        }

        return charFrequencyData;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String userInput = sc.nextLine();

        // Create an instance of CharacterFrequency class
        CharacterFrequency frequencyCalculator = new CharacterFrequency();

        // Compute character frequencies
        int[][] result = frequencyCalculator.computeCharFrequency(userInput);

        // Display character frequencies
        System.out.println("Character frequencies in the string:");
        for (int[] charData : result) {
            char character = (char) charData[0];
            int frequency = charData[1];
            System.out.println(character + ": " + frequency);
        }

        sc.close();
    }
}
