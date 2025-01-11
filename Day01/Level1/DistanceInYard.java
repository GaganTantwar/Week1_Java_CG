import java.util.*;
class DistanceInYard{
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);// Scanner Object
        System.out.println("Enter Distance In Feet");		
		double distanceInFeet= sc.nextDouble(); // Enter Distance 
		double distanceInYard = distanceInFeet/3; // Feet to Yard 
		double distanceInMiles = distanceInYard/1760; // Yard to Miles
		System.out.println("Distance In Yard " + distanceInYard + "Distance In Miles " + distanceInMiles); 
		sc.close();
		
	}
}