import java.util.*;
class TemperatureConverter{
    public static double toFahrenheit(double temperature){
       double tempFahrenheit=(temperature*(double)9/5)+32;
       return tempFahrenheit;
    }
    public static double toCelsius(double temperature){
        double tempCelsius=(temperature-32)*(double)5/9;
        return tempCelsius;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Fahrenheit Coversion or 2 for Celsius Coversion");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter Temperature in Celsius:");
            double temperature=sc.nextDouble();
            double tempFahrenheit=toFahrenheit(temperature);
            System.out.println("Temperature in Faherenheit: "+tempFahrenheit);
        }
        else if(choice==2){
            System.out.println("Enter Temperature in Fahrenheit:");
            double temperature=sc.nextDouble();
            double tempCelsius=toCelsius(temperature);
            System.out.println("Temperature in Celsius "+tempCelsius);
        } 
        else{
            System.out.println("Enter Valid Choice:");
        }
      
    }

}