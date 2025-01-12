import java.util.*;
class MutilDimensionToSingle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns for the Multidimensional array");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] multiDimensionArr = new int[rows][columns];
        int size = rows * columns;
        int[] singleDimensionArr = new int[size];
        int index = 0; // Initialize an index for the single-dimensional array

        // Input values for the multidimensional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multiDimensionArr[i][j] = sc.nextInt();
            }
        }

        // Convert multidimensional array to single-dimensional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleDimensionArr[index++] = multiDimensionArr[i][j];
            }
        }

        // Print the single-dimensional array
        for (int i = 0; i < size; i++) {
            System.out.println("Value of Single Dimension array: " + singleDimensionArr[i]);
        }

        sc.close();
    }
}
