import java.util.*; // Importing required package

class NumberChecker4{

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

    // Method to check if a number is a prime number
    static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for operations:");
        int number = sc.nextInt(); // Input number

        // Check if the number is a prime number
        boolean checkPrime = NumberChecker4.isPrimeNumber(number);

        // Check if the number is a neon number
        boolean checkNeon = NumberChecker4.isNeonNumber(number);

        // Check if the number is a spy number
        boolean checkSpy = NumberChecker4.isSpyNumber(number);

        // Check if the number is an automorphic number
        boolean checkAutomorphic = NumberChecker4.isAutomorphicNumber(number);

        // Check if the number is a buzz number
        boolean checkBuzz = NumberChecker4.isBuzzNumber(number);

        // Display results
        System.out.println("Number is a Prime Number: " + checkPrime);
        System.out.println("Number is a Neon Number: " + checkNeon);
        System.out.println("Number is a Spy Number: " + checkSpy);
        System.out.println("Number is an Automorphic Number: " + checkAutomorphic);
        System.out.println("Number is a Buzz Number: " + checkBuzz);

        // Close the scanner
        sc.close();
    }
}
