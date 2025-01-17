import java.util.*;
class LongestAndShortest{
    private static int lengthOfString(String str) {
        int length = 0; // Variable to store the length
        for (char c1 : str.toCharArray()) { // Convert the string to a character array and iterate through it
            length++; // Increment the length for each character
        }
        return length; // Return the calculated length
    }
    private static String[][] twoDarrayofString(String words[], int length[]) {
        String[][] twoDarray = new String[words.length][2]; // Create a 2D array with dimensions [number of words][2]
        for (int i = 0; i < words.length; i++) {
            twoDarray[i][0] = words[i]; // Store the word in the first column
            String temp = String.valueOf(length[i]); // Convert the word length to a string
            twoDarray[i][1] = temp; // Store the length in the second column
        }
        return twoDarray; // Return the 2D array
    }
    private static int [] longestAndShortest(String twoDArray [][],int length){
        int minimum=Integer.MAX_VALUE;// Minimum value of string 
        int maximum=Integer.MIN_VALUE;// Maximum value of string 
        for(int i=0;i<length;i++){
            if(Integer.parseInt(twoDArray[i][1])<minimum){
                minimum=Integer.parseInt(twoDArray[i][1]); // finding minimum
            }
        }
        for(int i=0;i<length;i++){
            if(Integer.parseInt(twoDArray[i][1])>maximum){
                maximum=Integer.parseInt(twoDArray[i][1]); // finding maximum
            }
        }
        int []longShort=new int[2];
        longShort[0]=minimum;
        longShort[1]=maximum;        
        return longShort;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("Enter a String for Execution "); // Prompting user for input

        String input = sc.nextLine(); // Taking the full string input from the user
        String[] words = input.split(" "); // Splitting the input string into an array of words
        int[] length = new int[words.length]; // Array to store the lengths of each word
        for (int i = 0; i < words.length; i++) {
            length[i] = lengthOfString(words[i]); // Calculate and store the length of each word
        }
         // Create a 2D array containing words and their lengths
        String[][] twoDArray = twoDarrayofString(words, length);
        for (int i = 0; i < words.length; i++) {
            System.out.println("Words: " + twoDArray[i][0] + " Length: " + twoDArray[i][1]);
        }
        int []longShort=longestAndShortest(twoDArray,words.length);
        System.out.println("Longest Length: "+longShort[0]+" Shortest Length : "+longShort[1]);
        
        sc.close(); // Close the Scanner to release resources
    }
}