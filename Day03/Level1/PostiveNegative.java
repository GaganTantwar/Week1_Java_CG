
import java.util.*;
class PostiveNegative{
    public static void main(String args[]){
         // Scanner class Object
	    Scanner sc= new Scanner(System.in);
        // Declaration of array of size 5 for taking integer input; 
		int []arrInteger=new int[5];
		System.out.println("Please enter 5 integer values");
		for(int i=0;i<5;i++){
            // Taking user input in array
		    arrInteger[i]=sc.nextInt();
            // checking for positive
			if (arrInteger[i]>0){
			    System.out.println("Input is Positive Integer");
                // checking for even number
			    if (arrInteger[i]%2==0){
			       System.out.println("Input is Even Number");
                }
                     // else negative 
                else{
				    System.out.println("Input is Odd Number");
                }
			} 
            // checking for negative input
			else if(arrInteger[i]<0){
			     System.out.println("Input is Negative Integer");
                  }
			else{
			    System.out.println("Input is Zero");
			}
				
		}
		int x=arrInteger[0]; // first input element 
		int y=arrInteger[4]; // last input element
            // checking for equality in both 
		if(x==y){
		   System.out.println("First and Last Input are equal");
            }
            // cheking for greater than 
		else if(x>y){
		    System.out.println("First input is greater than  Last input");
		}
            
		else{
		    System.out.println("Last input is greater than  First input");
	      }
            // closing scanner class object
            sc.close();
	}
}

