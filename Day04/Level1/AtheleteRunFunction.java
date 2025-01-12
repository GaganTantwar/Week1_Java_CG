 import java.util.*;
 class AtheleteRunFunction{
	private double atheleteRun(double side1,double side2,double side3){
		// Calculate the perimeter of the triangular park
      double perimeter = side1 + side2 + side3;

      // Total distance the athlete wants to run in meters (5 km = 5000 meters)
      double totalDistance = 5000;

      // Calculate the number of rounds needed
      double rounds = totalDistance / perimeter;
	  return rounds;
	}

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Take user input for the sides of the triangular park
      System.out.print("Enter the length of side 1 (in meters): ");
      double side1 = sc.nextDouble();

      System.out.print("Enter the length of side 2 (in meters): ");
      double side2 = sc.nextDouble();

      System.out.print("Enter the length of side 3 (in meters): ");
      double side3 = sc.nextDouble();
	  AtheleteRunFunction atheleterun=new AtheleteRunFunction();
	  double totalRounds=atheleterun.atheleteRun(side1,side2,side3);
	  
	  System.out.println("The total number of rounds the athlete will run is " + Math.ceil(totalRounds) + " to complete 5 km.");
	  sc.close();
	  
	}
}