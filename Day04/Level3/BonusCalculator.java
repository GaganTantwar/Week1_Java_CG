import java.util.*;

class BonusCalculator{
    // Method to generate a 2D array for salary and years of service
    public static int[][] generateEmployeeData(int employeeCount) {
        int[][] data = new int[employeeCount][2];
        Random random = new Random();

        for (int i = 0; i < employeeCount; i++) {
            data[i][0] = random.nextInt(90000) + 10000; // Generate 5-digit salary
            data[i][1] = random.nextInt(10) + 1; // Generate years of service (1 to 10)
        }

        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02; // 5% if > 5 years, else 2%
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            updatedData[i][0] = salary;      // Old Salary
            updatedData[i][1] = bonus;      // Bonus
            updatedData[i][2] = newSalary;  // New Salary
        }

        return updatedData;
    }

    // Method to calculate and display the summary
    public static void displaySummary(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];

            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f\n",
                    i + 1, updatedData[i][0], employeeData[i][1], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Total       %-15.2f %-15s %-15.2f %-15.2f\n", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int employeeCount = 10;

        // Step 1: Generate salary and years of service data
        int[][] employeeData = generateEmployeeData(employeeCount);

        // Step 2: Calculate new salary and bonus
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display the results
        displaySummary(employeeData, updatedData);
    }
}
