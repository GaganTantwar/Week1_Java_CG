import java.util.*;
class TotalPrice{
   public static void main(String args[]){
    System.out.println("Enter Unit Price and Quantity for Purchase:");
	Scanner sc= new Scanner(System.in); //Scanner Object
    double unitPrice = sc.nextDouble();// Unit Price
    double quantity = sc.nextDouble(); // Quantity for Purchase
	double totalPrice = unitPrice*quantity; // Calculation of total price
	System.out.println("The total purchase price is INR  " + totalPrice +  "if the quantity  " + quantity +"and unit price is INR "+ unitPrice);
	sc.close();
   }
}