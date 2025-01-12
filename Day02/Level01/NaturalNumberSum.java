import java.util.*;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int userInputNumber = scanner.nextInt();
        
        // Check if the number is a natural number
        if (userInputNumber >= 0) {
            // Calculate the sum of the first N natural numbers using the formula
            int sumOfNaturalNumbers = userInputNumber * (userInputNumber + 1) / 2;
            
            // Print the result
            System.out.println("The sum of the first " + userInputNumber + " natural numbers is " + sumOfNaturalNumbers);
        } 
        else {
            // Print that the number is not a natural number
            System.out.println("The number " + userInputNumber + " is not a natural number");
        }
        
        // Close the scanner object

        scanner.close();
    }
}

