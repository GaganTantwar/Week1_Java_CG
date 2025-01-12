import java.util.*;

public class LeapYear2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //  input a year from user >=1582 
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } 
		else{
			// if year is completely divided by 4 and not divided by 100 or year is divided by 400 then its a leap year
		    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } 
			else {
                System.out.println(year + " is not a Leap Year.");
            }
		}
		sc.close();
	}
}