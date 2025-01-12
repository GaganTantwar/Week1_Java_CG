
import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the month (1-12)
        System.out.print("Enter the month (1-12): ");
        int monthInput = scanner.nextInt();
        
        // Take user input for the day (1-31)
        System.out.print("Enter the day (1-31): ");
        int dayInput = scanner.nextInt();
        
        // Check if the date falls within the Spring season
        if ((monthInput == 3 && dayInput >= 20) || 
            (monthInput == 6 && dayInput <= 20) || 
			
            (monthInput > 3 && monthInput < 6)) {
            System.out.println("It's Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        
        // Close the scanner object

        scanner.close();
    }
}

