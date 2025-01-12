import java.util.*;
class StudentAge{
    public static void main(String args[]){
		// Scanner class object
	    Scanner sc = new Scanner(System.in);
		// Decleration of an array of size 10 as  ageOfPerson;
		int [] ageOfPerson=new int[10];
		for (int i=0;i<10;i++){
			// Taking input from the user
		    System.out.println("Enter age of Person "+(i+1));
		    ageOfPerson[i]=sc.nextInt();
			// Contdition 1 age should be greater than 0
	        if (ageOfPerson[i]<0){
			    System.out.println("Please Enter a Valid age");
				continue;
			}
			// condition 2 age should be greater  or equal to  18 for voting 
			else if(ageOfPerson[i]>=18){
			     System.out.println("Student with age "+ ageOfPerson[i]+" can vote");
			}
			// else block for student not able to voting 
			else{
			    System.out.println("Student with age "+ ageOfPerson[i]+" cannot vote");
			}
		}
		sc.close();
	}
}