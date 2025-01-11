 /* Q6 The University is charging the student a fee of INR 125000 for the course. The University is 
      willing to offer a discount of 10%. Write a program to find the discounted amount and 
      discounted price the student will pay for the course.*/
import java.util.*;
class Discount{
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Fess");
		
	    int fees =sc.nextInt(); //fees variable
		System.out.println("Enter Discount Percentage");
        double discountPercentage=sc.nextDouble();		//discount_percentage variable
		
        double discount= fees*(discountPercentage/100); //discount value;
        double discountedFees= fees-discount; //final discounted fees 
       System.out.println( "The discount amount is INR "+discount+" and final discounted  fee is INR " + discountedFees);
 	   sc.close();
	}
}