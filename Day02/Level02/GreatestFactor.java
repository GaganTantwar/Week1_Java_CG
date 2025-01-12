import java.util.*;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();
        
        // Initialize the greatestFactor variable
        int largestFactor = 1;
        
        // Loop from the number-1 down to 1
        for (int i = inputNumber - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (inputNumber % i == 0) {
                largestFactor = i;
                break;
            }
        }
        
        // Print the greatest factor
        System.out.println("The greatest factor of " + inputNumber + " besides itself is " + largestFactor);
        
        // Close the scanner class object
        scanner.close();
    }
}




