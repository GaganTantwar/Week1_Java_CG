
import java.util.*;
class SpringCheck{
    private boolean checkSpring(int month,int day){
	    // Check if the date falls within the Spring season
		boolean check;
	    if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            check=true;
        } 
		else {
            check=false;
        }
        return check;
	}
	public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the month (1-12)
        System.out.print("Enter the month (1-12): ");
        int monthInput = sc.nextInt();
        
        // Take user input for the day (1-31)
        System.out.print("Enter the day (1-31): ");
        int dayInput = sc.nextInt();
		SpringCheck spring=new SpringCheck();
		boolean result = spring.checkSpring(monthInput,dayInput);
		if(result){
		   System.out.println("It's Spring Season.");
		}
		else{
		    System.out.println("Not a Spring Season.");  
		}
		sc.close();
	}
}