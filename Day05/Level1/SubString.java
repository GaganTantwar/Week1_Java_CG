import java.util.*;

class SubString {

    // Method to manually extract a substring from a string using charAt()
    static String checkSubstring(String str, int start, int end) {
        String subString = "";
        for (int i = start; i < end; i++) {
            // Append each character within the range to the result string
            subString = subString + str.charAt(i);
        }
        return subString;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a String:");
        String str = sc.next();

        // Prompt the user to enter start and end indexes
        System.out.println("Enter Start and End Indexes:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Generate substring using the custom method
        String str1 = checkSubstring(str, start, end);

        // Generate substring using Java's built-in substring method
        String str2 = str.substring(start, end);

        // Compare the two substrings and display the result
        if (str1.equals(str2)) {
            System.out.println("Substrings are equal: " + str1 + " " + str2);
        } else {
            System.out.println("Substrings are not equal: " + str1 + " " + str2);
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
