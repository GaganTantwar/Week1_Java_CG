import java.util.*;

class TrimSpacesUsingCharAt{

    // Method to trim leading and trailing spaces
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        int []temp=new int[2]; 
        // Trim leading spaces
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        // Return start and end points in an array
        temp[0]=start;
        temp[1]=end;
        return temp;
    }

    // Method to create a substring using charAt
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result=result+str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        // Call the trimSpaces method to find the start and end points
        int[] indices = trimSpaces(input);

        // Extract the trimmed string using createSubstring
        String trimmedString = createSubstring(input, indices[0], indices[1]);

        // Trim the input string using the built-in trim() method
        String builtInTrimmed = input.trim();

        // Compare the two trimmed strings using compareStrings
        boolean areEqual = compareStrings(trimmedString, builtInTrimmed);

        // Display the results
        System.out.println("Trimmed string (using charAt method): '" + trimmedString + "'");
        System.out.println("Trimmed string (using built-in method): '" + builtInTrimmed + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        sc.close(); // Close the scanner
    }
}
