//Q7  Write a Program to compute the volume of Earth in km^3 and miles^3

import java.util.*;
class Earth{ //class Earth
    public static void main(String args[]){
	   int radiusInKm = 6378 ; //variable for radius_in_km
	   double a=(4/3);// variable for 4/3
       double radiusInMiles = radiusInKm*0.6; //variable for radius_in_miles
       double volumeInKm = a*(3.14)*(radiusInKm*radiusInKm*radiusInKm); // volume in km^3
       double volumeInMiles= a*(3.14)*(radiusInMiles*radiusInMiles*radiusInMiles); //volume in miles^3 
       System.out.println( "  The volume of earth in cubic kilometers is "+ volumeInKm +" and cubic miles is "+ volumeInMiles);
 	   
	}
}