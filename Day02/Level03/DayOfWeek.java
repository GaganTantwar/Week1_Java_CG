class DayOfWeek{
    public static void main(String[] args) {
        // Parse command-line arguments for month, day, and year
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        // Calculate intermediary values using the provided formulas
        int yearAdjusted = year - (14 - month) / 12;
        int leapYearFactor = yearAdjusted + yearAdjusted / 4 - yearAdjusted / 100 + yearAdjusted / 400;
        int monthAdjusted = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (day + leapYearFactor + 31 * monthAdjusted / 12) % 7;
        // Print the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println(dayOfWeek);
    }
}
