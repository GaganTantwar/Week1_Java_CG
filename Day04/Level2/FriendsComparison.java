import java.util.*;

class FriendsComparison{

    // Method to find the youngest friend
    public int findYoungestFriend(int[] ages) {
        int youngestIndex = 0;
        // Loop through the ages to find the smallest age
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex; // Return the index of the youngest friend
    }

    // Method to find the tallest friend
    public int findTallestFriend(int[] heights) {
        int tallestIndex = 0;
        // Loop through the heights to find the largest height
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex; // Return the index of the tallest friend
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of FriendsComparison to call methods
        FriendsComparison comparison = new FriendsComparison();

        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create arrays to store names, ages, and heights
        String[] friendNames = {"Amar", "Akbar", "Anthony"};
        int[] friendAges = new int[3];
        int[] friendHeights = new int[3];

        // Take user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friendNames[i] + ": ");
            friendAges[i] = sc.nextInt();

            System.out.print("Enter the height (in cm) of " + friendNames[i] + ": ");
            friendHeights[i] = sc.nextInt();
        }

        // Call methods to find the youngest and tallest friend
        int youngestIndex = comparison.findYoungestFriend(friendAges);
        int tallestIndex = comparison.findTallestFriend(friendHeights);

        // Display the results
        System.out.println("The youngest friend is " + friendNames[youngestIndex]);
        System.out.println("The tallest friend is " + friendNames[tallestIndex]);

        // Close the Scanner object
        sc.close();
    }
}
