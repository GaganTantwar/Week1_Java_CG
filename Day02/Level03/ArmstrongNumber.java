import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Get integer input and store it in the number variable
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        // Initialize sum variable to zero and originalNumber variable to the input number
        int sum = 0;
        int originalNumber = number;
        // Get the number of digits in the number
        int digits = String.valueOf(number).length();
        // Use a while loop until originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder (last digit) using the modulus operator
            int remainder = originalNumber % 10;
            // Calculate the remainder raised to the power of the number of digits and add it to the sum
            sum += Math.pow(remainder, digits);
            // Remove the last digit from the original number
            originalNumber /= 10;
        }
        // Check if the original number and the sum are the same
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        // Close the scanner class object
        sc.close();
    }
}
