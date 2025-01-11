import java.util.*;
class Reminder{
    public static void main(String args[]){
	    // Scanner Object
	    Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter 2 Number");
		
		// first input value
	    int number1 = sc.nextInt();
		// second input value
		int number2 = sc.nextInt();
		// Quotient and Reminder
		int reminder = number1%number2;
		int quotient = number1/number2;
		
		System.out.println(" The Quotient is "+ quotient + " and Reminder is "+reminder+" of two number "+number1+ " and "+ number2);
		sc.close();
	}
}
		
		
		

		