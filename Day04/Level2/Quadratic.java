import java.util.*;

class Quadratic{

    // Method to calculate delta
    public static double calculateDelta(double a, double b, double c) {
        // Calculate delta using the formula: delta = b^2 - 4ac
        return Math.pow(b, 2) - (4 * a * c);
    }

    // Method to calculate roots
    public static double[] calculateRoots(double delta, double a, double b) {
        // Check the value of delta to determine the number of roots
        if (delta > 0) {
            // Two distinct real roots
            double[] roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else if (delta == 0) {
            // One real root (repeated root)
            double[] roots = new double[1];
            roots[0] = -b / (2 * a);
            return roots;
        } else {
            // No real roots (complex roots)
            return new double[0];
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user for coefficients a, b, and c
        System.out.print("Enter value for a (must be non-zero): ");
        double a = sc.nextDouble();

        // Ensure 'a' is not zero to avoid invalid quadratic equation
        while (a == 0) {
            System.out.print("Coefficient 'a' cannot be zero. Please re-enter a non-zero value for a: ");
            a = sc.nextDouble();
        }

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Calculate delta
        double delta = calculateDelta(a, b, c);

        // Calculate the roots
        double[] roots = calculateRoots(delta, a, b);

        // Display the result
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }

        // Close the Scanner object
        sc.close();
    }
}
