import java.util.*;

 class PalindromeChecker{

    // Method 1: Check if a string is a palindrome by comparing start and end characters
    public static boolean isPalindromeByComparison(String inputText) {
        int startIndex = 0;
        int endIndex = calculateStringLength(inputText) - 1;

        while (startIndex < endIndex) {
            if (inputText.charAt(startIndex) != inputText.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    // Method 2: Recursive method to check if a string is a palindrome
    public static boolean isPalindromeRecursively(String inputText, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return true;
        }
        if (inputText.charAt(startIndex) != inputText.charAt(endIndex)) {
            return false;
        }
        return isPalindromeRecursively(inputText, startIndex + 1, endIndex - 1);
    }

    // Method 3: Check if a string is a palindrome by reversing it
    public static boolean isPalindromeByReversal(String inputText) {
        char[] originalArray = new char[calculateStringLength(inputText)];
        char[] reversedArray = new char[calculateStringLength(inputText)];

        for (int i = 0; i < calculateStringLength(inputText); i++) {
            originalArray[i] = inputText.charAt(i);
        }

        int endIndex = calculateStringLength(inputText) - 1;
        for (int i = 0; i < calculateStringLength(inputText); i++) {
            reversedArray[i] = inputText.charAt(endIndex - i);
        }

        for (int i = 0; i < calculateStringLength(inputText); i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to calculate the length of a string without using length() method
    public static int calculateStringLength(String inputText) {
        int length = 0;
        try {
            while (true) {
                inputText.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of the string reached
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the text:");
        String userInput = scanner.nextLine();

        // Check palindrome using Method 1
        boolean isPalindromeComparison = isPalindromeByComparison(userInput);

        // Check palindrome using Method 2
        boolean isPalindromeRecursive = isPalindromeRecursively(userInput, 0, calculateStringLength(userInput) - 1);

        // Check palindrome using Method 3
        boolean isPalindromeReversal = isPalindromeByReversal(userInput);

        // Display results
        System.out.println("Result using Comparison Method: " + (isPalindromeComparison ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Result using Recursive Method: " + (isPalindromeRecursive ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Result using Reversal Method: " + (isPalindromeReversal ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
