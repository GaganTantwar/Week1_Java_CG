import java.util.*;
class Factorial{
    public static int findFactorial(int number){
        if(number==1||number==0){
            return 1;
        }
        return number*findFactorial(number-1);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=sc.nextInt();
        int factorial=findFactorial(number);
        System.out.println("Factorial Of the Number: "+factorial);

    }
}