import java.util.*; // Importing required package

class NumberChecker {
    // Method to count the number of digits in a number
    static int countOfDigit(int number) {
        int count = 0;
        // Loop until the number becomes 0
        while (number != 0) {
            count += 1;
            number /= 10; // Remove the last digit
        }
        return count;
    }

    // Method to convert digits of a number into an array
    static int[] digitsIntoArr(int number, int size) {
        int[] digitArr = new int[size]; // Array to store digits
        int i = 0;
        // Loop to extract digits and store in the array
        while (number != 0) {
            digitArr[i] = number % 10; // Get the last digit
            i++;
            number /= 10; // Remove the last digit
        }
        return digitArr;
    }

    // Method to check if a number is a Duck Number
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

    // Method to check if a number is an Armstrong Number
    static boolean armstrongNumber(int[] digitArr, int number) {
        int sum = 0;
        // Calculate the sum of cubes of the digits 
        for (int i = 0; i < digitArr.length; i++) {
            int n=digitArr.length;
            int power = (int) Math.pow(digitArr[i],n); // armstrong
            sum += power;
        }
        // Check if the sum of cubes equals the original number
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    // Method to find the largest and second largest digits
    static int[] largestAndSecondlargest(int[] digitArr) {
        int[] largestandsecond = new int[2];
        // Initialize variables to find the largest and second largest digits
        int secmaxNumber = Integer.MIN_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        // Iterate through the array to find the largest digit
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] > maxNumber) {
                maxNumber = digitArr[i];
            }
        }

        // Iterate through the array to find the second largest digit
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] > secmaxNumber && digitArr[i] != maxNumber) {
                secmaxNumber = digitArr[i];
            }
        }
        largestandsecond[0] = maxNumber;
        largestandsecond[1] = secmaxNumber;
        return largestandsecond;
    }

    // Method to find the smallest and second smallest digits
    static int[] smallestAndSecondsmallest(int[] digitArr) {
        int[] smallestandsecond = new int[2];
        int minNumber = Integer.MAX_VALUE;
        int secminNumber = Integer.MAX_VALUE;

        // Iterate through the array to find the smallest digit
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] < minNumber) {
                minNumber = digitArr[i];
            }
        }

        // Iterate through the array to find the second smallest digit
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] < secminNumber && digitArr[i] != minNumber) {
                secminNumber = digitArr[i];
            }
        }
        smallestandsecond[0] = minNumber;
        smallestandsecond[1] = secminNumber;
        return smallestandsecond;
    }

    public static void main(String args[]) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for operations");
        int number = sc.nextInt(); // Input number

        // Get the count of digits
        int size = NumberChecker.countOfDigit(number);

        // Convert the number into an array of digits
        int[] digitArr = NumberChecker.digitsIntoArr(number, size);

        // Check if the number is a Duck Number
        boolean checkDuck = NumberChecker.duckNumber(digitArr);

        // Check if the number is an Armstrong Number
        boolean checkArmstrong = NumberChecker.armstrongNumber(digitArr, number);

        // Find the largest and second largest digits
        int[] largestandsecond = NumberChecker.largestAndSecondlargest(digitArr);

        // Find the smallest and second smallest digits
        int[] smallestandsecond = NumberChecker.smallestAndSecondsmallest(digitArr);

        // Display the results
        System.out.println("Total Number of digits in the number: " + size);
        for (int i=0; i <digitArr.length ; i++) {
            System.out.print("Values in digit array: " + digitArr[i] + " ");
        }
        System.out.println("");

        System.out.println("Number is Duck Number: " + checkDuck);
        System.out.println("Number is Armstrong: " + checkArmstrong);
        System.out.println("Largest Number in digits: " + largestandsecond[0] + ", Second Largest Number in digits: " + largestandsecond[1]);
        System.out.println("Minimum Number in digits: " + smallestandsecond[0] + ", Second Minimum Number in digits: " + smallestandsecond[1]);
        // closing scanner class object
        sc.close();
    }
}
