import java.util.*;

public class FriendsComparison {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for ages
        System.out.print("Enter the age of Amar: ");
        int amarAge = scanner.nextInt();
        
        System.out.print("Enter the age of Akbar: ");
        int akbarAge = scanner.nextInt();
        
        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        
        // Take user input for heights
        System.out.print("Enter the height of Amar (in cm): ");
        double amarHeight = scanner.nextDouble();
        
        System.out.print("Enter the height of Akbar (in cm): ");
        double akbarHeight = scanner.nextDouble();
        
        System.out.print("Enter the height of Anthony (in cm): ");
        double anthonyHeight = scanner.nextDouble();
        
        // Finding the youngest friend
        String youngestFriend;
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Finding the tallest friend
        String tallestFriend;
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        // Print the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");
        
        // Close the scanner class  object 
        scanner.close();
    }
}