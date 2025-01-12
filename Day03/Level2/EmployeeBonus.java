import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc= new Scanner(System.in);

        // Arrays to store the salary, years of service, new salary, and bonus of employees
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];

        // Variables to store the total bonus, total old salary, and total new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to take user input for the salary and years of service of employees
        for (int i = 0; i < 10; i++) {
            boolean isValid = false;
            while (!isValid) {
                // Ask user to input the salary for each employee
                System.out.println("Enter the salary of employee " + (i + 1) + ": ");
                salaries[i] = sc.nextDouble();
                // Ask user to input the years of service for each employee
                System.out.println("Enter the years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();

                // Validate the input to ensure salary and years of service are non-negative
                if (salaries[i] < 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Salary and years of service must be non-negative.");
                } else {
                    isValid = true;
                }
            }
        }

        // Loop to calculate the bonus and new salary for each employee based on their years of service
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] >= 5) {
                bonuses[i] = salaries[i] * 0.05;  // 5% bonus for employees with 5 or more years of service
            } else {
                bonuses[i] = salaries[i] * 0.02;  // 2% bonus for employees with less than 5 years of service
            }
            newSalaries[i] = salaries[i] + bonuses[i];  // Calculate the new salary
        }

        // Loop to calculate the total bonus, total old salary, and total new salary for all employees
        for (int i = 0; i < 10; i++) {
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display the results: total bonus payout, total old salary, and total new salary
        System.out.println("The total bonus payout of all employees is: " + totalBonus);
        System.out.println("The total old salary of all employees is: " + totalOldSalary);
        System.out.println("The total new salary of all employees is: " + totalNewSalary);

        // Close the Scanner object to free resources
        sc.close();
    }
}
