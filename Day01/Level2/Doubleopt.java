import java.util.*;
class Doubleopt{
    public static void main(String args[]){
	    // Scanner Class Object for taking user input
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Values");
        // First Input Variable
		double a = sc.nextDouble();
        // Second Input Variable
		double b = sc.nextDouble();
        // Third Input Variable
		double  c = sc.nextDouble();
        // variable for calculation  
		double w = a + b *c;
		double x = a * b + c;
		double y = c + a / b; 
		double z = a % b + c;
		System.out.println("W: "+w+" X: "+x+" Y: "+y+" Z: "+z);
		sc.close();
	}
}
