
import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int userInputNumber = scanner.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (userInputNumber > 0) {
            System.out.println("The number is positive.");
        } else if (userInputNumber < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Close the scanner object

        scanner.close();
    }
}

