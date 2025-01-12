import java.util.*; // Importing java.util package for Scanner class

class FootballPlayerHeight {
    // Method to calculate the sum of all player heights
    static double sumOfHeight(double[] heightArr) {
        double sum = 0.0;
        // Iterating through the array to calculate the total height
        for (int i = 0; i < heightArr.length; i++) {
            sum += heightArr[i];
        }
        return sum;
    }

    // Method to calculate the average height of players
    static double averageOfHeight(double sum) {
        // Dividing the sum of heights by the total number of players (11)
        double average = sum / 11;
        return average;
    }

    // Method to find the tallest player's height
    static double tallestHeight(double[] heightArr) {
        double taller = heightArr[0]; // Initializing with the first player's height
        // Iterating through the array to find the maximum height
        for (int i = 0; i < heightArr.length; i++) {
            if (heightArr[i] > taller) {
                taller = heightArr[i];
            }
        }
        return taller;
    }

    // Method to find the shortest player's height
    static double smallestHeight(double[] heightArr) {
        double smaller = heightArr[0]; // Initializing with the first player's height
        // Iterating through the array to find the minimum height
        for (int i = 0; i < heightArr.length; i++) {
            if (heightArr[i] < smaller) {
                smaller = heightArr[i];
            }
        }
        return smaller;
    }

    public static void main(String args[]) {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Declaring an array to store the heights of 11 players
        double[] heightOfPlayer = new double[11];

        // Loop to take input for each player's height
        for (int i = 0; i < 11; i++) {
            System.out.println("Enter Height of Player in cm within range 150 cms to 250 cms: " + (i + 1));
            heightOfPlayer[i] = sc.nextDouble(); // Storing the height in the array
        }

        // Calling methods to perform calculations
        double sum = FootballPlayerHeight.sumOfHeight(heightOfPlayer);
        double average = FootballPlayerHeight.averageOfHeight(sum);
        double tallestHeightPlayer = FootballPlayerHeight.tallestHeight(heightOfPlayer);
        double smallestHeightPlayer = FootballPlayerHeight.smallestHeight(heightOfPlayer);

        // Displaying the results
        System.out.println("Sum of Height of All Players: " + sum);
        System.out.println("Mean Height of Players: " + average);
        System.out.println("Maximum Height among Players: " + tallestHeightPlayer);
        System.out.println("Minimum Height among Players: " + smallestHeightPlayer);

        // Closing the Scanner object
        sc.close();
    }
}
