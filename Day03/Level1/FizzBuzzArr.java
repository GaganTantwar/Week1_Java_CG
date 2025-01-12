import java.util.*;
class FizzBuzzArr{
    public static void main(String args[]){
		//scanner class object
	    Scanner sc = new Scanner(System.in);
		// User input 
		int number=sc.nextInt();
		// Creating array of string  fizzbuzz
	    String []fizzbuzz=new String[number];
		for(int i=0;i<number;i++){
		
		    if(i%3==0 && i%5==0){
			  fizzbuzz[i]="FizzBuzz";
			}
			else if(i%3==0){
			  fizzbuzz[i]="Fizz";
			}
			else if (i%5==0){
			   fizzbuzz[i]="Buzz";
			}
			else{
			    fizzbuzz[i]=Integer.toString(i); 
			}
		}
		for(int i=0;i<number;i++){
		    System.out.println("Position"+i+ " "+fizzbuzz[i]);
		}
		//closing scanner class object
		sc.close();
	}
}