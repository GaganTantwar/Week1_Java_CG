import java.util.Scanner;

public class LeapYear{

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year calculation is valid only for years after 1582 (Gregorian calendar)
        if (year >= 1582) {
            // A year is a leap year if it is divisible by 4 and not divisible by 100,
            // or it is divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        // Return false for years before 1582
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.println("Enter a year to check if it is a leap year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean leapYear = isLeapYear(year);

        // Display the result
        if (leapYear) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
