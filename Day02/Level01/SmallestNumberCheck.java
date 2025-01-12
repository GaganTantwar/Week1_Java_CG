import java.util.*;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the first number
        System.out.print("Enter the first number (firstNumber): ");
        int firstNumber = scanner.nextInt();
        
        // Take user input for the second number
        System.out.print("Enter the second number (secondNumber): ");
        int secondNumber = scanner.nextInt();
        
        // Take user input for the third number
        System.out.print("Enter the third number (thirdNumber): ");
        int thirdNumber = scanner.nextInt();
        
        // Check if the first number is the smallest
        boolean isFirstSmallest = (firstNumber < secondNumber) && (firstNumber < thirdNumber);
        
        // Print the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        
        // Close the scanner object
        scanner.close();
    }
}




