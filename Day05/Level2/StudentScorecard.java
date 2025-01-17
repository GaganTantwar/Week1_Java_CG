import java.util.*;

class StudentScorecard{

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM)
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90 + 10); // Physics score
            scores[i][1] = (int) (Math.random() * 90 + 10); // Chemistry score
            scores[i][2] = (int) (Math.random() * 90 + 10); // Math score
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStatistics(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3]; // [total, average, percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            stats[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return stats;
    }

    // Method to calculate the grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

            if (percentage >=80) {
                grades[i] = "A";
            } else if (percentage >= 80) {
                grades[i] = "B";
            } else if (percentage >= 70) {
                grades[i] = "C";
            } else if (percentage >= 60) {
                grades[i] = "D";
            } else if (percentage >= 50) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "%", "Grade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                              stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate random scores for the students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] stats = calculateStatistics(scores);

        // Calculate grades for each student
        String[] grades = calculateGrades(stats);

        // Display the scorecard
        displayScorecard(scores, stats, grades);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
