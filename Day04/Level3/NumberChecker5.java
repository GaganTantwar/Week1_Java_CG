import java.util.*; // Importing required package

class NumberChecker5{

    // Method to find factors of a number and return them as an array
    static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    static int greatestFactor(int[] factors) {
        return factors[factors.length - 2]; // The second last element (excluding the number itself)
    }

    // Method to find the sum of the factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= (int) Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    static boolean isAbundantNumber(int number) {
        int divisorSum= 0;
         for (int i = 1; i < number; i++) {
            // Check if i is a divisor of inputNumber
            if (number % i == 0) {
                // Add the divisor to the sum
                divisorSum += i;
            }
        }

        return divisorSum > number;
    }

    // Method to check if a number is a deficient number
    static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for operations:");
        int number = sc.nextInt(); // Input number

        // Get the factors of the number
        int[] factors = NumberChecker5.findFactors(number);

        // Find the greatest factor (excluding the number itself)
        int greatestFactor = NumberChecker5.greatestFactor(factors);

        // Find the sum of the factors
        int sumFactors = NumberChecker5.sumOfFactors(factors);

        // Find the product of the factors
        long productFactors = NumberChecker5.productOfFactors(factors);

        // Find the product of the cubes of the factors
        long productCubes = NumberChecker5.productOfCubesOfFactors(factors);

        // Check if the number is a perfect number
        boolean checkPerfect = NumberChecker5.isPerfectNumber(number);

        // Check if the number is an abundant number
        boolean checkAbundant = NumberChecker5.isAbundantNumber(number);

        // Check if the number is a deficient number
        boolean checkDeficient = NumberChecker5.isDeficientNumber(number);

        // Check if the number is a strong number
        boolean checkStrong = NumberChecker5.isStrongNumber(number);

        // Display results
        System.out.println("Factors of the number: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumFactors);
        System.out.println("Product of Factors: " + productFactors);
        System.out.println("Product of Cubes of Factors: " + productCubes);
        System.out.println("Number is a Perfect Number: " + checkPerfect);
        System.out.println("Number is an Abundant Number: " + checkAbundant);
        System.out.println("Number is a Deficient Number: " + checkDeficient);
        System.out.println("Number is a Strong Number: " + checkStrong);

        // Close the scanner
        sc.close();
    }
}
