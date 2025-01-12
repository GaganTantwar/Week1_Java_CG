import java.util.*;

public class UnitConverter3 {

    // Convert kilometers to miles
    public static double convertKilometersToMiles(double kilometers) {
        double conversionFactor = 0.621371; // 1 kilometer = 0.621371 miles
        return kilometers * conversionFactor;
    }

    // Convert miles to kilometers
    public static double convertMilesToKilometers(double miles) {
        double conversionFactor = 1.60934; // 1 mile = 1.60934 kilometers
        return miles * conversionFactor;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double conversionFactor = 3.28084; // 1 meter = 3.28084 feet
        return meters * conversionFactor;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double conversionFactor = 0.3048; // 1 foot = 0.3048 meters
        return feet * conversionFactor;
    }

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double conversionFactor = 3.0; // 1 yard = 3 feet
        return yards * conversionFactor;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double conversionFactor = 0.333333; // 1 foot = 0.333333 yards
        return feet * conversionFactor;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double conversionFactor = 39.3701; // 1 meter = 39.3701 inches
        return meters * conversionFactor;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double conversionFactor = 0.0254; // 1 inch = 0.0254 meters
        return inches * conversionFactor;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double conversionFactor = 2.54; // 1 inch = 2.54 centimeters
        return inches * conversionFactor;
    }

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Formula: (F - 32) * 5/9
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Formula: (C * 9/5) + 32
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double conversionFactor = 0.453592; // 1 pound = 0.453592 kilograms
        return pounds * conversionFactor;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double conversionFactor = 2.20462; // 1 kilogram = 2.20462 pounds
        return kilograms * conversionFactor;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double conversionFactor = 3.78541; // 1 gallon = 3.78541 liters
        return gallons * conversionFactor;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double conversionFactor = 0.264172; // 1 liter = 0.264172 gallons
        return liters * conversionFactor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
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

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.print("Enter the weight in pounds: ");
        double pounds = scanner.nextDouble();

        System.out.print("Enter the weight in kilograms: ");
        double kilograms = scanner.nextDouble();

        System.out.print("Enter the volume in gallons: ");
        double gallons = scanner.nextDouble();

        System.out.print("Enter the volume in liters: ");
        double liters = scanner.nextDouble();

        // Perform conversions
        System.out.println(kilometers + " kilometers is equal to " + convertKilometersToMiles(kilometers) + " miles.");
        System.out.println(miles + " miles is equal to " + convertMilesToKilometers(miles) + " kilometers.");
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
        System.out.println(fahrenheit + " °F is equal to " + convertFahrenheitToCelsius(fahrenheit) + " °C.");
        System.out.println(celsius + " °C is equal to " + convertCelsiusToFahrenheit(celsius) + " °F.");
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");

        scanner.close();
    }
}
