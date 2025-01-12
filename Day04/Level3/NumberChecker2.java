import java.util.*; // Importing required package

class NumberChecker2 {

    // Method to count the number of digits in a number
    static int countOfDigit(int number) {
        int count = 0;
        // Loop until the number becomes 0
        while (number != 0) {
            count += 1;
            number /= 10;
        }
        return count;
    }

    // Method to convert digits of a number into an array
    static int[] digitsIntoArr(int number, int size) {
        int[] digitArr = new int[size]; // Array to store digits
        int i = 0;
        // Loop to extract digits and store them in reverse order
        while (number != 0) {
            digitArr[i] = number % 10; // Get the last digit
            i++;
            number /= 10;
        }
        return digitArr;
    }

    // Method to calculate the sum of digits
    static int sumOfNumbers(int[] digitArr) {
        int sum = 0;
        // Loop through the digits to calculate their sum
        for (int i = 0; i < digitArr.length; i++) {
            sum += digitArr[i];
        }
        return sum;
    }

    // Method to check if a number is a Harshad Number
    static boolean harshadNumber(int number, int sumOfDigits) {
        // Check if the number is divisible by the sum of its digits
        return number % sumOfDigits == 0;
    }

    // Method to calculate the sum of squares of digits
    static int sumOfSquare(int[] digitArr) {
        int sumsquare = 0;
        for (int i = 0; i < digitArr.length; i++) {
            sumsquare += (int) Math.pow(digitArr[i], 2);
        }
        return sumsquare;
    }

    // Method to calculate the frequency of each digit (0-9)
    static int[][] frequencyCount(int[] digitArr) {
        int[][] frequency = new int[10][2];
        // Initialize the digit column (0 to 9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Digit value
        }
        // Count occurrences of each digit
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] >= 0 && digitArr[i] <= 9) { // Ensure valid range
                frequency[digitArr[i]][1]++;
            }
        }
        return frequency;
    }

    public static void main(String args[]) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for operations:");
        int number = sc.nextInt(); // Input number

        // Get the count of digits
        int size = NumberChecker2.countOfDigit(number);

        // Convert the number into an array of digits
        int[] digitArr = NumberChecker2.digitsIntoArr(number, size);

        // Calculate the sum of digits
        int sum = NumberChecker2.sumOfNumbers(digitArr);

        // Check if the number is a Harshad Number
        boolean checkHarshad = NumberChecker2.harshadNumber(number, sum);

        // Calculate the sum of squares of digits
        int sumOfSquare = NumberChecker2.sumOfSquare(digitArr);

        // Get the frequency of each digit
        int[][] frequency = NumberChecker2.frequencyCount(digitArr);

        // Display the results
        System.out.println("Total Number of digits in the number: " + size);
        System.out.print("Digits in the number: ");
        for (int i = 0; i < size; i++) {
            System.out.print(digitArr[i] + " ");
        }
        System.out.println();

        System.out.println("Number is Harshad Number: " + checkHarshad);
        System.out.println("Sum of all digits: " + sum);
        System.out.println("Sum of squares of all digits: " + sumOfSquare);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }

        // Closing the Scanner
        sc.close();
    }
}
