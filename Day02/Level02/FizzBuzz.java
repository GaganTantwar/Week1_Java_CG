import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        // scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a positive integer
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if (num > 0) {
            // Loop from 1 to the input number
            for (int i = 0; i <= num; i++) {
                // Check if i is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if i is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if i is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else {
                    // Print the number if it's not divisible by 3 or 5
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner object
        sc.close();
    }
}

