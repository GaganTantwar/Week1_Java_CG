import java.util.*;
class Height{ //class Height
    public static void main(String args[]){ 
	Scanner sc=new Scanner(System.in);// Scanner class Object
    System.out.println("Enter Your Height in Centimeter"); //
	double heightInCentimeter=sc.nextDouble();// Height in Centimeter
	double heightInInches = (heightInCentimeter/2.54); // Height in Inches
	int heightInFoot=(int)heightInInches/12; // Height in feet
  	double remainingInches=heightInInches%12; // remaining height in inches after foot conversion
	System.out.println(" Your Height in cm is "+heightInCentimeter+  " while in feet is " + heightInFoot +","+remainingInches + " Inches " +" and inches is " +heightInInches);
		
	}
}