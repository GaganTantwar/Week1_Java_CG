import java.util.*;

import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the base number
        System.out.print("Enter the base number: ");
        int baseNumber = scanner.nextInt();
        
        // Take user input for the power/exponent
        System.out.print("Enter the exponent (power): ");
        int exponent = scanner.nextInt();
        
        // Initialize the result variable to 1 (since any number raised to 0 is 1)
        int result = 1;
        
        // Run a for loop from i = 1 to i <= exponent
        for (int i = 1; i <= exponent; i++) {
            // Multiply the result by the base number for each iteration
            result *= baseNumber;
        }
        
        // Print the final result
        System.out.println("The result of " + baseNumber + " raised to the power of " + exponent + " is " + result);
        
        // Close the scanner
        scanner.close();
    }
}



