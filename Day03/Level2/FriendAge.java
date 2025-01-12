import java.util.*;

class FriendAge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Array to store the ages of three friends
        int[] ageOfFriend = new int[3];

        // Array to store the heights of three friends
        double[] heightOfFriend = new double[3];

        // Input ages of three friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Age Of " + (i + 1) + " Friend");
            ageOfFriend[i] = sc.nextInt();
        }

        // Input heights of three friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Height Of " + (i + 1) + " Friend");
            heightOfFriend[i] = sc.nextDouble();
        }

        // Variables to track the youngest age and tallest height
        int minAge = ageOfFriend[0];
        int minAgeIndex = 0;
        double maxHeight = heightOfFriend[0];
        int maxHeightIndex = 0;

        // Find the youngest and the tallest friend
        for (int i = 1; i < 3; i++) {
            if (ageOfFriend[i] < minAge) {
                minAge = ageOfFriend[i];
                minAgeIndex = i;
            }
            if (heightOfFriend[i] > maxHeight) {
                maxHeight = heightOfFriend[i];
                maxHeightIndex = i;
            }
        }

        // Output the index of the youngest friend (for debugging purposes)
        System.out.println(minAgeIndex);

        // Determine and display who is the youngest
        if (minAgeIndex == 0) {
            System.out.println("Amar is Youngest");
        } else if (minAgeIndex == 1) {
            System.out.println("Akbar is Youngest");
        } else {
            System.out.println("Anthony is Youngest");
        }

        // Determine and display who is the tallest
        if (maxHeightIndex == 0) {
            System.out.println("Amar is Tallest");
        } else if (maxHeightIndex == 1) {
            System.out.println("Akbar is Tallest");
        } else {
            System.out.println("Anthony is Tallest");
        }

        // Close the scanner
        sc.close();
    }
}
