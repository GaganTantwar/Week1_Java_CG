import java.util.*;
public class Factorial {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner sc = new Scanner(System.in);
    // Take user input for the integer
    System.out.print("Enter a positive integer:  ");
    int number = sc.nextInt();
    // Check if the user has entered a positive  integer
    if (number >= 0) {
      // Initialize the factorial variable
      long factorialResult = 1;
      // Variable to keep track of the current  number
      int i = 1;
      // Compute the factorial using a while  loop
      while (i <= number) {
        factorialResult *= i;
        i++;
      }
      System.out.println(
          "The factorial of " + number + " is " + factorialResult);
    } else {
      // Print an error message if the number  is not positive
      System.out.println("Please enter a positive  integer.");
    }
    // Close the scanner object
    sc.close();
  }
}