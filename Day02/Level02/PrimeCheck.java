import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        //  scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isPrime = true;
		if (num <= 1) {
            isPrime=false;  // Numbers less than or equal to 1 are not prime
        }
		
		for (int i = 2; i < num; i++) {
            // Check if the number is divisible by i
            if (num % i == 0) {
                isPrime = false;
                break;  // Exit the loop if the number is divisible by i
            }
        }
		
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        // Close the scanner object
        sc.close();
    }
}