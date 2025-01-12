import java.util.*;
class BMIWithArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         // Input the number of persons
        System.out.println("Enter Number of Person ");
        int numberOfPerson=sc.nextInt();
         // Arrays to store weight, height, BMI, and status for each person
        double []weight=new double[numberOfPerson];
        double []height=new double[numberOfPerson];
        double []heightInMeters=new double[numberOfPerson];
        double []Bmi=new double[numberOfPerson];
        String []status=new String[numberOfPerson];
        // Input weight and height for each person
        for(int i=0;i<numberOfPerson;i++){
            System.out.println("Enter Weight of a Person "+(i+1)+" in kg");
            weight[i]=sc.nextDouble();
            System.out.println("Enter Height of a Person"+(i+1)+" in cm");
            height[i]=sc.nextDouble();
            // Convert height from cm to meters
            heightInMeters[i]=height[i]/100.0;
        }
        // Calculate BMI and determine status for each person
        for(int i=0;i<numberOfPerson;i++){
            Bmi[i]=weight[i] / (heightInMeters[i] * heightInMeters[i]);
            if (Bmi[i]<= 18.4) {
                status[i] = "Underweight";
            } 
            else if (Bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (Bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        
        }
        for(int i=0;i<numberOfPerson;i++){
            System.out.println("Height "+height[i]+" Weight "+weight[i]+" BMI "+Bmi[i]+" Status "+status[i]+" Of "+(i+1)+" Person");
        }
        // Close the scanner
        sc.close();
    }
}