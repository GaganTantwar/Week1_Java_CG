
class NumberAnalysis{

    // Method to generate an array of 4-digit random numbers
    public int[] generateRandom4DigitNumbers(int arraySize) {
        // Create an array to store the random numbers
        int[] randomNumbers = new int[arraySize];

        // Generate random 4-digit numbers between 1000 and 9999
        for (int i = 0; i < arraySize; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to calculate the average, minimum, and maximum values in an array
    public double[] calculateStatistics(int[] numbers) {
        // Array to store the results: [0] = average, [1] = minimum, [2] = maximum
        double[] statistics = new double[3];

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        statistics[0] = sum / numbers.length;

        // Find the minimum value
        double minimum = numbers[0];
        for (int number : numbers) {
            minimum = Math.min(minimum, number);
        }
        statistics[1] = minimum;

        // Find the maximum value
        double maximum = numbers[0];
        for (int number : numbers) {
            maximum = Math.max(maximum, number);
        }
        statistics[2] = maximum;

        return statistics;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the main class to call its methods
        NumberAnalysis analysisTool = new NumberAnalysis();

        // Create a Scanner object to take input from the user
       

        // Specify the size of the array
        int arraySize = 5;

        // Generate the array of random 4-digit numbers
        int[] randomNumbers = analysisTool.generateRandom4DigitNumbers(arraySize);

        // Calculate the average, minimum, and maximum values
        double[] statistics = analysisTool.calculateStatistics(randomNumbers);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int i=0;i<randomNumbers.length;i++) {
            System.out.println(randomNumbers[i]);
        }

        // Display the calculated statistics
        System.out.println("Average: " + statistics[0]);
        System.out.println("Minimum: " + statistics[1]);
        System.out.println("Maximum: " + statistics[2]);

        }
}




