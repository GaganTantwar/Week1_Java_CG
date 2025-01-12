import java.util.*;

class LargestAndSecondLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Maximum number of digits to process
        int maxDigit = 10;

        // Prompt the user to input a number
        System.out.println("Enter a Number With maxDigit ");
        int number = sc.nextInt();

        // Array to store the digits of the number
        int[] digitArr = new int[maxDigit];
        int j = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            digitArr[j] = number % 10; // Get the last digit

            // Break if the number of digits exceeds maxDigit
            if (j == maxDigit) {
                break;
            }
            j++;
            number /= 10; // Remove the last digit
        }

        // Initialize variables to find the largest and second largest digits
        int secmaxNumber = -1;
        int maxNumber = -1;

        // Iterate through the array to find the largest and second largest digits
        for (int i =0; i <j; i++) {
            if (digitArr[i] > maxNumber) {
                maxNumber = digitArr[i];
            }
        }
        for(int i=0;i<j;i++){
            if (digitArr[i] > secmaxNumber && digitArr[i]!=maxNumber) {
                secmaxNumber = digitArr[i];
            }
        }

       

        // Print the largest and second largest digits
        System.out.println("Largest=" + maxNumber + " Second Largest=" + secmaxNumber);

        // Close the scanner
        sc.close();
    }
}
