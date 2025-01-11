import java.util.*;

class Calculator { // class Calculator
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
		Scanner sc= new Scanner(System.in); //Scanner Object
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double addition = num1 + num2; // Addition
        System.out.println("The Addition is: " + addition);
        double subtraction = num1 - num2; //Subtraction
        System.out.println("The Subtraction is: " + subtraction);
        double multiplication=num1*num2; //Multiplication
		System.out.println("This Multiply :"+ multiplication); 
        double division=num1/num2; //Division
        System.out.println("This Division:"+ division);
             
        sc.close();     
    }
 }
