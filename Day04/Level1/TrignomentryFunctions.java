import java.util.*;
class TrignomentryFunctions{
    public double[] calculateTrigonometricFunctions(double angle){
	    // creating array for storing values
	    double []valuesOfTrignometry=new double[3];
		// conversion of degree to radians
	    double radians=Math.toRadians(angle);
		// variable storing sin value
		double sinValue=Math.sin(radians);
		// variable storing cos value
		double cosValue=Math.cos(radians);
		// variable storing tan value
		double tanValue=Math.tan(radians);
		valuesOfTrignometry[0]=sinValue;
		valuesOfTrignometry[1]=cosValue;
		valuesOfTrignometry[2]=tanValue;
		return valuesOfTrignometry;
	}
	public static void main(String args[]){
	   // Scanner class Object creation
	   Scanner sc =new Scanner(System.in);
	   // taking user input for angle
	   System.out.println("Enter Angle for Calculation");
	   double angle=sc.nextDouble();
	   // creating object of TrignomentryFunctions class
	   TrignomentryFunctions trignometry= new TrignomentryFunctions();
	   double []valuesOfTrignometry= trignometry.calculateTrigonometricFunctions(angle);
	   System.out.println("Value of Angle in sin: "+ valuesOfTrignometry[0]);
	   System.out.println("Value of Angle in cos: " +valuesOfTrignometry[1]);
	   System.out.println("Value of Angle in tan: " +valuesOfTrignometry[2]);
	}
}
	   