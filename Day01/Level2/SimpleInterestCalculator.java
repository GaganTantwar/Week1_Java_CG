import java.util.*;

class SimpleInterestCalculator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Take user input for Principal amount
      System.out.print("Enter the Principal amount: ");
      double principal = sc.nextDouble();

      // Take user input for Rate of Interest
      System.out.print("Enter the Rate of Interest (in %): ");
      double rate = sc.nextDouble();

      // Take user input for Time (in years)
      System.out.print("Enter the Time (in years): ");
      double time = sc.nextDouble();

      // Calculate Simple Interest
      double simpleInterest = (principal * rate * time) / 100;

      // Display the result
      System.out.println("The Simple Interest is " + simpleInterest + 
                         " for Principal " + principal + ", Rate of Interest " + rate + 
                         "% and Time " + time + " years.");

      // Close the scanner object
      sc.close();
   }
}

