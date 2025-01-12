import java.util.*;

class BMIWithArray2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input the number of persons
        System.out.println("Enter Number of Persons");
        int numberOfPersons = sc.nextInt();

        // Multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // 0: Weight, 1: Height, 2: BMI
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter Weight of Person " + (i + 1) + " in kg:");
            personData[i][0] = sc.nextDouble();
            if (personData[i][0] <= 0) {
                System.out.println("Invalid input. Weight must be positive. Please re-enter.");
                i--;
                continue;
            }

            System.out.println("Enter Height of Person " + (i + 1) + " in cm:");
            personData[i][1] = sc.nextDouble();
            if (personData[i][1] <= 0) {
                System.out.println("Invalid input. Height must be positive. Please re-enter.");
                i--;
                continue;
            }

            // Convert height to meters
            personData[i][1] /= 100.0;
        }

        // Calculate BMI and determine weight status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.printf("Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                              personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        // Close the scanner
        sc.close();
    }
}
