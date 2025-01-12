import java.util.*; // Importing required package

class NumberChecker3 {

    // Method to count the number of digits in a number
    static int countOfDigit(int number) {
        int count = 0;
        while (number != 0) {
            count += 1;
            number /= 10;
        }
        return count;
    }

    // Method to store digits of a number in a digits array
    static int[] digitsIntoArr(int number, int size) {
        int[] digitArr = new int[size];
        int i = 0;
        while (number != 0) {
            digitArr[i] = number % 10;
            i++;
            number /= 10;
        }
        return digitArr;
    }

    // Method to reverse the digits array
    static int[] reverseArray(int[] digitArr) {
        int n = digitArr.length;
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = digitArr[n - i - 1];
        }
        return reversedArr;
    }


    // Method to check if a number is a palindrome using the digits
    static boolean isPalindrome(int[] digitArr) {
        int[] reversedArr = reverseArray(digitArr);
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a duck number using the digits array
    static boolean duckNumber(int[] digitArr) {
        boolean check = false;
        // Loop through the digits to check for any zero
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] == 0) {
                check = true; // If zero is found, it's not a Duck Number
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for operations:");
        int number = sc.nextInt(); // Input number

        // Get the count of digits
        int size = NumberChecker.countOfDigit(number);

        // Convert the number into an array of digits
        int[] digitArr = NumberChecker.digitsIntoArr(number, size);

        // Reverse the digits array
        int[] reversedArr = NumberChecker.reverseArray(digitArr);

        // Check if the number is a palindrome
        boolean checkPalindrome = NumberChecker.isPalindrome(digitArr);

        // Check if the number is a Duck Number
        boolean checkDuckNumber = NumberChecker.isDuckNumber(digitArr);

        // Display results
        System.out.println("Total Number of digits in the number: " + size);
        System.out.print("Digits in the number: ");
        for (int digit : digitArr) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.print("Reversed Digits: ");
        for (int digit : reversedArr) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Number is a Palindrome: " + checkPalindrome);
        System.out.println("Number is a Duck Number: " + checkDuckNumber);

        // Close the scanner
        sc.close();
    }
}
