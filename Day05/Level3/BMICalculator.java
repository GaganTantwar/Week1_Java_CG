import java.util.Scanner;

class BMICalculator{

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = getStatus(bmi);
            result[i][0] = String.format("%.2f", data[i][1]); // Height in cm
            result[i][1] = String.format("%.2f", weight); // Weight in kg
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status; // Status
        }
        return result;
    }

    // Method to get BMI status
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the 2D string array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2];

        // Taking user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ":");
            data[i][0] = input.nextDouble();
            System.out.println("Enter height (in cm) for person " + (i + 1) + ":");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        String[][] results = calculateBMI(data);

        // Display the results
        displayResults(results);

        input.close();
    }
}
