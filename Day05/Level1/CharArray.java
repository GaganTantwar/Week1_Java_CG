import java.util.*;

// Class to demonstrate conversion of a string to a character array
class CharArray {
    
    // Method to convert a string to a character array
    static char[] stringTocharArr(String str) {
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }

    // Main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        // Take user input for the string
        String input = sc.next();
        
        // Convert the string to a character array using custom method
        char[] charArr1 = stringTocharArr(input);
        
        // Convert the string to a character array using built-in method
        char[] charArr2 = input.toCharArray();
        
        // Compare the two character arrays
        int checkArr = Arrays.compare(charArr1, charArr2);
        
        // Print the result
        if (checkArr == 0) {
            System.out.println("Both the arrays are same");
        } else {
            System.out.println("Both the arrays are same");
        }
        
        // Close the Scanner object
        sc.close();
    }
}
