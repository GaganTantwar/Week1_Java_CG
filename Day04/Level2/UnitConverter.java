import java.util.Scanner;

public class UnitConverter{

    // Method to convert kilometers to miles
    public static double convertKilometersToMiles(double kilometers) {
        // Conversion factor from kilometers to miles
        double kilometersToMilesFactor = 0.621371;
        // Convert kilometers to miles
        return kilometers * kilometersToMilesFactor;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(double miles) {
        // Conversion factor from miles to kilometers
        double milesToKilometersFactor = 1.60934;
        // Convert miles to kilometers
        return miles * milesToKilometersFactor;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        // Conversion factor from meters to feet
        double metersToFeetFactor = 3.28084;
        // Convert meters to feet
        return meters * metersToFeetFactor;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        // Conversion factor from feet to meters
        double feetToMetersFactor = 0.3048;
        // Convert feet to meters
        return feet * feetToMetersFactor;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Take input for miles
        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();

        // Take input for meters
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();

        // Take input for feet
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        // Perform conversions
        double convertedMiles = convertKilometersToMiles(kilometers);
        double convertedKilometers = convertMilesToKilometers(miles);
        double convertedFeet = convertMetersToFeet(meters);
        double convertedMeters = convertFeetToMeters(feet);

        // Display the results
        System.out.println(kilometers + " kilometers is equal to " + convertedMiles + " miles.");
        System.out.println(miles + " miles is equal to " + convertedKilometers + " kilometers.");
        System.out.println(meters + " meters is equal to " + convertedFeet + " feet.");
        System.out.println(feet + " feet is equal to " + convertedMeters + " meters.");

        // Close the scanner
        sc.close();
    }
}
