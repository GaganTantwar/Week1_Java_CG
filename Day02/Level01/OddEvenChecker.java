import java.util.*;
public class OddEvenChecker {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner sc = new Scanner(System.in);
    // Take user input for the number
    System.out.print("Enter a positive integer:  ");
    int userInput = sc.nextInt();
    // Check if the user has entered a positive  integer
    if (userInput > 0) {
      // Iterate from 1 to the entered number
      for (int i = 1; i <= userInput; i++) {
        // Check if the current number is  odd or even
        if (i % 2 == 0) {
          System.out.println(i + " is an  even number.");
        } else {
          System.out.println(i + " is an  odd number.");
        }
      }
    } else {
      System.out.println("Please enter a positive  integer.");
    }
    // Close the scanner object
    sc.close();
  }
}
