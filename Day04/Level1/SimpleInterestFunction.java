import java.util.*;
class SimpleInterestFunction{
    private double simpleInterest(int principal,double rate,int time){
	    double simpleinterest=(principal*rate*time)/100;
		return simpleinterest;
	}
	     
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		double rate=sc.nextDouble();
		int time=sc.nextInt();
		double finalSI=simpleInterest(principal,rate,time);
		System.out.println("Simple Interest Calculated : "+finalSI);
		sc.close();
	}
}
	
		