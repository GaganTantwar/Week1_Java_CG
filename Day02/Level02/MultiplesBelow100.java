import java.util.*;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print the multiples of the number below 100
        System.out.println("The multiples of " + number + " below 100 are:");
        
        // Run a for loop backward from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                // If true, print the number
                System.out.println(i);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}



