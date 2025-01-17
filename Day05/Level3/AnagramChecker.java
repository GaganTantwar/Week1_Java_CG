import java.util.*;

class AnagramChecker{

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths of the two texts are equal
        if (getStringLength(str1) != getStringLength(str2)) {
            return false;
        }

        // Create arrays to store the frequency of characters
        int[] frequency1 = new int[256]; // Assuming ASCII characters
        int[] frequency2 = new int[256];

        // Find the frequency of charactSers in the first text
        for (int i = 0; i < getStringLength(str1); i++) {
            frequency1[str1.charAt(i)]++;
        }

        // Find the frequency of characters in the second text
        for (int i = 0; i < getStringLength(str2); i++) {
            frequency2[str2.charAt(i)]++;
        }

        // Compare the frequency of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to find the length of a string without using length() method
    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first text:");
        String firstText = input.nextLine();
        System.out.println("Enter the second text:");
        String secondText = input.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(firstText, secondText);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
