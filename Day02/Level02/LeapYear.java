import java.util.*;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //  input a year from user >=1582 
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } 
		else {
            // Using multiple if-else statements
			// condition for checking year completely divided by 4
            if (year % 4 == 0) {
			    //condition for checking year completely divided by 100
                if (year % 100 == 0) {
				    //condition for checking year completely divided by 400
                    if (year % 400 == 0) {
					    // if all conditions are true
                        System.out.println(year + " is a Leap Year.");
                    } 
					else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } 
				else {
                    System.out.println(year + " is a Leap Year.");
                }
            } 
			else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
		sc.close();
    }
}