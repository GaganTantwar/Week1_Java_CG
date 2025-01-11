
import java.util.*;
class Triangle{
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Base and Height for Area");
	    double baseInCentimeter = sc.nextDouble();// Base in Cm
	    double heightInCentimeter = sc.nextDouble();// Height in Cm
	    double baseInInches = baseInCentimeter/2.54; // Base in Inches
        double heightInInches = heightInCentimeter/2.54; // Height in Inches
        double areaOfTriangleInCm2=0.5*baseInCentimeter*heightInCentimeter;
        double areaOfTriangleInInch2= 0.5*baseInInches*heightInInches;
        System.out.println("Area of Triangle In  Square Inches: "+areaOfTriangleInInch2+" Area of Triangle In  Square Cm: "+areaOfTriangleInCm2);
        sc.close();
    }
}	