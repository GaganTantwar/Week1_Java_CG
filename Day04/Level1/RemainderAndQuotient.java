import java.util.*;
class RemainderAndQuotient{
    public static int[] findRemainderAndQuotient(int number, int divisor){
	    int []result=new int[2];
	    int remainder=number%divisor;
		int quotient=number/divisor;
		result[0]=remainder;
		result[1]=quotient;
		return result;
	}
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Number ");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		RemainderAndQuotient calculation = new RemainderAndQuotient();
		int []answer=calculation.findRemainderAndQuotient(number1,number2);
		System.out.println("Remainder is: "+answer[0]);
		System.out.println("Quotient is: "+answer[1]);
		sc.close();
	}
}
		