import java.util.*;
class Grade{ //Grade class
    public static void main(String args[]){
	    // scanner class object;
	    Scanner sc = new Scanner(System.in);
		System.out.println( "Enter Marks in Maths ");
	    int  maths = sc.nextInt(); // marks of maths
		System.out.println( "Enter Marks in Physics");
		int  physics = sc.nextInt(); // marks of physics
		System.out.println( "Enter Marks in Chemistry");
	    int  chemistry = sc.nextInt(); // marks of chemistry
        // calculating average marks
		double average= (maths+physics+chemistry)/3;
		if (average>=80){
		   System.out.println("Level 4, above agency-normalized standard "+average);
		}
		else if (average>=70 && average<=79){
		    System.out.println("Level 3, at agency-normalized standard "+average);
		}
		else if(average>=60 && average<=69){
		    System.out.println("Level 2, below but approaching agency-normalized standard "+average);
		}
		else if(average>=50 && average<=59){
		    System.out.println("Level 1, well below agency-normalized standard "+average );
		}
		else if(average>=40 && average<=49){
		    System.out.println("Level 1, too below  agency-normalized standard "+average);
		}
		else{
		    System.out.println("Remedial Standard "+average);
		}
		
		sc.close();
		
	}
}