import java.util.*;

// Class to compare two strings
class CompareString {
    
    // Method to compare two strings character by character
    static boolean compareOfString(String str1, String str2) {
        // Check if lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        } else {
            // Compare each character of the strings
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the strings
		System.out.println("Enter Two String");
        String input1 = sc.next();
        String input2 = sc.next();
        
        // Check if the strings are equal using built-in method
        boolean builtInCheck = input1.equals(input2);
        
        // Check if the strings are equal using custom method
        boolean checkEqual = compareOfString(input1, input2);
        
        // Print the result
        if (builtInCheck == true && checkEqual == true) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        
        // Close the Scanner object
        sc.close();
    }
}
