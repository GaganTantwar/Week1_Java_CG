import java.util.*;
public class TotalIncome {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        //  enter  salary of a person
        System.out.print("Enter  salary (INR): ");
        double salary = scanner.nextDouble();
        // enter bonus of a person
        System.out.print("Enter  bonus (INR): ");
        double bonus = scanner.nextDouble();
        // Calculate the total income
        double totalIncome = salary + bonus;
        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome + ".");
        // Close the scanner object
        scanner.close();
    }
}