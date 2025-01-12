import java.util.*;
class HandShakesFun{ 
    // handShakes function for calculating total number of hand shakes
    private int handShakes(int n){
		// calculation of total hand shakes
	    int totalHandShakes=(n*(n-1))/2;
		return totalHandShakes;
	}
	public static void main(String args[]){
		// scanner class object
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Person: ");
		int number=sc.nextInt();
		// creation of object of HandShakesFun
		HandShakesFun handshake= new HandShakesFun();
		int totalHandShakes=handshake.handShakes(number);
		System.out.println("Total Number of Hand Shakes :"+totalHandShakes+" by "+number+"  Person");
		// Closing scanner class object
        sc.close();
    }
}	
		