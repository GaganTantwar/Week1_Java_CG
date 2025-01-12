import java.util.*;
class SmallestAndLargest{
	// function for finding smallest and largest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		// varible for storing minimum and maximum number
	    int maxNumber,minNumber;
		// decleration of array for storing minimum and maximum
		int []minmaxnum=new int[2];
		// conditions for maximum
	    if(number1>number2 && number1>number3){
		  maxNumber=number1;
		}
		else if (number2>number1 && number2>number3){
		    maxNumber=number2;
		}
		else{
		    maxNumber=number3;
		}
		// conditions for minimum
		if(number1<number2 && number1<number3){
		    minNumber=number1;
		}
		else if(number2<number1 && number2<number3){
		    minNumber=number2;
		}
		else{
		    minNumber=number3;
		}
		// storing values minimum and maximum in array 
		minmaxnum[0]=minNumber;
		minmaxnum[1]=maxNumber;
		return minmaxnum;
	}
    public static void main(String args[]){
		// scanner  class object
	    Scanner sc=new Scanner(System.in);
		// taking input from user
		System.out.println("Enter a Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter a Number: ");
		int num2=sc.nextInt();
		System.out.println("Enter a Number: ");
		int num3=sc.nextInt();
		// object of smallestAndLargest number 
		SmallestAndLargest bigsmall=new SmallestAndLargest();
		int []minmax=bigsmall.findSmallestAndLargest(num1,num2,num3);
		System.out.println("Smallest Number is: "+minmax[0]);
		System.out.println("Largest Number is: "+minmax[1]);
		// closing scanner class object
		sc.close();
	}
}
	