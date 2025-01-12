
import java.util.*;

class SimpleMatrixOperations{

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int numRows, int numCols) {
        // Create a 2D matrix with the specified number of rows and columns
        int[][] matrix = new int[numRows][numCols];

        // Iterate through each element of the matrix to assign a random value between 0 and 9
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                matrix[row][col] = (int) (Math.random() * 10); // Random value between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Get the number of rows and columns of the matrices
        int numRows = matrix1.length;
        int numCols = matrix1[0].length;

        // Create a result matrix of the same size as the input matrices
        int[][] resultMatrix = new int[numRows][numCols];

        // Iterate through each element to perform addition
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                resultMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return resultMatrix;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        // Get the number of rows and columns of the matrices
        int numRows = matrix1.length;
        int numCols = matrix1[0].length;

        // Create a result matrix of the same size as the input matrices
        int[][] resultMatrix = new int[numRows][numCols];

        // Iterate through each element to perform subtraction
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                resultMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return resultMatrix;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        // Get the number of rows and columns for both matrices
        int numRows1 = matrix1.length;
        int numCols1 = matrix1[0].length;
        int numCols2 = matrix2[0].length;

        // Create a result matrix with the appropriate size for the product
        int[][] resultMatrix = new int[numRows1][numCols2];

        // Iterate through each element to perform matrix multiplication
        for (int row = 0; row < numRows1; row++) {
            for (int col = 0; col < numCols2; col++) {
                resultMatrix[row][col] = 0;
                for (int k = 0; k < numCols1; k++) {
                    resultMatrix[row][col] += matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        return resultMatrix;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        // Get the number of rows and columns of the matrix
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Create a new matrix with swapped rows and columns
        int[][] transposedMatrix = new int[numCols][numRows];

        // Iterate through the original matrix to fill in the transposed matrix
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                transposedMatrix[col][row] = matrix[row][col];
            }
        }
        return transposedMatrix;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        // Calculate and return the determinant of the 2x2 matrix
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        // Calculate and return the determinant of the 3x3 matrix
        int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        // Calculate the determinant of the matrix
        int det = determinant2x2(matrix);

        // Check if the determinant is zero
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }

        // Create an inverse matrix and compute the values
        double[][] inverseMatrix = new double[2][2];
        inverseMatrix[0][0] = matrix[1][1] / (double) det;
        inverseMatrix[0][1] = -matrix[0][1] / (double) det;
        inverseMatrix[1][0] = -matrix[1][0] / (double) det;
        inverseMatrix[1][1] = matrix[0][0] / (double) det;

        return inverseMatrix;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        // Calculate the determinant of the matrix
        int det = determinant3x3(matrix);

        // Check if the determinant is zero
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }

        // Create an inverse matrix and compute the values
        double[][] inverseMatrix = new double[3][3];
        inverseMatrix[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) det;
        inverseMatrix[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) det;
        inverseMatrix[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) det;
        inverseMatrix[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) det;
        inverseMatrix[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) det;
        inverseMatrix[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) det;
        inverseMatrix[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) det;
        inverseMatrix[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) det;
        inverseMatrix[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) det;

        return inverseMatrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            // Move to the next row
            System.out.println();
        }
    }

    // Method to display a matrix with double values (for inverse)
    public static void displayDoubleMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            // Move to the next row
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the size of matrices
        System.out.print("Enter the number of rows for the matrices: ");
        int numRows = sc.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int numCols = sc.nextInt();

        // Generate two random matrices of the specified size
        int[][] matrix1 = createRandomMatrix(numRows, numCols);
        int[][] matrix2 = createRandomMatrix(numRows, numCols);

        // Display both matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform and display matrix operations
        // Addition
        System.out.println("Addition of Matrix 1 and Matrix 2:");
        displayMatrix(addMatrices(matrix1, matrix2));

        // Subtraction
        System.out.println("Subtraction of Matrix 1 and Matrix 2:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        // Matrix multiplication (only possible if the number of columns in matrix1 equals rows in matrix2)
        if (numCols == matrix2.length) {
            System.out.println("Multiplication of Matrix 1 and Matrix 2:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Multiplication not possible due to incompatible matrix dimensions.");
        }

        // Transpose of matrix1
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        // Determinant and inverse for 2x2 and 3x3 matrices
        if (numRows == 2 && numCols == 2) {
            System.out.println("Determinant of Matrix 1:");
            System.out.println(determinant2x2(matrix1));
            System.out.println("Inverse of Matrix 1:");
            displayDoubleMatrix(inverse2x2(matrix1));
        } else if (numRows == 3 && numCols == 3) {
            System.out.println("Determinant of Matrix 1:");
            System.out.println(determinant3x3(matrix1));
            System.out.println("Inverse of Matrix 1:");
            displayDoubleMatrix(inverse3x3(matrix1));
        } else {
            System.out.println("Determinant and inverse not supported for this matrix size.");
        }

        // Close the scanner object
        sc.close();
    }
}



