import java.util.*;
class TableOfNumber{// class TableOfNumber
    public static void main(String args[]){
		// Scanner class object creation
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number for Table ");
		// Taking user input for table
        int number=sc.nextInt();
        // Creating array table for calculating table  		
		int []table=new int[10];
		for(int i=0;i<10;i++){
			// Calculation for table 
		    table[i]=number*(i+1);
		}
		for(int i=0;i<10;i++){
			
		    System.out.println(number+"x"+(i+1)+"="+table[i]);
		}
		// closing scanner class object
		sc.close();
	}
}