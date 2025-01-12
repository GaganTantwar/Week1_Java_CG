import java.util.*;
public class RocketLaunchCountdown2 {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner sc = new Scanner(System.in);
    // Take user input for the countdown starting  value
    System.out.print("Enter the countdown starting  value: ");
    int countdownStart = sc.nextInt();
    // Perform the countdown using a for-loop
    for (int countdown = countdownStart; countdown >= 1; countdown--) {
      // Print the current countdown value
      System.out.println(countdown);
    }
    // Close the scanner object
    sc.close();
  }
}