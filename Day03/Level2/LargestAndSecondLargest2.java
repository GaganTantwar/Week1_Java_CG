import java.util.*;

class LargestAndSecondLargest2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Initial maximum number of digits
        int maxDigit = 10;

        // Prompt the user to input a number
        System.out.println("Enter a Number:");
        int number = sc.nextInt();

        // Array to store the digits of the number
        int[] digitArr = new int[maxDigit];
        int j = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            // If array size limit is reached, expand the array size
            if (j == maxDigit) {
                maxDigit += 10; // Increase maxDigit by 10
                int[] tempArr = new int[maxDigit]; // Create a temporary array
                System.arraycopy(digitArr, 0, tempArr, 0, digitArr.length); // Copy old array to temp
                digitArr = tempArr; // Assign temp array to digitArr
            }

            digitArr[j] = number % 10; // Get the last digit
            j++;
            number /= 10; // Remove the last digit
        }

        // Initialize variables to find the largest and second largest digits
        int maxNumber = -1;
        int secondMaxNumber = -1;

        // Iterate through the array to find the largest and second largest digits
        for (int i = 0; i < j; i++) {
            if (digitArr[i] > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = digitArr[i];
            } else if (digitArr[i] > secondMaxNumber && digitArr[i] != maxNumber) {
                secondMaxNumber = digitArr[i];
            }
        }

        // Print the largest and second largest digits
        System.out.println("Largest digit: " + maxNumber);
        if (secondMaxNumber != Integer.MIN_VALUE) {
            System.out.println("Second largest digit: " + secondMaxNumber);
        } else {
            System.out.println("No second largest digit found.");
        }

        // Close the scanner
        sc.close();
    }
}
