import java.util.*;
class ChocolateDistribution{
    public static int[] findRemainderAndQuotient(int number, int divisor) {
	  int chocolatesPerChild = number/ divisor;
      int remainingChocolates = number % divisor;
	  int []chocolates=new int[2];
	  chocolates[0]=chocolatesPerChild;
	  chocolates[1]=remainingChocolates;
	  return chocolates;
	}
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Take user input for the number of chocolates
      System.out.print("Enter the total number of chocolates: ");
      int numberOfChocolates = sc.nextInt();

      // Take user input for the number of children
      System.out.print("Enter the total number of children: ");
      int numberOfChildren = sc.nextInt();
	  int []chocolates=ChocolateDistribution.findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
	  System.out.println("Number of Chocolates per Student: "+chocolates[0]);
	  System.out.println("Number of Chocolates remaining: "+chocolates[1]);
	  sc.close();
	}
}
	  