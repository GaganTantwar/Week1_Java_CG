import java.util.*;
class Tablefrom6to9{ 
    public static void main(String args[]){
            // scanner class object
	      Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for table:");
            // input variable from user
		int number=sc.nextInt();
            // declaring an array for storing value;
		int []arrTable=new int[4];
		int multiplicationResult;
		for(int i=6;i<10;i++){
		    multiplicationResult=number*i;
		    arrTable[i-6]=multiplicationResult;
		}
		for(int i=0;i<5;i++){
		   System.out.println( number+" x "+ (6+i) + "="+arrTable[i]);
		}
            // closing scanner class object
		sc.close();
	}
}

