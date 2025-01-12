import java.util.*;

class DistanceAndLineEquation {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m) of the line
        double m = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b) of the line
        double b = y1 - m * x1;

        // Return an array containing slope m and y-intercept b
        return new double[] {m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates of the two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        // Calculate and display the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);

        sc.close();
    }
}



