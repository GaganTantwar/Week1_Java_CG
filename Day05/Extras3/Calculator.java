import java.util.*;

public class Calculator{
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an operation: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
        int choice = sc.nextInt();
        
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch (choice) {
            case 1:
                int sum = num1 + num2;
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println("The sub is: " + sub);
                break;
            case 3:
                int mul=num1*num2;
                System.out.println("This Multiply :"+ mul);
                break;
            case 4:
                int div=num1*num2;
                System.out.println("This Division:"+ div);
                break;
            default:
                System.out.println("Invalid Choice");
                
        }
    }
}