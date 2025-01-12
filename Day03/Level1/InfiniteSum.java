import java.util.*;
class InfiniteSum{
    public static void main(String args[]){
		// Scanner class object;
	    Scanner sc = new Scanner(System.in);
		// array decleration of size 10;
		double []array =new double[10];
		// varible for addition
		double sum=0.0;
		// counter variable
		int i=0;
		// infinite while loop 
		while(true){
		  
		  i++;
		  // taking input from user
		  array[(i-1)] =sc.nextDouble();
		  // Checking for negative and zero 
		  if(array[i-1]<=0){
		    System.out.println("You enter zero or a negative value");
			break;// if negative or zero end loop
		  }
		  // checking for range upto 10
		  else if(i==10){
		    System.out.println("Limited Exceded");
		    break; //if exceded than exit the loop
		  }
		}
		for(int j=0;j<i;j++){
		   System.out.println("Input given by user "+array[j]);// displaying user input
		   sum+=array[j];// adding all the values 
		}
		System.out.println("Sum of all number is "+sum);
		sc.close();
	}
}