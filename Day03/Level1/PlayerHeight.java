import java.util.*;
class PlayerHeight{
    public static void main(String args[]){
		// Scanner class object
	    Scanner sc = new Scanner(System.in);
		// Decleration of an array of size 11 heightOfPlayer;
		double [] heightOfPlayer=new double[11];
		double sum=0;
		for (int i=0;i<11;i++){
			// Taking input from the user
		    System.out.println("Enter Height of Player in cm "+(i+1));
		    heightOfPlayer[i]=sc.nextDouble();
			// sum calculation
            sum+=heightOfPlayer[i];	
            			
		}
		// mean calculation of players height; 
		double avg=sum/11;
		for(int i=0;i<11;i++){
		   System.out.println("Height of Player "+(i+1)+" is "+heightOfPlayer[i]);
		}
		System.out.println("Mean of Player Height is "+avg);
		// closing scanner class object;
		sc.close();
	}
}