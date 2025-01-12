import java.util.*;

public class NaturalNumbers{

    // Recursive method to find the sum of natural numbers
    public static int calculateSumUsingRecursion(int number) {
        // Base case: when the number is 1, return 1
        if (number == 1) {
            return 1;
        }
        // Recursive case: sum = current number + sum of previous numbers
        return number + calculateSumUsingRecursion(number - 1);
    }

    // Method to calculate the sum using the formula n * (n + 1) / 2
    public static int calculateSumUsingFormula(int number) {
        // Formula to calculate the sum of first n natural numbers
        return number * (number + 1) / 2;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc= new Scanner(System.in);

        // Ask user to enter a natural number
        System.out.println("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the entered number is a valid natural number
        if (number <= 0) {
            System.out.println("The input is not a valid natural number. Exiting program.");
            System.exit(0);
        } 
        else {
            // Calculate the sum using the formula
            int sumUsingFormula = calculateSumUsingFormula(number);

            // Calculate the sum using recursion
            int sumUsingRecursion = calculateSumUsingRecursion(number);

            // Compare the results from the formula and recursion
            if (sumUsingFormula == sumUsingRecursion) {
                System.out.println("The result from both computations is correct.");
            } 
            else {
                System.out.println("The result from both computations is different.");
            }
        }

        // Close the Scanner object
        sc.close();
    }
}
