import java.util.*;

class DigitFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.println("Enter a Number:");
        int number = sc.nextInt();

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Process each digit of the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            frequency[digit]++; // Increment the frequency of the digit
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Close the scanner
        sc.close();
    }
}
