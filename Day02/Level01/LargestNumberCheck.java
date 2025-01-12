import java.util.*;

public class LargestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        // Take user input for the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        // Take user input for the third number
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();
        
        // Check if the first number is the largest
        boolean isFirstLargest = (firstNumber >= secondNumber) && (firstNumber >= thirdNumber);
        
        // Check if the second number is the largest
        boolean isSecondLargest = (secondNumber >= firstNumber) && (secondNumber >= thirdNumber);
        
        // Check if the third number is the largest
        boolean isThirdLargest = (thirdNumber >= firstNumber) && (thirdNumber >= secondNumber);
        
        // Print the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        
        // Close the scanner object

        scanner.close();
    }
}

