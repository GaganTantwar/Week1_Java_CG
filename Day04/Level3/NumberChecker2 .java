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
        // Loop to extract digits and store in the array
        while (number != 0) {
            digitArr[i] = number % 10; // Get the last digit
            i++;
            number /= 10; 
        }
        return digitArr;
    }

    // Method to check if a number is a Duck Number
    static int  sumOfNumbers(int[] digitArr) {
        int sum=0;
        // Loop through the digits to check for any zero
        for (int i = 0; i < digitArr.length; i++) {
            sum+=digitArr[i];
        }
        return sum;
    }

    // Method to check if a number is an Armstrong Number
    static boolean harshadNumber(int number,int sum) {
        
        // Check if the sum of cubes equals the original number
        if ( number%sum==0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to find the largest and second largest digits
    static int sumOfSquare(int[] digitArr) {
        int sumsquare=0;
        for(int i=0;i<digitArr.length;i++){
            sumsquare+=(int)Math.pow(digitArr[i],2);
        }
        return sumsquare;
       
    }

    // Method to find the smallest and second smallest digits
    static int[][] frequencyCount(int []digitArr){
        int [][] frequency=new int[10][2];
        for(int i=0;i<10;i++){
            frequency[digitArr[i]][1]++;
            frequency[i][0]=digitArr[i];
        }
        return frequency;
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
        boolean checkHarshad = NumberChecker2.harshadNumber(number,size);
        int sum=NumberChecker2.sumOfNumbers(digitArr);
        // Check if the number is an Armstrong Number
        int sumofsqaure = NumberChecker2.sumOfSquare(digitArr);

        int [][]frequency=NumberChecker2.frequencyCount(digitArr);
        // Display the results
        
        System.out.println("Total Number of digits in the number: " + size);
        for (int i = digitArr.length-1; i >=0; i--) {
            System.out.print("Values of array: " + digitArr[i] + " ");
        }
        System.out.println("");

        System.out.println("Number is Harshad Number: " + checkHarshad);
        System.out.println("Sum of all Numbers" + sum);
        System.out.println("Sum of Square of all Numbers" + sumofsqaure);
         for (int i = 0; i < 10; i++) { 
            if (frequency[i][1] > 0) { 
                System.out.println("Digit " + frequency[i][0] + " Frequency " + frequency[i][1]); 
            } 
         }

        // closing scanner class object
        sc.close();
    }
}
