import java.util.Scanner;
class WeightConverter {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Take user input for weight in pounds
      System.out.print("Enter the weight in pounds: ");
      double weightInPounds = sc.nextDouble();

      // Convert weight to kilograms
      double weightInKilograms = weightInPounds / 2.2;

      // Display the results
      System.out.println("The weight of the person in pounds is " + weightInPounds + 
                         " and in kilograms is " + weightInKilograms + ".");

      // Close the scanner object
      sc.close();
   }
}

