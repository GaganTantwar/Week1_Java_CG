// conversion to Fahrenheit
import java.util.*;
class TemperatureToFahrenheit{ //class Fahrenheit
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		System.out.println("Enter temperature in celsius");
        // 1 input variable for temperature in Celsius 
		int celsius = sc.nextInt();
        // conversion to Fahrenheit
		float fahrenheitResult =  (celsius * 9/5) + 32;
		System.out.println("Temperature in Fahrenheit is  "+ fahrenheitResult); // Temperature in Fahrenheit
		sc.close();
		}
}

