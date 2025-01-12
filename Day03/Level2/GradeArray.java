import java.util.*;
class GradeArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // Prompt user for the number of students
        System.out.println("Enter Number of Student");
        int numberOfStudent=sc.nextInt();
         // Arrays to store marks, percentages, and grades for each student
        int []marksInMaths=new int[numberOfStudent];
        int []marksInPhysics=new int[numberOfStudent];
        int []marksInChemistry=new int[numberOfStudent];
        double []percentage=new double[numberOfStudent];
        char []grades=new char[numberOfStudent];
         // Input marks for each subject for all students
        for(int i=0;i<numberOfStudent;i++){
            System.out.println("Enter Marks in Maths");
            marksInMaths[i]=sc.nextInt();
            // Validate marks input for Maths
            if(marksInMaths[i]<0){
                System.out.println("Invalid input");
                i-=1;
            }
            System.out.println("Enter Marks in Physics");
            marksInPhysics[i]=sc.nextInt();

            // Validate marks input for Physics
            if(marksInPhysics[i]<0){
                System.out.println("Invalid input");
                i-=1;
            }
            System.out.println("Enter Marks in Chemistry");
            marksInChemistry[i]=sc.nextInt();

            // Validate marks input for Physics
            if(marksInChemistry[i]<0){
                System.out.println("Invalid input");
                i-=1;
            }
        } 
        // Calculate percentage and assign grades for each student
        for(int i=0;i<numberOfStudent;i++){
            percentage[i]=(marksInMaths[i]+marksInPhysics[i]+marksInChemistry[i])/3;
            if (percentage[i]>=80){
		       grades[i]='A';
	    	}
		    else if (percentage[i]>=70 && percentage[i]<=79){
		       grades[i]='B';
		    }
		    else if(percentage[i]>=60 && percentage[i]<=69){
		       grades[i]='C';
		    }
		    else if(percentage[i]>=50 && percentage[i]<=59){
		       grades[i]='D';
		    }
		    else if(percentage[i]>=40 && percentage[i]<=49){
		      grades[i]='E';
		    }
		    else{
		       grades[i]='R';
		    }
        }
        for(int i=0;i<numberOfStudent;i++){
            System.out.println("Marks in Maths="+marksInMaths[i]+" Marks in Physics="+marksInPhysics[i]+" Marks in Chemistry="+marksInChemistry[i]+" Percentage of Student="+percentage[i]+" Grade of Student="+grades[i]);
        }
          // Close the scanner object 
        sc.close();
    }
}