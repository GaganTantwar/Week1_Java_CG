import java.util.*;

class CollinearityChecker{

    // Method to check collinearity using the slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes between points
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If the area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc= new Scanner(System.in);

        // Input coordinates for three points
        System.out.print("Enter x1, y1 for point A: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2 for point B: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3, y3 for point C: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check collinearity using the slope formula
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using the area formula
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("Collinearity Check:");
        System.out.println("Using Slope Formula: " + (collinearBySlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Formula: " + (collinearByArea ? "Collinear" : "Not Collinear"));

        // Close the Scanner object
        sc.close();
    }
}
