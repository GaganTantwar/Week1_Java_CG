
import java.util.*;
class SimpleInterestFunction{
   // Method for Simple_Interest Calculation
    private double simpleInterest(int principal,double rate,int time){
          // Formula of simple interest
	    double simpleinterest=(principal*rate*time)/100;
	    return simpleinterest;
   }
	     
    public static void main(String args[]){
             // Scanner class object creation
	        Scanner sc=new Scanner(System.in);
             // Taking input from user 
		  System.out.println("Enter Principal Amount: ");
		  int principal=sc.nextInt();
		  System.out.println("Enter Rate of Interest: ");
		  double rate=sc.nextDouble();
		  System.out.println("Enter Time: ");
		  int time=sc.nextInt();
              // Creating object for SimpleInterestFunction class
		  SimpleInterestFunction s=new SimpleInterestFunction();
              // calling simpleinterest function
		  double finalSI=s.simpleInterest(principal,rate,time);
		  System.out.println("The Simple Interest is "+finalSI+" for Principal "+principal+" Rate of Interest "+rate+" and Time "+time);
              // closing scanner class object
		  sc.close();
	}
}
	
	


	
		