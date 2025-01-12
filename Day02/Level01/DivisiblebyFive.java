import java.util.*;

public class DivisiblebyFive {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        
        // Check if the number is divisible by 5
        if (userNumber % 5 == 0) {
            // If divisible by 5, print the message
            System.out.println("The number " + userNumber + " divisible by 5 ");
        } 
        else {
            // If not divisible by 5, print the message
            System.out.println("The number " + userNumber + " not divisible by 5");
        }
        
        // Close the scanner object
        scanner.close();
    }
}




