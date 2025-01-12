import java.util.*;

class CalendarDisplay {

    // Method to get the name of the month based on the month number
    public static String getMonthName(int monthNumber) {
        // Array containing month names
        String[] monthNames = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[monthNumber];
    }

    // Method to get the number of days in a specific month and year
    public static int getDaysInMonth(int monthNumber, int year) {
        // Array with the number of days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year and adjust February days
        if (monthNumber == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            return 29; // February in a leap year
        } else {
            return daysInMonth[monthNumber];
        }
    }

    // Method to calculate the first day of the month using Zeller's Congruence
    public static int getFirstDayOfMonth(int monthNumber, int year) {
        int firstDay = 1; // First day of the month
        int adjustedYear = year - (14 - monthNumber) / 12;
        int leapYearOffset = adjustedYear + adjustedYear / 4 - adjustedYear / 100 + adjustedYear / 400;
        int adjustedMonth = monthNumber + 12 * ((14 - monthNumber) / 12) - 2;

        // Calculate the weekday of the first day (0 = Sunday, 6 = Saturday)
        return (firstDay + leapYearOffset + (31 * adjustedMonth) / 12) % 7;
    }

    // Method to display the calendar for a specific month and year
    public static void displayCalendar(int monthNumber, int year) {
        // Print the month and year
        System.out.println(" " + getMonthName(monthNumber) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(monthNumber, year);

        // Get the starting day of the month
        int startDay = getFirstDayOfMonth(monthNumber, year);

        // Print spaces for days before the first day of the month
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day); // Print day with right alignment
            if ((day + startDay) % 7 == 0) {
                System.out.println(); // Move to the next week
            }
        }
        System.out.println(); // End the calendar output
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the month and year
        System.out.print("Enter the month (1-12): ");
        int monthInput = sc.nextInt();

        System.out.print("Enter the year: ");
        int yearInput = sc.nextInt();

        // Display the calendar for the entered month and year
        displayCalendar(monthInput, yearInput);

        // Close the scanner
        sc.close();
    }
}
