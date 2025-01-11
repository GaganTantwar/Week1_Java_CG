import java.util.*;

class ChocolateDistribution {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Take user input for the number of chocolates
      System.out.print("Enter the total number of chocolates: ");
      int numberOfChocolates = sc.nextInt();

      // Take user input for the number of children
      System.out.print("Enter the total number of children: ");
      int numberOfChildren = sc.nextInt();

      // Calculate chocolates each child gets and the remaining chocolates
      int chocolatesPerChild = numberOfChocolates / numberOfChildren;
      int remainingChocolates = numberOfChocolates % numberOfChildren;

      // Display the results
      System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                         " and the number of remaining chocolates are " + remainingChocolates + ".");

      // Close the scanner object
      sc.close();
   }
}

