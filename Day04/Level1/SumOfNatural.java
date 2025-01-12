import java.util.*;
class SumOfNatural{
    int sumofnumber(int n){
	   // variable for storing sum
	   int sum=0;
	    for(int i=1;i<=n;i++){
			// calculating sum;
	       sum+=i;
		}
		return sum;
	}
	public static void main(String args[]){
		
	    Scanner sc = new Scanner(System.in);
		// input from user
		System.out.println("Enter a Number :"); 
		int number = sc.nextInt();
		// Object of SumOfNatural
		SumOfNatural sumof=new SumOfNatural();
		int sum = sumof.sumofnumber(number);
		System.out.println("Sum of Natural Number :"+sum);
		// closing scanner object
		sc.close();
	}
}
		