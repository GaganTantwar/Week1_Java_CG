import java.util.*;

class DisplayCalendar{

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y = year;
        int m = month;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    // Method to find the length of the text without using the length() method
    public int findLength(String string) {
        int i = 0;
        try {
            while (true) {
                string.charAt(i++);
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing
        }
        return i;
    }
    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        // Get month name and number of days
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar header
        System.out.println("  " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Display the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        // Print a new line after the last day of the month
        System.out.println();
    }

    // Main method to display the calendar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for month and year
        System.out.println("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        sc.close();
    }

}