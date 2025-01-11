//  Q5 	Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
import java.util.*;
class Pens{
    public static void main(String args[]){
	    int numberOfPens=14;
		int pensPerStudent= numberOfPens/3;
		int pensNotDistributed=numberOfPens%3;
		System.out.println("  The Pen Per Student is "+ pensPerStudent+" the remaining  pen not distributed is " +  pensNotDistributed);
	}
}