import java.util.*;

class Calculator{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();
        // Prompt the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = sc.next();
        // Perform specific operations based on the input value of the operator
        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                // Handle division by zero
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
        // Close the scanner class object
        sc.close();
    }
}
