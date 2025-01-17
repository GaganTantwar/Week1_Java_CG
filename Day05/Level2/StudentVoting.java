class StudentVoting {

    // Method to generate an array of random ages for students
    public static int[] ageOfStudent(int size) {
        int[] studentAge = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random age between 10 and 99
            studentAge[i] = (int) ((Math.random() * 90) + 10);
        }
        return studentAge;
    }

    // Method to check if students are eligible to vote based on their ages
    public static String[][] checkVote(int[] ageArr, int size) {
        String[][] voteChecking = new String[size][2];
        for (int i = 0; i < size; i++) {
            // Store the age as a string in the first column
            voteChecking[i][0] = String.valueOf(ageArr[i]);

            // Check voting eligibility
            if (ageArr[i] > 0) {
                if (ageArr[i] >= 18) {
                    voteChecking[i][1] = "true"; // Eligible to vote
                } else {
                    voteChecking[i][1] = "false"; // Not eligible to vote
                }
            } else {
                voteChecking[i][1] = "Invalid"; // Invalid age
            }
        }
        return voteChecking;
    }

    public static void main(String args[]) {
        int size = 10; // Number of students

        // Generate an array of random student ages
        int[] studentAge = ageOfStudent(size);

        // Check voting eligibility for each student
        String[][] voteChecking = checkVote(studentAge, size);

        // Display the results
        for (int i = 0; i < size; i++) {
            System.out.println("Student of Age: " + voteChecking[i][0] + " can vote: " + voteChecking[i][1]);
        }
    }
}
