import java.util.*;

class GradeArray2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number of students
        System.out.println("Enter Number of Students");
        int numberOfStudents = sc.nextInt();

        // Initialize a 2D array to store marks for each subject (rows: students, columns: subjects)
        int[][] marks = new int[numberOfStudents][3]; // 0: Maths, 1: Physics, 2: Chemistry
        double[] percentage = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each subject for all students
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter Marks for Student " + (i + 1));

            // Input marks in Maths
            System.out.println("Maths:");
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("Invalid input for Maths. Please re-enter.");
                i--;
                continue;
            }

            // Input marks in Physics
            System.out.println("Physics:");
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("Invalid input for Physics. Please re-enter.");
                i--;
                continue;
            }

            // Input marks in Chemistry
            System.out.println("Chemistry:");
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("Invalid input for Chemistry. Please re-enter.");
                i--;
                continue;
            }
        }

        // Calculate percentage and assign grades for each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate the average percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grades based on percentage
            if (percentage[i] >= 80) {
                grades[i] = 'A';
            } else if (percentage[i] >= 70) {
                grades[i] = 'B';
            } else if (percentage[i] >= 60) {
                grades[i] = 'C';
            } else if (percentage[i] >= 50) {
                grades[i] = 'D';
            } else if (percentage[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R'; // 'R' for Reappear or Fail
            }
        }

        // Display marks, percentage, and grades for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Maths: " + marks[i][0] + ", Physics: " + marks[i][1] + ", Chemistry: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + ", Grade: " + grades[i]);
        }

        // Close the scanner
        sc.close();
    }
}
