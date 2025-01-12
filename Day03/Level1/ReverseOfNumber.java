import java.util.*;

class ReverseOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number ");
        int number = sc.nextInt();

        // Variable to hold the original number for processing
        int x = number;
        int size = 0;

        // Calculate the number of digits in the input number
        while (x != 0) {
            x /= 10;
            size++;
        }

        // Array to store the digits of the number in reverse order
        int[] digitsOfNumber = new int[size];

        int y = number;
        int index = 0;

        // Extract digits from the number and store them in the array
        while (y != 0) {
            digitsOfNumber[index] = y % 10;
            y /= 10;
            index++;
        }

        // Display the input number
        System.out.println("Input Given " + number);

        // Display the reverse of the input number
        System.out.print("Reverse of Given Input ");
        for (int i = 0; i < size; i++) {
            System.out.print(digitsOfNumber[i]);
        }

        // Close the scanner
        sc.close();
    }
}
