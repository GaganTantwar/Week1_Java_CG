import java.util.*;

public class TemperatureCalculator {

	// create a method to calculate the wind chill temperature
	public double calculateWindChill(double temperature, double windSpeed) {

		// calculating the windChill temperature
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);

		// return the result
		return windChill;
	}
	

	// Main method
	public static void main(String[] args) {

	// create a main class object
	TemperatureCalculator classObject = new TemperatureCalculator();

	// create a scanner object to take an input from the user
	Scanner sc= new Scanner(System.in);

	// take user input for wind speed and temperature
	System.out.println("Enter the temperature: ");
	double temperature = sc.nextDouble();
	System.out.println("Enter the windSpeed: ");
	double windSpeed = sc.nextDouble();

	// create a variable to store the windchill temperature
	double windChill = classObject.calculateWindChill(temperature, windSpeed);

	// Displaying the result
	System.out.println("The wind chill temperature is: " + windChill);

	// Close the Scanner Object
	sc.close();

	}
}