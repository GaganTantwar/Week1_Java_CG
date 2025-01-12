import java.util.*;

public class FactorFinder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");
        
        // Run a for loop from i = 1 to i < number
        for (int i = 1; i <= number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                // If true, print the value of i as a factor
                System.out.println(i);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}



