import java.util.*;
public class SumUntilZero {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner sc = new Scanner(System.in);
    // Initialize the total sum variable
    double totalSum = 0.0;
    // Variable to store the user-entered value
    double userInput;
    // Ask the user to enter the first number
    System.out.print("Enter a number (enter 0  to stop): ");
    userInput = sc.nextDouble();
    // Loop to continue until the user enters  0
    while (userInput != 0) {
      // Add the user input to the total sum
      totalSum += userInput;

      // Prompt the user to enter the next number
      System.out.print("Enter a number (enter  0 to stop): ");
      userInput = sc.nextDouble();
      // Print the total sum value
      System.out.println("The total sum is " + totalSum);
    }
    // Close the scanner object
    sc.close();
  }
}
