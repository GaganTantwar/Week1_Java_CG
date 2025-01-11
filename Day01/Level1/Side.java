import java.util.*;
class Side{ // Class Side
    public static void main(String args[]){
		System.out.println("Enter Perimeter of Square");
	    Scanner sc=new Scanner(System.in); //Scanner Object
		double perimeter = sc.nextDouble(); // Perimeter of Square
		double side = perimeter/4; // Finding Side of Square
        System.out.println(" The length of the side is "+side+ " whose perimeter is " +perimeter);
	}
}
		