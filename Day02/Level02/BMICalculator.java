import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for weight in kg
        System.out.print("Enter weight in kg: ");
        double userWeight = scanner.nextDouble();
        
        // Take user input for height in cm
        System.out.print("Enter height in cm: ");
        double heightInCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;
        
        // Calculate BMI
        double bmiValue = userWeight / (heightInMeters * heightInMeters);
        
        // Check weight status based on BMI
        String weightStatus;
        if (bmiValue <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmiValue <= 24.9) {
            weightStatus = "Normal";
        } else if (bmiValue <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }
        
        // Print the BMI and weight status
        System.out.println("BMI: " + bmiValue);
        System.out.println("Status: " + weightStatus);
        
        // Close the scanner
        scanner.close();
    }
}