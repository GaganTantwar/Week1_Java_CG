// Q4.  Create a program to calculate the profit and loss in number and percentage based on the  cost price of INR 129 and the selling price of INR 191. 
import java.util.*;
class Profit{ //Profit class
    public static void main(String args[]){ // 
	    int costPrice=129; //Cost Price 
	    int sellingPrice=191; // Selling Price
	    int profit=sellingPrice - costPrice; // Profit calculation
	    double profitPercentage=((double)profit/(double)costPrice)*100; //profit percentage calculation
	    System.out.println(" The Cost Price is INR "+ costPrice+" and Selling Price is INR "+ sellingPrice);
        System.out.println("The Profit is INR "+profit + " and the Profit Percentage "+ profitPercentage);		
	}
}

