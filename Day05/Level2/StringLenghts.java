import java.util.*; // Importing the utility package for Scanner class

// Class to calculate the lengths of words in a string and store them in a 2D array
class StringLengths{

    // Method to calculate the length of a string manually
    private static int lengthOfString(String str) {
        int length = 0; // Variable to store the length
        for (char c1 : str.toCharArray()) { // Convert the string to a character array and iterate through it
            length++; // Increment the length for each character
        }
        return length; // Return the calculated length
    }

    // Method to create a 2D array containing words and their respective lengths
    private static String[][] twoDarrayofString(String words[], int length[]) {
        String[][] twoDarray = new String[words.length][2]; // Create a 2D array with dimensions [number of words][2]
        for (int i = 0; i < words.length; i++) {
            twoDarray[i][0] = words[i]; // Store the word in the first column
            String temp = String.valueOf(length[i]); // Convert the word length to a string
            twoDarray[i][1] = temp; // Store the length in the second column
        }
        return twoDarray; // Return the 2D array
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("Enter a String for Execution "); // Prompting user for input

        String input = sc.nextLine(); // Taking the full string input from the user
        String[] words = input.split(" "); // Splitting the input string into an array of words
        StringLengths len=new StringLengths();
        int[] length = new int[words.length]; // Array to store the lengths of each word
        for (int i = 0; i < words.length; i++) {
            length[i] = lengthOfString(words[i]); // Calculate and store the length of each word
        }

        // Create a 2D array containing words and their lengths
        String[][] twoDArray = len.twoDarrayofString(words, length);

        // Print each word along with its length
        for (int i = 0; i < words.length; i++) {
            System.out.println("Words: " + twoDArray[i][0] + " Length: " + twoDArray[i][1]);
        }

        sc.close(); // Close the Scanner to release resources
    }
}
