import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic{
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Define a formatter for input and output dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Prompt the user to enter a date
        System.out.print("Enter a date in the format dd-MM-yyyy: ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Perform the date arithmetic
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display the results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + updatedDate.format(formatter));
        System.out.println("After Subtracting 3 Weeks: " + finalDate.format(formatter));

        // Close the scanner
        scanner.close();
    }
}
