import java.util.*;

public class UnitConverter2{

    // Method to convert kilometers to miles
    public static double convertKilometersToMiles(double kilometers) {
        double conversionFactor = 0.621371; // Conversion factor from kilometers to miles
        return kilometers * conversionFactor;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(double miles) {
        double conversionFactor = 1.60934; // Conversion factor from miles to kilometers
        return miles * conversionFactor;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double conversionFactor = 3.28084; // Conversion factor from meters to feet
        return meters * conversionFactor;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double conversionFactor = 0.3048; // Conversion factor from feet to meters
        return feet * conversionFactor;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double conversionFactor = 3.0; // Conversion factor from yards to feet
        return yards * conversionFactor;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double conversionFactor = 0.333333; // Conversion factor from feet to yards
        return feet * conversionFactor;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double conversionFactor = 39.3701; // Conversion factor from meters to inches
        return meters * conversionFactor;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double conversionFactor = 0.0254; // Conversion factor from inches to meters
        return inches * conversionFactor;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double conversionFactor = 2.54; // Conversion factor from inches to centimeters
        return inches * conversionFactor;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for various inputs
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();

        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();

        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter the distance in yards: ");
        double yards = scanner.nextDouble();

        System.out.print("Enter the distance in inches: ");
        double inches = scanner.nextDouble();

        // Perform conversions
        double milesFromKilometers = convertKilometersToMiles(kilometers);
        double kilometersFromMiles = convertMilesToKilometers(miles);
        double feetFromMeters = convertMetersToFeet(meters);
        double metersFromFeet = convertFeetToMeters(feet);
        double feetFromYards = convertYardsToFeet(yards);
        double yardsFromFeet = convertFeetToYards(feet);
        double inchesFromMeters = convertMetersToInches(meters);
        double metersFromInches = convertInchesToMeters(inches);
        double centimetersFromInches = convertInchesToCentimeters(inches);

        // Display the results
        System.out.println(kilometers + " kilometers is equal to " + milesFromKilometers + " miles.");
        System.out.println(miles + " miles is equal to " + kilometersFromMiles + " kilometers.");
        System.out.println(meters + " meters is equal to " + feetFromMeters + " feet.");
        System.out.println(feet + " feet is equal to " + metersFromFeet + " meters.");
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches.");
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");
        System.out.println(inches + " inches is equal to " + centimetersFromInches + " centimeters.");

        // Close the scanner
        scanner.close();
    }
}
