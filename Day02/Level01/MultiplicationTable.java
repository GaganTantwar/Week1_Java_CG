import java.util.*;
public class MultiplicationTable {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner sc = new Scanner(System.in);
    // Take user input for the number
    System.out.print("Enter a number: ");
    int inputNumber = sc.nextInt();
    // Print the multiplication table from 6 to  9
    for (int i = 6; i <= 9; i++) {
      System.out.println(inputNumber + " * " + i + " = " + (inputNumber * i));
    }
    sc.close();
  }
}