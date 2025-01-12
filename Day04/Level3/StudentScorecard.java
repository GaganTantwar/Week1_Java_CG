import java.util.*;

class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Mathematics
    public static int[][] generateScores(int numOfStudents) {
        // Create a 2D array to store scores for each student (3 subjects per student)
        int[][] studentScores = new int[numOfStudents][3];

        // Loop through each student to generate random scores for Physics, Chemistry, and Mathematics
        for (int studentIndex = 0; studentIndex < numOfStudents; studentIndex++) {
            for (int subjectIndex = 0; subjectIndex < 3; subjectIndex++) {
                studentScores[studentIndex][subjectIndex] = (int)(Math.random() * 90) + 10; // Generate random score between 10 and 99
            }
        }
        return studentScores;
    }

    // Method to calculate total score, average score, and percentage for each student
    public static double[][] calculateResults(int[][] studentScores) {
        // Get the number of students
        int numOfStudents = studentScores.length;
        
        // Create a 2D array to store results for each student (total, average, percentage)
        double[][] studentResults = new double[numOfStudents][3];
        
        // Loop through each student to calculate total score, average, and percentage
        for (int studentIndex = 0; studentIndex < numOfStudents; studentIndex++) {
            int totalScore = studentScores[studentIndex][0] + studentScores[studentIndex][1] + studentScores[studentIndex][2];
            double averageScore = totalScore / 3.0;
            double percentage = (totalScore / 300.0) * 100;
            
            // Store the results: total, average, and percentage (rounded to 2 decimal places)
            studentResults[studentIndex][0] = totalScore;
            studentResults[studentIndex][1] = Math.round(averageScore * 100.0) / 100.0;
            studentResults[studentIndex][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return studentResults;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] studentScores, double[][] studentResults) {
        System.out.println("Student\tPhysics\tChemistry\tMathematics\tTotal\tAverage\tPercentage");

        // Loop through each student and display their scores and results
        for (int studentIndex = 0; studentIndex < studentScores.length; studentIndex++) {
            // Display student number
            System.out.print((studentIndex + 1) + "\t");
            
            // Display scores for each subject (Physics, Chemistry, Mathematics)
            for (int subjectIndex = 0; subjectIndex < 3; subjectIndex++) {
                System.out.print(studentScores[studentIndex][subjectIndex] + "\t");
            }
            
            // Display total score, average, and percentage
            System.out.print(studentResults[studentIndex][0] + "\t");
            System.out.print(studentResults[studentIndex][1] + "\t");
            System.out.println(studentResults[studentIndex][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        // Prompt the user to input the number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = sc.nextInt();

        // Generate random scores for Physics, Chemistry, and Mathematics
        int[][] studentScores = generateScores(numOfStudents);

        // Calculate total score, average score, and percentage for each student
        double[][] studentResults = calculateResults(studentScores);

        // Display the scorecard
        displayScorecard(studentScores, studentResults);
        sc.close();
    
    }
}
