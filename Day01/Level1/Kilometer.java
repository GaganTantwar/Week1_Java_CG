import java.util.*;
class Kilometer{ //Kilometer class
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in); //Scanner class object
		System.out.println("Please Enter Distance in Km");
	    double  distanceInKm = sc.nextDouble(); // distance in kilometers
	    double distanceInMiles= distanceInKm*0.6; //distance in miles 
	    System.out.println( " The distance "+ distanceInKm +" km in miles is " +distanceInMiles);
		sc.close();
	}
}
