import java.util.*;

public class Factors {

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        // Variable to count the number of factors
        int count = 0;

        // Find the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Creating an array to store the factors
        int[] factorArray = new int[count];

        // Variable to track the current index of the factor array
        int index = 0;

        // Find the factors and store them in the factor array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorArray[index] = i;
                index++;
            }
        }

        return factorArray;
    }

    // Method to calculate the sum of the factors
    public static int sumFactors(int[] factorArray) {
        int sum = 0;
        for (int factor : factorArray) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static int productFactors(int[] factorArray) {
        int product = 1;
        for (int factor : factorArray) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of the squares of the factors
    public static int sumSquareFactors(int[] factorArray) {
        int sumSquare = 0;
        for (int factor : factorArray) {
            sumSquare += Math.pow(factor, 2);
        }
        return sumSquare;
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user for a number
        System.out.println("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Call the method to get the factors of the number
        int[] factors = findFactors(number);

        // Calculate the sum, product, and sum of squares of the factors
        int sum = sumFactors(factors);
        int product = productFactors(factors);
        int sumSquare = sumSquareFactors(factors);

        // Display the factors and the results
        System.out.println("The factors of the number " + number + " are:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nThe sum of the factors is: " + sum);
        System.out.println("The sum of the squares of the factors is: " + sumSquare);
        System.out.println("The product of the factors is: " + product);

        // Close the Scanner object
        sc.close();
    }
}
