
import java.util.*;
public class SumUntilZeroOrNegative {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner sc = new Scanner(System.in);
    // Initialize the total sum variable
    double totalSum = 0.0;
    // Infinite while loop to keep asking for  user input until they enter 0 or
    // a negative number 
    while (true) {
      // Ask the user to enter a number
      System.out.print("Enter a number (enter  0 or a negative number to stop): ");
      double userInput = sc.nextDouble();
      // Check if the user entered 0 or a negative  number
      if (userInput <= 0) {
        break; // Exit the loop if the number  is 0 or negative
      }
      // Add the user input to the total sum
      totalSum += userInput;
    }
    // Print the total sum of all positive numbers  entered
    System.out.println("The total sum is " + totalSum);
    // Close the scanner  o  bject
    sc.close();
  }
}