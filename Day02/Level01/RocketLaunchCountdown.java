import  java.util.*; 
public  class  RocketLaunchCountdown  { 
    public  static  void  main  (String[] args) { 
        // Create a Scanner object to take user input 
        Scanner sc=  new  Scanner(System.in); 
        // Take user input for the countdown start  value 
        System.out.print(  "Enter the countdown start  value: "  ); 
        int  countdownStart = sc.nextInt();
        // Perform the countdown using a while loop 
        while  (countdownStart >=  1  ) { 
            // Print the value of the countdown 
            System.out.println(countdownStart); 
           // Decrement the countdown 
           countdownStart--; 
           // Close the scanner object 
   
        }
    sc.close();
    } 
}