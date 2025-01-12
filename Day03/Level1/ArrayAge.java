import java.util.*;
class ArrayAge{
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		int [] ageOfPerson=new int[10];
		for (int i=0;i<10;i++){
		    System.out.println("Enter age of Person "+(i+1));
		    ageOfPerson[i]=sc.nextInt();
	        if (ageOfPerson[i]<0){
			    System.out.println("Please Enter a Valid age");
				continue;
			}
			else if(ageOfPerson[i]>=18){
			     System.out.println("Student with age "+ ageOfPerson[i]+" can vote");
			}
			else{
			    System.out.println("Student with age "+ ageOfPerson[i]+" cannot vote");
			}
		}
	}
}