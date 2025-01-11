import java.util.*;
class HandShakes{
    public static void main(String args[]){
	    Scanner sc= new Scanner( System.in);
		System.out.println("Enter Number of People");
		int n = sc.nextInt();
		int totalHandShakes = (n*(n-1))/2;
		System.out.println(" Number of Possible HandShakes "+ totalHandShakes);
		sc.close();
	}
}
		
		