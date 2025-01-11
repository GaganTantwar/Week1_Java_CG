

import java.util.*;

class TravelComputation {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Take user input for the person's name
      System.out.print("Enter the name of the person traveling: ");
      String name = scanner.nextLine();

      // Take user input for cities
      System.out.print("Enter the city of origin: ");
      String fromCity = scanner.nextLine();

      System.out.print("Enter the via city: ");
      String viaCity = scanner.nextLine();

      System.out.print("Enter the destination city: ");
      String toCity = scanner.nextLine();

      // Take user input for distances
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
      double distanceFromToVia = scanner.nextDouble();

      System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " (in minutes): ");
      int timeFromToVia = scanner.nextInt();

      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
      double distanceViaToFinalCity = scanner.nextDouble();

      System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " (in minutes): ");
      int timeViaToFinalCity = scanner.nextInt();

      // Calculate total distance and total time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

      // Close the scanner object
      scanner.close();
   }
}

