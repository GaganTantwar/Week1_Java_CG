import java.util.*;

class AbundantNumber{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter an integer
        System.out.print("Enter a positive integer: ");
        int inputNumber = sc.nextInt();
        // Initialize the sum of divisors to 0
        int divisorSum = 0;
        // Loop through all numbers from 1 to inputNumber - 1
        for (int i = 1; i < inputNumber; i++) {
            // Check if i is a divisor of inputNumber
            if (inputNumber % i == 0) {
                // Add the divisor to the sum
                divisorSum += i;
            }
        }
        // Check if the sum of divisors is greater than the input number
        if (divisorSum > inputNumber) {
            System.out.println(inputNumber + " is an Abundant number.");
        } else {
            System.out.println(inputNumber + " is not an Abundant number.");
        }
        // Close the scanner class object
        sc.close();
    }
}
